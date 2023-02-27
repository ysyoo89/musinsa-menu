package com.musinsa.musinsamenu.api.controller;

import com.musinsa.musinsamenu.api.request.BannerRequest;
import com.musinsa.musinsamenu.api.request.MenuDeleteRequest;
import com.musinsa.musinsamenu.api.request.TopMenuRequest;
import com.musinsa.musinsamenu.service.BannerService;
import com.musinsa.musinsamenu.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/menu")
public class MenuController {
    private final MenuService menuService;
    private final BannerService bannerService;

    @PostMapping("/create")
    public ResponseEntity<?> createMenu(@RequestBody TopMenuRequest topMenuRequest) {
        menuService.createMenu(topMenuRequest);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping("/modify")
    public ResponseEntity<?> modifyMenu(@RequestBody TopMenuRequest topMenuRequest) {
        menuService.modifyMenu(topMenuRequest);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/remove")
    public ResponseEntity<?> removeMenu(@RequestBody MenuDeleteRequest menuDeleteRequest) {
        menuService.removeMenu(menuDeleteRequest);
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

    @GetMapping("/connect/banner/{topMenuId}/{bannerId}")
    public ResponseEntity<?> connectBanner(@PathVariable("topMenuId") Long topMenuId, @PathVariable("bannerId") Long bannerId) {
        menuService.connectBanner(topMenuId, bannerId);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
