# MetadataApi

All URIs are relative to *http://api.nftrainbow.cn/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMetadata**](MetadataApi.md#createMetadata) | **POST** /metadata/ | Create NFT metadata |
| [**getMetadatInfo**](MetadataApi.md#getMetadatInfo) | **GET** /metadata/{metadata_id} | Query metadata |
| [**listMetadatas**](MetadataApi.md#listMetadatas) | **GET** /metadata/ | Obtain metadata list |



## createMetadata

> ModelsExposedMetadata createMetadata(authorization, metadataInfo)

Create NFT metadata

Create NFT metadata by providing the info including name, description and so on

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        MetadataApi apiInstance = new MetadataApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer openapi_token
        ServicesMetadataDto metadataInfo = new ServicesMetadataDto(); // ServicesMetadataDto | metadata_info
        try {
            ModelsExposedMetadata result = apiInstance.createMetadata(authorization, metadataInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#createMetadata");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**| Bearer openapi_token | |
| **metadataInfo** | [**ServicesMetadataDto**](ServicesMetadataDto.md)| metadata_info | |

### Return type

[**ModelsExposedMetadata**](ModelsExposedMetadata.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid request |  -  |
| **500** | Internal Server error |  -  |


## getMetadatInfo

> ModelsExposedMetadata getMetadatInfo(authorization, metadataId)

Query metadata

Query the metadata according to metadata_id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        MetadataApi apiInstance = new MetadataApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer openapi_token
        String metadataId = "metadataId_example"; // String | metadata_id
        try {
            ModelsExposedMetadata result = apiInstance.getMetadatInfo(authorization, metadataId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#getMetadatInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**| Bearer openapi_token | |
| **metadataId** | **String**| metadata_id | |

### Return type

[**ModelsExposedMetadata**](ModelsExposedMetadata.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid request |  -  |
| **500** | Internal Server error |  -  |


## listMetadatas

> ModelsExposedMetadataQueryResult listMetadatas(authorization, page, limit)

Obtain metadata list

Get the metadata list containing the info of the metadata created in the specified app

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        MetadataApi apiInstance = new MetadataApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer openapi_token
        String page = "page_example"; // String | page
        String limit = "limit_example"; // String | limit
        try {
            ModelsExposedMetadataQueryResult result = apiInstance.listMetadatas(authorization, page, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#listMetadatas");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**| Bearer openapi_token | |
| **page** | **String**| page | [optional] |
| **limit** | **String**| limit | [optional] |

### Return type

[**ModelsExposedMetadataQueryResult**](ModelsExposedMetadataQueryResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | Internal Server error |  -  |

