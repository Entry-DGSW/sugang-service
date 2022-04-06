package com.sugang.sugang.common.errors.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    SUGANG_NOTFOUND_ERROR(404, "SUGANG-404-1", "can not found sugang"),

    BAD_REQUEST_ERROR(400, "SUGANG-400-1", "Bad Request error occurred"),
    INTERNAL_SERVER_ERROR(500, "SUGANG-500-1", "Server error occurred");

    private final int status;
    private final String code;
    private final String message;
}

