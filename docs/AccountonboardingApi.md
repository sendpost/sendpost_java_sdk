# AccountonboardingApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**onboardingRouterGetOnboardingChecklist**](AccountonboardingApi.md#onboardingRouterGetOnboardingChecklist) | **GET** /account/onboarding/checklist | 


<a name="onboardingRouterGetOnboardingChecklist"></a>
# **onboardingRouterGetOnboardingChecklist**
> ModelsOnboardingChecklist onboardingRouterGetOnboardingChecklist(xAccountApiKey)



Gets Onboarding Checklist data for account if not present creates a default entry

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountonboardingApi;


AccountonboardingApi apiInstance = new AccountonboardingApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
try {
    ModelsOnboardingChecklist result = apiInstance.onboardingRouterGetOnboardingChecklist(xAccountApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountonboardingApi#onboardingRouterGetOnboardingChecklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |

### Return type

[**ModelsOnboardingChecklist**](ModelsOnboardingChecklist.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

