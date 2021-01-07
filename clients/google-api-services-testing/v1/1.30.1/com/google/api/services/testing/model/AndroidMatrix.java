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

package com.google.api.services.testing.model;

/**
 * A set of Android device configuration permutations is defined by the the cross-product of the
 * given axes. Internally, the given AndroidMatrix will be expanded into a set of AndroidDevices.
 * Only supported permutations will be instantiated. Invalid permutations (e.g., incompatible
 * models/versions) are ignored.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AndroidMatrix extends com.google.api.client.json.GenericJson {

  /**
   * Required. The ids of the set of Android device to be used. Use the
   * TestEnvironmentDiscoveryService to get supported options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> androidModelIds;

  /**
   * Required. The ids of the set of Android OS version to be used. Use the
   * TestEnvironmentDiscoveryService to get supported options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> androidVersionIds;

  /**
   * Required. The set of locales the test device will enable for testing. Use the
   * TestEnvironmentDiscoveryService to get supported options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> locales;

  /**
   * Required. The set of orientations to test with. Use the TestEnvironmentDiscoveryService to get
   * supported options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> orientations;

  /**
   * Required. The ids of the set of Android device to be used. Use the
   * TestEnvironmentDiscoveryService to get supported options.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAndroidModelIds() {
    return androidModelIds;
  }

  /**
   * Required. The ids of the set of Android device to be used. Use the
   * TestEnvironmentDiscoveryService to get supported options.
   * @param androidModelIds androidModelIds or {@code null} for none
   */
  public AndroidMatrix setAndroidModelIds(java.util.List<java.lang.String> androidModelIds) {
    this.androidModelIds = androidModelIds;
    return this;
  }

  /**
   * Required. The ids of the set of Android OS version to be used. Use the
   * TestEnvironmentDiscoveryService to get supported options.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAndroidVersionIds() {
    return androidVersionIds;
  }

  /**
   * Required. The ids of the set of Android OS version to be used. Use the
   * TestEnvironmentDiscoveryService to get supported options.
   * @param androidVersionIds androidVersionIds or {@code null} for none
   */
  public AndroidMatrix setAndroidVersionIds(java.util.List<java.lang.String> androidVersionIds) {
    this.androidVersionIds = androidVersionIds;
    return this;
  }

  /**
   * Required. The set of locales the test device will enable for testing. Use the
   * TestEnvironmentDiscoveryService to get supported options.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLocales() {
    return locales;
  }

  /**
   * Required. The set of locales the test device will enable for testing. Use the
   * TestEnvironmentDiscoveryService to get supported options.
   * @param locales locales or {@code null} for none
   */
  public AndroidMatrix setLocales(java.util.List<java.lang.String> locales) {
    this.locales = locales;
    return this;
  }

  /**
   * Required. The set of orientations to test with. Use the TestEnvironmentDiscoveryService to get
   * supported options.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOrientations() {
    return orientations;
  }

  /**
   * Required. The set of orientations to test with. Use the TestEnvironmentDiscoveryService to get
   * supported options.
   * @param orientations orientations or {@code null} for none
   */
  public AndroidMatrix setOrientations(java.util.List<java.lang.String> orientations) {
    this.orientations = orientations;
    return this;
  }

  @Override
  public AndroidMatrix set(String fieldName, Object value) {
    return (AndroidMatrix) super.set(fieldName, value);
  }

  @Override
  public AndroidMatrix clone() {
    return (AndroidMatrix) super.clone();
  }

}
