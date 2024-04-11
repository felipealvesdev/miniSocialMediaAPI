package com.example.miniSocialMedia.user;


import com.example.miniSocialMedia.commentaries.Commentary;
import com.example.miniSocialMedia.posts.Post;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "users")
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private LocalDate birthdate;

    @OneToMany(mappedBy = "user")
    private Set<Post> postsList = new HashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<Commentary> commentariesList = new HashSet<>();


    @ManyToMany
    @JoinTable(
            name = "userLikedPosts",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "post_id")
    )
    private Set<Post> likedPostsList = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "userLikedCommentaries",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "commentary_id")
    )
    private Set<Commentary> likedCommentariesList = new HashSet<>();
}
