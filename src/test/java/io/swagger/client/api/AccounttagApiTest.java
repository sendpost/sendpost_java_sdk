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
import io.swagger.client.model.ModelsDeleteResponse;
import io.swagger.client.model.ModelsTag;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccounttagApi
 */
@Ignore
public class AccounttagApiTest {

    private final AccounttagApi api = new AccounttagApi();

    
    /**
     * 
     *
     * Create Tag
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tagRouterCreateTest() throws ApiException {
        String xAccountApiKey = null;
        ModelsTag body = null;
        ModelsTag response = api.tagRouterCreate(xAccountApiKey, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete Tag
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tagRouterDeleteTest() throws ApiException {
        String xAccountApiKey = null;
        Long tagid = null;
        ModelsDeleteResponse response = api.tagRouterDelete(xAccountApiKey, tagid);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get All Tags
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tagRouterGetAllTest() throws ApiException {
        String xAccountApiKey = null;
        List<ModelsTag> response = api.tagRouterGetAll(xAccountApiKey);

        // TODO: test validations
    }
    
}
