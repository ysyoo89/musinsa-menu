package com.musinsa.musinsamenu.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class BottomMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOTTOM_MENU_ID")
    private Long id;

    @Column
    private String BottomMenuName;

    @ManyToOne
    @JoinColumn(name = "MIDDLE_MENU_ID")
    private MiddleMenu middleMenu;
}
