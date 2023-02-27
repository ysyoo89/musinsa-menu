package com.musinsa.musinsamenu.api.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BannerRequest {
    private Long bannerId;
    private String bannerImage;
    private String bannerUrl;
}
