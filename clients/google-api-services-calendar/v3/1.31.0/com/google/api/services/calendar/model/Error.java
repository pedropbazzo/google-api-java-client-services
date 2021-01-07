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

package com.google.api.services.calendar.model;

/**
 * Model definition for Error.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Calendar API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Error extends com.google.api.client.json.GenericJson {

  /**
   * Domain, or broad category, of the error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domain;

  /**
   * Specific reason for the error. Some of the possible values are: - "groupTooBig" - The group of
   * users requested is too large for a single query.  - "tooManyCalendarsRequested" - The number of
   * calendars requested is too large for a single query.  - "notFound" - The requested resource was
   * not found.  - "internalError" - The API service has encountered an internal error.  Additional
   * error types may be added in the future, so clients should gracefully handle additional error
   * statuses not included in this list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * Domain, or broad category, of the error.
   * @return value or {@code null} for none
   */
  public java.lang.String getDomain() {
    return domain;
  }

  /**
   * Domain, or broad category, of the error.
   * @param domain domain or {@code null} for none
   */
  public Error setDomain(java.lang.String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Specific reason for the error. Some of the possible values are: - "groupTooBig" - The group of
   * users requested is too large for a single query.  - "tooManyCalendarsRequested" - The number of
   * calendars requested is too large for a single query.  - "notFound" - The requested resource was
   * not found.  - "internalError" - The API service has encountered an internal error.  Additional
   * error types may be added in the future, so clients should gracefully handle additional error
   * statuses not included in this list.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * Specific reason for the error. Some of the possible values are: - "groupTooBig" - The group of
   * users requested is too large for a single query.  - "tooManyCalendarsRequested" - The number of
   * calendars requested is too large for a single query.  - "notFound" - The requested resource was
   * not found.  - "internalError" - The API service has encountered an internal error.  Additional
   * error types may be added in the future, so clients should gracefully handle additional error
   * statuses not included in this list.
   * @param reason reason or {@code null} for none
   */
  public Error setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  @Override
  public Error set(String fieldName, Object value) {
    return (Error) super.set(fieldName, value);
  }

  @Override
  public Error clone() {
    return (Error) super.clone();
  }

}
