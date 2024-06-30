package com.app.BabyBuy.generics.controller;

import com.app.BabyBuy.pojo.GlobalApiResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import enums.ResponseStatus;

/**
 * Base Controller
 */
public class BaseController {


    /**
     * ObjectMapper instance
     */
    public ObjectMapper objectMapper = new ObjectMapper();

    /**
     * API Success ResponseStatus
     */
    protected final ResponseStatus API_SUCCESS_STATUS = ResponseStatus.SUCCESS;

    /**
     * API Error ResponseStatus
     */
    protected final ResponseStatus API_ERROR_STATUS = ResponseStatus.FAIL;

    /**
     * Message Source Instance
     */

    /**
     * Module Name
     */
    protected String moduleName;
    protected String permissionName;
    protected String screenName;

    /**
     * This module is used to fetch the available permissions of current user in particular module
     */
    protected String module;


    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    /**
     * Function that sends successful API Response
     *
     * @param message
     * @param data
     * @return
     */
    protected GlobalApiResponse successResponse(String message, Object data) {
        GlobalApiResponse globalApiResponse = new GlobalApiResponse();
        globalApiResponse.setStatus(API_SUCCESS_STATUS);
        globalApiResponse.setMessage(message);
        globalApiResponse.setData(data);
        return globalApiResponse;
    }


}
