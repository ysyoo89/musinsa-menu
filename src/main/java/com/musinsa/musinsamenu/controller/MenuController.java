package com.musinsa.musinsamenu.controller;

import com.musinsa.musinsamenu.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MenuController {
    private final MenuService menuService;

    @PostMapping("/create")
    public ResponseEntity<?> createMenu() {
        menuService.createMenu();
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
