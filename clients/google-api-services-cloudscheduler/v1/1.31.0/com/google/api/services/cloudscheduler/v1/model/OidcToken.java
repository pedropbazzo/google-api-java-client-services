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

package com.google.api.services.cloudscheduler.v1.model;

/**
 * Contains information needed for generating an [OpenID Connect
 * token](https://developers.google.com/identity/protocols/OpenIDConnect). This type of
 * authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you
 * intend to validate the token yourself.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Scheduler API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OidcToken extends com.google.api.client.json.GenericJson {

  /**
   * Audience to be used when generating OIDC token. If not specified, the URI specified in target
   * will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String audience;

  /**
   * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for
   * generating OIDC token. The service account must be within the same project as the job. The
   * caller must have iam.serviceAccounts.actAs permission for the service account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccountEmail;

  /**
   * Audience to be used when generating OIDC token. If not specified, the URI specified in target
   * will be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getAudience() {
    return audience;
  }

  /**
   * Audience to be used when generating OIDC token. If not specified, the URI specified in target
   * will be used.
   * @param audience audience or {@code null} for none
   */
  public OidcToken setAudience(java.lang.String audience) {
    this.audience = audience;
    return this;
  }

  /**
   * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for
   * generating OIDC token. The service account must be within the same project as the job. The
   * caller must have iam.serviceAccounts.actAs permission for the service account.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccountEmail() {
    return serviceAccountEmail;
  }

  /**
   * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for
   * generating OIDC token. The service account must be within the same project as the job. The
   * caller must have iam.serviceAccounts.actAs permission for the service account.
   * @param serviceAccountEmail serviceAccountEmail or {@code null} for none
   */
  public OidcToken setServiceAccountEmail(java.lang.String serviceAccountEmail) {
    this.serviceAccountEmail = serviceAccountEmail;
    return this;
  }

  @Override
  public OidcToken set(String fieldName, Object value) {
    return (OidcToken) super.set(fieldName, value);
  }

  @Override
  public OidcToken clone() {
    return (OidcToken) super.clone();
  }

}
