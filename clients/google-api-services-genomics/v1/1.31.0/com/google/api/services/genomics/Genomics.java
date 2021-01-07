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

package com.google.api.services.genomics;

/**
 * Service definition for Genomics (v1).
 *
 * <p>
 * Uploads, processes, queries, and searches Genomics data in the cloud.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://cloud.google.com/genomics" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link GenomicsRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Genomics extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 32 ||
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION == 31 &&
        com.google.api.client.googleapis.GoogleUtils.BUGFIX_VERSION >= 1)),
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.31.1 of google-api-client to run version " +
        "1.31.0 of the Genomics API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://genomics.googleapis.com/";

  /**
   * The default encoded mTLS root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.31
   */
  public static final String DEFAULT_MTLS_ROOT_URL = "https://genomics.mtls.googleapis.com/";

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
  public Genomics(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Genomics(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Operations collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Genomics genomics = new Genomics(...);}
   *   {@code Genomics.Operations.List request = genomics.operations().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Operations operations() {
    return new Operations();
  }

  /**
   * The "operations" collection of methods.
   */
  public class Operations {

    /**
     * Starts asynchronous cancellation on a long-running operation. The server makes a best effort to
     * cancel the operation, but success is not guaranteed. Clients may use Operations.GetOperation or
     * Operations.ListOperations to check whether the cancellation succeeded or the operation completed
     * despite cancellation. Authorization requires the following [Google
     * IAM](https://cloud.google.com/iam) permission: * `genomics.operations.cancel`
     *
     * Create a request for the method "operations.cancel".
     *
     * This request holds the parameters needed by the genomics server.  After setting any optional
     * parameters, call the {@link Cancel#execute()} method to invoke the remote operation.
     *
     * @param name The name of the operation resource to be cancelled.
     * @param content the {@link com.google.api.services.genomics.model.CancelOperationRequest}
     * @return the request
     */
    public Cancel cancel(java.lang.String name, com.google.api.services.genomics.model.CancelOperationRequest content) throws java.io.IOException {
      Cancel result = new Cancel(name, content);
      initialize(result);
      return result;
    }

    public class Cancel extends GenomicsRequest<com.google.api.services.genomics.model.Empty> {

      private static final String REST_PATH = "v1/{+name}:cancel";

      private final java.util.regex.Pattern NAME_PATTERN =
          java.util.regex.Pattern.compile("^operations/.*$");

      /**
       * Starts asynchronous cancellation on a long-running operation. The server makes a best effort to
       * cancel the operation, but success is not guaranteed. Clients may use Operations.GetOperation or
       * Operations.ListOperations to check whether the cancellation succeeded or the operation
       * completed despite cancellation. Authorization requires the following [Google
       * IAM](https://cloud.google.com/iam) permission: * `genomics.operations.cancel`
       *
       * Create a request for the method "operations.cancel".
       *
       * This request holds the parameters needed by the the genomics server.  After setting any
       * optional parameters, call the {@link Cancel#execute()} method to invoke the remote operation.
       * <p> {@link
       * Cancel#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param name The name of the operation resource to be cancelled.
       * @param content the {@link com.google.api.services.genomics.model.CancelOperationRequest}
       * @since 1.13
       */
      protected Cancel(java.lang.String name, com.google.api.services.genomics.model.CancelOperationRequest content) {
        super(Genomics.this, "POST", REST_PATH, content, com.google.api.services.genomics.model.Empty.class);
        this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
              "Parameter name must conform to the pattern " +
              "^operations/.*$");
        }
      }

      @Override
      public Cancel set$Xgafv(java.lang.String $Xgafv) {
        return (Cancel) super.set$Xgafv($Xgafv);
      }

      @Override
      public Cancel setAccessToken(java.lang.String accessToken) {
        return (Cancel) super.setAccessToken(accessToken);
      }

      @Override
      public Cancel setAlt(java.lang.String alt) {
        return (Cancel) super.setAlt(alt);
      }

      @Override
      public Cancel setCallback(java.lang.String callback) {
        return (Cancel) super.setCallback(callback);
      }

      @Override
      public Cancel setFields(java.lang.String fields) {
        return (Cancel) super.setFields(fields);
      }

      @Override
      public Cancel setKey(java.lang.String key) {
        return (Cancel) super.setKey(key);
      }

      @Override
      public Cancel setOauthToken(java.lang.String oauthToken) {
        return (Cancel) super.setOauthToken(oauthToken);
      }

      @Override
      public Cancel setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Cancel) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Cancel setQuotaUser(java.lang.String quotaUser) {
        return (Cancel) super.setQuotaUser(quotaUser);
      }

      @Override
      public Cancel setUploadType(java.lang.String uploadType) {
        return (Cancel) super.setUploadType(uploadType);
      }

      @Override
      public Cancel setUploadProtocol(java.lang.String uploadProtocol) {
        return (Cancel) super.setUploadProtocol(uploadProtocol);
      }

      /** The name of the operation resource to be cancelled. */
      @com.google.api.client.util.Key
      private java.lang.String name;

      /** The name of the operation resource to be cancelled.
       */
      public java.lang.String getName() {
        return name;
      }

      /** The name of the operation resource to be cancelled. */
      public Cancel setName(java.lang.String name) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
              "Parameter name must conform to the pattern " +
              "^operations/.*$");
        }
        this.name = name;
        return this;
      }

      @Override
      public Cancel set(String parameterName, Object value) {
        return (Cancel) super.set(parameterName, value);
      }
    }
    /**
     * Gets the latest state of a long-running operation. Clients can use this method to poll the
     * operation result at intervals as recommended by the API service. Authorization requires the
     * following [Google IAM](https://cloud.google.com/iam) permission: * `genomics.operations.get`
     *
     * Create a request for the method "operations.get".
     *
     * This request holds the parameters needed by the genomics server.  After setting any optional
     * parameters, call the {@link Get#execute()} method to invoke the remote operation.
     *
     * @param name The name of the operation resource.
     * @return the request
     */
    public Get get(java.lang.String name) throws java.io.IOException {
      Get result = new Get(name);
      initialize(result);
      return result;
    }

    public class Get extends GenomicsRequest<com.google.api.services.genomics.model.Operation> {

      private static final String REST_PATH = "v1/{+name}";

      private final java.util.regex.Pattern NAME_PATTERN =
          java.util.regex.Pattern.compile("^operations/.*$");

      /**
       * Gets the latest state of a long-running operation. Clients can use this method to poll the
       * operation result at intervals as recommended by the API service. Authorization requires the
       * following [Google IAM](https://cloud.google.com/iam) permission: * `genomics.operations.get`
       *
       * Create a request for the method "operations.get".
       *
       * This request holds the parameters needed by the the genomics server.  After setting any
       * optional parameters, call the {@link Get#execute()} method to invoke the remote operation. <p>
       * {@link Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param name The name of the operation resource.
       * @since 1.13
       */
      protected Get(java.lang.String name) {
        super(Genomics.this, "GET", REST_PATH, null, com.google.api.services.genomics.model.Operation.class);
        this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
              "Parameter name must conform to the pattern " +
              "^operations/.*$");
        }
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public Get set$Xgafv(java.lang.String $Xgafv) {
        return (Get) super.set$Xgafv($Xgafv);
      }

      @Override
      public Get setAccessToken(java.lang.String accessToken) {
        return (Get) super.setAccessToken(accessToken);
      }

      @Override
      public Get setAlt(java.lang.String alt) {
        return (Get) super.setAlt(alt);
      }

      @Override
      public Get setCallback(java.lang.String callback) {
        return (Get) super.setCallback(callback);
      }

      @Override
      public Get setFields(java.lang.String fields) {
        return (Get) super.setFields(fields);
      }

      @Override
      public Get setKey(java.lang.String key) {
        return (Get) super.setKey(key);
      }

      @Override
      public Get setOauthToken(java.lang.String oauthToken) {
        return (Get) super.setOauthToken(oauthToken);
      }

      @Override
      public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Get) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Get setQuotaUser(java.lang.String quotaUser) {
        return (Get) super.setQuotaUser(quotaUser);
      }

      @Override
      public Get setUploadType(java.lang.String uploadType) {
        return (Get) super.setUploadType(uploadType);
      }

      @Override
      public Get setUploadProtocol(java.lang.String uploadProtocol) {
        return (Get) super.setUploadProtocol(uploadProtocol);
      }

      /** The name of the operation resource. */
      @com.google.api.client.util.Key
      private java.lang.String name;

      /** The name of the operation resource.
       */
      public java.lang.String getName() {
        return name;
      }

      /** The name of the operation resource. */
      public Get setName(java.lang.String name) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
              "Parameter name must conform to the pattern " +
              "^operations/.*$");
        }
        this.name = name;
        return this;
      }

      @Override
      public Get set(String parameterName, Object value) {
        return (Get) super.set(parameterName, value);
      }
    }
    /**
     * Lists operations that match the specified filter in the request. Authorization requires the
     * following [Google IAM](https://cloud.google.com/iam) permission: * `genomics.operations.list`
     *
     * Create a request for the method "operations.list".
     *
     * This request holds the parameters needed by the genomics server.  After setting any optional
     * parameters, call the {@link List#execute()} method to invoke the remote operation.
     *
     * @param name The name of the operation's parent resource.
     * @return the request
     */
    public List list(java.lang.String name) throws java.io.IOException {
      List result = new List(name);
      initialize(result);
      return result;
    }

    public class List extends GenomicsRequest<com.google.api.services.genomics.model.ListOperationsResponse> {

      private static final String REST_PATH = "v1/{+name}";

      private final java.util.regex.Pattern NAME_PATTERN =
          java.util.regex.Pattern.compile("^operations$");

      /**
       * Lists operations that match the specified filter in the request. Authorization requires the
       * following [Google IAM](https://cloud.google.com/iam) permission: * `genomics.operations.list`
       *
       * Create a request for the method "operations.list".
       *
       * This request holds the parameters needed by the the genomics server.  After setting any
       * optional parameters, call the {@link List#execute()} method to invoke the remote operation. <p>
       * {@link List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param name The name of the operation's parent resource.
       * @since 1.13
       */
      protected List(java.lang.String name) {
        super(Genomics.this, "GET", REST_PATH, null, com.google.api.services.genomics.model.ListOperationsResponse.class);
        this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
              "Parameter name must conform to the pattern " +
              "^operations$");
        }
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public List set$Xgafv(java.lang.String $Xgafv) {
        return (List) super.set$Xgafv($Xgafv);
      }

      @Override
      public List setAccessToken(java.lang.String accessToken) {
        return (List) super.setAccessToken(accessToken);
      }

      @Override
      public List setAlt(java.lang.String alt) {
        return (List) super.setAlt(alt);
      }

      @Override
      public List setCallback(java.lang.String callback) {
        return (List) super.setCallback(callback);
      }

      @Override
      public List setFields(java.lang.String fields) {
        return (List) super.setFields(fields);
      }

      @Override
      public List setKey(java.lang.String key) {
        return (List) super.setKey(key);
      }

      @Override
      public List setOauthToken(java.lang.String oauthToken) {
        return (List) super.setOauthToken(oauthToken);
      }

      @Override
      public List setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (List) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public List setQuotaUser(java.lang.String quotaUser) {
        return (List) super.setQuotaUser(quotaUser);
      }

      @Override
      public List setUploadType(java.lang.String uploadType) {
        return (List) super.setUploadType(uploadType);
      }

      @Override
      public List setUploadProtocol(java.lang.String uploadProtocol) {
        return (List) super.setUploadProtocol(uploadProtocol);
      }

      /** The name of the operation's parent resource. */
      @com.google.api.client.util.Key
      private java.lang.String name;

      /** The name of the operation's parent resource.
       */
      public java.lang.String getName() {
        return name;
      }

      /** The name of the operation's parent resource. */
      public List setName(java.lang.String name) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
              "Parameter name must conform to the pattern " +
              "^operations$");
        }
        this.name = name;
        return this;
      }

      /**
       * A string for filtering Operations. In v2alpha1, the following filter fields are supported:
       * * createTime: The time this job was created * events: The set of event (names) that have
       * occurred while running the pipeline. The : operator can be used to determine if a
       * particular event has occurred. * error: If the pipeline is running, this value is NULL.
       * Once the pipeline finishes, the value is the standard Google error code. * labels.key or
       * labels."key with space" where key is a label key. * done: If the pipeline is running, this
       * value is false. Once the pipeline finishes, the value is true. In v1 and v1alpha2, the
       * following filter fields are supported: * projectId: Required. Corresponds to
       * OperationMetadata.projectId. * createTime: The time this job was created, in seconds from
       * the [epoch](http://en.wikipedia.org/wiki/Unix_time). Can use `>=` and/or `<=` operators. *
       * status: Can be `RUNNING`, `SUCCESS`, `FAILURE`, or `CANCELED`. Only one status may be
       * specified. * labels.key where key is a label key. Examples: * `projectId = my-project AND
       * createTime >= 1432140000` * `projectId = my-project AND createTime >= 1432140000 AND
       * createTime <= 1432150000 AND status = RUNNING` * `projectId = my-project AND labels.color =
       * *` * `projectId = my-project AND labels.color = red`
       */
      @com.google.api.client.util.Key
      private java.lang.String filter;

      /** A string for filtering Operations. In v2alpha1, the following filter fields are supported: *
     createTime: The time this job was created * events: The set of event (names) that have occurred
     while running the pipeline. The : operator can be used to determine if a particular event has
     occurred. * error: If the pipeline is running, this value is NULL. Once the pipeline finishes, the
     value is the standard Google error code. * labels.key or labels."key with space" where key is a
     label key. * done: If the pipeline is running, this value is false. Once the pipeline finishes, the
     value is true. In v1 and v1alpha2, the following filter fields are supported: * projectId:
     Required. Corresponds to OperationMetadata.projectId. * createTime: The time this job was created,
     in seconds from the [epoch](http://en.wikipedia.org/wiki/Unix_time). Can use `>=` and/or `<=`
     operators. * status: Can be `RUNNING`, `SUCCESS`, `FAILURE`, or `CANCELED`. Only one status may be
     specified. * labels.key where key is a label key. Examples: * `projectId = my-project AND
     createTime >= 1432140000` * `projectId = my-project AND createTime >= 1432140000 AND createTime <=
     1432150000 AND status = RUNNING` * `projectId = my-project AND labels.color = *` * `projectId = my-
     project AND labels.color = red`
       */
      public java.lang.String getFilter() {
        return filter;
      }

      /**
       * A string for filtering Operations. In v2alpha1, the following filter fields are supported:
       * * createTime: The time this job was created * events: The set of event (names) that have
       * occurred while running the pipeline. The : operator can be used to determine if a
       * particular event has occurred. * error: If the pipeline is running, this value is NULL.
       * Once the pipeline finishes, the value is the standard Google error code. * labels.key or
       * labels."key with space" where key is a label key. * done: If the pipeline is running, this
       * value is false. Once the pipeline finishes, the value is true. In v1 and v1alpha2, the
       * following filter fields are supported: * projectId: Required. Corresponds to
       * OperationMetadata.projectId. * createTime: The time this job was created, in seconds from
       * the [epoch](http://en.wikipedia.org/wiki/Unix_time). Can use `>=` and/or `<=` operators. *
       * status: Can be `RUNNING`, `SUCCESS`, `FAILURE`, or `CANCELED`. Only one status may be
       * specified. * labels.key where key is a label key. Examples: * `projectId = my-project AND
       * createTime >= 1432140000` * `projectId = my-project AND createTime >= 1432140000 AND
       * createTime <= 1432150000 AND status = RUNNING` * `projectId = my-project AND labels.color =
       * *` * `projectId = my-project AND labels.color = red`
       */
      public List setFilter(java.lang.String filter) {
        this.filter = filter;
        return this;
      }

      /** The maximum number of results to return. The maximum value is 256. */
      @com.google.api.client.util.Key
      private java.lang.Integer pageSize;

      /** The maximum number of results to return. The maximum value is 256.
       */
      public java.lang.Integer getPageSize() {
        return pageSize;
      }

      /** The maximum number of results to return. The maximum value is 256. */
      public List setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
        return this;
      }

      /** The standard list page token. */
      @com.google.api.client.util.Key
      private java.lang.String pageToken;

      /** The standard list page token.
       */
      public java.lang.String getPageToken() {
        return pageToken;
      }

      /** The standard list page token. */
      public List setPageToken(java.lang.String pageToken) {
        this.pageToken = pageToken;
        return this;
      }

      @Override
      public List set(String parameterName, Object value) {
        return (List) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Genomics}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    private static String chooseEndpoint(com.google.api.client.http.HttpTransport transport) {
      // If the GOOGLE_API_USE_MTLS_ENDPOINT environment variable value is "always", use mTLS endpoint.
      // If the env variable is "auto", use mTLS endpoint if and only if the transport is mTLS.
      // Use the regular endpoint for all other cases.
      String useMtlsEndpoint = System.getenv("GOOGLE_API_USE_MTLS_ENDPOINT");
      useMtlsEndpoint = useMtlsEndpoint == null ? "auto" : useMtlsEndpoint;
      if ("always".equals(useMtlsEndpoint) || ("auto".equals(useMtlsEndpoint) && transport != null && transport.isMtls())) {
        return DEFAULT_MTLS_ROOT_URL;
      }
      return DEFAULT_ROOT_URL;
    }

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
          Builder.chooseEndpoint(transport),
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link Genomics}. */
    @Override
    public Genomics build() {
      return new Genomics(this);
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
     * Set the {@link GenomicsRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setGenomicsRequestInitializer(
        GenomicsRequestInitializer genomicsRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(genomicsRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
