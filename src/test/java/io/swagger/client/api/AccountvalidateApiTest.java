/*
 * SendPost API
 * SendPost API to send transactional emails reliably
 *
 * OpenAPI spec version: 1.0.0
 * Contact: hello@sendx.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import java.io.File;
import io.swagger.client.model.ModelsBulkResponse;
import io.swagger.client.model.ModelsCleanedList;
import io.swagger.client.model.ModelsEmailList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountvalidateApi
 */
@Ignore
public class AccountvalidateApiTest {

    private final AccountvalidateApi api = new AccountvalidateApi();

    
    /**
     * 
     *
     * Validate Emails In File Asynchronously
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateRouterValidateEmailBulkTest() throws ApiException {
        File fileinput = null;
        String xAccountApiKey = null;
        ModelsBulkResponse response = api.validateRouterValidateEmailBulk(fileinput, xAccountApiKey);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Validate Email List Synchronously
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateRouterValidateEmailListTest() throws ApiException {
        String xAccountApiKey = null;
        ModelsEmailList body = null;
        ModelsCleanedList response = api.validateRouterValidateEmailList(xAccountApiKey, body);

        // TODO: test validations
    }
    
}
