package com.sugang.sugang.service.facade;

import com.sugang.sugang.controller.dto.*;
import com.sugang.sugang.domain.entity.Sugang;
import com.sugang.sugang.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class SugangFacadeImpl implements SugangFacade {

    private final AddSugangService addSugangService;
    private final DeleteSugangService deleteSugangService;
    private final FindSugangByIdService findSugangByIdService;
    private final ModifySugangService modifySugangService;

    @Override
    @Transactional
    public void addSugang(AddSugangDto.Request request) {
        addSugangService.execute(request);
    }

    @Override
    @Transactional
    public void deleteSugang(Long sugangId) {
        deleteSugangService.execute(sugangId);
    }

    @Override
    @Transactional
    public void modifySugang(Long sugangId, ModifySugangDto.Request request) {
        modifySugangService.execute(findSugangByIdService.execute(sugangId), request);
    }

    @Override
    @Transactional
    public FindSugangDto.Response findSugangById(Long sugangId) {
        Sugang sugang = findSugangByIdService.execute(sugangId);

        return FindSugangDto.Response.builder()
                .id(sugang.getId())
                .chargeTeacher(sugang.getChargeTeacher())
                .name(sugang.getName())
                .content(sugang.getContent())
                .startDate(sugang.getStartDate())
                .endDate(sugang.getEndDate())
                .createdTeacher(sugang.getCreatedTeacher())
                .applicant(sugang.getSugangRequests().size())
                .sugangRequests(sugang.getSugangRequests())
                .build();
    }
}
