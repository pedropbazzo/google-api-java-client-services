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

package com.google.api.services.digitalassetlinks.v1.model;

/**
 * Response message for the CheckAssetLinks call.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Digital Asset Links API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CheckResponse extends com.google.api.client.json.GenericJson {

  /**
   * Human-readable message containing information intended to help end users understand, reproduce
   * and debug the result. The message will be in English and we are currently not planning to offer
   * any translations. Please note that no guarantees are made about the contents or format of this
   * string. Any aspect of it may be subject to change without notice. You should not attempt to
   * programmatically parse this data. For programmatic access, use the error_code field below.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String debugString;

  /**
   * Error codes that describe the result of the Check operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> errorCode;

  /**
   * Set to true if the assets specified in the request are linked by the relation specified in the
   * request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean linked;

  /**
   * From serving time, how much longer the response should be considered valid barring further
   * updates. REQUIRED
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String maxAge;

  /**
   * Human-readable message containing information intended to help end users understand, reproduce
   * and debug the result. The message will be in English and we are currently not planning to offer
   * any translations. Please note that no guarantees are made about the contents or format of this
   * string. Any aspect of it may be subject to change without notice. You should not attempt to
   * programmatically parse this data. For programmatic access, use the error_code field below.
   * @return value or {@code null} for none
   */
  public java.lang.String getDebugString() {
    return debugString;
  }

  /**
   * Human-readable message containing information intended to help end users understand, reproduce
   * and debug the result. The message will be in English and we are currently not planning to offer
   * any translations. Please note that no guarantees are made about the contents or format of this
   * string. Any aspect of it may be subject to change without notice. You should not attempt to
   * programmatically parse this data. For programmatic access, use the error_code field below.
   * @param debugString debugString or {@code null} for none
   */
  public CheckResponse setDebugString(java.lang.String debugString) {
    this.debugString = debugString;
    return this;
  }

  /**
   * Error codes that describe the result of the Check operation.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getErrorCode() {
    return errorCode;
  }

  /**
   * Error codes that describe the result of the Check operation.
   * @param errorCode errorCode or {@code null} for none
   */
  public CheckResponse setErrorCode(java.util.List<java.lang.String> errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Set to true if the assets specified in the request are linked by the relation specified in the
   * request.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLinked() {
    return linked;
  }

  /**
   * Set to true if the assets specified in the request are linked by the relation specified in the
   * request.
   * @param linked linked or {@code null} for none
   */
  public CheckResponse setLinked(java.lang.Boolean linked) {
    this.linked = linked;
    return this;
  }

  /**
   * From serving time, how much longer the response should be considered valid barring further
   * updates. REQUIRED
   * @return value or {@code null} for none
   */
  public String getMaxAge() {
    return maxAge;
  }

  /**
   * From serving time, how much longer the response should be considered valid barring further
   * updates. REQUIRED
   * @param maxAge maxAge or {@code null} for none
   */
  public CheckResponse setMaxAge(String maxAge) {
    this.maxAge = maxAge;
    return this;
  }

  @Override
  public CheckResponse set(String fieldName, Object value) {
    return (CheckResponse) super.set(fieldName, value);
  }

  @Override
  public CheckResponse clone() {
    return (CheckResponse) super.clone();
  }

}
