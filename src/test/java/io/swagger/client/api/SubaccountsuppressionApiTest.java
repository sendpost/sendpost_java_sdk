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
import io.swagger.client.model.ModelsRDSuppression;
import io.swagger.client.model.ModelsRSuppression;
import io.swagger.client.model.ModelsSuppression;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubaccountsuppressionApi
 */
@Ignore
public class SubaccountsuppressionApiTest {

    private final SubaccountsuppressionApi api = new SubaccountsuppressionApi();

    
    /**
     * 
     *
     * Count Total Suppressions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suppressionRouterCountTest() throws ApiException {
        String xSubAccountApiKey = null;
        ModelsCountStat response = api.suppressionRouterCount(xSubAccountApiKey);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Add Email Addresses To Suppression List
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suppressionRouterCreateSuppressionsTest() throws ApiException {
        String xSubAccountApiKey = null;
        ModelsRSuppression body = null;
        ModelsSuppression response = api.suppressionRouterCreateSuppressions(xSubAccountApiKey, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Add Email Addresses To Suppression Filter
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suppressionRouterCreateSuppressionsInSuppressionFilterTest() throws ApiException {
        ModelsSuppression body = null;
        api.suppressionRouterCreateSuppressionsInSuppressionFilter(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete specific emails which are in suppression list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suppressionRouterDeleteSuppressionTest() throws ApiException {
        String xSubAccountApiKey = null;
        ModelsRDSuppression body = null;
        ModelsSuppression response = api.suppressionRouterDeleteSuppression(xSubAccountApiKey, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete specific emails which are in suppression list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suppressionRouterDeleteSuppressionsInSuppressionFilterTest() throws ApiException {
        ModelsSuppression body = null;
        api.suppressionRouterDeleteSuppressionsInSuppressionFilter(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get all suppressions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suppressionRouterGetAllSuppressionsTest() throws ApiException {
        String xSubAccountApiKey = null;
        Long offset = null;
        Long limit = null;
        String search = null;
        List<ModelsSuppression> response = api.suppressionRouterGetAllSuppressions(xSubAccountApiKey, offset, limit, search);

        // TODO: test validations
    }
    
}
