# SmtpApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sMTPRouterReceiveWebhooksRaisedFromSMTPServers**](SmtpApi.md#sMTPRouterReceiveWebhooksRaisedFromSMTPServers) | **POST** /smtp/webhook | 


<a name="sMTPRouterReceiveWebhooksRaisedFromSMTPServers"></a>
# **sMTPRouterReceiveWebhooksRaisedFromSMTPServers**
> sMTPRouterReceiveWebhooksRaisedFromSMTPServers(body)



Receive webhooks raised from SMTP servers

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SmtpApi;


SmtpApi apiInstance = new SmtpApi();
ModelsWMessage body = new ModelsWMessage(); // ModelsWMessage | The Webhook content
try {
    apiInstance.sMTPRouterReceiveWebhooksRaisedFromSMTPServers(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SmtpApi#sMTPRouterReceiveWebhooksRaisedFromSMTPServers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModelsWMessage**](ModelsWMessage.md)| The Webhook content |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

