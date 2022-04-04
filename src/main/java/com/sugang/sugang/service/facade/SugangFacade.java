package com.sugang.sugang.service.facade;

import com.sugang.sugang.controller.dto.AddSugangDto;
import com.sugang.sugang.controller.dto.ModifySugangDto;

public interface SugangFacade {

    void addSugang(AddSugangDto.Request request);

    void deleteSugang(Long sugangId);

    void modifySugang(Long sugangId, ModifySugangDto.Request request);
}
