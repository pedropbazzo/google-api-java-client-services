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

package com.google.api.services.servicemanagement.model;

/**
 * `Backend` defines the backend configuration for a service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Backend extends com.google.api.client.json.GenericJson {

  /**
   * A list of API backend rules that apply to individual API methods. **NOTE:** All service
   * configuration rules follow "last one wins" order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BackendRule> rules;

  /**
   * A list of API backend rules that apply to individual API methods. **NOTE:** All service
   * configuration rules follow "last one wins" order.
   * @return value or {@code null} for none
   */
  public java.util.List<BackendRule> getRules() {
    return rules;
  }

  /**
   * A list of API backend rules that apply to individual API methods. **NOTE:** All service
   * configuration rules follow "last one wins" order.
   * @param rules rules or {@code null} for none
   */
  public Backend setRules(java.util.List<BackendRule> rules) {
    this.rules = rules;
    return this;
  }

  @Override
  public Backend set(String fieldName, Object value) {
    return (Backend) super.set(fieldName, value);
  }

  @Override
  public Backend clone() {
    return (Backend) super.clone();
  }

}
