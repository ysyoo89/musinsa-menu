package com.musinsa.musinsamenu.model.convertor;

import com.musinsa.musinsamenu.entity.BottomMenu;
import com.musinsa.musinsamenu.model.dto.BottomMenuModel;
import com.musinsa.musinsamenu.api.response.BottomMenuResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BottomMenuConvertor {

    BottomMenuConvertor INSTANCE = Mappers.getMapper(BottomMenuConvertor.class);
    BottomMenu toEntity(BottomMenuModel bottomMenuModel);
    BottomMenuModel toDto(BottomMenu bottomMenu);
    @Mapping(target = "middleMenuId", source = "middleMenu.id")
    BottomMenuResponse toReponse(BottomMenu bottomMenu);
}
