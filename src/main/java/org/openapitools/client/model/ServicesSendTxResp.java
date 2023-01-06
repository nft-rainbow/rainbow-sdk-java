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
 * ServicesSendTxResp
 */
@JsonPropertyOrder({
  ServicesSendTxResp.JSON_PROPERTY_TX_ID
})
@JsonTypeName("services.SendTxResp")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServicesSendTxResp {
  public static final String JSON_PROPERTY_TX_ID = "tx_id";
  private Integer txId;

  public ServicesSendTxResp() {
  }

  public ServicesSendTxResp txId(Integer txId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicesSendTxResp servicesSendTxResp = (ServicesSendTxResp) o;
    return Objects.equals(this.txId, servicesSendTxResp.txId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicesSendTxResp {\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
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

