package com.example.miniSocialMedia.commentaries;


import com.example.miniSocialMedia.user.User;
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

    @ManyToOne
    private User user;
/*     @Column(nullable = false)
    private String commentary;
    private LocalDate createdAt;

    private Set<User> likedBy = new HashSet<>();

    public Commentary(User owner) {
        this.owner = owner;
        this.createdAt = LocalDate.now();
    }
*/
}
