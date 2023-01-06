# MintsApi

All URIs are relative to *http://api.nftrainbow.cn/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchCustomMint**](MintsApi.md#batchCustomMint) | **POST** /mints/customizable/batch | Batch Mint NFTs |
| [**customMint**](MintsApi.md#customMint) | **POST** /mints/ | Mint NFT |
| [**easyMintByFile**](MintsApi.md#easyMintByFile) | **POST** /mints/easy/files | Mint NFT with file |
| [**easyMintByMetadata**](MintsApi.md#easyMintByMetadata) | **POST** /mints/easy/urls | Mint NFT with metadata |
| [**getMintDetail**](MintsApi.md#getMintDetail) | **GET** /mints/{id} | Mint NFT detail |
| [**listMints**](MintsApi.md#listMints) | **GET** /mints/ | Obtain NFT list |



## batchCustomMint

> List&lt;ModelsMintTask&gt; batchCustomMint(authorization, customMintBatchDto)

Batch Mint NFTs

Mint several NFTs once

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MintsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        MintsApi apiInstance = new MintsApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        ServicesCustomMintBatchDto customMintBatchDto = new ServicesCustomMintBatchDto(); // ServicesCustomMintBatchDto | custom_mint_batch_dto
        try {
            List<ModelsMintTask> result = apiInstance.batchCustomMint(authorization, customMintBatchDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MintsApi#batchCustomMint");
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
| **authorization** | **String**| Bearer Open_JWT | |
| **customMintBatchDto** | [**ServicesCustomMintBatchDto**](ServicesCustomMintBatchDto.md)| custom_mint_batch_dto | |

### Return type

[**List&lt;ModelsMintTask&gt;**](ModelsMintTask.md)

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


## customMint

> ModelsMintTask customMint(authorization, customMintDto)

Mint NFT

Mint a NFT by providing a metadata url

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MintsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        MintsApi apiInstance = new MintsApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        ServicesCustomMintDto customMintDto = new ServicesCustomMintDto(); // ServicesCustomMintDto | custom_mint_dto
        try {
            ModelsMintTask result = apiInstance.customMint(authorization, customMintDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MintsApi#customMint");
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
| **authorization** | **String**| Bearer Open_JWT | |
| **customMintDto** | [**ServicesCustomMintDto**](ServicesCustomMintDto.md)| custom_mint_dto | |

### Return type

[**ModelsMintTask**](ModelsMintTask.md)

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


## easyMintByFile

> ModelsMintTask easyMintByFile(authorization, _file)

Mint NFT with file

Mint a NFT by uploading a file which can be a video, image and so on

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MintsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        MintsApi apiInstance = new MintsApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        File _file = new File("/path/to/file"); // File | file
        try {
            ModelsMintTask result = apiInstance.easyMintByFile(authorization, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MintsApi#easyMintByFile");
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
| **authorization** | **String**| Bearer Open_JWT | |
| **_file** | **File**| file | |

### Return type

[**ModelsMintTask**](ModelsMintTask.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid request |  -  |
| **500** | Internal Server error |  -  |


## easyMintByMetadata

> ModelsMintTask easyMintByMetadata(authorization, easyMintMetaInfo)

Mint NFT with metadata

Mint a NFT by providing a file url to create the metadata

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MintsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        MintsApi apiInstance = new MintsApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        ServicesEasyMintMetaDto easyMintMetaInfo = new ServicesEasyMintMetaDto(); // ServicesEasyMintMetaDto | easy_mint_meta_info
        try {
            ModelsMintTask result = apiInstance.easyMintByMetadata(authorization, easyMintMetaInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MintsApi#easyMintByMetadata");
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
| **authorization** | **String**| Bearer Open_JWT | |
| **easyMintMetaInfo** | [**ServicesEasyMintMetaDto**](ServicesEasyMintMetaDto.md)| easy_mint_meta_info | |

### Return type

[**ModelsMintTask**](ModelsMintTask.md)

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


## getMintDetail

> ModelsMintTask getMintDetail(authorization, id)

Mint NFT detail

Get NFT detail info

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MintsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        MintsApi apiInstance = new MintsApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        Integer id = 56; // Integer | id
        try {
            ModelsMintTask result = apiInstance.getMintDetail(authorization, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MintsApi#getMintDetail");
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
| **authorization** | **String**| Bearer Open_JWT | |
| **id** | **Integer**| id | |

### Return type

[**ModelsMintTask**](ModelsMintTask.md)

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


## listMints

> ModelsMintTaskQueryResult listMints(authorization, page, limit, contract, mintTo)

Obtain NFT list

Get the NFT list containing the NFTs minted in the specified app

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MintsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        MintsApi apiInstance = new MintsApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        Integer page = 56; // Integer | page
        Integer limit = 56; // Integer | limit
        String contract = "contract_example"; // String | contract
        String mintTo = "mintTo_example"; // String | mint_to
        try {
            ModelsMintTaskQueryResult result = apiInstance.listMints(authorization, page, limit, contract, mintTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MintsApi#listMints");
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
| **authorization** | **String**| Bearer Open_JWT | |
| **page** | **Integer**| page | [optional] |
| **limit** | **Integer**| limit | [optional] |
| **contract** | **String**| contract | [optional] |
| **mintTo** | **String**| mint_to | [optional] |

### Return type

[**ModelsMintTaskQueryResult**](ModelsMintTaskQueryResult.md)

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

