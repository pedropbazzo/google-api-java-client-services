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

package com.google.api.services.run.v1.model;

/**
 * Cloud Run fully managed: not supported Cloud Run for Anthos: supported Selects a key from a
 * ConfigMap.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigMapKeySelector extends com.google.api.client.json.GenericJson {

  /**
   * Cloud Run fully managed: not supported Cloud Run for Anthos: supported The key to select.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * This field should not be used directly as it is meant to be inlined directly into the message.
   * Use the "name" field instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LocalObjectReference localObjectReference;

  /**
   * Cloud Run fully managed: not supported Cloud Run for Anthos: supported The ConfigMap to select
   * from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Specify
   * whether the ConfigMap or its key must be defined
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean optional;

  /**
   * Cloud Run fully managed: not supported Cloud Run for Anthos: supported The key to select.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Cloud Run fully managed: not supported Cloud Run for Anthos: supported The key to select.
   * @param key key or {@code null} for none
   */
  public ConfigMapKeySelector setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * This field should not be used directly as it is meant to be inlined directly into the message.
   * Use the "name" field instead.
   * @return value or {@code null} for none
   */
  public LocalObjectReference getLocalObjectReference() {
    return localObjectReference;
  }

  /**
   * This field should not be used directly as it is meant to be inlined directly into the message.
   * Use the "name" field instead.
   * @param localObjectReference localObjectReference or {@code null} for none
   */
  public ConfigMapKeySelector setLocalObjectReference(LocalObjectReference localObjectReference) {
    this.localObjectReference = localObjectReference;
    return this;
  }

  /**
   * Cloud Run fully managed: not supported Cloud Run for Anthos: supported The ConfigMap to select
   * from.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Cloud Run fully managed: not supported Cloud Run for Anthos: supported The ConfigMap to select
   * from.
   * @param name name or {@code null} for none
   */
  public ConfigMapKeySelector setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Specify
   * whether the ConfigMap or its key must be defined
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOptional() {
    return optional;
  }

  /**
   * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Specify
   * whether the ConfigMap or its key must be defined
   * @param optional optional or {@code null} for none
   */
  public ConfigMapKeySelector setOptional(java.lang.Boolean optional) {
    this.optional = optional;
    return this;
  }

  @Override
  public ConfigMapKeySelector set(String fieldName, Object value) {
    return (ConfigMapKeySelector) super.set(fieldName, value);
  }

  @Override
  public ConfigMapKeySelector clone() {
    return (ConfigMapKeySelector) super.clone();
  }

}
