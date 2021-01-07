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

package com.google.api.services.content.model;

/**
 * Model definition for ProductStatusItemLevelIssue.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProductStatusItemLevelIssue extends com.google.api.client.json.GenericJson {

  /**
   * List of country codes (ISO 3166-1 alpha-2) where issue applies to the offer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> applicableCountries;

  /**
   * The attribute's name, if the issue is caused by a single attribute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attributeName;

  /**
   * The error code of the issue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * A short issue description in English.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The destination the issue applies to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destination;

  /**
   * A detailed issue description in English.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String detail;

  /**
   * The URL of a web page to help with resolving this issue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String documentation;

  /**
   * Whether the issue can be resolved by the merchant.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resolution;

  /**
   * How this issue affects serving of the offer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String servability;

  /**
   * List of country codes (ISO 3166-1 alpha-2) where issue applies to the offer.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getApplicableCountries() {
    return applicableCountries;
  }

  /**
   * List of country codes (ISO 3166-1 alpha-2) where issue applies to the offer.
   * @param applicableCountries applicableCountries or {@code null} for none
   */
  public ProductStatusItemLevelIssue setApplicableCountries(java.util.List<java.lang.String> applicableCountries) {
    this.applicableCountries = applicableCountries;
    return this;
  }

  /**
   * The attribute's name, if the issue is caused by a single attribute.
   * @return value or {@code null} for none
   */
  public java.lang.String getAttributeName() {
    return attributeName;
  }

  /**
   * The attribute's name, if the issue is caused by a single attribute.
   * @param attributeName attributeName or {@code null} for none
   */
  public ProductStatusItemLevelIssue setAttributeName(java.lang.String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

  /**
   * The error code of the issue.
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * The error code of the issue.
   * @param code code or {@code null} for none
   */
  public ProductStatusItemLevelIssue setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * A short issue description in English.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A short issue description in English.
   * @param description description or {@code null} for none
   */
  public ProductStatusItemLevelIssue setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The destination the issue applies to.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestination() {
    return destination;
  }

  /**
   * The destination the issue applies to.
   * @param destination destination or {@code null} for none
   */
  public ProductStatusItemLevelIssue setDestination(java.lang.String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * A detailed issue description in English.
   * @return value or {@code null} for none
   */
  public java.lang.String getDetail() {
    return detail;
  }

  /**
   * A detailed issue description in English.
   * @param detail detail or {@code null} for none
   */
  public ProductStatusItemLevelIssue setDetail(java.lang.String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * The URL of a web page to help with resolving this issue.
   * @return value or {@code null} for none
   */
  public java.lang.String getDocumentation() {
    return documentation;
  }

  /**
   * The URL of a web page to help with resolving this issue.
   * @param documentation documentation or {@code null} for none
   */
  public ProductStatusItemLevelIssue setDocumentation(java.lang.String documentation) {
    this.documentation = documentation;
    return this;
  }

  /**
   * Whether the issue can be resolved by the merchant.
   * @return value or {@code null} for none
   */
  public java.lang.String getResolution() {
    return resolution;
  }

  /**
   * Whether the issue can be resolved by the merchant.
   * @param resolution resolution or {@code null} for none
   */
  public ProductStatusItemLevelIssue setResolution(java.lang.String resolution) {
    this.resolution = resolution;
    return this;
  }

  /**
   * How this issue affects serving of the offer.
   * @return value or {@code null} for none
   */
  public java.lang.String getServability() {
    return servability;
  }

  /**
   * How this issue affects serving of the offer.
   * @param servability servability or {@code null} for none
   */
  public ProductStatusItemLevelIssue setServability(java.lang.String servability) {
    this.servability = servability;
    return this;
  }

  @Override
  public ProductStatusItemLevelIssue set(String fieldName, Object value) {
    return (ProductStatusItemLevelIssue) super.set(fieldName, value);
  }

  @Override
  public ProductStatusItemLevelIssue clone() {
    return (ProductStatusItemLevelIssue) super.clone();
  }

}
