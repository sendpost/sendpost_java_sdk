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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.ModelsBillingPortalSession;
import io.swagger.client.model.ModelsPaymentOptions;
import io.swagger.client.model.ModelsPaymentStatus;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountpaymentApi {
    private ApiClient apiClient;

    public AccountpaymentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccountpaymentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for paymentRouterCreateCustomerPortal
     * @param xAccountApiKey Account API Key (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentRouterCreateCustomerPortalCall(String xAccountApiKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/account/payment/portal";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xAccountApiKey != null)
        localVarHeaderParams.put("X-Account-ApiKey", apiClient.parameterToString(xAccountApiKey));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call paymentRouterCreateCustomerPortalValidateBeforeCall(String xAccountApiKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xAccountApiKey' is set
        if (xAccountApiKey == null) {
            throw new ApiException("Missing the required parameter 'xAccountApiKey' when calling paymentRouterCreateCustomerPortal(Async)");
        }
        

        com.squareup.okhttp.Call call = paymentRouterCreateCustomerPortalCall(xAccountApiKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Create Customer Portal for account
     * @param xAccountApiKey Account API Key (required)
     * @return ModelsBillingPortalSession
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ModelsBillingPortalSession paymentRouterCreateCustomerPortal(String xAccountApiKey) throws ApiException {
        ApiResponse<ModelsBillingPortalSession> resp = paymentRouterCreateCustomerPortalWithHttpInfo(xAccountApiKey);
        return resp.getData();
    }

    /**
     * 
     * Create Customer Portal for account
     * @param xAccountApiKey Account API Key (required)
     * @return ApiResponse&lt;ModelsBillingPortalSession&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ModelsBillingPortalSession> paymentRouterCreateCustomerPortalWithHttpInfo(String xAccountApiKey) throws ApiException {
        com.squareup.okhttp.Call call = paymentRouterCreateCustomerPortalValidateBeforeCall(xAccountApiKey, null, null);
        Type localVarReturnType = new TypeToken<ModelsBillingPortalSession>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create Customer Portal for account
     * @param xAccountApiKey Account API Key (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentRouterCreateCustomerPortalAsync(String xAccountApiKey, final ApiCallback<ModelsBillingPortalSession> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = paymentRouterCreateCustomerPortalValidateBeforeCall(xAccountApiKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ModelsBillingPortalSession>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentRouterCreatePaymentSubscription
     * @param xAccountApiKey Account API Key (required)
     * @param body PaymentOptions content (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentRouterCreatePaymentSubscriptionCall(String xAccountApiKey, ModelsPaymentOptions body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/account/payment/subscription";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xAccountApiKey != null)
        localVarHeaderParams.put("X-Account-ApiKey", apiClient.parameterToString(xAccountApiKey));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call paymentRouterCreatePaymentSubscriptionValidateBeforeCall(String xAccountApiKey, ModelsPaymentOptions body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xAccountApiKey' is set
        if (xAccountApiKey == null) {
            throw new ApiException("Missing the required parameter 'xAccountApiKey' when calling paymentRouterCreatePaymentSubscription(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling paymentRouterCreatePaymentSubscription(Async)");
        }
        

        com.squareup.okhttp.Call call = paymentRouterCreatePaymentSubscriptionCall(xAccountApiKey, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Create Payment Subscription for Stripe
     * @param xAccountApiKey Account API Key (required)
     * @param body PaymentOptions content (required)
     * @return ModelsPaymentStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ModelsPaymentStatus paymentRouterCreatePaymentSubscription(String xAccountApiKey, ModelsPaymentOptions body) throws ApiException {
        ApiResponse<ModelsPaymentStatus> resp = paymentRouterCreatePaymentSubscriptionWithHttpInfo(xAccountApiKey, body);
        return resp.getData();
    }

    /**
     * 
     * Create Payment Subscription for Stripe
     * @param xAccountApiKey Account API Key (required)
     * @param body PaymentOptions content (required)
     * @return ApiResponse&lt;ModelsPaymentStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ModelsPaymentStatus> paymentRouterCreatePaymentSubscriptionWithHttpInfo(String xAccountApiKey, ModelsPaymentOptions body) throws ApiException {
        com.squareup.okhttp.Call call = paymentRouterCreatePaymentSubscriptionValidateBeforeCall(xAccountApiKey, body, null, null);
        Type localVarReturnType = new TypeToken<ModelsPaymentStatus>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create Payment Subscription for Stripe
     * @param xAccountApiKey Account API Key (required)
     * @param body PaymentOptions content (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentRouterCreatePaymentSubscriptionAsync(String xAccountApiKey, ModelsPaymentOptions body, final ApiCallback<ModelsPaymentStatus> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = paymentRouterCreatePaymentSubscriptionValidateBeforeCall(xAccountApiKey, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ModelsPaymentStatus>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentRouterHandlePaymentWebhook
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentRouterHandlePaymentWebhookCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/account/payment/webhook";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call paymentRouterHandlePaymentWebhookValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = paymentRouterHandlePaymentWebhookCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Handle Payment Related Webhooks
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void paymentRouterHandlePaymentWebhook() throws ApiException {
        paymentRouterHandlePaymentWebhookWithHttpInfo();
    }

    /**
     * 
     * Handle Payment Related Webhooks
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> paymentRouterHandlePaymentWebhookWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = paymentRouterHandlePaymentWebhookValidateBeforeCall(null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Handle Payment Related Webhooks
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentRouterHandlePaymentWebhookAsync(final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = paymentRouterHandlePaymentWebhookValidateBeforeCall(progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
