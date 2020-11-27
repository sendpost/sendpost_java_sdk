# ClusterApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clusterRouterDeleteItemFromCacheOfEveryNodeInCluster**](ClusterApi.md#clusterRouterDeleteItemFromCacheOfEveryNodeInCluster) | **DELETE** /cluster/cache | 
[**clusterRouterDeleteItemFromCacheOfSpecificNodeInCluster**](ClusterApi.md#clusterRouterDeleteItemFromCacheOfSpecificNodeInCluster) | **DELETE** /cluster/cache/node | 


<a name="clusterRouterDeleteItemFromCacheOfEveryNodeInCluster"></a>
# **clusterRouterDeleteItemFromCacheOfEveryNodeInCluster**
> clusterRouterDeleteItemFromCacheOfEveryNodeInCluster(xSystemApiKey, name, key)



Delete item from cache of every node in cluster

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xSystemApiKey = "xSystemApiKey_example"; // String | System API Key
String name = "name_example"; // String | cache name
String key = "key_example"; // String | cache item key to delete
try {
    apiInstance.clusterRouterDeleteItemFromCacheOfEveryNodeInCluster(xSystemApiKey, name, key);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#clusterRouterDeleteItemFromCacheOfEveryNodeInCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSystemApiKey** | **String**| System API Key |
 **name** | **String**| cache name | [optional]
 **key** | **String**| cache item key to delete | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clusterRouterDeleteItemFromCacheOfSpecificNodeInCluster"></a>
# **clusterRouterDeleteItemFromCacheOfSpecificNodeInCluster**
> clusterRouterDeleteItemFromCacheOfSpecificNodeInCluster(xSystemApiKey, name, key)



Delete item from cache of specific node in cluster

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xSystemApiKey = "xSystemApiKey_example"; // String | System API Key
String name = "name_example"; // String | cache name
String key = "key_example"; // String | cache item key to delete
try {
    apiInstance.clusterRouterDeleteItemFromCacheOfSpecificNodeInCluster(xSystemApiKey, name, key);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#clusterRouterDeleteItemFromCacheOfSpecificNodeInCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSystemApiKey** | **String**| System API Key |
 **name** | **String**| cache name | [optional]
 **key** | **String**| cache item key to delete | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

