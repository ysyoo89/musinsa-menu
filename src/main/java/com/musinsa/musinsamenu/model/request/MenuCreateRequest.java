package com.musinsa.musinsamenu.model.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MenuCreateRequest {
    private String topMenuName;
    private String banner;
}
