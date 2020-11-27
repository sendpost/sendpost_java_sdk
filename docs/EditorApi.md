# EditorApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**editorApiRouterGetToken**](EditorApi.md#editorApiRouterGetToken) | **GET** /editor/ | 


<a name="editorApiRouterGetToken"></a>
# **editorApiRouterGetToken**
> ModelsEditorTokenResponse editorApiRouterGetToken(xAccountApiKey)



fetch Bee editor token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EditorApi;


EditorApi apiInstance = new EditorApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
try {
    ModelsEditorTokenResponse result = apiInstance.editorApiRouterGetToken(xAccountApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditorApi#editorApiRouterGetToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |

### Return type

[**ModelsEditorTokenResponse**](ModelsEditorTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

