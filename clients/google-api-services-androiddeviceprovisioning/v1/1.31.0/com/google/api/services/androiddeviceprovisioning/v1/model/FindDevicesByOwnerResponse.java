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
 * Response containing found devices.
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
public final class FindDevicesByOwnerResponse extends com.google.api.client.json.GenericJson {

  /**
   * The customer's devices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Device> devices;

  static {
    // hack to force ProGuard to consider Device used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Device.class);
  }

  /**
   * A token used to access the next page of results. Omitted if no further results are available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The total count of items in the list irrespective of pagination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalSize;

  /**
   * The customer's devices.
   * @return value or {@code null} for none
   */
  public java.util.List<Device> getDevices() {
    return devices;
  }

  /**
   * The customer's devices.
   * @param devices devices or {@code null} for none
   */
  public FindDevicesByOwnerResponse setDevices(java.util.List<Device> devices) {
    this.devices = devices;
    return this;
  }

  /**
   * A token used to access the next page of results. Omitted if no further results are available.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token used to access the next page of results. Omitted if no further results are available.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public FindDevicesByOwnerResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The total count of items in the list irrespective of pagination.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalSize() {
    return totalSize;
  }

  /**
   * The total count of items in the list irrespective of pagination.
   * @param totalSize totalSize or {@code null} for none
   */
  public FindDevicesByOwnerResponse setTotalSize(java.lang.Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  @Override
  public FindDevicesByOwnerResponse set(String fieldName, Object value) {
    return (FindDevicesByOwnerResponse) super.set(fieldName, value);
  }

  @Override
  public FindDevicesByOwnerResponse clone() {
    return (FindDevicesByOwnerResponse) super.clone();
  }

}
