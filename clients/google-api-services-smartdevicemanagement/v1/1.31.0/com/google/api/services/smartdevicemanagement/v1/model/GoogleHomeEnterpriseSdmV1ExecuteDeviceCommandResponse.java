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

package com.google.api.services.smartdevicemanagement.v1.model;

/**
 * Response message for SmartDeviceManagementService.ExecuteDeviceCommand
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Smart Device Management API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse extends com.google.api.client.json.GenericJson {

  /**
   * The results of executing the command.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> results;

  /**
   * The results of executing the command.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getResults() {
    return results;
  }

  /**
   * The results of executing the command.
   * @param results results or {@code null} for none
   */
  public GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse setResults(java.util.Map<String, java.lang.Object> results) {
    this.results = results;
    return this;
  }

  @Override
  public GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse set(String fieldName, Object value) {
    return (GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse clone() {
    return (GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse) super.clone();
  }

}
