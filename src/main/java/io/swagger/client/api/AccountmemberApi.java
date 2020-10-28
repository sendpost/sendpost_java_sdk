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


import io.swagger.client.model.ModelsDeleteResponse;
import io.swagger.client.model.ModelsMember;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountmemberApi {
    private ApiClient apiClient;

    public AccountmemberApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccountmemberApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for memberRouterDelete
     * @param xAccountApiKey Account API Key (required)
     * @param memberId The MemberId you want to delete (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call memberRouterDeleteCall(String xAccountApiKey, Long memberId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/account/member/{memberId}"
            .replaceAll("\\{" + "memberId" + "\\}", apiClient.escapeString(memberId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call memberRouterDeleteValidateBeforeCall(String xAccountApiKey, Long memberId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xAccountApiKey' is set
        if (xAccountApiKey == null) {
            throw new ApiException("Missing the required parameter 'xAccountApiKey' when calling memberRouterDelete(Async)");
        }
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException("Missing the required parameter 'memberId' when calling memberRouterDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = memberRouterDeleteCall(xAccountApiKey, memberId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Delete Member
     * @param xAccountApiKey Account API Key (required)
     * @param memberId The MemberId you want to delete (required)
     * @return ModelsDeleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ModelsDeleteResponse memberRouterDelete(String xAccountApiKey, Long memberId) throws ApiException {
        ApiResponse<ModelsDeleteResponse> resp = memberRouterDeleteWithHttpInfo(xAccountApiKey, memberId);
        return resp.getData();
    }

    /**
     * 
     * Delete Member
     * @param xAccountApiKey Account API Key (required)
     * @param memberId The MemberId you want to delete (required)
     * @return ApiResponse&lt;ModelsDeleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ModelsDeleteResponse> memberRouterDeleteWithHttpInfo(String xAccountApiKey, Long memberId) throws ApiException {
        com.squareup.okhttp.Call call = memberRouterDeleteValidateBeforeCall(xAccountApiKey, memberId, null, null);
        Type localVarReturnType = new TypeToken<ModelsDeleteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Delete Member
     * @param xAccountApiKey Account API Key (required)
     * @param memberId The MemberId you want to delete (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call memberRouterDeleteAsync(String xAccountApiKey, Long memberId, final ApiCallback<ModelsDeleteResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = memberRouterDeleteValidateBeforeCall(xAccountApiKey, memberId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ModelsDeleteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for memberRouterGet
     * @param xAccountApiKey Account API Key (required)
     * @param memberId the MemberId you want to get (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call memberRouterGetCall(String xAccountApiKey, Long memberId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/account/member/{memberId}"
            .replaceAll("\\{" + "memberId" + "\\}", apiClient.escapeString(memberId.toString()));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call memberRouterGetValidateBeforeCall(String xAccountApiKey, Long memberId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xAccountApiKey' is set
        if (xAccountApiKey == null) {
            throw new ApiException("Missing the required parameter 'xAccountApiKey' when calling memberRouterGet(Async)");
        }
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException("Missing the required parameter 'memberId' when calling memberRouterGet(Async)");
        }
        

        com.squareup.okhttp.Call call = memberRouterGetCall(xAccountApiKey, memberId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Find Member by MemberId
     * @param xAccountApiKey Account API Key (required)
     * @param memberId the MemberId you want to get (required)
     * @return ModelsMember
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ModelsMember memberRouterGet(String xAccountApiKey, Long memberId) throws ApiException {
        ApiResponse<ModelsMember> resp = memberRouterGetWithHttpInfo(xAccountApiKey, memberId);
        return resp.getData();
    }

    /**
     * 
     * Find Member by MemberId
     * @param xAccountApiKey Account API Key (required)
     * @param memberId the MemberId you want to get (required)
     * @return ApiResponse&lt;ModelsMember&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ModelsMember> memberRouterGetWithHttpInfo(String xAccountApiKey, Long memberId) throws ApiException {
        com.squareup.okhttp.Call call = memberRouterGetValidateBeforeCall(xAccountApiKey, memberId, null, null);
        Type localVarReturnType = new TypeToken<ModelsMember>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Find Member by MemberId
     * @param xAccountApiKey Account API Key (required)
     * @param memberId the MemberId you want to get (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call memberRouterGetAsync(String xAccountApiKey, Long memberId, final ApiCallback<ModelsMember> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = memberRouterGetValidateBeforeCall(xAccountApiKey, memberId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ModelsMember>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for memberRouterGetAll
     * @param xAccountApiKey Account API Key (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call memberRouterGetAllCall(String xAccountApiKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/account/member/";

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call memberRouterGetAllValidateBeforeCall(String xAccountApiKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xAccountApiKey' is set
        if (xAccountApiKey == null) {
            throw new ApiException("Missing the required parameter 'xAccountApiKey' when calling memberRouterGetAll(Async)");
        }
        

        com.squareup.okhttp.Call call = memberRouterGetAllCall(xAccountApiKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Get All Members
     * @param xAccountApiKey Account API Key (required)
     * @return List&lt;ModelsMember&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ModelsMember> memberRouterGetAll(String xAccountApiKey) throws ApiException {
        ApiResponse<List<ModelsMember>> resp = memberRouterGetAllWithHttpInfo(xAccountApiKey);
        return resp.getData();
    }

    /**
     * 
     * Get All Members
     * @param xAccountApiKey Account API Key (required)
     * @return ApiResponse&lt;List&lt;ModelsMember&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ModelsMember>> memberRouterGetAllWithHttpInfo(String xAccountApiKey) throws ApiException {
        com.squareup.okhttp.Call call = memberRouterGetAllValidateBeforeCall(xAccountApiKey, null, null);
        Type localVarReturnType = new TypeToken<List<ModelsMember>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get All Members
     * @param xAccountApiKey Account API Key (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call memberRouterGetAllAsync(String xAccountApiKey, final ApiCallback<List<ModelsMember>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = memberRouterGetAllValidateBeforeCall(xAccountApiKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ModelsMember>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}