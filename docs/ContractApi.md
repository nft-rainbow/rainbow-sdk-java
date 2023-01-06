# ContractApi

All URIs are relative to *http://api.nftrainbow.cn/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addContractSponsorWhitelist**](ContractApi.md#addContractSponsorWhitelist) | **POST** /contracts/{address}/sponsor/whitelist | Add contract sponsored whitelist |
| [**deployContract**](ContractApi.md#deployContract) | **POST** /contracts/ | Deploy contract |
| [**getContractAdmin**](ContractApi.md#getContractAdmin) | **GET** /contracts/{address}/admin | Get administrator of contract, only work on conflux chain |
| [**getContractInfo**](ContractApi.md#getContractInfo) | **GET** /contracts/detail/{id} | Contract detail |
| [**getContractSponsorInfo**](ContractApi.md#getContractSponsorInfo) | **GET** /contracts/{address}/sponsor | Query sponsor |
| [**getContractSponsoredWhitelist**](ContractApi.md#getContractSponsoredWhitelist) | **GET** /contracts/{address}/sponsor/whitelist | Get contract sponsored whitelist |
| [**listContracts**](ContractApi.md#listContracts) | **GET** /contracts/ | Obtain contract list |
| [**removeContractSponsorWhitelist**](ContractApi.md#removeContractSponsorWhitelist) | **DELETE** /contracts/{address}/sponsor/whitelist | Remove contract sponsored whitelist |
| [**setContractSponsor**](ContractApi.md#setContractSponsor) | **POST** /contracts/{address}/sponsor | Set sponsor |
| [**updateContractAdmin**](ContractApi.md#updateContractAdmin) | **PUT** /contracts/{address}/admin | Update administrator of contract |



## addContractSponsorWhitelist

> ServicesSendTxResp addContractSponsorWhitelist(authorization, address, users)

Add contract sponsored whitelist

Add contract sponsored whitelist, only work on conflux chain

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        String address = "address_example"; // String | contract address
        List<String> users = Arrays.asList(); // List<String> | Adding sponsor whitelist
        try {
            ServicesSendTxResp result = apiInstance.addContractSponsorWhitelist(authorization, address, users);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#addContractSponsorWhitelist");
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
| **address** | **String**| contract address | |
| **users** | [**List&lt;String&gt;**](String.md)| Adding sponsor whitelist | |

### Return type

[**ServicesSendTxResp**](ServicesSendTxResp.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction id |  -  |
| **400** | Invalid request |  -  |
| **500** | Internal Server error |  -  |
| **599** | Businesss error |  -  |


## deployContract

> ModelsContract deployContract(authorization, contractInfo)

Deploy contract

Deploy a ERC721 or ERC1155 contract.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        ServicesContractDeployDto contractInfo = new ServicesContractDeployDto(); // ServicesContractDeployDto | contract_info
        try {
            ModelsContract result = apiInstance.deployContract(authorization, contractInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#deployContract");
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
| **contractInfo** | [**ServicesContractDeployDto**](ServicesContractDeployDto.md)| contract_info | |

### Return type

[**ModelsContract**](ModelsContract.md)

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


## getContractAdmin

> String getContractAdmin(authorization, address)

Get administrator of contract, only work on conflux chain

Get Contract Admin

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        String address = "address_example"; // String | contract address
        try {
            String result = apiInstance.getContractAdmin(authorization, address);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#getContractAdmin");
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
| **address** | **String**| contract address | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Admin address |  -  |
| **400** | Invalid request |  -  |
| **500** | Internal Server error |  -  |
| **599** | Businesss error |  -  |


## getContractInfo

> ModelsContract getContractInfo(authorization, id)

Contract detail

Get Contract info

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        Integer id = 56; // Integer | id
        try {
            ModelsContract result = apiInstance.getContractInfo(authorization, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#getContractInfo");
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

[**ModelsContract**](ModelsContract.md)

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


## getContractSponsorInfo

> ServicesSponsorInfo getContractSponsorInfo(authorization, address, chain)

Query sponsor

Get the sponsor of the specified contract according to address.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        String address = "address_example"; // String | address
        String chain = "chain_example"; // String | chain
        try {
            ServicesSponsorInfo result = apiInstance.getContractSponsorInfo(authorization, address, chain);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#getContractSponsorInfo");
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
| **address** | **String**| address | |
| **chain** | **String**| chain | [optional] |

### Return type

[**ServicesSponsorInfo**](ServicesSponsorInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid address |  -  |
| **500** | Internal Server error |  -  |


## getContractSponsoredWhitelist

> List&lt;String&gt; getContractSponsoredWhitelist(authorization, address)

Get contract sponsored whitelist

Get contract sponsored whitelist, only work on conflux chain

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        String address = "address_example"; // String | contract address
        try {
            List<String> result = apiInstance.getContractSponsoredWhitelist(authorization, address);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#getContractSponsoredWhitelist");
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
| **address** | **String**| contract address | |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Contract sponsored whitelist |  -  |
| **400** | Invalid request |  -  |
| **500** | Internal Server error |  -  |
| **599** | Businesss error |  -  |


## listContracts

> ModelsContractTaskQueryResult listContracts(authorization, page, limit)

Obtain contract list

Get the contract list containing the contracts deployed through the specified app.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        Integer page = 56; // Integer | page
        Integer limit = 56; // Integer | limit
        try {
            ModelsContractTaskQueryResult result = apiInstance.listContracts(authorization, page, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#listContracts");
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

### Return type

[**ModelsContractTaskQueryResult**](ModelsContractTaskQueryResult.md)

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


## removeContractSponsorWhitelist

> ServicesSendTxResp removeContractSponsorWhitelist(authorization, address, users)

Remove contract sponsored whitelist

Remove contract sponsored whitelist, only work on conflux chain

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        String address = "address_example"; // String | contract address
        List<String> users = Arrays.asList(); // List<String> | Removing sponsor whitelist
        try {
            ServicesSendTxResp result = apiInstance.removeContractSponsorWhitelist(authorization, address, users);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#removeContractSponsorWhitelist");
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
| **address** | **String**| contract address | |
| **users** | [**List&lt;String&gt;**](String.md)| Removing sponsor whitelist | |

### Return type

[**ServicesSendTxResp**](ServicesSendTxResp.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction id |  -  |
| **400** | Invalid request |  -  |
| **500** | Internal Server error |  -  |
| **599** | Businesss error |  -  |


## setContractSponsor

> ServicesSetSponsorResp setContractSponsor(authorization, address)

Set sponsor

Set the sponsor for a specified contract according to the address

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        String address = "address_example"; // String | address
        try {
            ServicesSetSponsorResp result = apiInstance.setContractSponsor(authorization, address);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#setContractSponsor");
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
| **address** | **String**| address | |

### Return type

[**ServicesSetSponsorResp**](ServicesSetSponsorResp.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction id\&quot;                             \&quot;success |  -  |
| **400** | Invalid address |  -  |
| **500** | Internal Server error |  -  |


## updateContractAdmin

> ServicesSendTxResp updateContractAdmin(authorization, address, adminInfo)

Update administrator of contract

Update administrator of contract, only work on conflux chain

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        String address = "address_example"; // String | contract address
        ServicesContractAdminUpdateDto adminInfo = new ServicesContractAdminUpdateDto(); // ServicesContractAdminUpdateDto | contract admin update info
        try {
            ServicesSendTxResp result = apiInstance.updateContractAdmin(authorization, address, adminInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#updateContractAdmin");
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
| **address** | **String**| contract address | |
| **adminInfo** | [**ServicesContractAdminUpdateDto**](ServicesContractAdminUpdateDto.md)| contract admin update info | |

### Return type

[**ServicesSendTxResp**](ServicesSendTxResp.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction id |  -  |
| **400** | Invalid request |  -  |
| **500** | Internal Server error |  -  |
| **599** | Businesss error |  -  |

