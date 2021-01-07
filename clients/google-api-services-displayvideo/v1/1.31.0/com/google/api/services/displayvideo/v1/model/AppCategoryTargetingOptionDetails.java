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

package com.google.api.services.displayvideo.v1.model;

/**
 * Represents a targetable collection of apps. A collection lets you target dynamic groups of
 * related apps that are maintained by the platform, for example `All Apps/Google Play/Games`. This
 * will be populated in the app_category_details field when targeting_type is
 * `TARGETING_TYPE_APP_CATEGORY`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppCategoryTargetingOptionDetails extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The name of the app collection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. The name of the app collection.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Output only. The name of the app collection.
   * @param displayName displayName or {@code null} for none
   */
  public AppCategoryTargetingOptionDetails setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  @Override
  public AppCategoryTargetingOptionDetails set(String fieldName, Object value) {
    return (AppCategoryTargetingOptionDetails) super.set(fieldName, value);
  }

  @Override
  public AppCategoryTargetingOptionDetails clone() {
    return (AppCategoryTargetingOptionDetails) super.clone();
  }

}
