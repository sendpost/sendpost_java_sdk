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
import io.swagger.client.model.ModelsAGStat;
import io.swagger.client.model.ModelsAIPStat;
import io.swagger.client.model.ModelsPIPStat;
import io.swagger.client.model.ModelsRStat;
import io.swagger.client.model.ModelsStat;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubaccountstatApi
 */
@Ignore
public class SubaccountstatApiTest {

    private final SubaccountstatApi api = new SubaccountstatApi();

    
    /**
     * 
     *
     * Get All Aggregate Sub-Account Stats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subAccountStatRouterGetAllAggregateSubAccountStatsTest() throws ApiException {
        String xSubAccountApiKey = null;
        String from = null;
        String to = null;
        ModelsStat response = api.subAccountStatRouterGetAllAggregateSubAccountStats(xSubAccountApiKey, from, to);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get All Aggregate Sub-Account Stats by Group
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subAccountStatRouterGetAllAggregateSubAccountStatsByGroupTest() throws ApiException {
        String xSubAccountApiKey = null;
        String group = null;
        String from = null;
        String to = null;
        ModelsStat response = api.subAccountStatRouterGetAllAggregateSubAccountStatsByGroup(xSubAccountApiKey, group, from, to);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get All Aggregated Group Stats for a Sub-Account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subAccountStatRouterGetAllAggregatedGroupStatsForASubAccountTest() throws ApiException {
        String xSubAccountApiKey = null;
        String from = null;
        String to = null;
        List<ModelsAGStat> response = api.subAccountStatRouterGetAllAggregatedGroupStatsForASubAccount(xSubAccountApiKey, from, to);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get All Aggregated IP Stats for a Sub-Account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subAccountStatRouterGetAllAggregatedIPStatsForASubAccountTest() throws ApiException {
        String xSubAccountApiKey = null;
        String from = null;
        String to = null;
        List<ModelsAIPStat> response = api.subAccountStatRouterGetAllAggregatedIPStatsForASubAccount(xSubAccountApiKey, from, to);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get All Aggregated Provider Stats for a Specific IP of a Sub-Account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subAccountStatRouterGetAllAggregatedProviderStatsForASpecificIPOfASubAccountTest() throws ApiException {
        String xSubAccountApiKey = null;
        Long ipid = null;
        String from = null;
        String to = null;
        List<ModelsPIPStat> response = api.subAccountStatRouterGetAllAggregatedProviderStatsForASpecificIPOfASubAccount(xSubAccountApiKey, ipid, from, to);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get All Aggregated Provider Stats for a Sub-Account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subAccountStatRouterGetAllAggregatedProviderStatsForASubAccountTest() throws ApiException {
        String xSubAccountApiKey = null;
        String from = null;
        String to = null;
        List<ModelsPIPStat> response = api.subAccountStatRouterGetAllAggregatedProviderStatsForASubAccount(xSubAccountApiKey, from, to);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get All Sub-Account Stats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subAccountStatRouterGetAllSubAccountStatsTest() throws ApiException {
        String xSubAccountApiKey = null;
        String from = null;
        String to = null;
        List<ModelsRStat> response = api.subAccountStatRouterGetAllSubAccountStats(xSubAccountApiKey, from, to);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get All Sub-Account Stats by Group
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subAccountStatRouterGetAllSubAccountStatsByGroupTest() throws ApiException {
        String xSubAccountApiKey = null;
        String group = null;
        String from = null;
        String to = null;
        List<ModelsRStat> response = api.subAccountStatRouterGetAllSubAccountStatsByGroup(xSubAccountApiKey, group, from, to);

        // TODO: test validations
    }
    
}
