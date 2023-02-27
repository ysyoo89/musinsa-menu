package com.musinsa.musinsamenu.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BottomMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOTTOM_MENU_ID")
    private Long id;

    @Column(updatable=false)
    private String bottomMenuName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MIDDLE_MENU_ID", referencedColumnName = "MIDDLE_MENU_ID")
    private MiddleMenu middleMenu;

    public void addMiddleMenu(MiddleMenu middleMenu) {
        this.middleMenu = middleMenu;
    }
}
