# AuthApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authRouterCreate**](AuthApi.md#authRouterCreate) | **POST** /auth/create | 
[**authRouterGetAuthInfo**](AuthApi.md#authRouterGetAuthInfo) | **POST** /auth/info | 
[**authRouterUpdateAuthInfo**](AuthApi.md#authRouterUpdateAuthInfo) | **PUT** /auth/info | 


<a name="authRouterCreate"></a>
# **authRouterCreate**
> ModelsAccount authRouterCreate(body, xToken)



Create Account, sub-account and member

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
ModelsEAccount body = new ModelsEAccount(); // ModelsEAccount | The Account content
String xToken = "xToken_example"; // String | Firebase dynamic token
try {
    ModelsAccount result = apiInstance.authRouterCreate(body, xToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#authRouterCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModelsEAccount**](ModelsEAccount.md)| The Account content |
 **xToken** | **String**| Firebase dynamic token |

### Return type

[**ModelsAccount**](ModelsAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="authRouterGetAuthInfo"></a>
# **authRouterGetAuthInfo**
> ModelsAuthInfo authRouterGetAuthInfo(body, xToken)



Get Auth Info Details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
ModelsEAccount body = new ModelsEAccount(); // ModelsEAccount | The Account content
String xToken = "xToken_example"; // String | Firebase dynamic token
try {
    ModelsAuthInfo result = apiInstance.authRouterGetAuthInfo(body, xToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#authRouterGetAuthInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModelsEAccount**](ModelsEAccount.md)| The Account content |
 **xToken** | **String**| Firebase dynamic token |

### Return type

[**ModelsAuthInfo**](ModelsAuthInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="authRouterUpdateAuthInfo"></a>
# **authRouterUpdateAuthInfo**
> ModelsAuthInfo authRouterUpdateAuthInfo(body, xToken)



Updates member and accounts related for email verification and on boarding answers

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
ModelsEAccountMember body = new ModelsEAccountMember(); // ModelsEAccountMember | The Account Member content
String xToken = "xToken_example"; // String | Firebase dynamic token
try {
    ModelsAuthInfo result = apiInstance.authRouterUpdateAuthInfo(body, xToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#authRouterUpdateAuthInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModelsEAccountMember**](ModelsEAccountMember.md)| The Account Member content |
 **xToken** | **String**| Firebase dynamic token |

### Return type

[**ModelsAuthInfo**](ModelsAuthInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
