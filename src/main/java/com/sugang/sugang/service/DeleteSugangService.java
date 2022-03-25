package com.sugang.sugang.service;

import com.sugang.sugang.domain.repository.SugangRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteSugangService {

    private final SugangRepository sugangRepository;

    public void execute(Long sugangId) {
        sugangRepository.deleteById(sugangId);
    }
}
