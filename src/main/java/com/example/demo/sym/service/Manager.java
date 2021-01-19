package com.example.demo.sym.service;

import lombok.*;
import javax.persistence.*;

@Getter
@Entity
@ToString
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Table(name="managers")
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mgr_num") private int mgrNum;
    @Column(name = "email") private String email;
    @Column(name = "password") private String password;
    @Column(name = "name") private String name;
    @Column(name = "profile_image") private String profileImage;

    @Builder
    private Manager(String email, String password, String name, String profileImage){
        this.email = email;
        this.password = password;
        this.name = name;
        this.profileImage = profileImage;
    }

}