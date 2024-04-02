package com.example.miniSocialMedia.posts;

import com.example.miniSocialMedia.commentaries.Commentary;
import com.example.miniSocialMedia.user.User;
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

    @Column(nullable = false, unique = true)
    private User owner;

    private LocalDate createdAt;

    private Set<User> likedBy = new HashSet<>();
    private Set<Commentary> commentaries = new HashSet<>();

    public Post(User owner) {
        this.owner = owner;
        this.createdAt = LocalDate.now();
    }

}
