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

package com.google.api.services.servicemanagement.model;

/**
 * Request message for DisableService method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DisableServiceRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The identity of consumer resource which service disablement will be applied to. The
   * Google Service Management implementation accepts the following forms: - "project:" Note: this
   * is made compatible with google.api.servicecontrol.v1.Operation.consumer_id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumerId;

  /**
   * Required. The identity of consumer resource which service disablement will be applied to. The
   * Google Service Management implementation accepts the following forms: - "project:" Note: this
   * is made compatible with google.api.servicecontrol.v1.Operation.consumer_id.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumerId() {
    return consumerId;
  }

  /**
   * Required. The identity of consumer resource which service disablement will be applied to. The
   * Google Service Management implementation accepts the following forms: - "project:" Note: this
   * is made compatible with google.api.servicecontrol.v1.Operation.consumer_id.
   * @param consumerId consumerId or {@code null} for none
   */
  public DisableServiceRequest setConsumerId(java.lang.String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  @Override
  public DisableServiceRequest set(String fieldName, Object value) {
    return (DisableServiceRequest) super.set(fieldName, value);
  }

  @Override
  public DisableServiceRequest clone() {
    return (DisableServiceRequest) super.clone();
  }

}
