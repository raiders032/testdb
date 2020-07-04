package com.example.testdb.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Member extends BaseEntity{

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String password;

    private String name;

    private String email;

    private String role;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member")
    List<Order> orders = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    List<Post> posts = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    List<Qna> qnas = new ArrayList<>();

}
