package com.musinsa.musinsamenu.model.convertor;

import com.musinsa.musinsamenu.api.request.BannerRequest;
import com.musinsa.musinsamenu.entity.BannerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BannerConvertor {

    BannerEntity toEntity(BannerRequest bannerRequest);

}
