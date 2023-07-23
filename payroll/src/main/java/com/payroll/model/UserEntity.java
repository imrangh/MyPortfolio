package com.payroll.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@RequiredArgsConstructor
public class UserEntity {
    String id ="1";
    String name = "Imran Ismail";
    String userName = "@imran";
    String email = "imran@geek";
    String pincode = "422-009";
}
