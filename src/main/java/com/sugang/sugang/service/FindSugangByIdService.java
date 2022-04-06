package com.sugang.sugang.service;

import com.sugang.sugang.common.errors.exception.BaseException;
import com.sugang.sugang.common.errors.exception.ErrorCode;
import com.sugang.sugang.domain.entity.Sugang;
import com.sugang.sugang.domain.repository.SugangRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class FindSugangByIdService {

    private final SugangRepository sugangRepository;

    @Transactional
    public Sugang execute(Long sugangId) {
        return sugangRepository.findById(sugangId).orElseThrow(
                () -> new BaseException(ErrorCode.SUGANG_NOTFOUND_ERROR));
    }
}
