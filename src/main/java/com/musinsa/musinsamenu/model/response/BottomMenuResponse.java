package com.musinsa.musinsamenu.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class BottomMenuResponse {
    private Long id;
    private Long middleMenuId;
    private String bottomMenuName;
}
