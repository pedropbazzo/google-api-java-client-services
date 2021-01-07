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

package com.google.api.services.androidenterprise.model;

/**
 * The device policy for a given managed device.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Policy extends com.google.api.client.json.GenericJson {

  /**
   * The auto-update policy for apps installed on the device. "choiceToTheUser" allows the device's
   * user to configure the app update policy. "always" enables auto updates. "never" disables auto
   * updates. "wifiOnly" enables auto updates only when the device is connected to wifi.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String autoUpdatePolicy;

  /**
   * Whether the device reports app states to the EMM. The default value is "deviceReportDisabled".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceReportPolicy;

  /**
   * The maintenance window defining when apps running in the foreground should be updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MaintenanceWindow maintenanceWindow;

  /**
   * The availability granted to the device for the specified products. "all" gives the device
   * access to all products, regardless of approval status. "all" does not enable automatic
   * visibility of "alpha" or "beta" tracks. "whitelist" grants the device access the products
   * specified in productPolicy[]. Only products that are approved or products that were previously
   * approved (products with revoked approval) by the enterprise can be whitelisted. If no value is
   * provided, the availability set at the user level is applied by default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productAvailabilityPolicy;

  /**
   * The list of product policies. The productAvailabilityPolicy needs to be set to WHITELIST or ALL
   * for the product policies to be applied.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ProductPolicy> productPolicy;

  /**
   * The auto-update policy for apps installed on the device. "choiceToTheUser" allows the device's
   * user to configure the app update policy. "always" enables auto updates. "never" disables auto
   * updates. "wifiOnly" enables auto updates only when the device is connected to wifi.
   * @return value or {@code null} for none
   */
  public java.lang.String getAutoUpdatePolicy() {
    return autoUpdatePolicy;
  }

  /**
   * The auto-update policy for apps installed on the device. "choiceToTheUser" allows the device's
   * user to configure the app update policy. "always" enables auto updates. "never" disables auto
   * updates. "wifiOnly" enables auto updates only when the device is connected to wifi.
   * @param autoUpdatePolicy autoUpdatePolicy or {@code null} for none
   */
  public Policy setAutoUpdatePolicy(java.lang.String autoUpdatePolicy) {
    this.autoUpdatePolicy = autoUpdatePolicy;
    return this;
  }

  /**
   * Whether the device reports app states to the EMM. The default value is "deviceReportDisabled".
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceReportPolicy() {
    return deviceReportPolicy;
  }

  /**
   * Whether the device reports app states to the EMM. The default value is "deviceReportDisabled".
   * @param deviceReportPolicy deviceReportPolicy or {@code null} for none
   */
  public Policy setDeviceReportPolicy(java.lang.String deviceReportPolicy) {
    this.deviceReportPolicy = deviceReportPolicy;
    return this;
  }

  /**
   * The maintenance window defining when apps running in the foreground should be updated.
   * @return value or {@code null} for none
   */
  public MaintenanceWindow getMaintenanceWindow() {
    return maintenanceWindow;
  }

  /**
   * The maintenance window defining when apps running in the foreground should be updated.
   * @param maintenanceWindow maintenanceWindow or {@code null} for none
   */
  public Policy setMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
    this.maintenanceWindow = maintenanceWindow;
    return this;
  }

  /**
   * The availability granted to the device for the specified products. "all" gives the device
   * access to all products, regardless of approval status. "all" does not enable automatic
   * visibility of "alpha" or "beta" tracks. "whitelist" grants the device access the products
   * specified in productPolicy[]. Only products that are approved or products that were previously
   * approved (products with revoked approval) by the enterprise can be whitelisted. If no value is
   * provided, the availability set at the user level is applied by default.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductAvailabilityPolicy() {
    return productAvailabilityPolicy;
  }

  /**
   * The availability granted to the device for the specified products. "all" gives the device
   * access to all products, regardless of approval status. "all" does not enable automatic
   * visibility of "alpha" or "beta" tracks. "whitelist" grants the device access the products
   * specified in productPolicy[]. Only products that are approved or products that were previously
   * approved (products with revoked approval) by the enterprise can be whitelisted. If no value is
   * provided, the availability set at the user level is applied by default.
   * @param productAvailabilityPolicy productAvailabilityPolicy or {@code null} for none
   */
  public Policy setProductAvailabilityPolicy(java.lang.String productAvailabilityPolicy) {
    this.productAvailabilityPolicy = productAvailabilityPolicy;
    return this;
  }

  /**
   * The list of product policies. The productAvailabilityPolicy needs to be set to WHITELIST or ALL
   * for the product policies to be applied.
   * @return value or {@code null} for none
   */
  public java.util.List<ProductPolicy> getProductPolicy() {
    return productPolicy;
  }

  /**
   * The list of product policies. The productAvailabilityPolicy needs to be set to WHITELIST or ALL
   * for the product policies to be applied.
   * @param productPolicy productPolicy or {@code null} for none
   */
  public Policy setProductPolicy(java.util.List<ProductPolicy> productPolicy) {
    this.productPolicy = productPolicy;
    return this;
  }

  @Override
  public Policy set(String fieldName, Object value) {
    return (Policy) super.set(fieldName, value);
  }

  @Override
  public Policy clone() {
    return (Policy) super.clone();
  }

}
