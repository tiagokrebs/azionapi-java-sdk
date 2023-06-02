/*
 * Edge Application
 * ## Welcome to the Azion API!  With the following APIs you can check, remove or update existing settings, besides creating new ones.  * * *  ## Overview  The Azion API is a RESTful API, based on HTTPS requests, that allows you to integrate your systems with our platform, simply, quickly, and securely.  Here you will find instructions on how our API works and what functionality is available.  This documentation is being constantly updated. Make sure you verify if there are any updates or changes before you perform any development in your application, even if you are familiar with our API.  * * *  Both HTTPS requests and responses must be in JavaScript Object Notation (JSON) format. All HTTPS requests and responses must follow these conventions.  **Base URL**  The base URL of the API, which must be used, is:  [**https://api.azionapi.net/_**](https://api.azionapi.net/)  **HTTP Methods**  Each HTTP method defines the type of operation that will be run.  | HTTP Method | CRUD | Whole Collection (e.g. /items) | Specific Item (e.g. /items/:item_id) | | --- | --- | --- | --- | | GET | Read | It retrieves the list of items in a Collection. | It retrieves a specific item in a Collection. | | POST | Create | It creates a new item in the Collection. | \\- | | PUT | Update/Replace | It replaces a whole Collection with a new one. | It replaces an item in a Collection with a new one. | | PATCH | Update/Modify | It partially updates a Collection. | It partially updates an item in a Collection | | DELETE | Delete | It deletes a whole Collection. | It deletes an item in a Collection. |  * * *  **Status Codes**  The HTTP return code defines the status – successful or not – after the requested operation is run.  | Status Code | Meaning | | --- | --- | | 200 OK | General Status for a successful operation. | | 201 CREATED | Successfully created a collection or item, by means of POST or PUT. | | 204 NO CONTENT | Successful operation, but without any content to be return to the Body. Generally used for DELETE or PUT operations. | | 207 MULTI-STATUS | A batch of operations were triggered by a single request, which resulted in different return codes when it was run, for some of the operations. The codes are displayed in the “status” field, in the body of the response, for each sub-batch of operations for whichever are applicable. | | 400 BAD REQUEST | Request error, such as invalid parameters, missing mandatory parameters or others. | | 401 UNAUTHORIZED | Error caused by a missing HTTP Authentication header. | | 403 FORBIDDEN | User does not have the permissions to run the requested operation. | | 404 NOT FOUND | The requested resource does not exist. | | 405 METHOD NOT ALLOWED | The requested method is not applicable with the URL. | | 406 NOT ACCEPTABLE | Accept header missing from the HTTP request or the header contains formatting or the version is not supported by the API. | | 409 CONFLICT | Conflict generated in running the request, such as a request to create an already existing record. | | 429 TOO MANY REQUESTS | The request was temporarily rejected, due to exceeding the limit on operations. Wait for the time defined in the X-Ratelimit-Reset header and try again. | | 500 INTERNAL SERVER ERROR | Unintentional error, due to an unidentified failure in the request process. | | \\--- |  | | **HTTP Headers** |  |  All requests must be generated with the HTTP header specifying the desired code format for responses and the API version used. The current version of the API is 3 and the format is application/json.  ``` Accept: application/json; version=3  ```  * * *  **Rate Limit**  The limit of operations that can be run via the API is defined by 3 HTTP response headers:  *   **X-ratelimit-limit:** number of operations allowed in one time-frame; *   **X-ratelimit-remaining:** number of operations still available in one time-frame; *   **X-ratelimit-reset:** is the date and time, in IOS 8601 format, which represents the point in the future when the time-frame will be closed and when the limits will, therefore, be reset.       Example of HTTP response headers and a request:  ``` Date: Thu, 02 Nov 2017 12:30:28 GMT X-ratelimit-remaining: 199 X-ratelimit-limit: 200 X-ratelimit-reset: 2017-11-02T12:31:28.675446  ```  In the example provided, 200 operations are allowed within a 1-minute time frame. Of those, there are 199 still available, because one has already been run. The total limit will be reset after 1 minute.  When the X-ratelimit-limit is reached, or in other words, when the X-ratelimit-remaining reaches zero, the API will give the error, HTTP 429 TOO MANY REQUESTS. If your application receives this error, you will need to wait until the time defined in X-ratelimit-reset has passed, to make another request.  *   **X-ratelimit-limit by product**       The *X-ratelimit limit* variations by product are the following:  *   **Real-Time Metrics:** 20 requests per minute. *   **Real-Time Purge:** 200 requests per minute; except for the Wildcard, which is 2000 a day.       > The rate-limit values are based on the client_id.  * * *  **Optional Parameters**  In this version, it is possible to include some optional parameters as part of the GET method, which can help and modify the form in which your data will be returned.  You can combine these parameters to get the result you want.  They are:  | Parameter | Description | Accepted values: | | --- | --- | --- | | order_by | Identifies which field the return should be sorted by. The default ordering is ascending. | Depends on the fields available from the endpoint structure | | sort | Defines which ordering to be used: ascending or descending. | asc  <br>  <br>desc | | page | Identifies which page should be returned, if the return is paginated. The default value is 1. | Page number. | | page_size | Identifies how many items should be returned per page. The default value is 10. | Desired number of items. |  * * *  **Request Exemple**  You can use one parameter, or a combination. See the example below, which uses all of them in the same request.  ``` GET /domains?order_by=name&page_size=20&sort=desc&page=3 Accept: application/json; version=3 Authorization: token 2909f3932069047f4736dc87e72baaddd19c9f75  ```  * * *  # Authentication  Authentication and authorization of operations via Azion API is done through Tokens.  The first step is to create the Token through authenticating a user registered in [Real-Time Manager](https://sso.azion.com/login).  * * *  ## Encoding Username and Password in Base64  Only token creation and cancelling operations are performed through Basic Authentication, that is, with a username and password. You can create and cancel the token through the API itself, but for that you need to encode your username and password in base64.  Base64 encoding can be done from the command line on a Unix terminal:  ``` $ echo 'user@domain:password'|base64 dXNlckBkb21haW46cGFzc3dvcmQK  ```  If you do not have a Unix terminal available, you can use the free online service at [https://www.base64encode.org/](https://www.base64encode.org/)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ApplicationCreateInstanceRequest;
import org.openapitools.client.model.ApplicationInstanceResults;
import org.openapitools.client.model.ApplicationInstancesGetOneResponse;
import org.openapitools.client.model.ApplicationInstancesGetResponse;
import org.openapitools.client.model.ApplicationPutInstanceRequest;
import org.openapitools.client.model.ApplicationUpdateInstanceRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class EdgeApplicationsEdgeFunctionsInstancesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EdgeApplicationsEdgeFunctionsInstancesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EdgeApplicationsEdgeFunctionsInstancesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdDelete
     * @param edgeApplicationId  (required)
     * @param functionsInstancesId  (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdDeleteCall(String edgeApplicationId, String functionsInstancesId, String accept, String contentType, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/edge_applications/{edge_application_id}/functions_instances/{functions_instances_id}"
            .replace("{" + "edge_application_id" + "}", localVarApiClient.escapeString(edgeApplicationId.toString()))
            .replace("{" + "functions_instances_id" + "}", localVarApiClient.escapeString(functionsInstancesId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdDeleteValidateBeforeCall(String edgeApplicationId, String functionsInstancesId, String accept, String contentType, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'edgeApplicationId' is set
        if (edgeApplicationId == null) {
            throw new ApiException("Missing the required parameter 'edgeApplicationId' when calling edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdDelete(Async)");
        }

        // verify the required parameter 'functionsInstancesId' is set
        if (functionsInstancesId == null) {
            throw new ApiException("Missing the required parameter 'functionsInstancesId' when calling edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdDelete(Async)");
        }

        return edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdDeleteCall(edgeApplicationId, functionsInstancesId, accept, contentType, _callback);

    }

    /**
     * /edge_applications/:edge_application_id:/functions_instances/:functions_instances_id:
     * 
     * @param edgeApplicationId  (required)
     * @param functionsInstancesId  (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public void edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdDelete(String edgeApplicationId, String functionsInstancesId, String accept, String contentType) throws ApiException {
        edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdDeleteWithHttpInfo(edgeApplicationId, functionsInstancesId, accept, contentType);
    }

    /**
     * /edge_applications/:edge_application_id:/functions_instances/:functions_instances_id:
     * 
     * @param edgeApplicationId  (required)
     * @param functionsInstancesId  (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdDeleteWithHttpInfo(String edgeApplicationId, String functionsInstancesId, String accept, String contentType) throws ApiException {
        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdDeleteValidateBeforeCall(edgeApplicationId, functionsInstancesId, accept, contentType, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * /edge_applications/:edge_application_id:/functions_instances/:functions_instances_id: (asynchronously)
     * 
     * @param edgeApplicationId  (required)
     * @param functionsInstancesId  (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdDeleteAsync(String edgeApplicationId, String functionsInstancesId, String accept, String contentType, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdDeleteValidateBeforeCall(edgeApplicationId, functionsInstancesId, accept, contentType, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdGet
     * @param edgeApplicationId  (required)
     * @param functionsInstancesId  (required)
     * @param accept The id of the edge function instance you plan to query.  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdGetCall(Long edgeApplicationId, Long functionsInstancesId, String accept, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/edge_applications/{edge_application_id}/functions_instances/{functions_instances_id}"
            .replace("{" + "edge_application_id" + "}", localVarApiClient.escapeString(edgeApplicationId.toString()))
            .replace("{" + "functions_instances_id" + "}", localVarApiClient.escapeString(functionsInstancesId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/json; version=3"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdGetValidateBeforeCall(Long edgeApplicationId, Long functionsInstancesId, String accept, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'edgeApplicationId' is set
        if (edgeApplicationId == null) {
            throw new ApiException("Missing the required parameter 'edgeApplicationId' when calling edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdGet(Async)");
        }

        // verify the required parameter 'functionsInstancesId' is set
        if (functionsInstancesId == null) {
            throw new ApiException("Missing the required parameter 'functionsInstancesId' when calling edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdGet(Async)");
        }

        return edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdGetCall(edgeApplicationId, functionsInstancesId, accept, _callback);

    }

    /**
     * /edge_applications/:edge_application_id:/functions_instances/:functions_instances_id:
     * 
     * @param edgeApplicationId  (required)
     * @param functionsInstancesId  (required)
     * @param accept The id of the edge function instance you plan to query.  (optional)
     * @return ApplicationInstancesGetOneResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApplicationInstancesGetOneResponse edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdGet(Long edgeApplicationId, Long functionsInstancesId, String accept) throws ApiException {
        ApiResponse<ApplicationInstancesGetOneResponse> localVarResp = edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdGetWithHttpInfo(edgeApplicationId, functionsInstancesId, accept);
        return localVarResp.getData();
    }

    /**
     * /edge_applications/:edge_application_id:/functions_instances/:functions_instances_id:
     * 
     * @param edgeApplicationId  (required)
     * @param functionsInstancesId  (required)
     * @param accept The id of the edge function instance you plan to query.  (optional)
     * @return ApiResponse&lt;ApplicationInstancesGetOneResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApplicationInstancesGetOneResponse> edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdGetWithHttpInfo(Long edgeApplicationId, Long functionsInstancesId, String accept) throws ApiException {
        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdGetValidateBeforeCall(edgeApplicationId, functionsInstancesId, accept, null);
        Type localVarReturnType = new TypeToken<ApplicationInstancesGetOneResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /edge_applications/:edge_application_id:/functions_instances/:functions_instances_id: (asynchronously)
     * 
     * @param edgeApplicationId  (required)
     * @param functionsInstancesId  (required)
     * @param accept The id of the edge function instance you plan to query.  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdGetAsync(Long edgeApplicationId, Long functionsInstancesId, String accept, final ApiCallback<ApplicationInstancesGetOneResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdGetValidateBeforeCall(edgeApplicationId, functionsInstancesId, accept, _callback);
        Type localVarReturnType = new TypeToken<ApplicationInstancesGetOneResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPatch
     * @param edgeApplicationId The id of the edge application you plan to overwrite  (required)
     * @param functionsInstancesId The id of the edge function instance you plan to overwrite. (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param applicationUpdateInstanceRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPatchCall(String edgeApplicationId, String functionsInstancesId, String accept, String contentType, ApplicationUpdateInstanceRequest applicationUpdateInstanceRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = applicationUpdateInstanceRequest;

        // create path and map variables
        String localVarPath = "/edge_applications/{edge_application_id}/functions_instances/{functions_instances_id}"
            .replace("{" + "edge_application_id" + "}", localVarApiClient.escapeString(edgeApplicationId.toString()))
            .replace("{" + "functions_instances_id" + "}", localVarApiClient.escapeString(functionsInstancesId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        final String[] localVarAccepts = {
            "application/json; version=3"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json; version=3"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPatchValidateBeforeCall(String edgeApplicationId, String functionsInstancesId, String accept, String contentType, ApplicationUpdateInstanceRequest applicationUpdateInstanceRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'edgeApplicationId' is set
        if (edgeApplicationId == null) {
            throw new ApiException("Missing the required parameter 'edgeApplicationId' when calling edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPatch(Async)");
        }

        // verify the required parameter 'functionsInstancesId' is set
        if (functionsInstancesId == null) {
            throw new ApiException("Missing the required parameter 'functionsInstancesId' when calling edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPatch(Async)");
        }

        return edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPatchCall(edgeApplicationId, functionsInstancesId, accept, contentType, applicationUpdateInstanceRequest, _callback);

    }

    /**
     * /edge_applications/:edge_application_id:/functions_instances/:functions_instances_id:
     * 
     * @param edgeApplicationId The id of the edge application you plan to overwrite  (required)
     * @param functionsInstancesId The id of the edge function instance you plan to overwrite. (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param applicationUpdateInstanceRequest  (optional)
     * @return ApplicationInstanceResults
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApplicationInstanceResults edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPatch(String edgeApplicationId, String functionsInstancesId, String accept, String contentType, ApplicationUpdateInstanceRequest applicationUpdateInstanceRequest) throws ApiException {
        ApiResponse<ApplicationInstanceResults> localVarResp = edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPatchWithHttpInfo(edgeApplicationId, functionsInstancesId, accept, contentType, applicationUpdateInstanceRequest);
        return localVarResp.getData();
    }

    /**
     * /edge_applications/:edge_application_id:/functions_instances/:functions_instances_id:
     * 
     * @param edgeApplicationId The id of the edge application you plan to overwrite  (required)
     * @param functionsInstancesId The id of the edge function instance you plan to overwrite. (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param applicationUpdateInstanceRequest  (optional)
     * @return ApiResponse&lt;ApplicationInstanceResults&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApplicationInstanceResults> edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPatchWithHttpInfo(String edgeApplicationId, String functionsInstancesId, String accept, String contentType, ApplicationUpdateInstanceRequest applicationUpdateInstanceRequest) throws ApiException {
        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPatchValidateBeforeCall(edgeApplicationId, functionsInstancesId, accept, contentType, applicationUpdateInstanceRequest, null);
        Type localVarReturnType = new TypeToken<ApplicationInstanceResults>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /edge_applications/:edge_application_id:/functions_instances/:functions_instances_id: (asynchronously)
     * 
     * @param edgeApplicationId The id of the edge application you plan to overwrite  (required)
     * @param functionsInstancesId The id of the edge function instance you plan to overwrite. (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param applicationUpdateInstanceRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPatchAsync(String edgeApplicationId, String functionsInstancesId, String accept, String contentType, ApplicationUpdateInstanceRequest applicationUpdateInstanceRequest, final ApiCallback<ApplicationInstanceResults> _callback) throws ApiException {

        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPatchValidateBeforeCall(edgeApplicationId, functionsInstancesId, accept, contentType, applicationUpdateInstanceRequest, _callback);
        Type localVarReturnType = new TypeToken<ApplicationInstanceResults>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPut
     * @param edgeApplicationId The id of the edge application you plan to overwrite  (required)
     * @param functionsInstancesId The id of the edge function instance you plan to overwrite. (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param applicationPutInstanceRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPutCall(String edgeApplicationId, String functionsInstancesId, String accept, String contentType, ApplicationPutInstanceRequest applicationPutInstanceRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = applicationPutInstanceRequest;

        // create path and map variables
        String localVarPath = "/edge_applications/{edge_application_id}/functions_instances/{functions_instances_id}"
            .replace("{" + "edge_application_id" + "}", localVarApiClient.escapeString(edgeApplicationId.toString()))
            .replace("{" + "functions_instances_id" + "}", localVarApiClient.escapeString(functionsInstancesId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        final String[] localVarAccepts = {
            "application/json; version=3"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json; version=3"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPutValidateBeforeCall(String edgeApplicationId, String functionsInstancesId, String accept, String contentType, ApplicationPutInstanceRequest applicationPutInstanceRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'edgeApplicationId' is set
        if (edgeApplicationId == null) {
            throw new ApiException("Missing the required parameter 'edgeApplicationId' when calling edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPut(Async)");
        }

        // verify the required parameter 'functionsInstancesId' is set
        if (functionsInstancesId == null) {
            throw new ApiException("Missing the required parameter 'functionsInstancesId' when calling edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPut(Async)");
        }

        return edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPutCall(edgeApplicationId, functionsInstancesId, accept, contentType, applicationPutInstanceRequest, _callback);

    }

    /**
     * /edge_applications/:edge_application_id:/functions_instances/:functions_instances_id:
     * 
     * @param edgeApplicationId The id of the edge application you plan to overwrite  (required)
     * @param functionsInstancesId The id of the edge function instance you plan to overwrite. (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param applicationPutInstanceRequest  (optional)
     * @return ApplicationInstanceResults
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApplicationInstanceResults edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPut(String edgeApplicationId, String functionsInstancesId, String accept, String contentType, ApplicationPutInstanceRequest applicationPutInstanceRequest) throws ApiException {
        ApiResponse<ApplicationInstanceResults> localVarResp = edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPutWithHttpInfo(edgeApplicationId, functionsInstancesId, accept, contentType, applicationPutInstanceRequest);
        return localVarResp.getData();
    }

    /**
     * /edge_applications/:edge_application_id:/functions_instances/:functions_instances_id:
     * 
     * @param edgeApplicationId The id of the edge application you plan to overwrite  (required)
     * @param functionsInstancesId The id of the edge function instance you plan to overwrite. (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param applicationPutInstanceRequest  (optional)
     * @return ApiResponse&lt;ApplicationInstanceResults&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApplicationInstanceResults> edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPutWithHttpInfo(String edgeApplicationId, String functionsInstancesId, String accept, String contentType, ApplicationPutInstanceRequest applicationPutInstanceRequest) throws ApiException {
        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPutValidateBeforeCall(edgeApplicationId, functionsInstancesId, accept, contentType, applicationPutInstanceRequest, null);
        Type localVarReturnType = new TypeToken<ApplicationInstanceResults>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /edge_applications/:edge_application_id:/functions_instances/:functions_instances_id: (asynchronously)
     * 
     * @param edgeApplicationId The id of the edge application you plan to overwrite  (required)
     * @param functionsInstancesId The id of the edge function instance you plan to overwrite. (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param applicationPutInstanceRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPutAsync(String edgeApplicationId, String functionsInstancesId, String accept, String contentType, ApplicationPutInstanceRequest applicationPutInstanceRequest, final ApiCallback<ApplicationInstanceResults> _callback) throws ApiException {

        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPutValidateBeforeCall(edgeApplicationId, functionsInstancesId, accept, contentType, applicationPutInstanceRequest, _callback);
        Type localVarReturnType = new TypeToken<ApplicationInstanceResults>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for edgeApplicationsEdgeApplicationIdFunctionsInstancesGet
     * @param edgeApplicationId  (required)
     * @param page  (optional)
     * @param pageSize  (optional)
     * @param filter  (optional)
     * @param orderBy  (optional)
     * @param sort  (optional)
     * @param accept  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call edgeApplicationsEdgeApplicationIdFunctionsInstancesGetCall(Long edgeApplicationId, Long page, Long pageSize, String filter, String orderBy, String sort, String accept, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/edge_applications/{edge_application_id}/functions_instances"
            .replace("{" + "edge_application_id" + "}", localVarApiClient.escapeString(edgeApplicationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_by", orderBy));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/json; version=3"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call edgeApplicationsEdgeApplicationIdFunctionsInstancesGetValidateBeforeCall(Long edgeApplicationId, Long page, Long pageSize, String filter, String orderBy, String sort, String accept, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'edgeApplicationId' is set
        if (edgeApplicationId == null) {
            throw new ApiException("Missing the required parameter 'edgeApplicationId' when calling edgeApplicationsEdgeApplicationIdFunctionsInstancesGet(Async)");
        }

        return edgeApplicationsEdgeApplicationIdFunctionsInstancesGetCall(edgeApplicationId, page, pageSize, filter, orderBy, sort, accept, _callback);

    }

    /**
     * /edge_applications/:edge_application_id:/functions_instances
     * 
     * @param edgeApplicationId  (required)
     * @param page  (optional)
     * @param pageSize  (optional)
     * @param filter  (optional)
     * @param orderBy  (optional)
     * @param sort  (optional)
     * @param accept  (optional)
     * @return ApplicationInstancesGetResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApplicationInstancesGetResponse edgeApplicationsEdgeApplicationIdFunctionsInstancesGet(Long edgeApplicationId, Long page, Long pageSize, String filter, String orderBy, String sort, String accept) throws ApiException {
        ApiResponse<ApplicationInstancesGetResponse> localVarResp = edgeApplicationsEdgeApplicationIdFunctionsInstancesGetWithHttpInfo(edgeApplicationId, page, pageSize, filter, orderBy, sort, accept);
        return localVarResp.getData();
    }

    /**
     * /edge_applications/:edge_application_id:/functions_instances
     * 
     * @param edgeApplicationId  (required)
     * @param page  (optional)
     * @param pageSize  (optional)
     * @param filter  (optional)
     * @param orderBy  (optional)
     * @param sort  (optional)
     * @param accept  (optional)
     * @return ApiResponse&lt;ApplicationInstancesGetResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApplicationInstancesGetResponse> edgeApplicationsEdgeApplicationIdFunctionsInstancesGetWithHttpInfo(Long edgeApplicationId, Long page, Long pageSize, String filter, String orderBy, String sort, String accept) throws ApiException {
        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdFunctionsInstancesGetValidateBeforeCall(edgeApplicationId, page, pageSize, filter, orderBy, sort, accept, null);
        Type localVarReturnType = new TypeToken<ApplicationInstancesGetResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /edge_applications/:edge_application_id:/functions_instances (asynchronously)
     * 
     * @param edgeApplicationId  (required)
     * @param page  (optional)
     * @param pageSize  (optional)
     * @param filter  (optional)
     * @param orderBy  (optional)
     * @param sort  (optional)
     * @param accept  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call edgeApplicationsEdgeApplicationIdFunctionsInstancesGetAsync(Long edgeApplicationId, Long page, Long pageSize, String filter, String orderBy, String sort, String accept, final ApiCallback<ApplicationInstancesGetResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdFunctionsInstancesGetValidateBeforeCall(edgeApplicationId, page, pageSize, filter, orderBy, sort, accept, _callback);
        Type localVarReturnType = new TypeToken<ApplicationInstancesGetResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for edgeApplicationsEdgeApplicationIdFunctionsInstancesPost
     * @param edgeApplicationId  (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param applicationCreateInstanceRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call edgeApplicationsEdgeApplicationIdFunctionsInstancesPostCall(Long edgeApplicationId, String accept, String contentType, ApplicationCreateInstanceRequest applicationCreateInstanceRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = applicationCreateInstanceRequest;

        // create path and map variables
        String localVarPath = "/edge_applications/{edge_application_id}/functions_instances"
            .replace("{" + "edge_application_id" + "}", localVarApiClient.escapeString(edgeApplicationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        final String[] localVarAccepts = {
            "application/json; version=3"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json; version=3"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call edgeApplicationsEdgeApplicationIdFunctionsInstancesPostValidateBeforeCall(Long edgeApplicationId, String accept, String contentType, ApplicationCreateInstanceRequest applicationCreateInstanceRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'edgeApplicationId' is set
        if (edgeApplicationId == null) {
            throw new ApiException("Missing the required parameter 'edgeApplicationId' when calling edgeApplicationsEdgeApplicationIdFunctionsInstancesPost(Async)");
        }

        return edgeApplicationsEdgeApplicationIdFunctionsInstancesPostCall(edgeApplicationId, accept, contentType, applicationCreateInstanceRequest, _callback);

    }

    /**
     * edge_application/:edge_application_id:/functions_instances
     * 
     * @param edgeApplicationId  (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param applicationCreateInstanceRequest  (optional)
     * @return ApplicationInstanceResults
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApplicationInstanceResults edgeApplicationsEdgeApplicationIdFunctionsInstancesPost(Long edgeApplicationId, String accept, String contentType, ApplicationCreateInstanceRequest applicationCreateInstanceRequest) throws ApiException {
        ApiResponse<ApplicationInstanceResults> localVarResp = edgeApplicationsEdgeApplicationIdFunctionsInstancesPostWithHttpInfo(edgeApplicationId, accept, contentType, applicationCreateInstanceRequest);
        return localVarResp.getData();
    }

    /**
     * edge_application/:edge_application_id:/functions_instances
     * 
     * @param edgeApplicationId  (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param applicationCreateInstanceRequest  (optional)
     * @return ApiResponse&lt;ApplicationInstanceResults&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApplicationInstanceResults> edgeApplicationsEdgeApplicationIdFunctionsInstancesPostWithHttpInfo(Long edgeApplicationId, String accept, String contentType, ApplicationCreateInstanceRequest applicationCreateInstanceRequest) throws ApiException {
        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdFunctionsInstancesPostValidateBeforeCall(edgeApplicationId, accept, contentType, applicationCreateInstanceRequest, null);
        Type localVarReturnType = new TypeToken<ApplicationInstanceResults>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * edge_application/:edge_application_id:/functions_instances (asynchronously)
     * 
     * @param edgeApplicationId  (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param applicationCreateInstanceRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call edgeApplicationsEdgeApplicationIdFunctionsInstancesPostAsync(Long edgeApplicationId, String accept, String contentType, ApplicationCreateInstanceRequest applicationCreateInstanceRequest, final ApiCallback<ApplicationInstanceResults> _callback) throws ApiException {

        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdFunctionsInstancesPostValidateBeforeCall(edgeApplicationId, accept, contentType, applicationCreateInstanceRequest, _callback);
        Type localVarReturnType = new TypeToken<ApplicationInstanceResults>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
