/*
 * Create and Update Commercial Projects
 * This service enables you to create and  update commercial projects in a SAP  S/4HANA Cloud system. For example, you  can use this service to create a customer  or internal project based on an  opportunity or a quotation. 
 *
 * OpenAPI spec version: 1 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sap.apibhub.sdk._cpd_sc_proj_engmt_create_upd_srv.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.sap.apibhub.sdk._cpd_sc_proj_engmt_create_upd_srv.model.CPDSCPROJENGMTCREATEUPDSRVDemand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * CollectionOfDemand
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-15T05:42:19.472Z")
public class CollectionOfDemand {
  @SerializedName("results")
  private List<CPDSCPROJENGMTCREATEUPDSRVDemand> results = new ArrayList<CPDSCPROJENGMTCREATEUPDSRVDemand>();

  public CollectionOfDemand results(List<CPDSCPROJENGMTCREATEUPDSRVDemand> results) {
    this.results = results;
    return this;
  }

  public CollectionOfDemand addResultsItem(CPDSCPROJENGMTCREATEUPDSRVDemand resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CPDSCPROJENGMTCREATEUPDSRVDemand> getResults() {
    return results;
  }

  public void setResults(List<CPDSCPROJENGMTCREATEUPDSRVDemand> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionOfDemand collectionOfDemand = (CollectionOfDemand) o;
    return Objects.equals(this.results, collectionOfDemand.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionOfDemand {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

