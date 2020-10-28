# AccountmemberApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**memberRouterDelete**](AccountmemberApi.md#memberRouterDelete) | **DELETE** /account/member/{memberId} | 
[**memberRouterGet**](AccountmemberApi.md#memberRouterGet) | **GET** /account/member/{memberId} | 
[**memberRouterGetAll**](AccountmemberApi.md#memberRouterGetAll) | **GET** /account/member/ | 


<a name="memberRouterDelete"></a>
# **memberRouterDelete**
> ModelsDeleteResponse memberRouterDelete(xAccountApiKey, memberId)



Delete Member

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountmemberApi;


AccountmemberApi apiInstance = new AccountmemberApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long memberId = 789L; // Long | The MemberId you want to delete
try {
    ModelsDeleteResponse result = apiInstance.memberRouterDelete(xAccountApiKey, memberId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountmemberApi#memberRouterDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **memberId** | **Long**| The MemberId you want to delete |

### Return type

[**ModelsDeleteResponse**](ModelsDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="memberRouterGet"></a>
# **memberRouterGet**
> ModelsMember memberRouterGet(xAccountApiKey, memberId)



Find Member by MemberId

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountmemberApi;


AccountmemberApi apiInstance = new AccountmemberApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long memberId = 789L; // Long | the MemberId you want to get
try {
    ModelsMember result = apiInstance.memberRouterGet(xAccountApiKey, memberId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountmemberApi#memberRouterGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **memberId** | **Long**| the MemberId you want to get |

### Return type

[**ModelsMember**](ModelsMember.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="memberRouterGetAll"></a>
# **memberRouterGetAll**
> List&lt;ModelsMember&gt; memberRouterGetAll(xAccountApiKey)



Get All Members

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountmemberApi;


AccountmemberApi apiInstance = new AccountmemberApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
try {
    List<ModelsMember> result = apiInstance.memberRouterGetAll(xAccountApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountmemberApi#memberRouterGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |

### Return type

[**List&lt;ModelsMember&gt;**](ModelsMember.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

