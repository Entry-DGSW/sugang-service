package com.sugang.sugang.service;

import com.sugang.sugang.domain.repository.SugangRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DeleteSugangService {

    private final SugangRepository sugangRepository;

    @Transactional
    public void execute(Long sugangId) {
        sugangRepository.deleteById(sugangId);
    }
}
