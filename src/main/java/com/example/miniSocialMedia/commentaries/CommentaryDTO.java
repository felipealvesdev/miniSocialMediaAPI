package com.example.miniSocialMedia.commentaries;

import com.example.miniSocialMedia.user.User;

import java.util.Set;

public record CommentaryDTO(String commentary, Set<User> likedBy) {
}
