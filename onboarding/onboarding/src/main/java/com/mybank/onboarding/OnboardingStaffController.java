package com.mybank.onboarding;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.security.Principal;
import java.util.Optional;

@RestController
@RequestMapping("/newstaff")
public class OnboardingStaffController {

    private OnboardingStaffRepository onboardingStaffRepository;

    public OnboardingStaffController(OnboardingStaffRepository onboardingStaffRepository) {
        this.onboardingStaffRepository = onboardingStaffRepository;
    }

    private OnboardingStaff findOnboardingStaff(Long staffId, Principal principal){
        return onboardingStaffRepository.findByIdAndOwner(staffId, principal.getName());
    }

    @GetMapping("/{staffId}")
    public ResponseEntity<OnboardingStaff> findById(@PathVariable Long staffId, Principal principal){

        OnboardingStaff onboardingStaff = findOnboardingStaff(staffId, principal);
        if(onboardingStaff != null){

            return ResponseEntity.ok(onboardingStaff);
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

    @PutMapping("/{staffId}")
    private ResponseEntity<Void> putOnboardingStaff(@PathVariable Long staffId, @RequestBody OnboardingStaff onboardingStaffUpdate, Principal principal){
        OnboardingStaff onboardingStaff = findOnboardingStaff(staffId, principal);

        if(onboardingStaff !=null){
            OnboardingStaff updatedOnboardingStaff = new OnboardingStaff(onboardingStaff.id(), onboardingStaffUpdate.name(), principal.getName());

            onboardingStaffRepository.save(updatedOnboardingStaff);
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();

    }

    @DeleteMapping("/{id}")
    private ResponseEntity<Void> deleteOnboardingStaff(@PathVariable Long id, Principal principal){

        if(onboardingStaffRepository.existsByIdAndOwner(id, principal.getName())) {
            onboardingStaffRepository.deleteById(id);
            return  ResponseEntity.noContent().build();

        }

        return ResponseEntity.notFound().build();

    }

}
