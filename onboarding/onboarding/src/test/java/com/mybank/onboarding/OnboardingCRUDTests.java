package com.mybank.onboarding;


import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.URI;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OnboardingCRUDTests {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    void shouldReturnAOnboardingStaffWhenDataIsSaved(){
        ResponseEntity<String> response = restTemplate
                .withBasicAuth("admin", "admin123")
                .getForEntity("/newstaff/100", String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

        DocumentContext documentContext = JsonPath.parse(response.getBody());
        Number id = documentContext.read("$.id");
        assertThat(id).isEqualTo(100);

        String name = documentContext.read("$.name");
        assertThat(name).isEqualTo("Isshaaq Ismail");
    }

    @Test
    void shouldNotReturnAOnboardingStaffWithAnUnknownId(){
        ResponseEntity<String> response = restTemplate
                .withBasicAuth("admin", "admin123")
                .getForEntity("/newstaff/1000", String.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
        assertThat(response.getBody()).isBlank();
    }

    @Test
    @DirtiesContext
    void shouldCreateANewOnboardingStaff(){
        OnboardingStaff onboardingStaff = new OnboardingStaff(null, "Isshaaq Ismail", "admin");
        ResponseEntity<Void> createResponse = restTemplate
                .withBasicAuth("admin", "admin123")
                .postForEntity("/newstaff", onboardingStaff, void.class);

        assertThat(createResponse.getStatusCode()).isEqualTo(HttpStatus.CREATED);

        URI locationOfNewOnboardingStaff = createResponse.getHeaders().getLocation();

        ResponseEntity<String> getResponse = restTemplate
                .withBasicAuth("admin", "admin123")
                .getForEntity(locationOfNewOnboardingStaff, String.class);
        assertThat(getResponse.getStatusCode()).isEqualTo(HttpStatus.OK);

        DocumentContext documentContext = JsonPath.parse(getResponse.getBody());
        Number id = documentContext.read("$.id");
        String name = documentContext.read("$.name");

        assertThat(id).isNotNull();
        assertThat(name).isEqualTo("Isshaaq Ismail");
    }

    @Test
    void shouldReturnAllOnboardingStaffWhenListIsRequested(){
        ResponseEntity<String> response = restTemplate
                .withBasicAuth("admin", "admin123")
                .getForEntity("/newstaff", String.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

        DocumentContext documentContext = JsonPath.parse(response.getBody());
        int onboardingStaffCount = documentContext.read("$.length()");
        assertThat(onboardingStaffCount).isEqualTo(3);

        JSONArray ids = documentContext.read("$..id");
        assertThat(ids).containsExactlyInAnyOrder(99, 100, 101);

        JSONArray names = documentContext.read("$..name");
        assertThat(names).containsExactlyInAnyOrder("Imran Ismail", "Isshaaq Ismail", "Ayesha Jayah");
    }

    @Test
    void shouldNotReturnAOnboardingStaffWhenUsingBadCredentials(){
        ResponseEntity<String> response = restTemplate
                .withBasicAuth("BAD-USER", "admin123")
                .getForEntity("/newstaff/99", String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.UNAUTHORIZED);

        response = restTemplate
                .withBasicAuth("admin", "BAD-PASSWORD")
                .getForEntity("/newstaff", String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.UNAUTHORIZED);
    }

    @Test
    void shouldRejectUsersWhoAreNotUserOwners(){
        ResponseEntity<String> response = restTemplate
                .withBasicAuth("hank-owns-no-users", "qrs456")
                .getForEntity("/newstaff/99", String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.FORBIDDEN);
    }
}
