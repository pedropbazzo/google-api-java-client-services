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

package com.google.api.services.admob.v1.model;

/**
 * Warnings associated with generation of the report.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdMob API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReportWarning extends com.google.api.client.json.GenericJson {

  /**
   * Describes the details of the warning message, in English.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Type of the warning.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Describes the details of the warning message, in English.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Describes the details of the warning message, in English.
   * @param description description or {@code null} for none
   */
  public ReportWarning setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Type of the warning.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of the warning.
   * @param type type or {@code null} for none
   */
  public ReportWarning setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public ReportWarning set(String fieldName, Object value) {
    return (ReportWarning) super.set(fieldName, value);
  }

  @Override
  public ReportWarning clone() {
    return (ReportWarning) super.clone();
  }

}
