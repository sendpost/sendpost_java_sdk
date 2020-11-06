# AccountinvitationApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invitationRouterCreate**](AccountinvitationApi.md#invitationRouterCreate) | **POST** /account/invitation/ | 
[**invitationRouterDelete**](AccountinvitationApi.md#invitationRouterDelete) | **DELETE** /account/invitation/{invitationId} | 
[**invitationRouterGetAll**](AccountinvitationApi.md#invitationRouterGetAll) | **GET** /account/invitation/ | 


<a name="invitationRouterCreate"></a>
# **invitationRouterCreate**
> ModelsInvitation invitationRouterCreate(xAccountApiKey, body)



Create Invitation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountinvitationApi;


AccountinvitationApi apiInstance = new AccountinvitationApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
ModelsEInvitation body = new ModelsEInvitation(); // ModelsEInvitation | The Invitation content
try {
    ModelsInvitation result = apiInstance.invitationRouterCreate(xAccountApiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountinvitationApi#invitationRouterCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **body** | [**ModelsEInvitation**](ModelsEInvitation.md)| The Invitation content |

### Return type

[**ModelsInvitation**](ModelsInvitation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invitationRouterDelete"></a>
# **invitationRouterDelete**
> ModelsDeleteResponse invitationRouterDelete(xAccountApiKey, invitationId)



Delete Invitation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountinvitationApi;


AccountinvitationApi apiInstance = new AccountinvitationApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long invitationId = 789L; // Long | The InvitationId you want to delete
try {
    ModelsDeleteResponse result = apiInstance.invitationRouterDelete(xAccountApiKey, invitationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountinvitationApi#invitationRouterDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **invitationId** | **Long**| The InvitationId you want to delete |

### Return type

[**ModelsDeleteResponse**](ModelsDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invitationRouterGetAll"></a>
# **invitationRouterGetAll**
> List&lt;ModelsInvitation&gt; invitationRouterGetAll(xAccountApiKey)



Get All Invitations

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountinvitationApi;


AccountinvitationApi apiInstance = new AccountinvitationApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
try {
    List<ModelsInvitation> result = apiInstance.invitationRouterGetAll(xAccountApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountinvitationApi#invitationRouterGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |

### Return type

[**List&lt;ModelsInvitation&gt;**](ModelsInvitation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

