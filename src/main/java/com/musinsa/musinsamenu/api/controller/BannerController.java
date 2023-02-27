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
@RequestMapping("/api/v1/banner")
public class BannerController {

    private final BannerService bannerService;

    @PostMapping("/create")
    public ResponseEntity<?> createBanner(@RequestBody BannerRequest bannerRequest) {
        bannerService.createBanner(bannerRequest);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
