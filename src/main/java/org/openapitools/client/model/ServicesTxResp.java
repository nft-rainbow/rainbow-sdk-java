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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServicesTxResp
 */
@JsonPropertyOrder({
  ServicesTxResp.JSON_PROPERTY_ERROR_MSG,
  ServicesTxResp.JSON_PROPERTY_HASH,
  ServicesTxResp.JSON_PROPERTY_IS_FINALIZED,
  ServicesTxResp.JSON_PROPERTY_IS_SUCCESS,
  ServicesTxResp.JSON_PROPERTY_STATE_CODE,
  ServicesTxResp.JSON_PROPERTY_STATE_MSG
})
@JsonTypeName("services.TxResp")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServicesTxResp {
  public static final String JSON_PROPERTY_ERROR_MSG = "error_msg";
  private String errorMsg;

  public static final String JSON_PROPERTY_HASH = "hash";
  private String hash;

  public static final String JSON_PROPERTY_IS_FINALIZED = "is_finalized";
  private Boolean isFinalized;

  public static final String JSON_PROPERTY_IS_SUCCESS = "is_success";
  private Boolean isSuccess;

  public static final String JSON_PROPERTY_STATE_CODE = "state_code";
  private Integer stateCode;

  public static final String JSON_PROPERTY_STATE_MSG = "state_msg";
  private String stateMsg;

  public ServicesTxResp() {
  }

  public ServicesTxResp errorMsg(String errorMsg) {
    
    this.errorMsg = errorMsg;
    return this;
  }

   /**
   * Get errorMsg
   * @return errorMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR_MSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorMsg() {
    return errorMsg;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_MSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }


  public ServicesTxResp hash(String hash) {
    
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


  public ServicesTxResp isFinalized(Boolean isFinalized) {
    
    this.isFinalized = isFinalized;
    return this;
  }

   /**
   * Get isFinalized
   * @return isFinalized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_FINALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsFinalized() {
    return isFinalized;
  }


  @JsonProperty(JSON_PROPERTY_IS_FINALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsFinalized(Boolean isFinalized) {
    this.isFinalized = isFinalized;
  }


  public ServicesTxResp isSuccess(Boolean isSuccess) {
    
    this.isSuccess = isSuccess;
    return this;
  }

   /**
   * Get isSuccess
   * @return isSuccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsSuccess() {
    return isSuccess;
  }


  @JsonProperty(JSON_PROPERTY_IS_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
  }


  public ServicesTxResp stateCode(Integer stateCode) {
    
    this.stateCode = stateCode;
    return this;
  }

   /**
   * Get stateCode
   * @return stateCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStateCode() {
    return stateCode;
  }


  @JsonProperty(JSON_PROPERTY_STATE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStateCode(Integer stateCode) {
    this.stateCode = stateCode;
  }


  public ServicesTxResp stateMsg(String stateMsg) {
    
    this.stateMsg = stateMsg;
    return this;
  }

   /**
   * Get stateMsg
   * @return stateMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATE_MSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStateMsg() {
    return stateMsg;
  }


  @JsonProperty(JSON_PROPERTY_STATE_MSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStateMsg(String stateMsg) {
    this.stateMsg = stateMsg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicesTxResp servicesTxResp = (ServicesTxResp) o;
    return Objects.equals(this.errorMsg, servicesTxResp.errorMsg) &&
        Objects.equals(this.hash, servicesTxResp.hash) &&
        Objects.equals(this.isFinalized, servicesTxResp.isFinalized) &&
        Objects.equals(this.isSuccess, servicesTxResp.isSuccess) &&
        Objects.equals(this.stateCode, servicesTxResp.stateCode) &&
        Objects.equals(this.stateMsg, servicesTxResp.stateMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMsg, hash, isFinalized, isSuccess, stateCode, stateMsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicesTxResp {\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    isFinalized: ").append(toIndentedString(isFinalized)).append("\n");
    sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    stateMsg: ").append(toIndentedString(stateMsg)).append("\n");
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

