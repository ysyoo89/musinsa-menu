package com.musinsa.musinsamenu.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MiddleMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MIDDLE_MENU_ID")
    private Long id;

    @Column
    private String middleMenuName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TOP_MENU_ID")
    private TopMenu topMenu;

    @OneToMany(mappedBy = "middleMenu", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<BottomMenu> bottomMenus = new ArrayList<>();

    public void addTopMenu(TopMenu topMenu) {
        this.topMenu = topMenu;
    }

    public void mapping() {
        if (this.getBottomMenus() != null) {
            this.getBottomMenus().forEach(m -> m.addMiddleMenu(this));
        }
    }

   public void removeMapping() {
        this.setBottomMenus(null);
   }
}
