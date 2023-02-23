package com.musinsa.musinsamenu.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "top-menu", schema = "menu")
public class TopMenuEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String topMenuName;

    @Column
    private String banner;
}
