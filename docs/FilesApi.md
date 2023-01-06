# FilesApi

All URIs are relative to *http://api.nftrainbow.cn/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listFiles**](FilesApi.md#listFiles) | **GET** /files/ | Obtain file list |
| [**uploadFile**](FilesApi.md#uploadFile) | **POST** /files/ | Upload file |
| [**uploadFileToOss**](FilesApi.md#uploadFileToOss) | **POST** /files/oss | Upload file to OSS |



## listFiles

> ModelsFilesQueryResult listFiles(authorization, page, limit)

Obtain file list

Get the file list containing the info of the files uploaded in the specified app

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        FilesApi apiInstance = new FilesApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer openapi_token
        String page = "page_example"; // String | page
        String limit = "limit_example"; // String | limit
        try {
            ModelsFilesQueryResult result = apiInstance.listFiles(authorization, page, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#listFiles");
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

[**ModelsFilesQueryResult**](ModelsFilesQueryResult.md)

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


## uploadFile

> ServicesUploadFilesResponse uploadFile(authorization, _file)

Upload file

Upload a file which can be a video, an image and so on

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        FilesApi apiInstance = new FilesApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer openapi_token
        File _file = new File("/path/to/file"); // File | uploaded file
        try {
            ServicesUploadFilesResponse result = apiInstance.uploadFile(authorization, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#uploadFile");
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
| **_file** | **File**| uploaded file | |

### Return type

[**ServicesUploadFilesResponse**](ServicesUploadFilesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | Internal Server error |  -  |


## uploadFileToOss

> ServicesUploadFilesResponse uploadFileToOss(authorization, _file)

Upload file to OSS

Upload a file to OSS, which can be a video, an image and so on

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        FilesApi apiInstance = new FilesApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer openapi_token
        File _file = new File("/path/to/file"); // File | uploaded file
        try {
            ServicesUploadFilesResponse result = apiInstance.uploadFileToOss(authorization, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#uploadFileToOss");
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
| **_file** | **File**| uploaded file | |

### Return type

[**ServicesUploadFilesResponse**](ServicesUploadFilesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | Internal Server error |  -  |

