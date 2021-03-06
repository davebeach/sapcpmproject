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
 * CPDSCPROJENGMTCREATEUPDSRVDemand
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-15T05:42:19.472Z")
public class CPDSCPROJENGMTCREATEUPDSRVDemand {
  @SerializedName("ProjectID")
  private String projectID = null;

  @SerializedName("WorkPackageID")
  private String workPackageID = null;

  @SerializedName("WorkPackageName")
  private String workPackageName = null;

  @SerializedName("ResType")
  private String resType = null;

  @SerializedName("ResourceId")
  private String resourceId = null;

  @SerializedName("Workitem")
  private String workitem = null;

  @SerializedName("DelvryServOrg")
  private String delvryServOrg = null;

  public CPDSCPROJENGMTCREATEUPDSRVDemand projectID(String projectID) {
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

  public CPDSCPROJENGMTCREATEUPDSRVDemand workPackageID(String workPackageID) {
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

  public CPDSCPROJENGMTCREATEUPDSRVDemand workPackageName(String workPackageName) {
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

  public CPDSCPROJENGMTCREATEUPDSRVDemand resType(String resType) {
    this.resType = resType;
    return this;
  }

   /**
   * Used to uniquely identify the resource type.   Resource types are used to categorize resources while carrying out financial planning activities.
   * @return resType
  **/
  @ApiModelProperty(example = "null", value = "Used to uniquely identify the resource type.   Resource types are used to categorize resources while carrying out financial planning activities.")
  public String getResType() {
    return resType;
  }

  public void setResType(String resType) {
    this.resType = resType;
  }

  public CPDSCPROJENGMTCREATEUPDSRVDemand resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Resource ID   Used to uniquely identify a resource.   Resources correspond to individual entities in a project. You can assign multiple cost elements and activity types to each resource.
   * @return resourceId
  **/
  @ApiModelProperty(example = "null", value = "Resource ID   Used to uniquely identify a resource.   Resources correspond to individual entities in a project. You can assign multiple cost elements and activity types to each resource.")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public CPDSCPROJENGMTCREATEUPDSRVDemand workitem(String workitem) {
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

  public CPDSCPROJENGMTCREATEUPDSRVDemand delvryServOrg(String delvryServOrg) {
    this.delvryServOrg = delvryServOrg;
    return this;
  }

   /**
   * Service Organization   This field links master project data with the company code and plant.   This field links master project data with the company code and plant.
   * @return delvryServOrg
  **/
  @ApiModelProperty(example = "null", value = "Service Organization   This field links master project data with the company code and plant.   This field links master project data with the company code and plant.")
  public String getDelvryServOrg() {
    return delvryServOrg;
  }

  public void setDelvryServOrg(String delvryServOrg) {
    this.delvryServOrg = delvryServOrg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CPDSCPROJENGMTCREATEUPDSRVDemand cpDSCPROJENGMTCREATEUPDSRVDemand = (CPDSCPROJENGMTCREATEUPDSRVDemand) o;
    return Objects.equals(this.projectID, cpDSCPROJENGMTCREATEUPDSRVDemand.projectID) &&
        Objects.equals(this.workPackageID, cpDSCPROJENGMTCREATEUPDSRVDemand.workPackageID) &&
        Objects.equals(this.workPackageName, cpDSCPROJENGMTCREATEUPDSRVDemand.workPackageName) &&
        Objects.equals(this.resType, cpDSCPROJENGMTCREATEUPDSRVDemand.resType) &&
        Objects.equals(this.resourceId, cpDSCPROJENGMTCREATEUPDSRVDemand.resourceId) &&
        Objects.equals(this.workitem, cpDSCPROJENGMTCREATEUPDSRVDemand.workitem) &&
        Objects.equals(this.delvryServOrg, cpDSCPROJENGMTCREATEUPDSRVDemand.delvryServOrg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectID, workPackageID, workPackageName, resType, resourceId, workitem, delvryServOrg);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CPDSCPROJENGMTCREATEUPDSRVDemand {\n");
    
    sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
    sb.append("    workPackageID: ").append(toIndentedString(workPackageID)).append("\n");
    sb.append("    workPackageName: ").append(toIndentedString(workPackageName)).append("\n");
    sb.append("    resType: ").append(toIndentedString(resType)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    workitem: ").append(toIndentedString(workitem)).append("\n");
    sb.append("    delvryServOrg: ").append(toIndentedString(delvryServOrg)).append("\n");
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

