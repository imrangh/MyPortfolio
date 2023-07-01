package com.mybank.onboarding;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.lang.reflect.Array;

import static org.assertj.core.api.Assertions.assertThat;


@JsonTest
class OnboardingApplicationTests {

	@Autowired
	private JacksonTester<OnboardingStaff> json;

	@Autowired
	private JacksonTester<OnboardingStaff[]> jsonList;

	private OnboardingStaff[] onboardingStaffs;

	@BeforeEach
	void setUp(){
		onboardingStaffs = Arrays.array(
				new OnboardingStaff(99L, "Imran Ismail", "admin"),
				new OnboardingStaff(100L, "Isshaaq Ismail", "admin"),
				new OnboardingStaff(101L, "Ayesha Jayah", "admin")

		);
	}

	@Test
	void onboardingStaffSerializationTest() throws IOException {
		OnboardingStaff onboardingStaff = onboardingStaffs[0];

		assertThat(json.write(onboardingStaff)).isStrictlyEqualToJson("newemployee.json");
		assertThat(json.write(onboardingStaff)).hasJsonPathNumberValue("@.id");

		assertThat(json.write(onboardingStaff)).extractingJsonPathNumberValue("@.id").isEqualTo(99);

		assertThat(json.write(onboardingStaff)).hasJsonPathStringValue("@.name");
		assertThat(json.write(onboardingStaff)).extractingJsonPathStringValue("@.name").isEqualTo("Imran Ismail");

	}

	@Test
	void onboardingStaffListSerializationTest() throws IOException{
		assertThat(jsonList.write(onboardingStaffs)).isStrictlyEqualToJson("list.json");
	}



}
