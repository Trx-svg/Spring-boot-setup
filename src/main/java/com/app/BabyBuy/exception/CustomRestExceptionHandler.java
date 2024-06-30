package com.app.BabyBuy.exception;

import com.app.BabyBuy.pojo.ApiError;
import enums.ResponseStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class CustomRestExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler({AppException.class})
    public ResponseEntity<Object> handleAppException(final RuntimeException ex, final WebRequest request) {
        logger.error(ex.getClass().getName());
        logger.error("error", ex);
        HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        final ApiError apiError = new ApiError(ResponseStatus.FAIL, httpStatus.value(), ex.getMessage(), ex.getMessage());
        return new ResponseEntity<>(apiError, new HttpHeaders(), httpStatus);
    }
}
