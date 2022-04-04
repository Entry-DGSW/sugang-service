package com.sugang.sugang.service.facade;

import com.sugang.sugang.controller.dto.AddSugangDto;
import com.sugang.sugang.controller.dto.ModifySugangDto;
import com.sugang.sugang.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SugangFacadeImpl implements SugangFacade {

    private final AddSugangService addSugangService;
    private final DeleteSugangService deleteSugangService;
    private final FindSugangByIdService findSugangByIdService;
    private final ModifySugangService modifySugangService;

    @Override
    public void addSugang(AddSugangDto.Request request) {
        addSugangService.execute(request);
    }

    @Override
    public void deleteSugang(Long sugangId) {
        deleteSugangService.execute(sugangId);
    }

    @Override
    public void modifySugang(Long sugangId, ModifySugangDto.Request request) {
        modifySugangService.execute(findSugangByIdService.execute(sugangId), request);
    }
}
