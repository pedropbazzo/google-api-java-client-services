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

package com.google.api.services.deploymentmanager.model;

/**
 * Holds the composite type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Deployment Manager V2 API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CompositeType extends com.google.api.client.json.GenericJson {

  /**
   * An optional textual description of the resource; provided by the client when the resource is
   * created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * Output only. Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String insertTime;

  /**
   * Map of labels; provided by the client when the resource is created or updated. Specifically:
   * Label keys must be between 1 and 63 characters long and must conform to the following regular
   * expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long
   * and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CompositeTypeLabelEntry> labels;

  /**
   * Name of the composite type, must follow the expression: `[a-z]([-a-z0-9_.]{0,61}[a-z0-9])?`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The Operation that most recently ran, or is currently running, on this composite
   * type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Operation operation;

  /**
   * Output only. Server defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Files for the template type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TemplateContents templateContents;

  /**
   * An optional textual description of the resource; provided by the client when the resource is
   * created.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional textual description of the resource; provided by the client when the resource is
   * created.
   * @param description description or {@code null} for none
   */
  public CompositeType setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public CompositeType setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * Output only. Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getInsertTime() {
    return insertTime;
  }

  /**
   * Output only. Creation timestamp in RFC3339 text format.
   * @param insertTime insertTime or {@code null} for none
   */
  public CompositeType setInsertTime(java.lang.String insertTime) {
    this.insertTime = insertTime;
    return this;
  }

  /**
   * Map of labels; provided by the client when the resource is created or updated. Specifically:
   * Label keys must be between 1 and 63 characters long and must conform to the following regular
   * expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long
   * and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
   * @return value or {@code null} for none
   */
  public java.util.List<CompositeTypeLabelEntry> getLabels() {
    return labels;
  }

  /**
   * Map of labels; provided by the client when the resource is created or updated. Specifically:
   * Label keys must be between 1 and 63 characters long and must conform to the following regular
   * expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long
   * and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
   * @param labels labels or {@code null} for none
   */
  public CompositeType setLabels(java.util.List<CompositeTypeLabelEntry> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Name of the composite type, must follow the expression: `[a-z]([-a-z0-9_.]{0,61}[a-z0-9])?`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the composite type, must follow the expression: `[a-z]([-a-z0-9_.]{0,61}[a-z0-9])?`.
   * @param name name or {@code null} for none
   */
  public CompositeType setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The Operation that most recently ran, or is currently running, on this composite
   * type.
   * @return value or {@code null} for none
   */
  public Operation getOperation() {
    return operation;
  }

  /**
   * Output only. The Operation that most recently ran, or is currently running, on this composite
   * type.
   * @param operation operation or {@code null} for none
   */
  public CompositeType setOperation(Operation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Output only. Server defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * Output only. Server defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public CompositeType setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * @param status status or {@code null} for none
   */
  public CompositeType setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Files for the template type.
   * @return value or {@code null} for none
   */
  public TemplateContents getTemplateContents() {
    return templateContents;
  }

  /**
   * Files for the template type.
   * @param templateContents templateContents or {@code null} for none
   */
  public CompositeType setTemplateContents(TemplateContents templateContents) {
    this.templateContents = templateContents;
    return this;
  }

  @Override
  public CompositeType set(String fieldName, Object value) {
    return (CompositeType) super.set(fieldName, value);
  }

  @Override
  public CompositeType clone() {
    return (CompositeType) super.clone();
  }

}
