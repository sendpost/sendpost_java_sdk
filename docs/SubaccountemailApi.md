# SubaccountemailApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emailRouterSendEmail**](SubaccountemailApi.md#emailRouterSendEmail) | **POST** /subaccount/email/ | 


<a name="emailRouterSendEmail"></a>
# **emailRouterSendEmail**
> List&lt;ModelsEmailResponse&gt; emailRouterSendEmail(xSubAccountApiKey, body)



Send Email To Contacts

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountemailApi;


SubaccountemailApi apiInstance = new SubaccountemailApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
ModelsEmailMessage body = new ModelsEmailMessage(); // ModelsEmailMessage | The Email Message
try {
    List<ModelsEmailResponse> result = apiInstance.emailRouterSendEmail(xSubAccountApiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountemailApi#emailRouterSendEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **body** | [**ModelsEmailMessage**](ModelsEmailMessage.md)| The Email Message |

### Return type

[**List&lt;ModelsEmailResponse&gt;**](ModelsEmailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

