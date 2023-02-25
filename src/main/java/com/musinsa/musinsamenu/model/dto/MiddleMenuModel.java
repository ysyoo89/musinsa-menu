package com.musinsa.musinsamenu.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class MiddleMenuModel {

    private Long topMenuId;
    private String middleMenuName;
    private List<BottomMenuModel> bottomMenuModelList;
}
