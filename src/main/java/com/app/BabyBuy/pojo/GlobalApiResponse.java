package com.app.BabyBuy.pojo;

import enums.CRUD;
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
    private CRUD crud;

    public void setResponse(String message, ResponseStatus status, Object data, CRUD crud) {
        this.message = message;
        this.status = status;
        this.data = data;
        this.crud = crud;
    }

}