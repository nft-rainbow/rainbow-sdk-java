

# ServicesContractDeployDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**baseUri** | **String** |  |  [optional] |
|**chain** | [**ChainEnum**](#ChainEnum) |  |  |
|**isSponsorForAllUser** | **Boolean** | default: true |  [optional] |
|**name** | **String** |  |  |
|**ownerAddress** | **String** |  |  [optional] |
|**royaltiesAddress** | **String** |  |  [optional] |
|**royaltiesBps** | **Integer** |  |  [optional] |
|**symbol** | **String** |  |  |
|**tokensBurnable** | **Boolean** |  |  [optional] |
|**tokensTransferableByAdmin** | **Boolean** |  |  [optional] |
|**tokensTransferableByUser** | **Boolean** |  |  [optional] |
|**transferCooldownTime** | **Integer** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |



## Enum: ChainEnum

| Name | Value |
|---- | -----|
| CONFLUX | &quot;conflux&quot; |
| CONFLUX_TEST | &quot;conflux_test&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ERC721 | &quot;erc721&quot; |
| ERC1155 | &quot;erc1155&quot; |



