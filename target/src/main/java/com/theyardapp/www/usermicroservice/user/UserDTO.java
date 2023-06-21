package com.theyardapp.www.usermicroservice.user;

import jakarta.persistence.*;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode @RequiredArgsConstructor
@Entity
@Table(name="User")
public class UserDTO {

    @Id
    @GeneratedValue()
    private final Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "ip")
    private String ip;

    private String password;


}
