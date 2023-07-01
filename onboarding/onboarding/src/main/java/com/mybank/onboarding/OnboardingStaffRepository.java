package com.mybank.onboarding;

import org.springframework.data.repository.CrudRepository;
public interface OnboardingStaffRepository extends CrudRepository<OnboardingStaff, Long> {
    OnboardingStaff findByIdAndOwner(Long id, String owner);


}
