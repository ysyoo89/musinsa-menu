package com.musinsa.musinsamenu.api.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class MiddleMenuRequest {
    private Long id;
    private Long topMenuId;
    private String middleMenuName;
    private List<BottomMenuRequest> bottomMenus;
}
