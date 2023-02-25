package com.musinsa.musinsamenu.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
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

    @OneToMany(mappedBy = "topMenu", cascade = CascadeType.PERSIST)
    private List<MiddleMenu> middleMenus = new ArrayList<>();

    public TopMenu mapping() {
        this.getMiddleMenus().forEach(m -> {
                    m.addTopMenu(this);
                    m.mapping();
        });
        return this;
    }
}
