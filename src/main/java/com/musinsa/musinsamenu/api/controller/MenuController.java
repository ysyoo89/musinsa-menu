package com.musinsa.musinsamenu.api.controller;

import com.musinsa.musinsamenu.api.request.TopMenuCreateRequest;
import com.musinsa.musinsamenu.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MenuController {
    private final MenuService menuService;

    @PostMapping("/create")
    public ResponseEntity<?> createMenu(@RequestBody TopMenuCreateRequest topMenuCreateRequest) {
        menuService.createMenu(topMenuCreateRequest);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping("/modify")
    public ResponseEntity<?> modifyMenu(@RequestBody TopMenuCreateRequest topMenuCreateRequest) {
        menuService.modifyMenu(topMenuCreateRequest);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/remove")
    public ResponseEntity<?> removeMenu(@RequestBody TopMenuCreateRequest topMenuCreateRequest) {
        menuService.removeMenu(topMenuCreateRequest);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/top-menu/{topMenuId}")
    public ResponseEntity<?> getTopMenu(@PathVariable Long topMenuId) {
        return ResponseEntity.ok(menuService.getTopMenu(topMenuId));
    }

    @GetMapping("/middle-menu/{middleMenuId}")
    public ResponseEntity<?> getMiddleMenu(@PathVariable Long middleMenuId) {
        return ResponseEntity.ok(menuService.getMiddleMenu(middleMenuId));
    }

    @GetMapping("/bottom-menu/{bottomMenuId}")
    public ResponseEntity<?> getBottomMenu(@PathVariable Long bottomMenuId) {
        return ResponseEntity.ok(menuService.getBottomMenu(bottomMenuId));
    }
}
