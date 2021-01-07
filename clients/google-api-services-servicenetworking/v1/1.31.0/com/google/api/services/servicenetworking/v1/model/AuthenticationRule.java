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

package com.google.api.services.servicenetworking.v1.model;

/**
 * Authentication rules for the service. By default, if a method has any authentication
 * requirements, every request must include a valid credential matching one of the requirements.
 * It's an error to include more than one kind of credential in a single request. If a method
 * doesn't have any auth requirements, request credentials will be ignored.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Networking API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AuthenticationRule extends com.google.api.client.json.GenericJson {

  /**
   * If true, the service accepts API keys without any other credential. This flag only applies to
   * HTTP and gRPC requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowWithoutCredential;

  /**
   * The requirements for OAuth credentials.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OAuthRequirements oauth;

  /**
   * Requirements for additional authentication providers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AuthRequirement> requirements;

  static {
    // hack to force ProGuard to consider AuthRequirement used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AuthRequirement.class);
  }

  /**
   * Selects the methods to which this rule applies. Refer to selector for syntax details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selector;

  /**
   * If true, the service accepts API keys without any other credential. This flag only applies to
   * HTTP and gRPC requests.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowWithoutCredential() {
    return allowWithoutCredential;
  }

  /**
   * If true, the service accepts API keys without any other credential. This flag only applies to
   * HTTP and gRPC requests.
   * @param allowWithoutCredential allowWithoutCredential or {@code null} for none
   */
  public AuthenticationRule setAllowWithoutCredential(java.lang.Boolean allowWithoutCredential) {
    this.allowWithoutCredential = allowWithoutCredential;
    return this;
  }

  /**
   * The requirements for OAuth credentials.
   * @return value or {@code null} for none
   */
  public OAuthRequirements getOauth() {
    return oauth;
  }

  /**
   * The requirements for OAuth credentials.
   * @param oauth oauth or {@code null} for none
   */
  public AuthenticationRule setOauth(OAuthRequirements oauth) {
    this.oauth = oauth;
    return this;
  }

  /**
   * Requirements for additional authentication providers.
   * @return value or {@code null} for none
   */
  public java.util.List<AuthRequirement> getRequirements() {
    return requirements;
  }

  /**
   * Requirements for additional authentication providers.
   * @param requirements requirements or {@code null} for none
   */
  public AuthenticationRule setRequirements(java.util.List<AuthRequirement> requirements) {
    this.requirements = requirements;
    return this;
  }

  /**
   * Selects the methods to which this rule applies. Refer to selector for syntax details.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelector() {
    return selector;
  }

  /**
   * Selects the methods to which this rule applies. Refer to selector for syntax details.
   * @param selector selector or {@code null} for none
   */
  public AuthenticationRule setSelector(java.lang.String selector) {
    this.selector = selector;
    return this;
  }

  @Override
  public AuthenticationRule set(String fieldName, Object value) {
    return (AuthenticationRule) super.set(fieldName, value);
  }

  @Override
  public AuthenticationRule clone() {
    return (AuthenticationRule) super.clone();
  }

}
