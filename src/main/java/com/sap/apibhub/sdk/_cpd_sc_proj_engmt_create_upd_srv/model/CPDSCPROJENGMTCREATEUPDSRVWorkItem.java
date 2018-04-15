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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CPDSCPROJENGMTCREATEUPDSRVWorkItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-15T05:42:19.472Z")
public class CPDSCPROJENGMTCREATEUPDSRVWorkItem {
  @SerializedName("ProjectID")
  private String projectID = null;

  @SerializedName("Workitem")
  private String workitem = null;

  @SerializedName("WorkPackageID")
  private String workPackageID = null;

  @SerializedName("WorkPackageName")
  private String workPackageName = null;

  public CPDSCPROJENGMTCREATEUPDSRVWorkItem projectID(String projectID) {
    this.projectID = projectID;
    return this;
  }

   /**
   * Commercial Project ID   Identifies a master project.
   * @return projectID
  **/
  @ApiModelProperty(example = "null", value = "Commercial Project ID   Identifies a master project.")
  public String getProjectID() {
    return projectID;
  }

  public void setProjectID(String projectID) {
    this.projectID = projectID;
  }

  public CPDSCPROJENGMTCREATEUPDSRVWorkItem workitem(String workitem) {
    this.workitem = workitem;
    return this;
  }

   /**
   * Work Item ID
   * @return workitem
  **/
  @ApiModelProperty(example = "null", value = "Work Item ID")
  public String getWorkitem() {
    return workitem;
  }

  public void setWorkitem(String workitem) {
    this.workitem = workitem;
  }

  public CPDSCPROJENGMTCREATEUPDSRVWorkItem workPackageID(String workPackageID) {
    this.workPackageID = workPackageID;
    return this;
  }

   /**
   * Plan Item
   * @return workPackageID
  **/
  @ApiModelProperty(example = "null", value = "Plan Item")
  public String getWorkPackageID() {
    return workPackageID;
  }

  public void setWorkPackageID(String workPackageID) {
    this.workPackageID = workPackageID;
  }

  public CPDSCPROJENGMTCREATEUPDSRVWorkItem workPackageName(String workPackageName) {
    this.workPackageName = workPackageName;
    return this;
  }

   /**
   * Plan Item Description
   * @return workPackageName
  **/
  @ApiModelProperty(example = "null", value = "Plan Item Description")
  public String getWorkPackageName() {
    return workPackageName;
  }

  public void setWorkPackageName(String workPackageName) {
    this.workPackageName = workPackageName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CPDSCPROJENGMTCREATEUPDSRVWorkItem cpDSCPROJENGMTCREATEUPDSRVWorkItem = (CPDSCPROJENGMTCREATEUPDSRVWorkItem) o;
    return Objects.equals(this.projectID, cpDSCPROJENGMTCREATEUPDSRVWorkItem.projectID) &&
        Objects.equals(this.workitem, cpDSCPROJENGMTCREATEUPDSRVWorkItem.workitem) &&
        Objects.equals(this.workPackageID, cpDSCPROJENGMTCREATEUPDSRVWorkItem.workPackageID) &&
        Objects.equals(this.workPackageName, cpDSCPROJENGMTCREATEUPDSRVWorkItem.workPackageName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectID, workitem, workPackageID, workPackageName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CPDSCPROJENGMTCREATEUPDSRVWorkItem {\n");
    
    sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
    sb.append("    workitem: ").append(toIndentedString(workitem)).append("\n");
    sb.append("    workPackageID: ").append(toIndentedString(workPackageID)).append("\n");
    sb.append("    workPackageName: ").append(toIndentedString(workPackageName)).append("\n");
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
