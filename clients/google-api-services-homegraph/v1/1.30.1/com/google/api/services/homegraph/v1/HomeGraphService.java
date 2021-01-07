/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.homegraph.v1;

/**
 * Service definition for HomeGraphService (v1).
 *
 * <p>
 * 
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/actions/smarthome/create-app#request-sync" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link HomeGraphServiceRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class HomeGraphService extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.30.10 of the HomeGraph API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://homegraph.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public HomeGraphService(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  HomeGraphService(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the AgentUsers collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code HomeGraphService homegraph = new HomeGraphService(...);}
   *   {@code HomeGraphService.AgentUsers.List request = homegraph.agentUsers().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public AgentUsers agentUsers() {
    return new AgentUsers();
  }

  /**
   * The "agentUsers" collection of methods.
   */
  public class AgentUsers {

    /**
     * Unlinks the given third-party user from your smart home Action. All data related to this user
     * will be deleted. For more details on how users link their accounts, see [fulfillment and
     * authentication](https://developers.google.com/assistant/smarthome/concepts/fulfillment-
     * authentication). The third-party user's identity is passed in via the `agent_user_id` (see
     * DeleteAgentUserRequest). This request must be authorized using service account credentials from
     * your Actions console project.
     *
     * Create a request for the method "agentUsers.delete".
     *
     * This request holds the parameters needed by the homegraph server.  After setting any optional
     * parameters, call the {@link Delete#execute()} method to invoke the remote operation.
     *
     * @param agentUserId Required. Third-party user ID.
     * @return the request
     */
    public Delete delete(java.lang.String agentUserId) throws java.io.IOException {
      Delete result = new Delete(agentUserId);
      initialize(result);
      return result;
    }

    public class Delete extends HomeGraphServiceRequest<com.google.api.services.homegraph.v1.model.Empty> {

      private static final String REST_PATH = "v1/{+agentUserId}";

      private final java.util.regex.Pattern AGENT_USER_ID_PATTERN =
          java.util.regex.Pattern.compile("^agentUsers/.*$");

      /**
       * Unlinks the given third-party user from your smart home Action. All data related to this user
       * will be deleted. For more details on how users link their accounts, see [fulfillment and
       * authentication](https://developers.google.com/assistant/smarthome/concepts/fulfillment-
       * authentication). The third-party user's identity is passed in via the `agent_user_id` (see
       * DeleteAgentUserRequest). This request must be authorized using service account credentials from
       * your Actions console project.
       *
       * Create a request for the method "agentUsers.delete".
       *
       * This request holds the parameters needed by the the homegraph server.  After setting any
       * optional parameters, call the {@link Delete#execute()} method to invoke the remote operation.
       * <p> {@link
       * Delete#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param agentUserId Required. Third-party user ID.
       * @since 1.13
       */
      protected Delete(java.lang.String agentUserId) {
        super(HomeGraphService.this, "DELETE", REST_PATH, null, com.google.api.services.homegraph.v1.model.Empty.class);
        this.agentUserId = com.google.api.client.util.Preconditions.checkNotNull(agentUserId, "Required parameter agentUserId must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(AGENT_USER_ID_PATTERN.matcher(agentUserId).matches(),
              "Parameter agentUserId must conform to the pattern " +
              "^agentUsers/.*$");
        }
      }

      @Override
      public Delete set$Xgafv(java.lang.String $Xgafv) {
        return (Delete) super.set$Xgafv($Xgafv);
      }

      @Override
      public Delete setAccessToken(java.lang.String accessToken) {
        return (Delete) super.setAccessToken(accessToken);
      }

      @Override
      public Delete setAlt(java.lang.String alt) {
        return (Delete) super.setAlt(alt);
      }

      @Override
      public Delete setCallback(java.lang.String callback) {
        return (Delete) super.setCallback(callback);
      }

      @Override
      public Delete setFields(java.lang.String fields) {
        return (Delete) super.setFields(fields);
      }

      @Override
      public Delete setKey(java.lang.String key) {
        return (Delete) super.setKey(key);
      }

      @Override
      public Delete setOauthToken(java.lang.String oauthToken) {
        return (Delete) super.setOauthToken(oauthToken);
      }

      @Override
      public Delete setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Delete) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Delete setQuotaUser(java.lang.String quotaUser) {
        return (Delete) super.setQuotaUser(quotaUser);
      }

      @Override
      public Delete setUploadType(java.lang.String uploadType) {
        return (Delete) super.setUploadType(uploadType);
      }

      @Override
      public Delete setUploadProtocol(java.lang.String uploadProtocol) {
        return (Delete) super.setUploadProtocol(uploadProtocol);
      }

      /** Required. Third-party user ID. */
      @com.google.api.client.util.Key
      private java.lang.String agentUserId;

      /** Required. Third-party user ID.
       */
      public java.lang.String getAgentUserId() {
        return agentUserId;
      }

      /** Required. Third-party user ID. */
      public Delete setAgentUserId(java.lang.String agentUserId) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(AGENT_USER_ID_PATTERN.matcher(agentUserId).matches(),
              "Parameter agentUserId must conform to the pattern " +
              "^agentUsers/.*$");
        }
        this.agentUserId = agentUserId;
        return this;
      }

      /** Request ID used for debugging. */
      @com.google.api.client.util.Key
      private java.lang.String requestId;

      /** Request ID used for debugging.
       */
      public java.lang.String getRequestId() {
        return requestId;
      }

      /** Request ID used for debugging. */
      public Delete setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
        return this;
      }

      @Override
      public Delete set(String parameterName, Object value) {
        return (Delete) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the Devices collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code HomeGraphService homegraph = new HomeGraphService(...);}
   *   {@code HomeGraphService.Devices.List request = homegraph.devices().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Devices devices() {
    return new Devices();
  }

  /**
   * The "devices" collection of methods.
   */
  public class Devices {

    /**
     * Gets the current states in Home Graph for the given set of the third-party user's devices. The
     * third-party user's identity is passed in via the `agent_user_id` (see QueryRequest). This request
     * must be authorized using service account credentials from your Actions console project.
     *
     * Create a request for the method "devices.query".
     *
     * This request holds the parameters needed by the homegraph server.  After setting any optional
     * parameters, call the {@link Query#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.homegraph.v1.model.QueryRequest}
     * @return the request
     */
    public Query query(com.google.api.services.homegraph.v1.model.QueryRequest content) throws java.io.IOException {
      Query result = new Query(content);
      initialize(result);
      return result;
    }

    public class Query extends HomeGraphServiceRequest<com.google.api.services.homegraph.v1.model.QueryResponse> {

      private static final String REST_PATH = "v1/devices:query";

      /**
       * Gets the current states in Home Graph for the given set of the third-party user's devices. The
       * third-party user's identity is passed in via the `agent_user_id` (see QueryRequest). This
       * request must be authorized using service account credentials from your Actions console project.
       *
       * Create a request for the method "devices.query".
       *
       * This request holds the parameters needed by the the homegraph server.  After setting any
       * optional parameters, call the {@link Query#execute()} method to invoke the remote operation.
       * <p> {@link
       * Query#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.homegraph.v1.model.QueryRequest}
       * @since 1.13
       */
      protected Query(com.google.api.services.homegraph.v1.model.QueryRequest content) {
        super(HomeGraphService.this, "POST", REST_PATH, content, com.google.api.services.homegraph.v1.model.QueryResponse.class);
      }

      @Override
      public Query set$Xgafv(java.lang.String $Xgafv) {
        return (Query) super.set$Xgafv($Xgafv);
      }

      @Override
      public Query setAccessToken(java.lang.String accessToken) {
        return (Query) super.setAccessToken(accessToken);
      }

      @Override
      public Query setAlt(java.lang.String alt) {
        return (Query) super.setAlt(alt);
      }

      @Override
      public Query setCallback(java.lang.String callback) {
        return (Query) super.setCallback(callback);
      }

      @Override
      public Query setFields(java.lang.String fields) {
        return (Query) super.setFields(fields);
      }

      @Override
      public Query setKey(java.lang.String key) {
        return (Query) super.setKey(key);
      }

      @Override
      public Query setOauthToken(java.lang.String oauthToken) {
        return (Query) super.setOauthToken(oauthToken);
      }

      @Override
      public Query setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Query) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Query setQuotaUser(java.lang.String quotaUser) {
        return (Query) super.setQuotaUser(quotaUser);
      }

      @Override
      public Query setUploadType(java.lang.String uploadType) {
        return (Query) super.setUploadType(uploadType);
      }

      @Override
      public Query setUploadProtocol(java.lang.String uploadProtocol) {
        return (Query) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public Query set(String parameterName, Object value) {
        return (Query) super.set(parameterName, value);
      }
    }
    /**
     * Reports device state and optionally sends device notifications. Called by your smart home Action
     * when the state of a third-party device changes or you need to send a notification about the
     * device. See [Implement Report State](https://developers.google.com/assistant/smarthome/develop
     * /report-state) for more information. This method updates the device state according to its
     * declared [traits](https://developers.google.com/assistant/smarthome/concepts/devices-traits).
     * Publishing a new state value outside of these traits will result in an `INVALID_ARGUMENT` error
     * response. The third-party user's identity is passed in via the `agent_user_id` (see
     * ReportStateAndNotificationRequest). This request must be authorized using service account
     * credentials from your Actions console project.
     *
     * Create a request for the method "devices.reportStateAndNotification".
     *
     * This request holds the parameters needed by the homegraph server.  After setting any optional
     * parameters, call the {@link ReportStateAndNotification#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.homegraph.v1.model.ReportStateAndNotificationRequest}
     * @return the request
     */
    public ReportStateAndNotification reportStateAndNotification(com.google.api.services.homegraph.v1.model.ReportStateAndNotificationRequest content) throws java.io.IOException {
      ReportStateAndNotification result = new ReportStateAndNotification(content);
      initialize(result);
      return result;
    }

    public class ReportStateAndNotification extends HomeGraphServiceRequest<com.google.api.services.homegraph.v1.model.ReportStateAndNotificationResponse> {

      private static final String REST_PATH = "v1/devices:reportStateAndNotification";

      /**
       * Reports device state and optionally sends device notifications. Called by your smart home
       * Action when the state of a third-party device changes or you need to send a notification about
       * the device. See [Implement Report
       * State](https://developers.google.com/assistant/smarthome/develop/report-state) for more
       * information. This method updates the device state according to its declared
       * [traits](https://developers.google.com/assistant/smarthome/concepts/devices-traits). Publishing
       * a new state value outside of these traits will result in an `INVALID_ARGUMENT` error response.
       * The third-party user's identity is passed in via the `agent_user_id` (see
       * ReportStateAndNotificationRequest). This request must be authorized using service account
       * credentials from your Actions console project.
       *
       * Create a request for the method "devices.reportStateAndNotification".
       *
       * This request holds the parameters needed by the the homegraph server.  After setting any
       * optional parameters, call the {@link ReportStateAndNotification#execute()} method to invoke the
       * remote operation. <p> {@link ReportStateAndNotification#initialize(com.google.api.client.google
       * apis.services.AbstractGoogleClientRequest)} must be called to initialize this instance
       * immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.homegraph.v1.model.ReportStateAndNotificationRequest}
       * @since 1.13
       */
      protected ReportStateAndNotification(com.google.api.services.homegraph.v1.model.ReportStateAndNotificationRequest content) {
        super(HomeGraphService.this, "POST", REST_PATH, content, com.google.api.services.homegraph.v1.model.ReportStateAndNotificationResponse.class);
      }

      @Override
      public ReportStateAndNotification set$Xgafv(java.lang.String $Xgafv) {
        return (ReportStateAndNotification) super.set$Xgafv($Xgafv);
      }

      @Override
      public ReportStateAndNotification setAccessToken(java.lang.String accessToken) {
        return (ReportStateAndNotification) super.setAccessToken(accessToken);
      }

      @Override
      public ReportStateAndNotification setAlt(java.lang.String alt) {
        return (ReportStateAndNotification) super.setAlt(alt);
      }

      @Override
      public ReportStateAndNotification setCallback(java.lang.String callback) {
        return (ReportStateAndNotification) super.setCallback(callback);
      }

      @Override
      public ReportStateAndNotification setFields(java.lang.String fields) {
        return (ReportStateAndNotification) super.setFields(fields);
      }

      @Override
      public ReportStateAndNotification setKey(java.lang.String key) {
        return (ReportStateAndNotification) super.setKey(key);
      }

      @Override
      public ReportStateAndNotification setOauthToken(java.lang.String oauthToken) {
        return (ReportStateAndNotification) super.setOauthToken(oauthToken);
      }

      @Override
      public ReportStateAndNotification setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (ReportStateAndNotification) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ReportStateAndNotification setQuotaUser(java.lang.String quotaUser) {
        return (ReportStateAndNotification) super.setQuotaUser(quotaUser);
      }

      @Override
      public ReportStateAndNotification setUploadType(java.lang.String uploadType) {
        return (ReportStateAndNotification) super.setUploadType(uploadType);
      }

      @Override
      public ReportStateAndNotification setUploadProtocol(java.lang.String uploadProtocol) {
        return (ReportStateAndNotification) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public ReportStateAndNotification set(String parameterName, Object value) {
        return (ReportStateAndNotification) super.set(parameterName, value);
      }
    }
    /**
     * Requests Google to send an `action.devices.SYNC`
     * [intent](https://developers.google.com/assistant/smarthome/reference/intent/sync) to your smart
     * home Action to update device metadata for the given user. The third-party user's identity is
     * passed via the `agent_user_id` (see RequestSyncDevicesRequest). This request must be authorized
     * using service account credentials from your Actions console project.
     *
     * Create a request for the method "devices.requestSync".
     *
     * This request holds the parameters needed by the homegraph server.  After setting any optional
     * parameters, call the {@link RequestSync#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.homegraph.v1.model.RequestSyncDevicesRequest}
     * @return the request
     */
    public RequestSync requestSync(com.google.api.services.homegraph.v1.model.RequestSyncDevicesRequest content) throws java.io.IOException {
      RequestSync result = new RequestSync(content);
      initialize(result);
      return result;
    }

    public class RequestSync extends HomeGraphServiceRequest<com.google.api.services.homegraph.v1.model.RequestSyncDevicesResponse> {

      private static final String REST_PATH = "v1/devices:requestSync";

      /**
       * Requests Google to send an `action.devices.SYNC`
       * [intent](https://developers.google.com/assistant/smarthome/reference/intent/sync) to your smart
       * home Action to update device metadata for the given user. The third-party user's identity is
       * passed via the `agent_user_id` (see RequestSyncDevicesRequest). This request must be authorized
       * using service account credentials from your Actions console project.
       *
       * Create a request for the method "devices.requestSync".
       *
       * This request holds the parameters needed by the the homegraph server.  After setting any
       * optional parameters, call the {@link RequestSync#execute()} method to invoke the remote
       * operation. <p> {@link
       * RequestSync#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.homegraph.v1.model.RequestSyncDevicesRequest}
       * @since 1.13
       */
      protected RequestSync(com.google.api.services.homegraph.v1.model.RequestSyncDevicesRequest content) {
        super(HomeGraphService.this, "POST", REST_PATH, content, com.google.api.services.homegraph.v1.model.RequestSyncDevicesResponse.class);
      }

      @Override
      public RequestSync set$Xgafv(java.lang.String $Xgafv) {
        return (RequestSync) super.set$Xgafv($Xgafv);
      }

      @Override
      public RequestSync setAccessToken(java.lang.String accessToken) {
        return (RequestSync) super.setAccessToken(accessToken);
      }

      @Override
      public RequestSync setAlt(java.lang.String alt) {
        return (RequestSync) super.setAlt(alt);
      }

      @Override
      public RequestSync setCallback(java.lang.String callback) {
        return (RequestSync) super.setCallback(callback);
      }

      @Override
      public RequestSync setFields(java.lang.String fields) {
        return (RequestSync) super.setFields(fields);
      }

      @Override
      public RequestSync setKey(java.lang.String key) {
        return (RequestSync) super.setKey(key);
      }

      @Override
      public RequestSync setOauthToken(java.lang.String oauthToken) {
        return (RequestSync) super.setOauthToken(oauthToken);
      }

      @Override
      public RequestSync setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (RequestSync) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public RequestSync setQuotaUser(java.lang.String quotaUser) {
        return (RequestSync) super.setQuotaUser(quotaUser);
      }

      @Override
      public RequestSync setUploadType(java.lang.String uploadType) {
        return (RequestSync) super.setUploadType(uploadType);
      }

      @Override
      public RequestSync setUploadProtocol(java.lang.String uploadProtocol) {
        return (RequestSync) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public RequestSync set(String parameterName, Object value) {
        return (RequestSync) super.set(parameterName, value);
      }
    }
    /**
     * Gets all the devices associated with the given third-party user. The third-party user's identity
     * is passed in via the `agent_user_id` (see SyncRequest). This request must be authorized using
     * service account credentials from your Actions console project.
     *
     * Create a request for the method "devices.sync".
     *
     * This request holds the parameters needed by the homegraph server.  After setting any optional
     * parameters, call the {@link Sync#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.homegraph.v1.model.SyncRequest}
     * @return the request
     */
    public Sync sync(com.google.api.services.homegraph.v1.model.SyncRequest content) throws java.io.IOException {
      Sync result = new Sync(content);
      initialize(result);
      return result;
    }

    public class Sync extends HomeGraphServiceRequest<com.google.api.services.homegraph.v1.model.SyncResponse> {

      private static final String REST_PATH = "v1/devices:sync";

      /**
       * Gets all the devices associated with the given third-party user. The third-party user's
       * identity is passed in via the `agent_user_id` (see SyncRequest). This request must be
       * authorized using service account credentials from your Actions console project.
       *
       * Create a request for the method "devices.sync".
       *
       * This request holds the parameters needed by the the homegraph server.  After setting any
       * optional parameters, call the {@link Sync#execute()} method to invoke the remote operation. <p>
       * {@link Sync#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.homegraph.v1.model.SyncRequest}
       * @since 1.13
       */
      protected Sync(com.google.api.services.homegraph.v1.model.SyncRequest content) {
        super(HomeGraphService.this, "POST", REST_PATH, content, com.google.api.services.homegraph.v1.model.SyncResponse.class);
      }

      @Override
      public Sync set$Xgafv(java.lang.String $Xgafv) {
        return (Sync) super.set$Xgafv($Xgafv);
      }

      @Override
      public Sync setAccessToken(java.lang.String accessToken) {
        return (Sync) super.setAccessToken(accessToken);
      }

      @Override
      public Sync setAlt(java.lang.String alt) {
        return (Sync) super.setAlt(alt);
      }

      @Override
      public Sync setCallback(java.lang.String callback) {
        return (Sync) super.setCallback(callback);
      }

      @Override
      public Sync setFields(java.lang.String fields) {
        return (Sync) super.setFields(fields);
      }

      @Override
      public Sync setKey(java.lang.String key) {
        return (Sync) super.setKey(key);
      }

      @Override
      public Sync setOauthToken(java.lang.String oauthToken) {
        return (Sync) super.setOauthToken(oauthToken);
      }

      @Override
      public Sync setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Sync) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Sync setQuotaUser(java.lang.String quotaUser) {
        return (Sync) super.setQuotaUser(quotaUser);
      }

      @Override
      public Sync setUploadType(java.lang.String uploadType) {
        return (Sync) super.setUploadType(uploadType);
      }

      @Override
      public Sync setUploadProtocol(java.lang.String uploadProtocol) {
        return (Sync) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public Sync set(String parameterName, Object value) {
        return (Sync) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link HomeGraphService}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link HomeGraphService}. */
    @Override
    public HomeGraphService build() {
      return new HomeGraphService(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link HomeGraphServiceRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setHomeGraphServiceRequestInitializer(
        HomeGraphServiceRequestInitializer homegraphserviceRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(homegraphserviceRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
