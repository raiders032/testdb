package com.example.testdb.domain;

import javax.persistence.*;

@Entity
public class Post extends BaseEntity{

    @Id @GeneratedValue
    @Column(name = "post_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    private String title;

    private int view;

    @Lob
    private String description;
}
