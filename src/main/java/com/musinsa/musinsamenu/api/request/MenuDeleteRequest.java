package com.musinsa.musinsamenu.api.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MenuDeleteRequest {
    private Long topId;
    private Long middleId;
    private Long bottomId;

    public boolean isTopMenu() {
        return this.topId != null;
    }

    public boolean isMiddleMenu() {
        return this.middleId != null;
    }

    public boolean isBottomMenu() {
        return this.bottomId != null;
    }
}
