package com.pensionat.customer.dto;


public record CustomerResponse(

        Long id,
        String firstName,
        String Lastname,
        String email,
        String phoneNumber


) {
}
