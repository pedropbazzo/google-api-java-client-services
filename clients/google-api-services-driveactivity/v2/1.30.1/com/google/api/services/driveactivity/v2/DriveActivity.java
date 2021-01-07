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

package com.google.api.services.driveactivity.v2;

/**
 * Service definition for DriveActivity (v2).
 *
 * <p>
 * Provides a historical view of activity in Google Drive.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/drive/activity/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link DriveActivityRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class DriveActivity extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.30.10 of the Drive Activity API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://driveactivity.googleapis.com/";

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
  public DriveActivity(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  DriveActivity(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Activity collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code DriveActivity driveactivity = new DriveActivity(...);}
   *   {@code DriveActivity.Activity.List request = driveactivity.activity().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Activity activity() {
    return new Activity();
  }

  /**
   * The "activity" collection of methods.
   */
  public class Activity {

    /**
     * Query past activity in Google Drive.
     *
     * Create a request for the method "activity.query".
     *
     * This request holds the parameters needed by the driveactivity server.  After setting any optional
     * parameters, call the {@link Query#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.driveactivity.v2.model.QueryDriveActivityRequest}
     * @return the request
     */
    public Query query(com.google.api.services.driveactivity.v2.model.QueryDriveActivityRequest content) throws java.io.IOException {
      Query result = new Query(content);
      initialize(result);
      return result;
    }

    public class Query extends DriveActivityRequest<com.google.api.services.driveactivity.v2.model.QueryDriveActivityResponse> {

      private static final String REST_PATH = "v2/activity:query";

      /**
       * Query past activity in Google Drive.
       *
       * Create a request for the method "activity.query".
       *
       * This request holds the parameters needed by the the driveactivity server.  After setting any
       * optional parameters, call the {@link Query#execute()} method to invoke the remote operation.
       * <p> {@link
       * Query#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.driveactivity.v2.model.QueryDriveActivityRequest}
       * @since 1.13
       */
      protected Query(com.google.api.services.driveactivity.v2.model.QueryDriveActivityRequest content) {
        super(DriveActivity.this, "POST", REST_PATH, content, com.google.api.services.driveactivity.v2.model.QueryDriveActivityResponse.class);
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

  }

  /**
   * Builder for {@link DriveActivity}.
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

    /** Builds a new instance of {@link DriveActivity}. */
    @Override
    public DriveActivity build() {
      return new DriveActivity(this);
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
     * Set the {@link DriveActivityRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setDriveActivityRequestInitializer(
        DriveActivityRequestInitializer driveactivityRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(driveactivityRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
