package com.app.BabyBuy.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import enums.ResponseStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiError {

    private ResponseStatus status;
    private int httpCode;
    @JsonProperty("message")
    private String message;
    @JsonProperty("errors")
    private List<String> errors;

    public ApiError(ResponseStatus status, final int httpCode, final String message, final String error) {
        super();
        this.status = status;
        this.httpCode = httpCode;
        this.message = message;
        errors = Arrays.asList(error);
    }

    public ApiError(boolean b, int status, String errorReadingFromFeignClient, String localizedMessage) {
    }
}
