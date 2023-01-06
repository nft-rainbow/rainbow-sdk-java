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
 * ServicesSponsorInfo
 */
@JsonPropertyOrder({
  ServicesSponsorInfo.JSON_PROPERTY_COLLATERAL_SPONSOR,
  ServicesSponsorInfo.JSON_PROPERTY_COLLATERAL_SPONSOR_BALANCE,
  ServicesSponsorInfo.JSON_PROPERTY_GAS_SPONSOR,
  ServicesSponsorInfo.JSON_PROPERTY_GAS_SPONSOR_BALANCE,
  ServicesSponsorInfo.JSON_PROPERTY_GAS_UPPER_BOUND,
  ServicesSponsorInfo.JSON_PROPERTY_IS_ALL_WHITE_LISTED
})
@JsonTypeName("services.SponsorInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServicesSponsorInfo {
  public static final String JSON_PROPERTY_COLLATERAL_SPONSOR = "collateral_sponsor";
  private String collateralSponsor;

  public static final String JSON_PROPERTY_COLLATERAL_SPONSOR_BALANCE = "collateral_sponsor_balance";
  private String collateralSponsorBalance;

  public static final String JSON_PROPERTY_GAS_SPONSOR = "gas_sponsor";
  private String gasSponsor;

  public static final String JSON_PROPERTY_GAS_SPONSOR_BALANCE = "gas_sponsor_balance";
  private String gasSponsorBalance;

  public static final String JSON_PROPERTY_GAS_UPPER_BOUND = "gas_upper_bound";
  private String gasUpperBound;

  public static final String JSON_PROPERTY_IS_ALL_WHITE_LISTED = "is_all_white_listed";
  private Boolean isAllWhiteListed;

  public ServicesSponsorInfo() {
  }

  public ServicesSponsorInfo collateralSponsor(String collateralSponsor) {
    
    this.collateralSponsor = collateralSponsor;
    return this;
  }

   /**
   * Get collateralSponsor
   * @return collateralSponsor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COLLATERAL_SPONSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCollateralSponsor() {
    return collateralSponsor;
  }


  @JsonProperty(JSON_PROPERTY_COLLATERAL_SPONSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollateralSponsor(String collateralSponsor) {
    this.collateralSponsor = collateralSponsor;
  }


  public ServicesSponsorInfo collateralSponsorBalance(String collateralSponsorBalance) {
    
    this.collateralSponsorBalance = collateralSponsorBalance;
    return this;
  }

   /**
   * Get collateralSponsorBalance
   * @return collateralSponsorBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COLLATERAL_SPONSOR_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCollateralSponsorBalance() {
    return collateralSponsorBalance;
  }


  @JsonProperty(JSON_PROPERTY_COLLATERAL_SPONSOR_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollateralSponsorBalance(String collateralSponsorBalance) {
    this.collateralSponsorBalance = collateralSponsorBalance;
  }


  public ServicesSponsorInfo gasSponsor(String gasSponsor) {
    
    this.gasSponsor = gasSponsor;
    return this;
  }

   /**
   * Get gasSponsor
   * @return gasSponsor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GAS_SPONSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGasSponsor() {
    return gasSponsor;
  }


  @JsonProperty(JSON_PROPERTY_GAS_SPONSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGasSponsor(String gasSponsor) {
    this.gasSponsor = gasSponsor;
  }


  public ServicesSponsorInfo gasSponsorBalance(String gasSponsorBalance) {
    
    this.gasSponsorBalance = gasSponsorBalance;
    return this;
  }

   /**
   * Get gasSponsorBalance
   * @return gasSponsorBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GAS_SPONSOR_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGasSponsorBalance() {
    return gasSponsorBalance;
  }


  @JsonProperty(JSON_PROPERTY_GAS_SPONSOR_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGasSponsorBalance(String gasSponsorBalance) {
    this.gasSponsorBalance = gasSponsorBalance;
  }


  public ServicesSponsorInfo gasUpperBound(String gasUpperBound) {
    
    this.gasUpperBound = gasUpperBound;
    return this;
  }

   /**
   * Get gasUpperBound
   * @return gasUpperBound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GAS_UPPER_BOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGasUpperBound() {
    return gasUpperBound;
  }


  @JsonProperty(JSON_PROPERTY_GAS_UPPER_BOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGasUpperBound(String gasUpperBound) {
    this.gasUpperBound = gasUpperBound;
  }


  public ServicesSponsorInfo isAllWhiteListed(Boolean isAllWhiteListed) {
    
    this.isAllWhiteListed = isAllWhiteListed;
    return this;
  }

   /**
   * Get isAllWhiteListed
   * @return isAllWhiteListed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_ALL_WHITE_LISTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAllWhiteListed() {
    return isAllWhiteListed;
  }


  @JsonProperty(JSON_PROPERTY_IS_ALL_WHITE_LISTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsAllWhiteListed(Boolean isAllWhiteListed) {
    this.isAllWhiteListed = isAllWhiteListed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicesSponsorInfo servicesSponsorInfo = (ServicesSponsorInfo) o;
    return Objects.equals(this.collateralSponsor, servicesSponsorInfo.collateralSponsor) &&
        Objects.equals(this.collateralSponsorBalance, servicesSponsorInfo.collateralSponsorBalance) &&
        Objects.equals(this.gasSponsor, servicesSponsorInfo.gasSponsor) &&
        Objects.equals(this.gasSponsorBalance, servicesSponsorInfo.gasSponsorBalance) &&
        Objects.equals(this.gasUpperBound, servicesSponsorInfo.gasUpperBound) &&
        Objects.equals(this.isAllWhiteListed, servicesSponsorInfo.isAllWhiteListed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collateralSponsor, collateralSponsorBalance, gasSponsor, gasSponsorBalance, gasUpperBound, isAllWhiteListed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicesSponsorInfo {\n");
    sb.append("    collateralSponsor: ").append(toIndentedString(collateralSponsor)).append("\n");
    sb.append("    collateralSponsorBalance: ").append(toIndentedString(collateralSponsorBalance)).append("\n");
    sb.append("    gasSponsor: ").append(toIndentedString(gasSponsor)).append("\n");
    sb.append("    gasSponsorBalance: ").append(toIndentedString(gasSponsorBalance)).append("\n");
    sb.append("    gasUpperBound: ").append(toIndentedString(gasUpperBound)).append("\n");
    sb.append("    isAllWhiteListed: ").append(toIndentedString(isAllWhiteListed)).append("\n");
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
