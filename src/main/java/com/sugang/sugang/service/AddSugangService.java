package com.sugang.sugang.service;

import com.sugang.sugang.controller.dto.AddSugangDto;
import com.sugang.sugang.domain.repository.SugangRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AddSugangService {

    private final SugangRepository sugangRepository;

    @Transactional
    public void execute(AddSugangDto.Request addSugangRequest) {
        sugangRepository.save(addSugangRequest.toEntity());
    }
}
