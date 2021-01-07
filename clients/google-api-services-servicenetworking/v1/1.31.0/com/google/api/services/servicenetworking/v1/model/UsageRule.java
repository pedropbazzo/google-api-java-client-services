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
 * Usage configuration rules for the service. NOTE: Under development. Use this rule to configure
 * unregistered calls for the service. Unregistered calls are calls that do not contain consumer
 * project identity. (Example: calls that do not contain an API key). By default, API methods do not
 * allow unregistered calls, and each method call must be identified by a consumer project identity.
 * Use this rule to allow/disallow unregistered calls. Example of an API that wants to allow
 * unregistered calls for entire service. usage: rules: - selector: "*" allow_unregistered_calls:
 * true Example of a method that wants to allow unregistered calls. usage: rules: - selector:
 * "google.example.library.v1.LibraryService.CreateBook" allow_unregistered_calls: true
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
public final class UsageRule extends com.google.api.client.json.GenericJson {

  /**
   * If true, the selected method allows unregistered calls, e.g. calls that don't identify any user
   * or application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowUnregisteredCalls;

  /**
   * Selects the methods to which this rule applies. Use '*' to indicate all methods in all APIs.
   * Refer to selector for syntax details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selector;

  /**
   * If true, the selected method should skip service control and the control plane features, such
   * as quota and billing, will not be available. This flag is used by Google Cloud Endpoints to
   * bypass checks for internal methods, such as service health check methods.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean skipServiceControl;

  /**
   * If true, the selected method allows unregistered calls, e.g. calls that don't identify any user
   * or application.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowUnregisteredCalls() {
    return allowUnregisteredCalls;
  }

  /**
   * If true, the selected method allows unregistered calls, e.g. calls that don't identify any user
   * or application.
   * @param allowUnregisteredCalls allowUnregisteredCalls or {@code null} for none
   */
  public UsageRule setAllowUnregisteredCalls(java.lang.Boolean allowUnregisteredCalls) {
    this.allowUnregisteredCalls = allowUnregisteredCalls;
    return this;
  }

  /**
   * Selects the methods to which this rule applies. Use '*' to indicate all methods in all APIs.
   * Refer to selector for syntax details.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelector() {
    return selector;
  }

  /**
   * Selects the methods to which this rule applies. Use '*' to indicate all methods in all APIs.
   * Refer to selector for syntax details.
   * @param selector selector or {@code null} for none
   */
  public UsageRule setSelector(java.lang.String selector) {
    this.selector = selector;
    return this;
  }

  /**
   * If true, the selected method should skip service control and the control plane features, such
   * as quota and billing, will not be available. This flag is used by Google Cloud Endpoints to
   * bypass checks for internal methods, such as service health check methods.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSkipServiceControl() {
    return skipServiceControl;
  }

  /**
   * If true, the selected method should skip service control and the control plane features, such
   * as quota and billing, will not be available. This flag is used by Google Cloud Endpoints to
   * bypass checks for internal methods, such as service health check methods.
   * @param skipServiceControl skipServiceControl or {@code null} for none
   */
  public UsageRule setSkipServiceControl(java.lang.Boolean skipServiceControl) {
    this.skipServiceControl = skipServiceControl;
    return this;
  }

  @Override
  public UsageRule set(String fieldName, Object value) {
    return (UsageRule) super.set(fieldName, value);
  }

  @Override
  public UsageRule clone() {
    return (UsageRule) super.clone();
  }

}
