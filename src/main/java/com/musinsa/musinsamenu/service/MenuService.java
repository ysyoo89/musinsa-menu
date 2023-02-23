package com.musinsa.musinsamenu.service;

import com.musinsa.musinsamenu.repository.BottomMenuRepository;
import com.musinsa.musinsamenu.repository.MiddleMenuRepository;
import com.musinsa.musinsamenu.repository.TopMenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final TopMenuRepository topMenuRepository;
    private final MiddleMenuRepository middleMenuRepository;
    private final BottomMenuRepository bottomMenuRepository;

    public void createMenu() {

    }
}
