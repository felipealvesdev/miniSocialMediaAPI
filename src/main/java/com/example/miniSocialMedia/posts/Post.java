package com.example.miniSocialMedia.posts;

import com.example.miniSocialMedia.commentaries.Commentary;
import com.example.miniSocialMedia.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

}
