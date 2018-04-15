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


package com.sap.apibhub.sdk._cpd_sc_proj_engmt_create_upd_srv.api;

import com.sap.apibhub.sdk.client.ApiCallback;
import com.sap.apibhub.sdk.client.ApiClient;
import com.sap.apibhub.sdk.client.ApiException;
import com.sap.apibhub.sdk.client.ApiResponse;
import com.sap.apibhub.sdk.client.Configuration;
import com.sap.apibhub.sdk.client.Pair;
import com.sap.apibhub.sdk.client.ProgressRequestBody;
import com.sap.apibhub.sdk.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.sap.apibhub.sdk._cpd_sc_proj_engmt_create_upd_srv.model.CPDSCPROJENGMTCREATEUPDSRVWorkPackage;
import com.sap.apibhub.sdk._cpd_sc_proj_engmt_create_upd_srv.model.CreatedWorkPackage;
import com.sap.apibhub.sdk._cpd_sc_proj_engmt_create_upd_srv.model.ModifiedWorkPackage;
import com.sap.apibhub.sdk._cpd_sc_proj_engmt_create_upd_srv.model.OdataError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkPackageSetApi {
    private ApiClient apiClient;

    public WorkPackageSetApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WorkPackageSetApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for workPackageSetPost */
    private com.squareup.okhttp.Call workPackageSetPostCall(CPDSCPROJENGMTCREATEUPDSRVWorkPackage workPackage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = workPackage;
        
        // create path and map variables
        String localVarPath = "/WorkPackageSet".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {"APIBHUB_SANDBOX_APIKEY", "basicAuthentication" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call workPackageSetPostValidateBeforeCall(CPDSCPROJENGMTCREATEUPDSRVWorkPackage workPackage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = workPackageSetPostCall(workPackage, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add new entity to WorkPackageSet
     * 
     * @param workPackage New entity (optional)
     * @return CreatedWorkPackage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreatedWorkPackage workPackageSetPost(CPDSCPROJENGMTCREATEUPDSRVWorkPackage workPackage) throws ApiException {
        ApiResponse<CreatedWorkPackage> resp = workPackageSetPostWithHttpInfo(workPackage);
        return resp.getData();
    }

    /**
     * Add new entity to WorkPackageSet
     * 
     * @param workPackage New entity (optional)
     * @return ApiResponse&lt;CreatedWorkPackage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreatedWorkPackage> workPackageSetPostWithHttpInfo(CPDSCPROJENGMTCREATEUPDSRVWorkPackage workPackage) throws ApiException {
        com.squareup.okhttp.Call call = workPackageSetPostValidateBeforeCall(workPackage, null, null);
        Type localVarReturnType = new TypeToken<CreatedWorkPackage>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add new entity to WorkPackageSet (asynchronously)
     * 
     * @param workPackage New entity (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call workPackageSetPostAsync(CPDSCPROJENGMTCREATEUPDSRVWorkPackage workPackage, final ApiCallback<CreatedWorkPackage> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = workPackageSetPostValidateBeforeCall(workPackage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreatedWorkPackage>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNameDelete */
    private com.squareup.okhttp.Call workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNameDeleteCall(String projectID, String workPackageID, String workPackageName, String ifMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/WorkPackageSet(ProjectID='{ProjectID}',WorkPackageID='{WorkPackageID}',WorkPackageName='{WorkPackageName}')".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "ProjectID" + "\\}", apiClient.escapeString(projectID.toString()))
        .replaceAll("\\{" + "WorkPackageID" + "\\}", apiClient.escapeString(workPackageID.toString()))
        .replaceAll("\\{" + "WorkPackageName" + "\\}", apiClient.escapeString(workPackageName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifMatch != null)
        localVarHeaderParams.put("If-Match", apiClient.parameterToString(ifMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {"APIBHUB_SANDBOX_APIKEY", "basicAuthentication" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNameDeleteValidateBeforeCall(String projectID, String workPackageID, String workPackageName, String ifMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectID' is set
        if (projectID == null) {
            throw new ApiException("Missing the required parameter 'projectID' when calling workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNameDelete(Async)");
        }
        
        // verify the required parameter 'workPackageID' is set
        if (workPackageID == null) {
            throw new ApiException("Missing the required parameter 'workPackageID' when calling workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNameDelete(Async)");
        }
        
        // verify the required parameter 'workPackageName' is set
        if (workPackageName == null) {
            throw new ApiException("Missing the required parameter 'workPackageName' when calling workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNameDelete(Async)");
        }
        
        
        com.squareup.okhttp.Call call = workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNameDeleteCall(projectID, workPackageID, workPackageName, ifMatch, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete entity from WorkPackageSet
     * 
     * @param projectID Commercial Project ID   Identifies a master project. (required)
     * @param workPackageID Plan Item (required)
     * @param workPackageName Plan Item Description (required)
     * @param ifMatch ETag (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNameDelete(String projectID, String workPackageID, String workPackageName, String ifMatch) throws ApiException {
        workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNameDeleteWithHttpInfo(projectID, workPackageID, workPackageName, ifMatch);
    }

    /**
     * Delete entity from WorkPackageSet
     * 
     * @param projectID Commercial Project ID   Identifies a master project. (required)
     * @param workPackageID Plan Item (required)
     * @param workPackageName Plan Item Description (required)
     * @param ifMatch ETag (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNameDeleteWithHttpInfo(String projectID, String workPackageID, String workPackageName, String ifMatch) throws ApiException {
        com.squareup.okhttp.Call call = workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNameDeleteValidateBeforeCall(projectID, workPackageID, workPackageName, ifMatch, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete entity from WorkPackageSet (asynchronously)
     * 
     * @param projectID Commercial Project ID   Identifies a master project. (required)
     * @param workPackageID Plan Item (required)
     * @param workPackageName Plan Item Description (required)
     * @param ifMatch ETag (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNameDeleteAsync(String projectID, String workPackageID, String workPackageName, String ifMatch, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNameDeleteValidateBeforeCall(projectID, workPackageID, workPackageName, ifMatch, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNamePatch */
    private com.squareup.okhttp.Call workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNamePatchCall(String projectID, String workPackageID, String workPackageName, ModifiedWorkPackage workPackage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = workPackage;
        
        // create path and map variables
        String localVarPath = "/WorkPackageSet(ProjectID='{ProjectID}',WorkPackageID='{WorkPackageID}',WorkPackageName='{WorkPackageName}')".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "ProjectID" + "\\}", apiClient.escapeString(projectID.toString()))
        .replaceAll("\\{" + "WorkPackageID" + "\\}", apiClient.escapeString(workPackageID.toString()))
        .replaceAll("\\{" + "WorkPackageName" + "\\}", apiClient.escapeString(workPackageName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {"APIBHUB_SANDBOX_APIKEY", "basicAuthentication" };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNamePatchValidateBeforeCall(String projectID, String workPackageID, String workPackageName, ModifiedWorkPackage workPackage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectID' is set
        if (projectID == null) {
            throw new ApiException("Missing the required parameter 'projectID' when calling workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNamePatch(Async)");
        }
        
        // verify the required parameter 'workPackageID' is set
        if (workPackageID == null) {
            throw new ApiException("Missing the required parameter 'workPackageID' when calling workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNamePatch(Async)");
        }
        
        // verify the required parameter 'workPackageName' is set
        if (workPackageName == null) {
            throw new ApiException("Missing the required parameter 'workPackageName' when calling workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNamePatch(Async)");
        }
        
        
        com.squareup.okhttp.Call call = workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNamePatchCall(projectID, workPackageID, workPackageName, workPackage, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update entity in WorkPackageSet
     * 
     * @param projectID Commercial Project ID   Identifies a master project. (required)
     * @param workPackageID Plan Item (required)
     * @param workPackageName Plan Item Description (required)
     * @param workPackage New property values (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNamePatch(String projectID, String workPackageID, String workPackageName, ModifiedWorkPackage workPackage) throws ApiException {
        workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNamePatchWithHttpInfo(projectID, workPackageID, workPackageName, workPackage);
    }

    /**
     * Update entity in WorkPackageSet
     * 
     * @param projectID Commercial Project ID   Identifies a master project. (required)
     * @param workPackageID Plan Item (required)
     * @param workPackageName Plan Item Description (required)
     * @param workPackage New property values (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNamePatchWithHttpInfo(String projectID, String workPackageID, String workPackageName, ModifiedWorkPackage workPackage) throws ApiException {
        com.squareup.okhttp.Call call = workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNamePatchValidateBeforeCall(projectID, workPackageID, workPackageName, workPackage, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update entity in WorkPackageSet (asynchronously)
     * 
     * @param projectID Commercial Project ID   Identifies a master project. (required)
     * @param workPackageID Plan Item (required)
     * @param workPackageName Plan Item Description (required)
     * @param workPackage New property values (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNamePatchAsync(String projectID, String workPackageID, String workPackageName, ModifiedWorkPackage workPackage, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = workPackageSetProjectIDProjectIDWorkPackageIDWorkPackageIDWorkPackageNameWorkPackageNamePatchValidateBeforeCall(projectID, workPackageID, workPackageName, workPackage, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
