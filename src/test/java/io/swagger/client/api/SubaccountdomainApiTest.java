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
import io.swagger.client.model.ModelsCountStat;
import io.swagger.client.model.ModelsDeleteResponse;
import io.swagger.client.model.ModelsDomain;
import io.swagger.client.model.ModelsEDomain;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubaccountdomainApi
 */
@Ignore
public class SubaccountdomainApiTest {

    private final SubaccountdomainApi api = new SubaccountdomainApi();

    
    /**
     * 
     *
     * Count Total Domains
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void domainRouterCountTest() throws ApiException {
        String xSubAccountApiKey = null;
        ModelsCountStat response = api.domainRouterCount(xSubAccountApiKey);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create Domain
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void domainRouterCreateTest() throws ApiException {
        String xSubAccountApiKey = null;
        ModelsEDomain body = null;
        ModelsDomain response = api.domainRouterCreate(xSubAccountApiKey, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete Domain
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void domainRouterDeleteTest() throws ApiException {
        String xSubAccountApiKey = null;
        Long domainId = null;
        ModelsDeleteResponse response = api.domainRouterDelete(xSubAccountApiKey, domainId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Find Domain by DomainId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void domainRouterGetTest() throws ApiException {
        String xSubAccountApiKey = null;
        Long domainId = null;
        ModelsDomain response = api.domainRouterGet(xSubAccountApiKey, domainId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get All Domains
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void domainRouterGetAllTest() throws ApiException {
        String xSubAccountApiKey = null;
        Long offset = null;
        Long limit = null;
        String search = null;
        List<ModelsDomain> response = api.domainRouterGetAll(xSubAccountApiKey, offset, limit, search);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update Domain
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void domainRouterUpdateTest() throws ApiException {
        String xSubAccountApiKey = null;
        Long domainId = null;
        ModelsEDomain body = null;
        ModelsDomain response = api.domainRouterUpdate(xSubAccountApiKey, domainId, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Verify Domain By Domain Id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void domainRouterVerifyTest() throws ApiException {
        String xSubAccountApiKey = null;
        Long domainId = null;
        ModelsDomain response = api.domainRouterVerify(xSubAccountApiKey, domainId);

        // TODO: test validations
    }
    
}