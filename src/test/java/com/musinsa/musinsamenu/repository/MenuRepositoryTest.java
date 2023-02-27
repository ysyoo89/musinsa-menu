package com.musinsa.musinsamenu.repository;

import com.musinsa.musinsamenu.JPATestConfig;
import com.musinsa.musinsamenu.entity.BottomMenu;
import com.musinsa.musinsamenu.entity.MiddleMenu;
import com.musinsa.musinsamenu.entity.TopMenu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@Import(JPATestConfig.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MenuRepositoryTest {

    @PersistenceContext
    private EntityManager entityManager;
    @Autowired
    private TopMenuRepository topMenuRepository;
    @Autowired
    private MiddleMenuRepository middleMenuRepository;
    @Autowired
    private BottomMenuRepository bottomMenuRepository;

    @Test
    void saveTest() {
        TopMenu topMenu = TopMenu.builder()
                .topMenuName("악세서리")
                .build();
        MiddleMenu middleMenu = MiddleMenu.builder().middleMenuName("귀걸이").build();
        MiddleMenu middleMenu1 = MiddleMenu.builder().middleMenuName("목걸이").build();
        middleMenu.addTopMenu(topMenu);
        middleMenu1.addTopMenu(topMenu);

        BottomMenu bottomMenu = BottomMenu.builder().bottomMenuName("보석").build();
        BottomMenu bottomMenu1 = BottomMenu.builder().bottomMenuName("큐빅").build();
        bottomMenu.addMiddleMenu(middleMenu);
        bottomMenu1.addMiddleMenu(middleMenu1);

        topMenuRepository.save(topMenu);
        middleMenuRepository.save(middleMenu);
        bottomMenuRepository.save(bottomMenu);

        entityManager.flush();
        entityManager.clear();

        List<TopMenu> list = topMenuRepository.findAll();
        List<MiddleMenu> middleList = middleMenuRepository.findAll();
        List<BottomMenu> bottomMenuList = bottomMenuRepository.findAll();
        assertEquals(4, list.size());
        assertEquals(9, middleList.size());
        assertEquals(13, bottomMenuList.size());
    }

    @Test
    void getMenu() {
        TopMenu topMenu = topMenuRepository.findById(1L).orElse(null);
        MiddleMenu middleMenu = middleMenuRepository.findById(1L).orElse(null);
        BottomMenu bottomMenu = bottomMenuRepository.findById(1L).orElse(null);
        assertEquals(3, topMenu.getMiddleMenus().size());
        assertEquals(2, middleMenu.getBottomMenus().size());
        assertEquals(1, bottomMenu.getMiddleMenu().getId());
    }
}
