package com.musinsa.musinsamenu.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor
public class MiddleMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MIDDLE_MENU_ID")
    private Long id;

    @Column
    private String middleMenuName;

    @ManyToOne
    @JoinColumn(name = "TOP_MENU_ID")
    private TopMenu topMenu;

    @OneToMany(mappedBy = "middleMenu")
    private List<BottomMenu> bottomMenus = new ArrayList<>();

}
