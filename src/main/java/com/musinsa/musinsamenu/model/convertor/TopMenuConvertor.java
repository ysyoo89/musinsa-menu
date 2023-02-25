package com.musinsa.musinsamenu.model.convertor;

import com.musinsa.musinsamenu.entity.BottomMenu;
import com.musinsa.musinsamenu.entity.MiddleMenu;
import com.musinsa.musinsamenu.entity.TopMenu;
import com.musinsa.musinsamenu.model.dto.TopMenuModel;
import com.musinsa.musinsamenu.model.response.BottomMenuResponse;
import com.musinsa.musinsamenu.model.response.MiddleMenuResponse;
import com.musinsa.musinsamenu.model.response.TopMenuResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TopMenuConvertor {

    TopMenu toEntity(TopMenuModel topMenuModel);
    TopMenuModel toDto(TopMenu topMenu);

    TopMenuResponse toResponse(TopMenu topMenu);

    @Mapping(target = "topMenuId", source = "topMenu.id")
    MiddleMenuResponse ToMiddleMenuResponse (MiddleMenu middleMenu);

    @Mapping(target = "middleMenuId", source = "middleMenu.id")
    BottomMenuResponse toBottomMenuReponse(BottomMenu bottomMenu);
}
