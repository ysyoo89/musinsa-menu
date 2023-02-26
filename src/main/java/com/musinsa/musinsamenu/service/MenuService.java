package com.musinsa.musinsamenu.service;

import com.musinsa.musinsamenu.api.request.MenuDeleteRequest;
import com.musinsa.musinsamenu.api.request.TopMenuRequest;
import com.musinsa.musinsamenu.entity.BottomMenu;
import com.musinsa.musinsamenu.entity.MiddleMenu;
import com.musinsa.musinsamenu.entity.TopMenu;
import com.musinsa.musinsamenu.model.convertor.BottomMenuConvertor;
import com.musinsa.musinsamenu.model.convertor.MiddleMenuConvertor;
import com.musinsa.musinsamenu.model.convertor.TopMenuConvertor;
import com.musinsa.musinsamenu.api.response.BottomMenuResponse;
import com.musinsa.musinsamenu.api.response.MiddleMenuResponse;
import com.musinsa.musinsamenu.api.response.TopMenuResponse;
import com.musinsa.musinsamenu.repository.BottomMenuRepository;
import com.musinsa.musinsamenu.repository.MiddleMenuRepository;
import com.musinsa.musinsamenu.repository.TopMenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final TopMenuRepository topMenuRepository;
    private final MiddleMenuRepository middleMenuRepository;
    private final BottomMenuRepository bottomMenuRepository;
    private final TopMenuConvertor topMenuConvertor;
    private final MiddleMenuConvertor middleMenuConvertor;
    private final BottomMenuConvertor bottomMenuConvertor;

    public void createMenu(TopMenuRequest topMenuRequest) {
        TopMenu entity = topMenuConvertor.createToEntity(topMenuRequest);
        topMenuRepository.save(entity.mapping());
    }

    public TopMenuResponse getTopMenu(Long topMenuId) {
        TopMenu menu = topMenuRepository.findById(topMenuId).orElseThrow(NoSuchElementException::new);
        return topMenuConvertor.toResponse(menu);
    }

    public MiddleMenuResponse getMiddleMenu(Long middleMenuId) {
        MiddleMenu middleMenu = middleMenuRepository.findById(middleMenuId).orElseThrow(NoSuchElementException::new);
        return middleMenuConvertor.toResponse(middleMenu);
    }

    public BottomMenuResponse getBottomMenu(Long bottomMenuId) {
        BottomMenu bottomMenu = bottomMenuRepository.findById(bottomMenuId).orElseThrow(NoSuchElementException::new);
        return bottomMenuConvertor.toReponse(bottomMenu);
    }

    public void modifyMenu(TopMenuRequest topMenuRequest) {
        TopMenu entity = topMenuConvertor.createToEntity(topMenuRequest);
        topMenuRepository.save(entity.mapping());
    }

    public void removeMenu(MenuDeleteRequest menuDeleteRequest) {
        if (menuDeleteRequest.isTopMenu()) {
            topMenuRepository.deleteById(menuDeleteRequest.getTopId());
        } else if (menuDeleteRequest.isMiddleMenu()) {
            middleMenuRepository.deleteById(menuDeleteRequest.getMiddleId());
        } else {
            bottomMenuRepository.deleteById(menuDeleteRequest.getBottomId());
        }
    }
}
