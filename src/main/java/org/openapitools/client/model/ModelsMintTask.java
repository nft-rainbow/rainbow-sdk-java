/*
 * Rainbow-API
 * The responses of the open api in swagger focus on the data field rather than the code and the message fields
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.client.model.GormDeletedAt;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ModelsMintTask
 */
@JsonPropertyOrder({
  ModelsMintTask.JSON_PROPERTY_AMOUNT,
  ModelsMintTask.JSON_PROPERTY_APP_ID,
  ModelsMintTask.JSON_PROPERTY_CHAIN_ID,
  ModelsMintTask.JSON_PROPERTY_CHAIN_TYPE,
  ModelsMintTask.JSON_PROPERTY_CONTRACT,
  ModelsMintTask.JSON_PROPERTY_CONTRACT_TYPE,
  ModelsMintTask.JSON_PROPERTY_CREATED_AT,
  ModelsMintTask.JSON_PROPERTY_DELETED_AT,
  ModelsMintTask.JSON_PROPERTY_ERROR,
  ModelsMintTask.JSON_PROPERTY_HASH,
  ModelsMintTask.JSON_PROPERTY_ID,
  ModelsMintTask.JSON_PROPERTY_MINT_TO,
  ModelsMintTask.JSON_PROPERTY_MINT_TYPE,
  ModelsMintTask.JSON_PROPERTY_STATUS,
  ModelsMintTask.JSON_PROPERTY_TOKEN_ID,
  ModelsMintTask.JSON_PROPERTY_TOKEN_URI,
  ModelsMintTask.JSON_PROPERTY_TX_ID,
  ModelsMintTask.JSON_PROPERTY_UPDATED_AT
})
@JsonTypeName("models.MintTask")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsMintTask {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_APP_ID = "app_id";
  private Integer appId;

  public static final String JSON_PROPERTY_CHAIN_ID = "chain_id";
  private Integer chainId;

  public static final String JSON_PROPERTY_CHAIN_TYPE = "chain_type";
  private Integer chainType;

  public static final String JSON_PROPERTY_CONTRACT = "contract";
  private String contract;

  public static final String JSON_PROPERTY_CONTRACT_TYPE = "contract_type";
  private Integer contractType;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private GormDeletedAt deletedAt;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_HASH = "hash";
  private String hash;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_MINT_TO = "mint_to";
  private String mintTo;

  public static final String JSON_PROPERTY_MINT_TYPE = "mint_type";
  private Integer mintType;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_TOKEN_ID = "token_id";
  private String tokenId;

  public static final String JSON_PROPERTY_TOKEN_URI = "token_uri";
  private String tokenUri;

  public static final String JSON_PROPERTY_TX_ID = "tx_id";
  private Integer txId;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public ModelsMintTask() {
  }

  public ModelsMintTask amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public ModelsMintTask appId(Integer appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAppId() {
    return appId;
  }


  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppId(Integer appId) {
    this.appId = appId;
  }


  public ModelsMintTask chainId(Integer chainId) {
    
    this.chainId = chainId;
    return this;
  }

   /**
   * Get chainId
   * @return chainId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHAIN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getChainId() {
    return chainId;
  }


  @JsonProperty(JSON_PROPERTY_CHAIN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChainId(Integer chainId) {
    this.chainId = chainId;
  }


  public ModelsMintTask chainType(Integer chainType) {
    
    this.chainType = chainType;
    return this;
  }

   /**
   * Get chainType
   * @return chainType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHAIN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getChainType() {
    return chainType;
  }


  @JsonProperty(JSON_PROPERTY_CHAIN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChainType(Integer chainType) {
    this.chainType = chainType;
  }


  public ModelsMintTask contract(String contract) {
    
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContract() {
    return contract;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContract(String contract) {
    this.contract = contract;
  }


  public ModelsMintTask contractType(Integer contractType) {
    
    this.contractType = contractType;
    return this;
  }

   /**
   * Get contractType
   * @return contractType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTRACT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getContractType() {
    return contractType;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContractType(Integer contractType) {
    this.contractType = contractType;
  }


  public ModelsMintTask createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public ModelsMintTask deletedAt(GormDeletedAt deletedAt) {
    
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Get deletedAt
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GormDeletedAt getDeletedAt() {
    return deletedAt;
  }


  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeletedAt(GormDeletedAt deletedAt) {
    this.deletedAt = deletedAt;
  }


  public ModelsMintTask error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(String error) {
    this.error = error;
  }


  public ModelsMintTask hash(String hash) {
    
    this.hash = hash;
    return this;
  }

   /**
   * Get hash
   * @return hash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHash() {
    return hash;
  }


  @JsonProperty(JSON_PROPERTY_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHash(String hash) {
    this.hash = hash;
  }


  public ModelsMintTask id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public ModelsMintTask mintTo(String mintTo) {
    
    this.mintTo = mintTo;
    return this;
  }

   /**
   * Get mintTo
   * @return mintTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MINT_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMintTo() {
    return mintTo;
  }


  @JsonProperty(JSON_PROPERTY_MINT_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMintTo(String mintTo) {
    this.mintTo = mintTo;
  }


  public ModelsMintTask mintType(Integer mintType) {
    
    this.mintType = mintType;
    return this;
  }

   /**
   * Get mintType
   * @return mintType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MINT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMintType() {
    return mintType;
  }


  @JsonProperty(JSON_PROPERTY_MINT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMintType(Integer mintType) {
    this.mintType = mintType;
  }


  public ModelsMintTask status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * 0-pending, 1-success, 2-failed
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "0-pending, 1-success, 2-failed")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Integer status) {
    this.status = status;
  }


  public ModelsMintTask tokenId(String tokenId) {
    
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Get tokenId
   * @return tokenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTokenId() {
    return tokenId;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  public ModelsMintTask tokenUri(String tokenUri) {
    
    this.tokenUri = tokenUri;
    return this;
  }

   /**
   * Get tokenUri
   * @return tokenUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTokenUri() {
    return tokenUri;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenUri(String tokenUri) {
    this.tokenUri = tokenUri;
  }


  public ModelsMintTask txId(Integer txId) {
    
    this.txId = txId;
    return this;
  }

   /**
   * Get txId
   * @return txId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTxId() {
    return txId;
  }


  @JsonProperty(JSON_PROPERTY_TX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTxId(Integer txId) {
    this.txId = txId;
  }


  public ModelsMintTask updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsMintTask modelsMintTask = (ModelsMintTask) o;
    return Objects.equals(this.amount, modelsMintTask.amount) &&
        Objects.equals(this.appId, modelsMintTask.appId) &&
        Objects.equals(this.chainId, modelsMintTask.chainId) &&
        Objects.equals(this.chainType, modelsMintTask.chainType) &&
        Objects.equals(this.contract, modelsMintTask.contract) &&
        Objects.equals(this.contractType, modelsMintTask.contractType) &&
        Objects.equals(this.createdAt, modelsMintTask.createdAt) &&
        Objects.equals(this.deletedAt, modelsMintTask.deletedAt) &&
        Objects.equals(this.error, modelsMintTask.error) &&
        Objects.equals(this.hash, modelsMintTask.hash) &&
        Objects.equals(this.id, modelsMintTask.id) &&
        Objects.equals(this.mintTo, modelsMintTask.mintTo) &&
        Objects.equals(this.mintType, modelsMintTask.mintType) &&
        Objects.equals(this.status, modelsMintTask.status) &&
        Objects.equals(this.tokenId, modelsMintTask.tokenId) &&
        Objects.equals(this.tokenUri, modelsMintTask.tokenUri) &&
        Objects.equals(this.txId, modelsMintTask.txId) &&
        Objects.equals(this.updatedAt, modelsMintTask.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, appId, chainId, chainType, contract, contractType, createdAt, deletedAt, error, hash, id, mintTo, mintType, status, tokenId, tokenUri, txId, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsMintTask {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    chainType: ").append(toIndentedString(chainType)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mintTo: ").append(toIndentedString(mintTo)).append("\n");
    sb.append("    mintType: ").append(toIndentedString(mintType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    tokenUri: ").append(toIndentedString(tokenUri)).append("\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

