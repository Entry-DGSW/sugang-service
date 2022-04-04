package com.sugang.sugang.service;

import com.sugang.sugang.controller.dto.AddSugangDto;
import com.sugang.sugang.domain.repository.SugangRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddSugangService {

    private final SugangRepository sugangRepository;

    public void execute(AddSugangDto.Request addSugangRequest) {
        sugangRepository.save(addSugangRequest.toEntity());
    }
}
