package com.musinsa.musinsamenu.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor
@Table(name="top_menu")
public class TopMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TOP_MENU_ID")
    private Long id;

    @Column
    private String topMenuName;

    @Column
    private String banner;

    @OneToMany(mappedBy = "topMenu")
    private List<MiddleMenu> middleMenus = new ArrayList<>();
}
