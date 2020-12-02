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

package com.google.api.services.osconfig.v1beta.model;

/**
 * Message encapsulating a value that can be either absolute ("fixed") or relative ("percent") to a
 * value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FixedOrPercent extends com.google.api.client.json.GenericJson {

  /**
   * Specifies a fixed value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer fixed;

  /**
   * Specifies the relative value defined as a percentage, which will be multiplied by a reference
   * value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer percent;

  /**
   * Specifies a fixed value.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getFixed() {
    return fixed;
  }

  /**
   * Specifies a fixed value.
   * @param fixed fixed or {@code null} for none
   */
  public FixedOrPercent setFixed(java.lang.Integer fixed) {
    this.fixed = fixed;
    return this;
  }

  /**
   * Specifies the relative value defined as a percentage, which will be multiplied by a reference
   * value.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPercent() {
    return percent;
  }

  /**
   * Specifies the relative value defined as a percentage, which will be multiplied by a reference
   * value.
   * @param percent percent or {@code null} for none
   */
  public FixedOrPercent setPercent(java.lang.Integer percent) {
    this.percent = percent;
    return this;
  }

  @Override
  public FixedOrPercent set(String fieldName, Object value) {
    return (FixedOrPercent) super.set(fieldName, value);
  }

  @Override
  public FixedOrPercent clone() {
    return (FixedOrPercent) super.clone();
  }

}
