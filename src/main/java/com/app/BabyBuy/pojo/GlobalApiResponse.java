package com.app.BabyBuy.pojo;

import enums.ResponseStatus;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Builder
public class GlobalApiResponse implements Serializable {
    private ResponseStatus status;
    private String message;
    private Object data;

    public void setResponse(String message, ResponseStatus status, Object data) {
        this.message = message;
        this.status = status;
        this.data = data;
    }

}