package com.example.miniSocialMedia.user;

import java.time.LocalDate;

public record UserDTO(String firstName, String lastName, String email, LocalDate birthdate) {
}
