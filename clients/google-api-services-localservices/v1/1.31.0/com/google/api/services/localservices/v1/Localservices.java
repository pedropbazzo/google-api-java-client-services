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

package com.google.api.services.localservices.v1;

/**
 * Service definition for Localservices (v1).
 *
 * <p>
 * 
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://ads.google.com/local-services-ads/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link LocalservicesRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Localservices extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 32 ||
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION == 31 &&
        com.google.api.client.googleapis.GoogleUtils.BUGFIX_VERSION >= 1)),
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.31.1 of google-api-client to run version " +
        "1.31.0 of the Local Services API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://localservices.googleapis.com/";

  /**
   * The default encoded mTLS root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.31
   */
  public static final String DEFAULT_MTLS_ROOT_URL = "https://localservices.mtls.googleapis.com/";

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
  public Localservices(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Localservices(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the AccountReports collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Localservices localservices = new Localservices(...);}
   *   {@code Localservices.AccountReports.List request = localservices.accountReports().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public AccountReports accountReports() {
    return new AccountReports();
  }

  /**
   * The "accountReports" collection of methods.
   */
  public class AccountReports {

    /**
     * Get account reports containing aggregate account data of all linked GLS accounts. Caller needs to
     * provide their manager customer id and the associated auth credential that allows them read
     * permissions on their linked accounts.
     *
     * Create a request for the method "accountReports.search".
     *
     * This request holds the parameters needed by the localservices server.  After setting any optional
     * parameters, call the {@link Search#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public Search search() throws java.io.IOException {
      Search result = new Search();
      initialize(result);
      return result;
    }

    public class Search extends LocalservicesRequest<com.google.api.services.localservices.v1.model.GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse> {

      private static final String REST_PATH = "v1/accountReports:search";

      /**
       * Get account reports containing aggregate account data of all linked GLS accounts. Caller needs
       * to provide their manager customer id and the associated auth credential that allows them read
       * permissions on their linked accounts.
       *
       * Create a request for the method "accountReports.search".
       *
       * This request holds the parameters needed by the the localservices server.  After setting any
       * optional parameters, call the {@link Search#execute()} method to invoke the remote operation.
       * <p> {@link
       * Search#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected Search() {
        super(Localservices.this, "GET", REST_PATH, null, com.google.api.services.localservices.v1.model.GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse.class);
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
      public Search set$Xgafv(java.lang.String $Xgafv) {
        return (Search) super.set$Xgafv($Xgafv);
      }

      @Override
      public Search setAccessToken(java.lang.String accessToken) {
        return (Search) super.setAccessToken(accessToken);
      }

      @Override
      public Search setAlt(java.lang.String alt) {
        return (Search) super.setAlt(alt);
      }

      @Override
      public Search setCallback(java.lang.String callback) {
        return (Search) super.setCallback(callback);
      }

      @Override
      public Search setFields(java.lang.String fields) {
        return (Search) super.setFields(fields);
      }

      @Override
      public Search setKey(java.lang.String key) {
        return (Search) super.setKey(key);
      }

      @Override
      public Search setOauthToken(java.lang.String oauthToken) {
        return (Search) super.setOauthToken(oauthToken);
      }

      @Override
      public Search setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Search) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Search setQuotaUser(java.lang.String quotaUser) {
        return (Search) super.setQuotaUser(quotaUser);
      }

      @Override
      public Search setUploadType(java.lang.String uploadType) {
        return (Search) super.setUploadType(uploadType);
      }

      @Override
      public Search setUploadProtocol(java.lang.String uploadProtocol) {
        return (Search) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a
       * year by itself or a year and month where the day isn't significant.
       */
      @com.google.api.client.util.Key("endDate.day")
      private java.lang.Integer endDateDay;

      /** Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by
     itself or a year and month where the day isn't significant.
       */
      public java.lang.Integer getEndDateDay() {
        return endDateDay;
      }

      /**
       * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a
       * year by itself or a year and month where the day isn't significant.
       */
      public Search setEndDateDay(java.lang.Integer endDateDay) {
        this.endDateDay = endDateDay;
        return this;
      }

      /** Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day. */
      @com.google.api.client.util.Key("endDate.month")
      private java.lang.Integer endDateMonth;

      /** Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
       */
      public java.lang.Integer getEndDateMonth() {
        return endDateMonth;
      }

      /** Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day. */
      public Search setEndDateMonth(java.lang.Integer endDateMonth) {
        this.endDateMonth = endDateMonth;
        return this;
      }

      /** Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year. */
      @com.google.api.client.util.Key("endDate.year")
      private java.lang.Integer endDateYear;

      /** Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
       */
      public java.lang.Integer getEndDateYear() {
        return endDateYear;
      }

      /** Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year. */
      public Search setEndDateYear(java.lang.Integer endDateYear) {
        this.endDateYear = endDateYear;
        return this;
      }

      /**
       * The maximum number of accounts to return. If the page size is unset, page size will default
       * to 1000. Maximum page_size is 10000. Optional.
       */
      @com.google.api.client.util.Key
      private java.lang.Integer pageSize;

      /** The maximum number of accounts to return. If the page size is unset, page size will default to
     1000. Maximum page_size is 10000. Optional.
       */
      public java.lang.Integer getPageSize() {
        return pageSize;
      }

      /**
       * The maximum number of accounts to return. If the page size is unset, page size will default
       * to 1000. Maximum page_size is 10000. Optional.
       */
      public Search setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
        return this;
      }

      /**
       * The `next_page_token` value returned from a previous request to SearchAccountReports that
       * indicates where listing should continue. Optional.
       */
      @com.google.api.client.util.Key
      private java.lang.String pageToken;

      /** The `next_page_token` value returned from a previous request to SearchAccountReports that indicates
     where listing should continue. Optional.
       */
      public java.lang.String getPageToken() {
        return pageToken;
      }

      /**
       * The `next_page_token` value returned from a previous request to SearchAccountReports that
       * indicates where listing should continue. Optional.
       */
      public Search setPageToken(java.lang.String pageToken) {
        this.pageToken = pageToken;
        return this;
      }

      /**
       * A query string for searching for account reports. Caller must provide a customer id of
       * their MCC account with an associated Gaia Mint that allows read permission on their linked
       * accounts. Search expressions are case insensitive. Example query: | Query | Description |
       * |-------------------------|-----------------------------------------------| |
       * manager_customer_id:123 | Get Account Report for Manager with id 123. | Required.
       */
      @com.google.api.client.util.Key
      private java.lang.String query;

      /** A query string for searching for account reports. Caller must provide a customer id of their MCC
     account with an associated Gaia Mint that allows read permission on their linked accounts. Search
     expressions are case insensitive. Example query: | Query | Description |
     |-------------------------|-----------------------------------------------| |
     manager_customer_id:123 | Get Account Report for Manager with id 123. | Required.
       */
      public java.lang.String getQuery() {
        return query;
      }

      /**
       * A query string for searching for account reports. Caller must provide a customer id of
       * their MCC account with an associated Gaia Mint that allows read permission on their linked
       * accounts. Search expressions are case insensitive. Example query: | Query | Description |
       * |-------------------------|-----------------------------------------------| |
       * manager_customer_id:123 | Get Account Report for Manager with id 123. | Required.
       */
      public Search setQuery(java.lang.String query) {
        this.query = query;
        return this;
      }

      /**
       * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a
       * year by itself or a year and month where the day isn't significant.
       */
      @com.google.api.client.util.Key("startDate.day")
      private java.lang.Integer startDateDay;

      /** Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by
     itself or a year and month where the day isn't significant.
       */
      public java.lang.Integer getStartDateDay() {
        return startDateDay;
      }

      /**
       * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a
       * year by itself or a year and month where the day isn't significant.
       */
      public Search setStartDateDay(java.lang.Integer startDateDay) {
        this.startDateDay = startDateDay;
        return this;
      }

      /** Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day. */
      @com.google.api.client.util.Key("startDate.month")
      private java.lang.Integer startDateMonth;

      /** Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
       */
      public java.lang.Integer getStartDateMonth() {
        return startDateMonth;
      }

      /** Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day. */
      public Search setStartDateMonth(java.lang.Integer startDateMonth) {
        this.startDateMonth = startDateMonth;
        return this;
      }

      /** Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year. */
      @com.google.api.client.util.Key("startDate.year")
      private java.lang.Integer startDateYear;

      /** Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
       */
      public java.lang.Integer getStartDateYear() {
        return startDateYear;
      }

      /** Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year. */
      public Search setStartDateYear(java.lang.Integer startDateYear) {
        this.startDateYear = startDateYear;
        return this;
      }

      @Override
      public Search set(String parameterName, Object value) {
        return (Search) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the DetailedLeadReports collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Localservices localservices = new Localservices(...);}
   *   {@code Localservices.DetailedLeadReports.List request = localservices.detailedLeadReports().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public DetailedLeadReports detailedLeadReports() {
    return new DetailedLeadReports();
  }

  /**
   * The "detailedLeadReports" collection of methods.
   */
  public class DetailedLeadReports {

    /**
     * Get detailed lead reports containing leads that have been received by all linked GLS accounts.
     * Caller needs to provide their manager customer id and the associated auth credential that allows
     * them read permissions on their linked accounts.
     *
     * Create a request for the method "detailedLeadReports.search".
     *
     * This request holds the parameters needed by the localservices server.  After setting any optional
     * parameters, call the {@link Search#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public Search search() throws java.io.IOException {
      Search result = new Search();
      initialize(result);
      return result;
    }

    public class Search extends LocalservicesRequest<com.google.api.services.localservices.v1.model.GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse> {

      private static final String REST_PATH = "v1/detailedLeadReports:search";

      /**
       * Get detailed lead reports containing leads that have been received by all linked GLS accounts.
       * Caller needs to provide their manager customer id and the associated auth credential that
       * allows them read permissions on their linked accounts.
       *
       * Create a request for the method "detailedLeadReports.search".
       *
       * This request holds the parameters needed by the the localservices server.  After setting any
       * optional parameters, call the {@link Search#execute()} method to invoke the remote operation.
       * <p> {@link
       * Search#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected Search() {
        super(Localservices.this, "GET", REST_PATH, null, com.google.api.services.localservices.v1.model.GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse.class);
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
      public Search set$Xgafv(java.lang.String $Xgafv) {
        return (Search) super.set$Xgafv($Xgafv);
      }

      @Override
      public Search setAccessToken(java.lang.String accessToken) {
        return (Search) super.setAccessToken(accessToken);
      }

      @Override
      public Search setAlt(java.lang.String alt) {
        return (Search) super.setAlt(alt);
      }

      @Override
      public Search setCallback(java.lang.String callback) {
        return (Search) super.setCallback(callback);
      }

      @Override
      public Search setFields(java.lang.String fields) {
        return (Search) super.setFields(fields);
      }

      @Override
      public Search setKey(java.lang.String key) {
        return (Search) super.setKey(key);
      }

      @Override
      public Search setOauthToken(java.lang.String oauthToken) {
        return (Search) super.setOauthToken(oauthToken);
      }

      @Override
      public Search setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Search) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Search setQuotaUser(java.lang.String quotaUser) {
        return (Search) super.setQuotaUser(quotaUser);
      }

      @Override
      public Search setUploadType(java.lang.String uploadType) {
        return (Search) super.setUploadType(uploadType);
      }

      @Override
      public Search setUploadProtocol(java.lang.String uploadProtocol) {
        return (Search) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a
       * year by itself or a year and month where the day isn't significant.
       */
      @com.google.api.client.util.Key("endDate.day")
      private java.lang.Integer endDateDay;

      /** Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by
     itself or a year and month where the day isn't significant.
       */
      public java.lang.Integer getEndDateDay() {
        return endDateDay;
      }

      /**
       * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a
       * year by itself or a year and month where the day isn't significant.
       */
      public Search setEndDateDay(java.lang.Integer endDateDay) {
        this.endDateDay = endDateDay;
        return this;
      }

      /** Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day. */
      @com.google.api.client.util.Key("endDate.month")
      private java.lang.Integer endDateMonth;

      /** Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
       */
      public java.lang.Integer getEndDateMonth() {
        return endDateMonth;
      }

      /** Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day. */
      public Search setEndDateMonth(java.lang.Integer endDateMonth) {
        this.endDateMonth = endDateMonth;
        return this;
      }

      /** Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year. */
      @com.google.api.client.util.Key("endDate.year")
      private java.lang.Integer endDateYear;

      /** Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
       */
      public java.lang.Integer getEndDateYear() {
        return endDateYear;
      }

      /** Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year. */
      public Search setEndDateYear(java.lang.Integer endDateYear) {
        this.endDateYear = endDateYear;
        return this;
      }

      /**
       * The maximum number of accounts to return. If the page size is unset, page size will default
       * to 1000. Maximum page_size is 10000. Optional.
       */
      @com.google.api.client.util.Key
      private java.lang.Integer pageSize;

      /** The maximum number of accounts to return. If the page size is unset, page size will default to
     1000. Maximum page_size is 10000. Optional.
       */
      public java.lang.Integer getPageSize() {
        return pageSize;
      }

      /**
       * The maximum number of accounts to return. If the page size is unset, page size will default
       * to 1000. Maximum page_size is 10000. Optional.
       */
      public Search setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
        return this;
      }

      /**
       * The `next_page_token` value returned from a previous request to SearchDetailedLeadReports
       * that indicates where listing should continue. Optional.
       */
      @com.google.api.client.util.Key
      private java.lang.String pageToken;

      /** The `next_page_token` value returned from a previous request to SearchDetailedLeadReports that
     indicates where listing should continue. Optional.
       */
      public java.lang.String getPageToken() {
        return pageToken;
      }

      /**
       * The `next_page_token` value returned from a previous request to SearchDetailedLeadReports
       * that indicates where listing should continue. Optional.
       */
      public Search setPageToken(java.lang.String pageToken) {
        this.pageToken = pageToken;
        return this;
      }

      /**
       * A query string for searching for account reports. Caller must provide a customer id of
       * their MCC account with an associated Gaia Mint that allows read permission on their linked
       * accounts. Search expressions are case insensitive. Example query: | Query | Description |
       * |-------------------------|-----------------------------------------------| |
       * manager_customer_id:123 | Get Detailed Lead Report for Manager with id | | | 123. |
       * Required.
       */
      @com.google.api.client.util.Key
      private java.lang.String query;

      /** A query string for searching for account reports. Caller must provide a customer id of their MCC
     account with an associated Gaia Mint that allows read permission on their linked accounts. Search
     expressions are case insensitive. Example query: | Query | Description |
     |-------------------------|-----------------------------------------------| |
     manager_customer_id:123 | Get Detailed Lead Report for Manager with id | | | 123. | Required.
       */
      public java.lang.String getQuery() {
        return query;
      }

      /**
       * A query string for searching for account reports. Caller must provide a customer id of
       * their MCC account with an associated Gaia Mint that allows read permission on their linked
       * accounts. Search expressions are case insensitive. Example query: | Query | Description |
       * |-------------------------|-----------------------------------------------| |
       * manager_customer_id:123 | Get Detailed Lead Report for Manager with id | | | 123. |
       * Required.
       */
      public Search setQuery(java.lang.String query) {
        this.query = query;
        return this;
      }

      /**
       * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a
       * year by itself or a year and month where the day isn't significant.
       */
      @com.google.api.client.util.Key("startDate.day")
      private java.lang.Integer startDateDay;

      /** Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by
     itself or a year and month where the day isn't significant.
       */
      public java.lang.Integer getStartDateDay() {
        return startDateDay;
      }

      /**
       * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a
       * year by itself or a year and month where the day isn't significant.
       */
      public Search setStartDateDay(java.lang.Integer startDateDay) {
        this.startDateDay = startDateDay;
        return this;
      }

      /** Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day. */
      @com.google.api.client.util.Key("startDate.month")
      private java.lang.Integer startDateMonth;

      /** Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
       */
      public java.lang.Integer getStartDateMonth() {
        return startDateMonth;
      }

      /** Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day. */
      public Search setStartDateMonth(java.lang.Integer startDateMonth) {
        this.startDateMonth = startDateMonth;
        return this;
      }

      /** Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year. */
      @com.google.api.client.util.Key("startDate.year")
      private java.lang.Integer startDateYear;

      /** Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
       */
      public java.lang.Integer getStartDateYear() {
        return startDateYear;
      }

      /** Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year. */
      public Search setStartDateYear(java.lang.Integer startDateYear) {
        this.startDateYear = startDateYear;
        return this;
      }

      @Override
      public Search set(String parameterName, Object value) {
        return (Search) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Localservices}.
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

    /** Builds a new instance of {@link Localservices}. */
    @Override
    public Localservices build() {
      return new Localservices(this);
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
     * Set the {@link LocalservicesRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setLocalservicesRequestInitializer(
        LocalservicesRequestInitializer localservicesRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(localservicesRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
