# AccountrecipientApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**recipientRouterGetAllMessagesForARecipient**](AccountrecipientApi.md#recipientRouterGetAllMessagesForARecipient) | **GET** /account/recipient/{recipient}/messages | 
[**recipientRouterGetAllMessagesForARecipientFromANode**](AccountrecipientApi.md#recipientRouterGetAllMessagesForARecipientFromANode) | **GET** /account/recipient/node/{recipient}/messages | 


<a name="recipientRouterGetAllMessagesForARecipient"></a>
# **recipientRouterGetAllMessagesForARecipient**
> List&lt;ModelsQEmailMessage&gt; recipientRouterGetAllMessagesForARecipient(xAccountApiKey, recipient)



Find all messages sent to a specific recipient

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountrecipientApi;


AccountrecipientApi apiInstance = new AccountrecipientApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
String recipient = "recipient_example"; // String | email of the recipient
try {
    List<ModelsQEmailMessage> result = apiInstance.recipientRouterGetAllMessagesForARecipient(xAccountApiKey, recipient);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountrecipientApi#recipientRouterGetAllMessagesForARecipient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **recipient** | **String**| email of the recipient |

### Return type

[**List&lt;ModelsQEmailMessage&gt;**](ModelsQEmailMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="recipientRouterGetAllMessagesForARecipientFromANode"></a>
# **recipientRouterGetAllMessagesForARecipientFromANode**
> List&lt;ModelsQEmailMessage&gt; recipientRouterGetAllMessagesForARecipientFromANode(xAccountApiKey, recipient)



Find all message sent to a recipient from a specific node

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountrecipientApi;


AccountrecipientApi apiInstance = new AccountrecipientApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
String recipient = "recipient_example"; // String | email of the recipient
try {
    List<ModelsQEmailMessage> result = apiInstance.recipientRouterGetAllMessagesForARecipientFromANode(xAccountApiKey, recipient);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountrecipientApi#recipientRouterGetAllMessagesForARecipientFromANode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **recipient** | **String**| email of the recipient |

### Return type

[**List&lt;ModelsQEmailMessage&gt;**](ModelsQEmailMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

