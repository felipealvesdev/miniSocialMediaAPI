package com.example.miniSocialMedia.posts;

import com.example.miniSocialMedia.commentaries.Commentary;
import com.example.miniSocialMedia.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@Entity(name = "posts")
@Table(name = "posts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDate createdAt;

    @ManyToMany(mappedBy = "postList")
    private Set<User> likedBy = new HashSet<>();
/*
    private Set<Commentary> commentaries = new HashSet<>();
*/
    public Post(User user) {
        this.user = user;
        this.createdAt = LocalDate.now();
    }

}
