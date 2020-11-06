# TrackApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**trackRouterTrackEmailOpen**](TrackApi.md#trackRouterTrackEmailOpen) | **GET** /track/open/{accountId}/{subAccountId}/{ipId}/{emailType}/{messageId}/1.png | 
[**trackRouterTrackLinkClick**](TrackApi.md#trackRouterTrackLinkClick) | **GET** /track/click/{accountId}/{subAccountId}/{ipId}/{emailType}/{messageId} | 
[**trackRouterTrackUnsubscribe**](TrackApi.md#trackRouterTrackUnsubscribe) | **GET** /track/unsubscribe/{accountId}/{subAccountId}/{ipId}/{emailType}/{messageId} | 


<a name="trackRouterTrackEmailOpen"></a>
# **trackRouterTrackEmailOpen**
> trackRouterTrackEmailOpen(ipId, accountId, subAccountId, messageId, emailType)



Track Email Open

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TrackApi;


TrackApi apiInstance = new TrackApi();
Long ipId = 789L; // Long | The id of ip from which this email message was sent
Long accountId = 789L; // Long | The id of account from which email is being sent
Long subAccountId = 789L; // Long | The id of sub-account from which email is being sent
String messageId = "messageId_example"; // String | The UUID of message which was sent
String emailType = "emailType_example"; // String | The type of email such as gmail, yahoo etc. which was sent. This is inferred from to email address
try {
    apiInstance.trackRouterTrackEmailOpen(ipId, accountId, subAccountId, messageId, emailType);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackApi#trackRouterTrackEmailOpen");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipId** | **Long**| The id of ip from which this email message was sent |
 **accountId** | **Long**| The id of account from which email is being sent |
 **subAccountId** | **Long**| The id of sub-account from which email is being sent |
 **messageId** | **String**| The UUID of message which was sent |
 **emailType** | **String**| The type of email such as gmail, yahoo etc. which was sent. This is inferred from to email address |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="trackRouterTrackLinkClick"></a>
# **trackRouterTrackLinkClick**
> trackRouterTrackLinkClick(ipId, accountId, subAccountId, messageId, emailType, redirecturl)



Track Link Click

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TrackApi;


TrackApi apiInstance = new TrackApi();
Long ipId = 789L; // Long | The id of ip from which this email message was sent
Long accountId = 789L; // Long | The id of account from which email is being sent
Long subAccountId = 789L; // Long | The id of sub-account from which email is being sent
String messageId = "messageId_example"; // String | The UUID of message which was sent
String emailType = "emailType_example"; // String | The type of email such as gmail, yahoo etc. which was sent. This is inferred from to email address
String redirecturl = "redirecturl_example"; // String | The encoded redirect URL
try {
    apiInstance.trackRouterTrackLinkClick(ipId, accountId, subAccountId, messageId, emailType, redirecturl);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackApi#trackRouterTrackLinkClick");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipId** | **Long**| The id of ip from which this email message was sent |
 **accountId** | **Long**| The id of account from which email is being sent |
 **subAccountId** | **Long**| The id of sub-account from which email is being sent |
 **messageId** | **String**| The UUID of message which was sent |
 **emailType** | **String**| The type of email such as gmail, yahoo etc. which was sent. This is inferred from to email address |
 **redirecturl** | **String**| The encoded redirect URL |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="trackRouterTrackUnsubscribe"></a>
# **trackRouterTrackUnsubscribe**
> trackRouterTrackUnsubscribe(ipId, accountId, subAccountId, messageId, emailType)



track link click

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TrackApi;


TrackApi apiInstance = new TrackApi();
Long ipId = 789L; // Long | The id of ip from which this email message was sent
Long accountId = 789L; // Long | The id of account from which email is being sent
Long subAccountId = 789L; // Long | The id of sub-account from which email is being sent
String messageId = "messageId_example"; // String | The UUID of message which was sent
String emailType = "emailType_example"; // String | The type of email such as gmail, yahoo etc. which was sent. This is inferred from to email address
try {
    apiInstance.trackRouterTrackUnsubscribe(ipId, accountId, subAccountId, messageId, emailType);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackApi#trackRouterTrackUnsubscribe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipId** | **Long**| The id of ip from which this email message was sent |
 **accountId** | **Long**| The id of account from which email is being sent |
 **subAccountId** | **Long**| The id of sub-account from which email is being sent |
 **messageId** | **String**| The UUID of message which was sent |
 **emailType** | **String**| The type of email such as gmail, yahoo etc. which was sent. This is inferred from to email address |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

