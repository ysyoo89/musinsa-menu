package com.musinsa.musinsamenu.model.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BottomMenuCreateRequest {
    private Long middleMenuId;
    private String bottomMenuName;
}
