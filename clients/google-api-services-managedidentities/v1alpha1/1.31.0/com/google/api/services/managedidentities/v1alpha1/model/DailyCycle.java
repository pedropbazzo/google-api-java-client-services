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

package com.google.api.services.managedidentities.v1alpha1.model;

/**
 * Time window specified for daily operations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Managed Service for Microsoft Active Directory API.
 * For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DailyCycle extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Duration of the time window, set by service producer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String duration;

  /**
   * Time within the day to start the operations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeOfDay startTime;

  /**
   * Output only. Duration of the time window, set by service producer.
   * @return value or {@code null} for none
   */
  public String getDuration() {
    return duration;
  }

  /**
   * Output only. Duration of the time window, set by service producer.
   * @param duration duration or {@code null} for none
   */
  public DailyCycle setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Time within the day to start the operations.
   * @return value or {@code null} for none
   */
  public TimeOfDay getStartTime() {
    return startTime;
  }

  /**
   * Time within the day to start the operations.
   * @param startTime startTime or {@code null} for none
   */
  public DailyCycle setStartTime(TimeOfDay startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public DailyCycle set(String fieldName, Object value) {
    return (DailyCycle) super.set(fieldName, value);
  }

  @Override
  public DailyCycle clone() {
    return (DailyCycle) super.clone();
  }

}
