package com.musinsa.musinsamenu.model.convertor;

import com.musinsa.musinsamenu.api.request.TopMenuRequest;
import com.musinsa.musinsamenu.entity.TopMenu;
import com.musinsa.musinsamenu.model.dto.TopMenuModel;
import com.musinsa.musinsamenu.api.response.TopMenuResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring"
    , uses = {
        MiddleMenuConvertor.class
        , BottomMenuConvertor.class
})
public interface TopMenuConvertor {

    TopMenu toEntity(TopMenuModel topMenuModel);
    TopMenuModel toDto(TopMenu topMenu);

    TopMenuResponse toResponse(TopMenu topMenu);

    TopMenu createToEntity(TopMenuRequest topMenuRequest);

}
