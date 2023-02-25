package com.musinsa.musinsamenu.model.convertor;

import com.musinsa.musinsamenu.entity.BottomMenu;
import com.musinsa.musinsamenu.entity.MiddleMenu;
import com.musinsa.musinsamenu.entity.TopMenu;
import com.musinsa.musinsamenu.model.dto.TopMenuModel;
import com.musinsa.musinsamenu.model.request.BottomMenuCreateRequest;
import com.musinsa.musinsamenu.model.request.MiddleMenuCreateRequest;
import com.musinsa.musinsamenu.model.request.TopMenuCreateRequest;
import com.musinsa.musinsamenu.model.response.BottomMenuResponse;
import com.musinsa.musinsamenu.model.response.MiddleMenuResponse;
import com.musinsa.musinsamenu.model.response.TopMenuResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring"
    , uses = {
        MiddleMenuConvertor.class
        , BottomMenuConvertor.class
})
public interface TopMenuConvertor {

    TopMenu toEntity(TopMenuModel topMenuModel);
    TopMenuModel toDto(TopMenu topMenu);

    TopMenuResponse toResponse(TopMenu topMenu);

    TopMenu createToEntity(TopMenuCreateRequest topMenuCreateRequest);

}
