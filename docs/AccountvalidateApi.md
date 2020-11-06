# AccountvalidateApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**validateRouterValidateEmailBulk**](AccountvalidateApi.md#validateRouterValidateEmailBulk) | **POST** /account/validate/bulk | 


<a name="validateRouterValidateEmailBulk"></a>
# **validateRouterValidateEmailBulk**
> ModelsBulkResponse validateRouterValidateEmailBulk(fileinput, xAccountApiKey)



Validate Emails In File Asynchronously

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountvalidateApi;


AccountvalidateApi apiInstance = new AccountvalidateApi();
File fileinput = new File("/path/to/file.txt"); // File | CSV whose emails need to be validated
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
try {
    ModelsBulkResponse result = apiInstance.validateRouterValidateEmailBulk(fileinput, xAccountApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountvalidateApi#validateRouterValidateEmailBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileinput** | **File**| CSV whose emails need to be validated |
 **xAccountApiKey** | **String**| Account API Key |

### Return type

[**ModelsBulkResponse**](ModelsBulkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

