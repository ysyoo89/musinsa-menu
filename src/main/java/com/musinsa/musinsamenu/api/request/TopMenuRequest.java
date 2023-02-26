package com.musinsa.musinsamenu.api.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class TopMenuRequest {
    private Long id;
    private String topMenuName;
    private String banner;
    private List<MiddleMenuRequest> middleMenus;
}
