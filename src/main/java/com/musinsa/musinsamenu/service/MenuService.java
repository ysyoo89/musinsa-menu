package com.musinsa.musinsamenu.service;

import com.musinsa.musinsamenu.repository.TopMenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final TopMenuRepository topMenuRepository;

    public void createMenu() {

    }
}
