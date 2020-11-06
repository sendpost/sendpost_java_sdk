# ClusterApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clusterRouterAddItemsToAccountWebhookCacheOfEveryNodeInCluster**](ClusterApi.md#clusterRouterAddItemsToAccountWebhookCacheOfEveryNodeInCluster) | **POST** /cluster/webhook/cache | 
[**clusterRouterAddItemsToSuppressionFilterOfEveryNodeInCluster**](ClusterApi.md#clusterRouterAddItemsToSuppressionFilterOfEveryNodeInCluster) | **POST** /cluster/suppression/filter | 
[**clusterRouterDeleteItemsFromSuppressionFilterOfEveryNodeInCluster**](ClusterApi.md#clusterRouterDeleteItemsFromSuppressionFilterOfEveryNodeInCluster) | **DELETE** /cluster/suppression/filter | 
[**clusterRouterDeleteItemsFromWebhookFilterOfEveryNodeInCluster**](ClusterApi.md#clusterRouterDeleteItemsFromWebhookFilterOfEveryNodeInCluster) | **DELETE** /cluster/webhook/cache | 


<a name="clusterRouterAddItemsToAccountWebhookCacheOfEveryNodeInCluster"></a>
# **clusterRouterAddItemsToAccountWebhookCacheOfEveryNodeInCluster**
> clusterRouterAddItemsToAccountWebhookCacheOfEveryNodeInCluster(body)



Add items to account webhook cache of every node in cluster

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
ModelsAccountWebhook body = new ModelsAccountWebhook(); // ModelsAccountWebhook | Add account webhooks to account webhook cache
try {
    apiInstance.clusterRouterAddItemsToAccountWebhookCacheOfEveryNodeInCluster(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#clusterRouterAddItemsToAccountWebhookCacheOfEveryNodeInCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModelsAccountWebhook**](ModelsAccountWebhook.md)| Add account webhooks to account webhook cache |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clusterRouterAddItemsToSuppressionFilterOfEveryNodeInCluster"></a>
# **clusterRouterAddItemsToSuppressionFilterOfEveryNodeInCluster**
> clusterRouterAddItemsToSuppressionFilterOfEveryNodeInCluster(body)



Add items to suppression filter of every node in cluster

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
ModelsSuppression body = new ModelsSuppression(); // ModelsSuppression | Add suppressions to suppression filter
try {
    apiInstance.clusterRouterAddItemsToSuppressionFilterOfEveryNodeInCluster(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#clusterRouterAddItemsToSuppressionFilterOfEveryNodeInCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModelsSuppression**](ModelsSuppression.md)| Add suppressions to suppression filter |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clusterRouterDeleteItemsFromSuppressionFilterOfEveryNodeInCluster"></a>
# **clusterRouterDeleteItemsFromSuppressionFilterOfEveryNodeInCluster**
> clusterRouterDeleteItemsFromSuppressionFilterOfEveryNodeInCluster(body)



Delete items from suppression filter of every node in cluster

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
ModelsSuppression body = new ModelsSuppression(); // ModelsSuppression | Delete suppressions from suppression filter
try {
    apiInstance.clusterRouterDeleteItemsFromSuppressionFilterOfEveryNodeInCluster(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#clusterRouterDeleteItemsFromSuppressionFilterOfEveryNodeInCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModelsSuppression**](ModelsSuppression.md)| Delete suppressions from suppression filter |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clusterRouterDeleteItemsFromWebhookFilterOfEveryNodeInCluster"></a>
# **clusterRouterDeleteItemsFromWebhookFilterOfEveryNodeInCluster**
> clusterRouterDeleteItemsFromWebhookFilterOfEveryNodeInCluster(body)



Delete items from webhook filter of every node in cluster

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
ModelsAccountWebhook body = new ModelsAccountWebhook(); // ModelsAccountWebhook | Delete webhooks from webhook filter
try {
    apiInstance.clusterRouterDeleteItemsFromWebhookFilterOfEveryNodeInCluster(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#clusterRouterDeleteItemsFromWebhookFilterOfEveryNodeInCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModelsAccountWebhook**](ModelsAccountWebhook.md)| Delete webhooks from webhook filter |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

