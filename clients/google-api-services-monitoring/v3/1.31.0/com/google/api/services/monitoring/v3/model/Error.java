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

package com.google.api.services.monitoring.v3.model;

/**
 * Detailed information about an error category.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Error extends com.google.api.client.json.GenericJson {

  /**
   * The number of points that couldn't be written because of status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pointCount;

  /**
   * The status of the requested write operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status status;

  /**
   * The number of points that couldn't be written because of status.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPointCount() {
    return pointCount;
  }

  /**
   * The number of points that couldn't be written because of status.
   * @param pointCount pointCount or {@code null} for none
   */
  public Error setPointCount(java.lang.Integer pointCount) {
    this.pointCount = pointCount;
    return this;
  }

  /**
   * The status of the requested write operation.
   * @return value or {@code null} for none
   */
  public Status getStatus() {
    return status;
  }

  /**
   * The status of the requested write operation.
   * @param status status or {@code null} for none
   */
  public Error setStatus(Status status) {
    this.status = status;
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
