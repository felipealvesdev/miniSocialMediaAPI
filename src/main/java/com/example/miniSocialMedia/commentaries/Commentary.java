package com.example.miniSocialMedia.commentaries;


import com.example.miniSocialMedia.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "commentaries")
public class Commentary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String commentary;
    private LocalDate createdAt;

    @ManyToMany(mappedBy = "likedCommentariesList")
    private Set<User> likedBy = new HashSet<>();

    public Commentary(User user) {
        this.user = user;
        this.createdAt = LocalDate.now();
    }
}
