package com.sugang.sugang.common.errors;

import com.sugang.sugang.common.errors.exception.ErrorCode;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
public class ErrorResponse {

    private final int status;
    private final String code;
    private final String message;

    public ErrorResponse(ErrorCode errorCode) {
        this.status = errorCode.getStatus();
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }
}
