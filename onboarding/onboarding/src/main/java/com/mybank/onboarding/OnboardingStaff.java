package com.mybank.onboarding;

import org.springframework.data.annotation.Id;

public record OnboardingStaff(@Id Long id, String name, String owner) {
}
