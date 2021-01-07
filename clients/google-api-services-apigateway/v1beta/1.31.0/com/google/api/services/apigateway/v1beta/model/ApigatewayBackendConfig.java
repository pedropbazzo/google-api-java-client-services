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

package com.google.api.services.apigateway.v1beta.model;

/**
 * Configuration for all backends.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the API Gateway API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApigatewayBackendConfig extends com.google.api.client.json.GenericJson {

  /**
   * Google Cloud IAM service account used to sign OIDC tokens for backends that have authentication
   * configured (https://cloud.google.com/service-infrastructure/docs/service-
   * management/reference/rest/v1/services.configs#backend). This may either be the Service
   * Account's email (i.e. "{ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com") or its full resource
   * name (i.e. "projects/{PROJECT}/accounts/{UNIQUE_ID}"). This is most often used when the backend
   * is a GCP resource such as a Cloud Run Service or an IAP-secured service. Note that this token
   * is always sent as an authorization header bearer token. The audience of the OIDC token is
   * configured in the associated Service Config in the BackendRule option
   * (https://github.com/googleapis/googleapis/blob/master/google/api/backend.proto#L125).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String googleServiceAccount;

  /**
   * Google Cloud IAM service account used to sign OIDC tokens for backends that have authentication
   * configured (https://cloud.google.com/service-infrastructure/docs/service-
   * management/reference/rest/v1/services.configs#backend). This may either be the Service
   * Account's email (i.e. "{ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com") or its full resource
   * name (i.e. "projects/{PROJECT}/accounts/{UNIQUE_ID}"). This is most often used when the backend
   * is a GCP resource such as a Cloud Run Service or an IAP-secured service. Note that this token
   * is always sent as an authorization header bearer token. The audience of the OIDC token is
   * configured in the associated Service Config in the BackendRule option
   * (https://github.com/googleapis/googleapis/blob/master/google/api/backend.proto#L125).
   * @return value or {@code null} for none
   */
  public java.lang.String getGoogleServiceAccount() {
    return googleServiceAccount;
  }

  /**
   * Google Cloud IAM service account used to sign OIDC tokens for backends that have authentication
   * configured (https://cloud.google.com/service-infrastructure/docs/service-
   * management/reference/rest/v1/services.configs#backend). This may either be the Service
   * Account's email (i.e. "{ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com") or its full resource
   * name (i.e. "projects/{PROJECT}/accounts/{UNIQUE_ID}"). This is most often used when the backend
   * is a GCP resource such as a Cloud Run Service or an IAP-secured service. Note that this token
   * is always sent as an authorization header bearer token. The audience of the OIDC token is
   * configured in the associated Service Config in the BackendRule option
   * (https://github.com/googleapis/googleapis/blob/master/google/api/backend.proto#L125).
   * @param googleServiceAccount googleServiceAccount or {@code null} for none
   */
  public ApigatewayBackendConfig setGoogleServiceAccount(java.lang.String googleServiceAccount) {
    this.googleServiceAccount = googleServiceAccount;
    return this;
  }

  @Override
  public ApigatewayBackendConfig set(String fieldName, Object value) {
    return (ApigatewayBackendConfig) super.set(fieldName, value);
  }

  @Override
  public ApigatewayBackendConfig clone() {
    return (ApigatewayBackendConfig) super.clone();
  }

}
