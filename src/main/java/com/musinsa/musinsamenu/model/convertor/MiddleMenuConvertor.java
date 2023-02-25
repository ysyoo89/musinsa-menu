package com.musinsa.musinsamenu.model.convertor;

import com.musinsa.musinsamenu.entity.MiddleMenu;
import com.musinsa.musinsamenu.entity.TopMenu;
import com.musinsa.musinsamenu.model.dto.MiddleMenuModel;
import com.musinsa.musinsamenu.model.dto.TopMenuModel;
import com.musinsa.musinsamenu.model.response.MiddleMenuResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring"
        , uses = {
            MiddleMenuConvertor.class
            , BottomMenuConvertor.class
})
public interface MiddleMenuConvertor {

    MiddleMenuConvertor INSTANCE = Mappers.getMapper(MiddleMenuConvertor.class);
    MiddleMenu toEntity(MiddleMenuModel middleMenuModel);
    MiddleMenuModel toDto(MiddleMenu middleMenu);
    @Mapping(target = "topMenuId", source = "topMenu.id")
    MiddleMenuResponse toResponse(MiddleMenu middleMenu);
}
