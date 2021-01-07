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

package com.google.api.services.androiddeviceprovisioning.v1.model;

/**
 * Identifies metadata updates to one device.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Device Provisioning Partner API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateMetadataArguments extends com.google.api.client.json.GenericJson {

  /**
   * Required. Device ID of the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long deviceId;

  /**
   * Required. Device identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeviceIdentifier deviceIdentifier;

  /**
   * Required. The metadata to update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeviceMetadata deviceMetadata;

  /**
   * Required. Device ID of the device.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDeviceId() {
    return deviceId;
  }

  /**
   * Required. Device ID of the device.
   * @param deviceId deviceId or {@code null} for none
   */
  public UpdateMetadataArguments setDeviceId(java.lang.Long deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * Required. Device identifier.
   * @return value or {@code null} for none
   */
  public DeviceIdentifier getDeviceIdentifier() {
    return deviceIdentifier;
  }

  /**
   * Required. Device identifier.
   * @param deviceIdentifier deviceIdentifier or {@code null} for none
   */
  public UpdateMetadataArguments setDeviceIdentifier(DeviceIdentifier deviceIdentifier) {
    this.deviceIdentifier = deviceIdentifier;
    return this;
  }

  /**
   * Required. The metadata to update.
   * @return value or {@code null} for none
   */
  public DeviceMetadata getDeviceMetadata() {
    return deviceMetadata;
  }

  /**
   * Required. The metadata to update.
   * @param deviceMetadata deviceMetadata or {@code null} for none
   */
  public UpdateMetadataArguments setDeviceMetadata(DeviceMetadata deviceMetadata) {
    this.deviceMetadata = deviceMetadata;
    return this;
  }

  @Override
  public UpdateMetadataArguments set(String fieldName, Object value) {
    return (UpdateMetadataArguments) super.set(fieldName, value);
  }

  @Override
  public UpdateMetadataArguments clone() {
    return (UpdateMetadataArguments) super.clone();
  }

}
