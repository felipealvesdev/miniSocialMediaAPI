package com.example.miniSocialMedia.posts;

import com.example.miniSocialMedia.commentaries.Commentary;
import com.example.miniSocialMedia.user.User;

import java.time.LocalDate;
import java.util.Set;

public record PostDTO(User owner, LocalDate createdAt, Set<User> likedBy, Set<Commentary> commentaries) {
}
