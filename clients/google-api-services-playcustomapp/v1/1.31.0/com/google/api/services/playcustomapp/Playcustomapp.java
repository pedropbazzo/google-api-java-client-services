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

package com.google.api.services.playcustomapp;

/**
 * Service definition for Playcustomapp (v1).
 *
 * <p>
 * API to create and publish custom Android apps
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/android/work/play/custom-app-api/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link PlaycustomappRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Playcustomapp extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 32 ||
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION == 31 &&
        com.google.api.client.googleapis.GoogleUtils.BUGFIX_VERSION >= 1)),
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.31.1 of google-api-client to run version " +
        "1.31.0 of the Google Play Custom App Publishing API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://playcustomapp.googleapis.com/";

  /**
   * The default encoded mTLS root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.31
   */
  public static final String DEFAULT_MTLS_ROOT_URL = "https://playcustomapp.mtls.googleapis.com/";

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
  public Playcustomapp(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Playcustomapp(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Accounts collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Playcustomapp playcustomapp = new Playcustomapp(...);}
   *   {@code Playcustomapp.Accounts.List request = playcustomapp.accounts().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Accounts accounts() {
    return new Accounts();
  }

  /**
   * The "accounts" collection of methods.
   */
  public class Accounts {

    /**
     * An accessor for creating requests from the CustomApps collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code Playcustomapp playcustomapp = new Playcustomapp(...);}
     *   {@code Playcustomapp.CustomApps.List request = playcustomapp.customApps().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public CustomApps customApps() {
      return new CustomApps();
    }

    /**
     * The "customApps" collection of methods.
     */
    public class CustomApps {

      /**
       * Creates a new custom app.
       *
       * Create a request for the method "customApps.create".
       *
       * This request holds the parameters needed by the playcustomapp server.  After setting any optional
       * parameters, call the {@link Create#execute()} method to invoke the remote operation.
       *
       * @param account Developer account ID.
       * @param content the {@link com.google.api.services.playcustomapp.model.CustomApp}
       * @return the request
       */
      public Create create(java.lang.Long account, com.google.api.services.playcustomapp.model.CustomApp content) throws java.io.IOException {
        Create result = new Create(account, content);
        initialize(result);
        return result;
      }

      /**
       * Creates a new custom app.
       *
       * Create a request for the method "customApps.create".
       *
       * This request holds the parameters needed by the the playcustomapp server.  After setting any
       * optional parameters, call the {@link Create#execute()} method to invoke the remote operation.
       *
       * <p>
       * This method should be used for uploading media content.
       * </p>
       *
       * @param account Developer account ID.
       * @param content the {@link com.google.api.services.playcustomapp.model.CustomApp} media metadata or {@code null} if none
       * @param mediaContent The media HTTP content or {@code null} if none.
       * @return the request
       * @throws java.io.IOException if the initialization of the request fails
       */
      public Create create(java.lang.Long account, com.google.api.services.playcustomapp.model.CustomApp content, com.google.api.client.http.AbstractInputStreamContent mediaContent) throws java.io.IOException {
        Create result = new Create(account, content, mediaContent);
        initialize(result);
        return result;
      }

      public class Create extends PlaycustomappRequest<com.google.api.services.playcustomapp.model.CustomApp> {

        private static final String REST_PATH = "playcustomapp/v1/accounts/{account}/customApps";

        /**
         * Creates a new custom app.
         *
         * Create a request for the method "customApps.create".
         *
         * This request holds the parameters needed by the the playcustomapp server.  After setting any
         * optional parameters, call the {@link Create#execute()} method to invoke the remote operation.
         * <p> {@link
         * Create#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
         * be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param account Developer account ID.
         * @param content the {@link com.google.api.services.playcustomapp.model.CustomApp}
         * @since 1.13
         */
        protected Create(java.lang.Long account, com.google.api.services.playcustomapp.model.CustomApp content) {
          super(Playcustomapp.this, "POST", REST_PATH, content, com.google.api.services.playcustomapp.model.CustomApp.class);
          this.account = com.google.api.client.util.Preconditions.checkNotNull(account, "Required parameter account must be specified.");
        }

        /**
         * Creates a new custom app.
         *
         * Create a request for the method "customApps.create".
         *
         * This request holds the parameters needed by the the playcustomapp server.  After setting any
         * optional parameters, call the {@link Create#execute()} method to invoke the remote operation.
         * <p> {@link
         * Create#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
         * be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * <p>
         * This constructor should be used for uploading media content.
         * </p>
         *
         * @param account Developer account ID.
         * @param content the {@link com.google.api.services.playcustomapp.model.CustomApp} media metadata or {@code null} if none
         * @param mediaContent The media HTTP content or {@code null} if none.
         * @since 1.13
         */
        protected Create(java.lang.Long account, com.google.api.services.playcustomapp.model.CustomApp content, com.google.api.client.http.AbstractInputStreamContent mediaContent) {
          super(Playcustomapp.this, "POST", "/upload/" + getServicePath() + REST_PATH, content, com.google.api.services.playcustomapp.model.CustomApp.class);
          this.account = com.google.api.client.util.Preconditions.checkNotNull(account, "Required parameter account must be specified.");
          initializeMediaUpload(mediaContent);
        }

        @Override
        public Create set$Xgafv(java.lang.String $Xgafv) {
          return (Create) super.set$Xgafv($Xgafv);
        }

        @Override
        public Create setAccessToken(java.lang.String accessToken) {
          return (Create) super.setAccessToken(accessToken);
        }

        @Override
        public Create setAlt(java.lang.String alt) {
          return (Create) super.setAlt(alt);
        }

        @Override
        public Create setCallback(java.lang.String callback) {
          return (Create) super.setCallback(callback);
        }

        @Override
        public Create setFields(java.lang.String fields) {
          return (Create) super.setFields(fields);
        }

        @Override
        public Create setKey(java.lang.String key) {
          return (Create) super.setKey(key);
        }

        @Override
        public Create setOauthToken(java.lang.String oauthToken) {
          return (Create) super.setOauthToken(oauthToken);
        }

        @Override
        public Create setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Create) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Create setQuotaUser(java.lang.String quotaUser) {
          return (Create) super.setQuotaUser(quotaUser);
        }

        @Override
        public Create setUploadType(java.lang.String uploadType) {
          return (Create) super.setUploadType(uploadType);
        }

        @Override
        public Create setUploadProtocol(java.lang.String uploadProtocol) {
          return (Create) super.setUploadProtocol(uploadProtocol);
        }

        /** Developer account ID. */
        @com.google.api.client.util.Key
        private java.lang.Long account;

        /** Developer account ID.
         */
        public java.lang.Long getAccount() {
          return account;
        }

        /** Developer account ID. */
        public Create setAccount(java.lang.Long account) {
          this.account = account;
          return this;
        }

        @Override
        public Create set(String parameterName, Object value) {
          return (Create) super.set(parameterName, value);
        }
      }

    }
  }

  /**
   * Builder for {@link Playcustomapp}.
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

    /** Builds a new instance of {@link Playcustomapp}. */
    @Override
    public Playcustomapp build() {
      return new Playcustomapp(this);
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
     * Set the {@link PlaycustomappRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setPlaycustomappRequestInitializer(
        PlaycustomappRequestInitializer playcustomappRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(playcustomappRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
