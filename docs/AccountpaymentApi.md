# AccountpaymentApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentRouterCreateCustomerPortal**](AccountpaymentApi.md#paymentRouterCreateCustomerPortal) | **POST** /account/payment/portal | 
[**paymentRouterCreatePaymentSubscription**](AccountpaymentApi.md#paymentRouterCreatePaymentSubscription) | **POST** /account/payment/subscription | 
[**paymentRouterHandlePaymentWebhook**](AccountpaymentApi.md#paymentRouterHandlePaymentWebhook) | **POST** /account/payment/webhook | 


<a name="paymentRouterCreateCustomerPortal"></a>
# **paymentRouterCreateCustomerPortal**
> ModelsBillingPortalSession paymentRouterCreateCustomerPortal(xAccountApiKey)



Create Customer Portal for account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountpaymentApi;


AccountpaymentApi apiInstance = new AccountpaymentApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
try {
    ModelsBillingPortalSession result = apiInstance.paymentRouterCreateCustomerPortal(xAccountApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountpaymentApi#paymentRouterCreateCustomerPortal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |

### Return type

[**ModelsBillingPortalSession**](ModelsBillingPortalSession.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="paymentRouterCreatePaymentSubscription"></a>
# **paymentRouterCreatePaymentSubscription**
> ModelsPaymentStatus paymentRouterCreatePaymentSubscription(xAccountApiKey, body)



Create Payment Subscription for Stripe

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountpaymentApi;


AccountpaymentApi apiInstance = new AccountpaymentApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
ModelsPaymentOptions body = new ModelsPaymentOptions(); // ModelsPaymentOptions | PaymentOptions content
try {
    ModelsPaymentStatus result = apiInstance.paymentRouterCreatePaymentSubscription(xAccountApiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountpaymentApi#paymentRouterCreatePaymentSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **body** | [**ModelsPaymentOptions**](ModelsPaymentOptions.md)| PaymentOptions content |

### Return type

[**ModelsPaymentStatus**](ModelsPaymentStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="paymentRouterHandlePaymentWebhook"></a>
# **paymentRouterHandlePaymentWebhook**
> paymentRouterHandlePaymentWebhook()



Handle Payment Related Webhooks

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountpaymentApi;


AccountpaymentApi apiInstance = new AccountpaymentApi();
try {
    apiInstance.paymentRouterHandlePaymentWebhook();
} catch (ApiException e) {
    System.err.println("Exception when calling AccountpaymentApi#paymentRouterHandlePaymentWebhook");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

