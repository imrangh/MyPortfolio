package com.mybank.onboarding;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/newstaff")
public class OnboardingStaffController {

    private OnboardingStaffRepository onboardingStaffRepository;

    public OnboardingStaffController(OnboardingStaffRepository onboardingStaffRepository) {
        this.onboardingStaffRepository = onboardingStaffRepository;
    }

    @GetMapping("/{staffId}")
    public ResponseEntity<OnboardingStaff> findById(@PathVariable Long staffId){

        Optional<OnboardingStaff> onboardingStaffOptional = onboardingStaffRepository.findById(staffId);
        if(onboardingStaffOptional.isPresent()){

            return ResponseEntity.ok(onboardingStaffOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @PostMapping
    private ResponseEntity createOnboardingStaff(@RequestBody OnboardingStaff newOnboardingStaffRequest, UriComponentsBuilder ucb){
        OnboardingStaff savedOnboardingStaff = onboardingStaffRepository.save(newOnboardingStaffRequest);
        URI locationOfNewOnboardingStaff  = ucb
                .path("newstaff/{staffId}")
                .buildAndExpand(savedOnboardingStaff.id())
                .toUri();
        return ResponseEntity.created(locationOfNewOnboardingStaff).build();
    }

    @GetMapping
    public ResponseEntity<Iterable<OnboardingStaff>> findAll(){
        return ResponseEntity.ok(onboardingStaffRepository.findAll());
    }
}
