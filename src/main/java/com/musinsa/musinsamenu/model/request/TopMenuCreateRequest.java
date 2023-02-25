package com.musinsa.musinsamenu.model.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class TopMenuCreateRequest {
    private Long id;
    private String topMenuName;
    private String banner;
    private List<MiddleMenuCreateRequest> middleMenus;
}
