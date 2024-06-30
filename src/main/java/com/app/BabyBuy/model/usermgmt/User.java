package com.app.BabyBuy.model.usermgmt;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(name = "unique_email_address", columnNames = {"email"})
})
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties
public class User {

    @Id
    @SequenceGenerator(name = "user_gen", sequenceName = "user_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_gen")
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, name = "phone_number")
    private String phoneNumber;


    private String address;
}