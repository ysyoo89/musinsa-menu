package com.musinsa.musinsamenu.model.response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class TopMenuResponse {
    private Long id;
    private String topMenuName;
    private String banner;
    private List<MiddleMenuResponse> middleMenus;
}
