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


import org.openapitools.client.model.ApplicationCacheCreateRequest;
import org.openapitools.client.model.ApplicationCacheCreateResponse;
import org.openapitools.client.model.ApplicationCacheGetOneResponse;
import org.openapitools.client.model.ApplicationCacheGetResponse;
import org.openapitools.client.model.ApplicationCachePatchRequest;
import org.openapitools.client.model.ApplicationCachePatchResponse;
import org.openapitools.client.model.ApplicationCachePutRequest;
import org.openapitools.client.model.ApplicationCachePutResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class EdgeApplicationsCacheSettingsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EdgeApplicationsCacheSettingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EdgeApplicationsCacheSettingsApi(ApiClient apiClient) {
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
     * Build call for edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsDelete
     * @param edgeApplicationId  (required)
     * @param cacheSettings  (required)
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
    public okhttp3.Call edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsDeleteCall(Long edgeApplicationId, Long cacheSettings, String accept, String contentType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/edge_applications/{edge_application_id}/cache_settings/{cache_settings}"
            .replace("{" + "edge_application_id" + "}", localVarApiClient.escapeString(edgeApplicationId.toString()))
            .replace("{" + "cache_settings" + "}", localVarApiClient.escapeString(cacheSettings.toString()));

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
    private okhttp3.Call edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsDeleteValidateBeforeCall(Long edgeApplicationId, Long cacheSettings, String accept, String contentType, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'edgeApplicationId' is set
        if (edgeApplicationId == null) {
            throw new ApiException("Missing the required parameter 'edgeApplicationId' when calling edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsDelete(Async)");
        }

        // verify the required parameter 'cacheSettings' is set
        if (cacheSettings == null) {
            throw new ApiException("Missing the required parameter 'cacheSettings' when calling edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsDelete(Async)");
        }

        return edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsDeleteCall(edgeApplicationId, cacheSettings, accept, contentType, _callback);

    }

    /**
     * /edge_applications/:edge_application_id:/cache_settings/:cache_settings:
     * 
     * @param edgeApplicationId  (required)
     * @param cacheSettings  (required)
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
    public void edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsDelete(Long edgeApplicationId, Long cacheSettings, String accept, String contentType) throws ApiException {
        edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsDeleteWithHttpInfo(edgeApplicationId, cacheSettings, accept, contentType);
    }

    /**
     * /edge_applications/:edge_application_id:/cache_settings/:cache_settings:
     * 
     * @param edgeApplicationId  (required)
     * @param cacheSettings  (required)
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
    public ApiResponse<Void> edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsDeleteWithHttpInfo(Long edgeApplicationId, Long cacheSettings, String accept, String contentType) throws ApiException {
        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsDeleteValidateBeforeCall(edgeApplicationId, cacheSettings, accept, contentType, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * /edge_applications/:edge_application_id:/cache_settings/:cache_settings: (asynchronously)
     * 
     * @param edgeApplicationId  (required)
     * @param cacheSettings  (required)
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
    public okhttp3.Call edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsDeleteAsync(Long edgeApplicationId, Long cacheSettings, String accept, String contentType, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsDeleteValidateBeforeCall(edgeApplicationId, cacheSettings, accept, contentType, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdGet
     * @param edgeApplicationId  (required)
     * @param cacheSettingsId  (required)
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
    public okhttp3.Call edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdGetCall(Long edgeApplicationId, Long cacheSettingsId, String accept, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/edge_applications/{edge_application_id}/cache_settings/{cache_settings_id}"
            .replace("{" + "edge_application_id" + "}", localVarApiClient.escapeString(edgeApplicationId.toString()))
            .replace("{" + "cache_settings_id" + "}", localVarApiClient.escapeString(cacheSettingsId.toString()));

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
    private okhttp3.Call edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdGetValidateBeforeCall(Long edgeApplicationId, Long cacheSettingsId, String accept, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'edgeApplicationId' is set
        if (edgeApplicationId == null) {
            throw new ApiException("Missing the required parameter 'edgeApplicationId' when calling edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdGet(Async)");
        }

        // verify the required parameter 'cacheSettingsId' is set
        if (cacheSettingsId == null) {
            throw new ApiException("Missing the required parameter 'cacheSettingsId' when calling edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdGet(Async)");
        }

        return edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdGetCall(edgeApplicationId, cacheSettingsId, accept, _callback);

    }

    /**
     * /edge_applications/:edge_application_id:/cache_settings/:cache_settings_id:
     * 
     * @param edgeApplicationId  (required)
     * @param cacheSettingsId  (required)
     * @param accept  (optional)
     * @return ApplicationCacheGetOneResponse
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
    public ApplicationCacheGetOneResponse edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdGet(Long edgeApplicationId, Long cacheSettingsId, String accept) throws ApiException {
        ApiResponse<ApplicationCacheGetOneResponse> localVarResp = edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdGetWithHttpInfo(edgeApplicationId, cacheSettingsId, accept);
        return localVarResp.getData();
    }

    /**
     * /edge_applications/:edge_application_id:/cache_settings/:cache_settings_id:
     * 
     * @param edgeApplicationId  (required)
     * @param cacheSettingsId  (required)
     * @param accept  (optional)
     * @return ApiResponse&lt;ApplicationCacheGetOneResponse&gt;
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
    public ApiResponse<ApplicationCacheGetOneResponse> edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdGetWithHttpInfo(Long edgeApplicationId, Long cacheSettingsId, String accept) throws ApiException {
        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdGetValidateBeforeCall(edgeApplicationId, cacheSettingsId, accept, null);
        Type localVarReturnType = new TypeToken<ApplicationCacheGetOneResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /edge_applications/:edge_application_id:/cache_settings/:cache_settings_id: (asynchronously)
     * 
     * @param edgeApplicationId  (required)
     * @param cacheSettingsId  (required)
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
    public okhttp3.Call edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdGetAsync(Long edgeApplicationId, Long cacheSettingsId, String accept, final ApiCallback<ApplicationCacheGetOneResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdGetValidateBeforeCall(edgeApplicationId, cacheSettingsId, accept, _callback);
        Type localVarReturnType = new TypeToken<ApplicationCacheGetOneResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPut
     * @param edgeApplicationId  (required)
     * @param cacheSettingsId  (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param applicationCachePutRequest  (optional)
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
    public okhttp3.Call edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPutCall(Long edgeApplicationId, Long cacheSettingsId, String accept, String contentType, ApplicationCachePutRequest applicationCachePutRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = applicationCachePutRequest;

        // create path and map variables
        String localVarPath = "/edge_applications/{edge_application_id}/cache_settings/{cache_settings_id}"
            .replace("{" + "edge_application_id" + "}", localVarApiClient.escapeString(edgeApplicationId.toString()))
            .replace("{" + "cache_settings_id" + "}", localVarApiClient.escapeString(cacheSettingsId.toString()));

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
    private okhttp3.Call edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPutValidateBeforeCall(Long edgeApplicationId, Long cacheSettingsId, String accept, String contentType, ApplicationCachePutRequest applicationCachePutRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'edgeApplicationId' is set
        if (edgeApplicationId == null) {
            throw new ApiException("Missing the required parameter 'edgeApplicationId' when calling edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPut(Async)");
        }

        // verify the required parameter 'cacheSettingsId' is set
        if (cacheSettingsId == null) {
            throw new ApiException("Missing the required parameter 'cacheSettingsId' when calling edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPut(Async)");
        }

        return edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPutCall(edgeApplicationId, cacheSettingsId, accept, contentType, applicationCachePutRequest, _callback);

    }

    /**
     * /edge_applications/:edge_application_id:/cache_settings/ca
     * 
     * @param edgeApplicationId  (required)
     * @param cacheSettingsId  (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param applicationCachePutRequest  (optional)
     * @return ApplicationCachePutResponse
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
    public ApplicationCachePutResponse edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPut(Long edgeApplicationId, Long cacheSettingsId, String accept, String contentType, ApplicationCachePutRequest applicationCachePutRequest) throws ApiException {
        ApiResponse<ApplicationCachePutResponse> localVarResp = edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPutWithHttpInfo(edgeApplicationId, cacheSettingsId, accept, contentType, applicationCachePutRequest);
        return localVarResp.getData();
    }

    /**
     * /edge_applications/:edge_application_id:/cache_settings/ca
     * 
     * @param edgeApplicationId  (required)
     * @param cacheSettingsId  (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param applicationCachePutRequest  (optional)
     * @return ApiResponse&lt;ApplicationCachePutResponse&gt;
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
    public ApiResponse<ApplicationCachePutResponse> edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPutWithHttpInfo(Long edgeApplicationId, Long cacheSettingsId, String accept, String contentType, ApplicationCachePutRequest applicationCachePutRequest) throws ApiException {
        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPutValidateBeforeCall(edgeApplicationId, cacheSettingsId, accept, contentType, applicationCachePutRequest, null);
        Type localVarReturnType = new TypeToken<ApplicationCachePutResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /edge_applications/:edge_application_id:/cache_settings/ca (asynchronously)
     * 
     * @param edgeApplicationId  (required)
     * @param cacheSettingsId  (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param applicationCachePutRequest  (optional)
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
    public okhttp3.Call edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPutAsync(Long edgeApplicationId, Long cacheSettingsId, String accept, String contentType, ApplicationCachePutRequest applicationCachePutRequest, final ApiCallback<ApplicationCachePutResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPutValidateBeforeCall(edgeApplicationId, cacheSettingsId, accept, contentType, applicationCachePutRequest, _callback);
        Type localVarReturnType = new TypeToken<ApplicationCachePutResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsPatch
     * @param edgeApplicationId  (required)
     * @param cacheSettings  (required)
     * @param accept  (optional)
     * @param applicationCachePatchRequest  (optional)
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
    public okhttp3.Call edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsPatchCall(Long edgeApplicationId, Long cacheSettings, String accept, ApplicationCachePatchRequest applicationCachePatchRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = applicationCachePatchRequest;

        // create path and map variables
        String localVarPath = "/edge_applications/{edge_application_id}/cache_settings/{cache_settings}"
            .replace("{" + "edge_application_id" + "}", localVarApiClient.escapeString(edgeApplicationId.toString()))
            .replace("{" + "cache_settings" + "}", localVarApiClient.escapeString(cacheSettings.toString()));

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
    private okhttp3.Call edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsPatchValidateBeforeCall(Long edgeApplicationId, Long cacheSettings, String accept, ApplicationCachePatchRequest applicationCachePatchRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'edgeApplicationId' is set
        if (edgeApplicationId == null) {
            throw new ApiException("Missing the required parameter 'edgeApplicationId' when calling edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsPatch(Async)");
        }

        // verify the required parameter 'cacheSettings' is set
        if (cacheSettings == null) {
            throw new ApiException("Missing the required parameter 'cacheSettings' when calling edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsPatch(Async)");
        }

        return edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsPatchCall(edgeApplicationId, cacheSettings, accept, applicationCachePatchRequest, _callback);

    }

    /**
     * /edge_applications/:edge_application_id:/cache_settings/:cache_settings_id:
     * 
     * @param edgeApplicationId  (required)
     * @param cacheSettings  (required)
     * @param accept  (optional)
     * @param applicationCachePatchRequest  (optional)
     * @return ApplicationCachePatchResponse
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
    public ApplicationCachePatchResponse edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsPatch(Long edgeApplicationId, Long cacheSettings, String accept, ApplicationCachePatchRequest applicationCachePatchRequest) throws ApiException {
        ApiResponse<ApplicationCachePatchResponse> localVarResp = edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsPatchWithHttpInfo(edgeApplicationId, cacheSettings, accept, applicationCachePatchRequest);
        return localVarResp.getData();
    }

    /**
     * /edge_applications/:edge_application_id:/cache_settings/:cache_settings_id:
     * 
     * @param edgeApplicationId  (required)
     * @param cacheSettings  (required)
     * @param accept  (optional)
     * @param applicationCachePatchRequest  (optional)
     * @return ApiResponse&lt;ApplicationCachePatchResponse&gt;
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
    public ApiResponse<ApplicationCachePatchResponse> edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsPatchWithHttpInfo(Long edgeApplicationId, Long cacheSettings, String accept, ApplicationCachePatchRequest applicationCachePatchRequest) throws ApiException {
        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsPatchValidateBeforeCall(edgeApplicationId, cacheSettings, accept, applicationCachePatchRequest, null);
        Type localVarReturnType = new TypeToken<ApplicationCachePatchResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /edge_applications/:edge_application_id:/cache_settings/:cache_settings_id: (asynchronously)
     * 
     * @param edgeApplicationId  (required)
     * @param cacheSettings  (required)
     * @param accept  (optional)
     * @param applicationCachePatchRequest  (optional)
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
    public okhttp3.Call edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsPatchAsync(Long edgeApplicationId, Long cacheSettings, String accept, ApplicationCachePatchRequest applicationCachePatchRequest, final ApiCallback<ApplicationCachePatchResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsPatchValidateBeforeCall(edgeApplicationId, cacheSettings, accept, applicationCachePatchRequest, _callback);
        Type localVarReturnType = new TypeToken<ApplicationCachePatchResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for edgeApplicationsEdgeApplicationIdCacheSettingsGet
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
    public okhttp3.Call edgeApplicationsEdgeApplicationIdCacheSettingsGetCall(Long edgeApplicationId, Long page, Long pageSize, String filter, String orderBy, String sort, String accept, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/edge_applications/{edge_application_id}/cache_settings"
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
    private okhttp3.Call edgeApplicationsEdgeApplicationIdCacheSettingsGetValidateBeforeCall(Long edgeApplicationId, Long page, Long pageSize, String filter, String orderBy, String sort, String accept, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'edgeApplicationId' is set
        if (edgeApplicationId == null) {
            throw new ApiException("Missing the required parameter 'edgeApplicationId' when calling edgeApplicationsEdgeApplicationIdCacheSettingsGet(Async)");
        }

        return edgeApplicationsEdgeApplicationIdCacheSettingsGetCall(edgeApplicationId, page, pageSize, filter, orderBy, sort, accept, _callback);

    }

    /**
     * /edge_applications/{edge_application_id}/cache_settings
     * 
     * @param edgeApplicationId  (required)
     * @param page  (optional)
     * @param pageSize  (optional)
     * @param filter  (optional)
     * @param orderBy  (optional)
     * @param sort  (optional)
     * @param accept  (optional)
     * @return ApplicationCacheGetResponse
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
    public ApplicationCacheGetResponse edgeApplicationsEdgeApplicationIdCacheSettingsGet(Long edgeApplicationId, Long page, Long pageSize, String filter, String orderBy, String sort, String accept) throws ApiException {
        ApiResponse<ApplicationCacheGetResponse> localVarResp = edgeApplicationsEdgeApplicationIdCacheSettingsGetWithHttpInfo(edgeApplicationId, page, pageSize, filter, orderBy, sort, accept);
        return localVarResp.getData();
    }

    /**
     * /edge_applications/{edge_application_id}/cache_settings
     * 
     * @param edgeApplicationId  (required)
     * @param page  (optional)
     * @param pageSize  (optional)
     * @param filter  (optional)
     * @param orderBy  (optional)
     * @param sort  (optional)
     * @param accept  (optional)
     * @return ApiResponse&lt;ApplicationCacheGetResponse&gt;
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
    public ApiResponse<ApplicationCacheGetResponse> edgeApplicationsEdgeApplicationIdCacheSettingsGetWithHttpInfo(Long edgeApplicationId, Long page, Long pageSize, String filter, String orderBy, String sort, String accept) throws ApiException {
        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdCacheSettingsGetValidateBeforeCall(edgeApplicationId, page, pageSize, filter, orderBy, sort, accept, null);
        Type localVarReturnType = new TypeToken<ApplicationCacheGetResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /edge_applications/{edge_application_id}/cache_settings (asynchronously)
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
    public okhttp3.Call edgeApplicationsEdgeApplicationIdCacheSettingsGetAsync(Long edgeApplicationId, Long page, Long pageSize, String filter, String orderBy, String sort, String accept, final ApiCallback<ApplicationCacheGetResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdCacheSettingsGetValidateBeforeCall(edgeApplicationId, page, pageSize, filter, orderBy, sort, accept, _callback);
        Type localVarReturnType = new TypeToken<ApplicationCacheGetResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for edgeApplicationsEdgeApplicationIdCacheSettingsPost
     * @param edgeApplicationId  (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param applicationCacheCreateRequest  (optional)
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
    public okhttp3.Call edgeApplicationsEdgeApplicationIdCacheSettingsPostCall(Long edgeApplicationId, String accept, String contentType, ApplicationCacheCreateRequest applicationCacheCreateRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = applicationCacheCreateRequest;

        // create path and map variables
        String localVarPath = "/edge_applications/{edge_application_id}/cache_settings"
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
    private okhttp3.Call edgeApplicationsEdgeApplicationIdCacheSettingsPostValidateBeforeCall(Long edgeApplicationId, String accept, String contentType, ApplicationCacheCreateRequest applicationCacheCreateRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'edgeApplicationId' is set
        if (edgeApplicationId == null) {
            throw new ApiException("Missing the required parameter 'edgeApplicationId' when calling edgeApplicationsEdgeApplicationIdCacheSettingsPost(Async)");
        }

        return edgeApplicationsEdgeApplicationIdCacheSettingsPostCall(edgeApplicationId, accept, contentType, applicationCacheCreateRequest, _callback);

    }

    /**
     * /edge_applications/:edge_application_id:/cache_settings
     * 
     * @param edgeApplicationId  (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param applicationCacheCreateRequest  (optional)
     * @return ApplicationCacheCreateResponse
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
    public ApplicationCacheCreateResponse edgeApplicationsEdgeApplicationIdCacheSettingsPost(Long edgeApplicationId, String accept, String contentType, ApplicationCacheCreateRequest applicationCacheCreateRequest) throws ApiException {
        ApiResponse<ApplicationCacheCreateResponse> localVarResp = edgeApplicationsEdgeApplicationIdCacheSettingsPostWithHttpInfo(edgeApplicationId, accept, contentType, applicationCacheCreateRequest);
        return localVarResp.getData();
    }

    /**
     * /edge_applications/:edge_application_id:/cache_settings
     * 
     * @param edgeApplicationId  (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param applicationCacheCreateRequest  (optional)
     * @return ApiResponse&lt;ApplicationCacheCreateResponse&gt;
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
    public ApiResponse<ApplicationCacheCreateResponse> edgeApplicationsEdgeApplicationIdCacheSettingsPostWithHttpInfo(Long edgeApplicationId, String accept, String contentType, ApplicationCacheCreateRequest applicationCacheCreateRequest) throws ApiException {
        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdCacheSettingsPostValidateBeforeCall(edgeApplicationId, accept, contentType, applicationCacheCreateRequest, null);
        Type localVarReturnType = new TypeToken<ApplicationCacheCreateResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /edge_applications/:edge_application_id:/cache_settings (asynchronously)
     * 
     * @param edgeApplicationId  (required)
     * @param accept  (optional)
     * @param contentType The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json (optional)
     * @param applicationCacheCreateRequest  (optional)
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
    public okhttp3.Call edgeApplicationsEdgeApplicationIdCacheSettingsPostAsync(Long edgeApplicationId, String accept, String contentType, ApplicationCacheCreateRequest applicationCacheCreateRequest, final ApiCallback<ApplicationCacheCreateResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = edgeApplicationsEdgeApplicationIdCacheSettingsPostValidateBeforeCall(edgeApplicationId, accept, contentType, applicationCacheCreateRequest, _callback);
        Type localVarReturnType = new TypeToken<ApplicationCacheCreateResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
