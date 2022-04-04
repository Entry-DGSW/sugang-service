package com.sugang.sugang.service;

import com.sugang.sugang.controller.dto.ModifySugangDto;
import com.sugang.sugang.domain.entity.Sugang;
import com.sugang.sugang.domain.repository.SugangRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ModifySugangService {

    private final SugangRepository sugangRepository;

    public void execute(Sugang sugang, ModifySugangDto.Request request) {
        sugangRepository.save(sugang.update(request));
    }
}
