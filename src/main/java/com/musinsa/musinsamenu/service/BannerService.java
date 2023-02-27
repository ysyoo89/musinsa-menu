package com.musinsa.musinsamenu.service;

import com.musinsa.musinsamenu.api.request.BannerRequest;
import com.musinsa.musinsamenu.entity.BannerEntity;
import com.musinsa.musinsamenu.model.convertor.BannerConvertor;
import com.musinsa.musinsamenu.repository.BannerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BannerService {

    private final BannerRepository bannerRepository;
    private final BannerConvertor bannerConvertor;

    public void createBanner(BannerRequest bannerRequest) {
        BannerEntity entity = bannerConvertor.toEntity(bannerRequest);
        bannerRepository.save(entity);
    }
}
