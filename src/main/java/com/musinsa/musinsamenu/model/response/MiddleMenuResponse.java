package com.musinsa.musinsamenu.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class MiddleMenuResponse {
    private Long id;
    private Long topMenuId;
    private String middleMenuName;
    private List<BottomMenuResponse> bottomMenus;
}
