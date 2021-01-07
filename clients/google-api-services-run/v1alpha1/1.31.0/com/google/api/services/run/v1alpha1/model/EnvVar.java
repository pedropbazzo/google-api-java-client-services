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

package com.google.api.services.run.v1alpha1.model;

/**
 * EnvVar represents an environment variable present in a Container.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EnvVar extends com.google.api.client.json.GenericJson {

  /**
   * Name of the environment variable. Must be a C_IDENTIFIER.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Variable references $(VAR_NAME) are expanded using the previous defined environment variables
   * in the container and any route environment variables. If a variable cannot be resolved, the
   * reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
   * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether
   * the variable exists or not. Defaults to "". +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Cloud Run fully managed: not supported Cloud Run on GKE: supported Source for the environment
   * variable's value. Cannot be used if value is not empty. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnvVarSource valueFrom;

  /**
   * Name of the environment variable. Must be a C_IDENTIFIER.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the environment variable. Must be a C_IDENTIFIER.
   * @param name name or {@code null} for none
   */
  public EnvVar setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Variable references $(VAR_NAME) are expanded using the previous defined environment variables
   * in the container and any route environment variables. If a variable cannot be resolved, the
   * reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
   * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether
   * the variable exists or not. Defaults to "". +optional
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Variable references $(VAR_NAME) are expanded using the previous defined environment variables
   * in the container and any route environment variables. If a variable cannot be resolved, the
   * reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
   * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether
   * the variable exists or not. Defaults to "". +optional
   * @param value value or {@code null} for none
   */
  public EnvVar setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  /**
   * Cloud Run fully managed: not supported Cloud Run on GKE: supported Source for the environment
   * variable's value. Cannot be used if value is not empty. +optional
   * @return value or {@code null} for none
   */
  public EnvVarSource getValueFrom() {
    return valueFrom;
  }

  /**
   * Cloud Run fully managed: not supported Cloud Run on GKE: supported Source for the environment
   * variable's value. Cannot be used if value is not empty. +optional
   * @param valueFrom valueFrom or {@code null} for none
   */
  public EnvVar setValueFrom(EnvVarSource valueFrom) {
    this.valueFrom = valueFrom;
    return this;
  }

  @Override
  public EnvVar set(String fieldName, Object value) {
    return (EnvVar) super.set(fieldName, value);
  }

  @Override
  public EnvVar clone() {
    return (EnvVar) super.clone();
  }

}
