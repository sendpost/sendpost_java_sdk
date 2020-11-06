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
import io.swagger.client.model.ModelsQEvent;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccounteventApi
 */
@Ignore
public class AccounteventApiTest {

    private final AccounteventApi api = new AccounteventApi();

    
    /**
     * 
     *
     * Count all events from a account for a given time-range
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventRouterCountAllEventsFromAAccountForAGivenTimeRangeTest() throws ApiException {
        String xAccountApiKey = null;
        String search = null;
        String type = null;
        String from = null;
        String to = null;
        String source = null;
        String sourceId = null;
        ModelsCountStat response = api.eventRouterCountAllEventsFromAAccountForAGivenTimeRange(xAccountApiKey, search, type, from, to, source, sourceId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Count all events from a node of a sub-account for a given time-range
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventRouterCountAllEventsFromANodeOfASubAccountForAGivenTimeRangeTest() throws ApiException {
        String xAccountApiKey = null;
        String search = null;
        String type = null;
        String from = null;
        String to = null;
        String source = null;
        String sourceId = null;
        ModelsCountStat response = api.eventRouterCountAllEventsFromANodeOfASubAccountForAGivenTimeRange(xAccountApiKey, search, type, from, to, source, sourceId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Find Event By Id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventRouterGetTest() throws ApiException {
        String xAccountApiKey = null;
        String eventId = null;
        ModelsQEvent response = api.eventRouterGet(xAccountApiKey, eventId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Find all events of a sub-account from a specific node for a give time-range
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventRouterGetAllEventTimestampKeysOfASubAccountFromASpecificNodeForAGivenTimeRangeTest() throws ApiException {
        String xAccountApiKey = null;
        String search = null;
        String type = null;
        String from = null;
        String to = null;
        String source = null;
        String sourceId = null;
        List<ModelsQEvent> response = api.eventRouterGetAllEventTimestampKeysOfASubAccountFromASpecificNodeForAGivenTimeRange(xAccountApiKey, search, type, from, to, source, sourceId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Find all events from a account for a given time-range
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventRouterGetAllEventsFromAAccountForAGivenTimeRangeTest() throws ApiException {
        String xAccountApiKey = null;
        Long offset = null;
        Long limit = null;
        String search = null;
        String type = null;
        String from = null;
        String to = null;
        String source = null;
        String sourceId = null;
        List<ModelsQEvent> response = api.eventRouterGetAllEventsFromAAccountForAGivenTimeRange(xAccountApiKey, offset, limit, search, type, from, to, source, sourceId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Find all events of a account from a specific node
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventRouterGetAllEventsOfAAccountFromASpecificNodeTest() throws ApiException {
        String xAccountApiKey = null;
        List<ModelsQEvent> response = api.eventRouterGetAllEventsOfAAccountFromASpecificNode(xAccountApiKey);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Find Event From Node by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventRouterGetEventInNodeTest() throws ApiException {
        String xAccountApiKey = null;
        String eventId = null;
        ModelsQEvent response = api.eventRouterGetEventInNode(xAccountApiKey, eventId);

        // TODO: test validations
    }
    
}
