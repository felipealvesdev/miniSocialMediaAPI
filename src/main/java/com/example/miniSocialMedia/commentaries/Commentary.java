package com.example.miniSocialMedia.commentaries;


import com.example.miniSocialMedia.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "commentaries")
public class Commentary {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String commentary;

    private Set<User> likedBy = new HashSet<>();

}
