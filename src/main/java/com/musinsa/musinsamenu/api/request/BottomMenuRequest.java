package com.musinsa.musinsamenu.api.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BottomMenuRequest {
    private Long id;
    private Long middleMenuId;
    private String bottomMenuName;
}
