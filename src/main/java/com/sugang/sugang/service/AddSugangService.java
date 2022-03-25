package com.sugang.sugang.service;

import com.sugang.sugang.controller.dto.AddSugangRequest;
import com.sugang.sugang.domain.repository.SugangRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddSugangService {

    private final SugangRepository sugangRepository;

    public void execute(AddSugangRequest addSugangRequest) {
        sugangRepository.save(addSugangRequest.toEntity());
    }
}
