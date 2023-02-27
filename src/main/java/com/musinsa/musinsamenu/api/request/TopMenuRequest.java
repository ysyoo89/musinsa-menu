package com.musinsa.musinsamenu.api.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

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
