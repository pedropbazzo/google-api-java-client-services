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

package com.google.api.services.firebasedynamiclinks.v1.model;

/**
 * Request to create a managed Short Dynamic Link.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Dynamic Links API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateManagedShortLinkRequest extends com.google.api.client.json.GenericJson {

  /**
   * Information about the Dynamic Link to be shortened. [Learn
   * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DynamicLinkInfo dynamicLinkInfo;

  /**
   * Full long Dynamic Link URL with desired query parameters specified. For example,
   * "https://sample.app.goo.gl/?link=http://www.google.com=com.sample", [Learn
   * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String longDynamicLink;

  /**
   * Link name to associate with the link. It's used for marketer to identify manually-created links
   * in the Firebase console (https://console.firebase.google.com/). Links must be named to be
   * tracked.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Google SDK version. Version takes the form "$major.$minor.$patch"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sdkVersion;

  /**
   * Short Dynamic Link suffix. Optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Suffix suffix;

  /**
   * Information about the Dynamic Link to be shortened. [Learn
   * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
   * @return value or {@code null} for none
   */
  public DynamicLinkInfo getDynamicLinkInfo() {
    return dynamicLinkInfo;
  }

  /**
   * Information about the Dynamic Link to be shortened. [Learn
   * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
   * @param dynamicLinkInfo dynamicLinkInfo or {@code null} for none
   */
  public CreateManagedShortLinkRequest setDynamicLinkInfo(DynamicLinkInfo dynamicLinkInfo) {
    this.dynamicLinkInfo = dynamicLinkInfo;
    return this;
  }

  /**
   * Full long Dynamic Link URL with desired query parameters specified. For example,
   * "https://sample.app.goo.gl/?link=http://www.google.com=com.sample", [Learn
   * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
   * @return value or {@code null} for none
   */
  public java.lang.String getLongDynamicLink() {
    return longDynamicLink;
  }

  /**
   * Full long Dynamic Link URL with desired query parameters specified. For example,
   * "https://sample.app.goo.gl/?link=http://www.google.com=com.sample", [Learn
   * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
   * @param longDynamicLink longDynamicLink or {@code null} for none
   */
  public CreateManagedShortLinkRequest setLongDynamicLink(java.lang.String longDynamicLink) {
    this.longDynamicLink = longDynamicLink;
    return this;
  }

  /**
   * Link name to associate with the link. It's used for marketer to identify manually-created links
   * in the Firebase console (https://console.firebase.google.com/). Links must be named to be
   * tracked.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Link name to associate with the link. It's used for marketer to identify manually-created links
   * in the Firebase console (https://console.firebase.google.com/). Links must be named to be
   * tracked.
   * @param name name or {@code null} for none
   */
  public CreateManagedShortLinkRequest setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Google SDK version. Version takes the form "$major.$minor.$patch"
   * @return value or {@code null} for none
   */
  public java.lang.String getSdkVersion() {
    return sdkVersion;
  }

  /**
   * Google SDK version. Version takes the form "$major.$minor.$patch"
   * @param sdkVersion sdkVersion or {@code null} for none
   */
  public CreateManagedShortLinkRequest setSdkVersion(java.lang.String sdkVersion) {
    this.sdkVersion = sdkVersion;
    return this;
  }

  /**
   * Short Dynamic Link suffix. Optional.
   * @return value or {@code null} for none
   */
  public Suffix getSuffix() {
    return suffix;
  }

  /**
   * Short Dynamic Link suffix. Optional.
   * @param suffix suffix or {@code null} for none
   */
  public CreateManagedShortLinkRequest setSuffix(Suffix suffix) {
    this.suffix = suffix;
    return this;
  }

  @Override
  public CreateManagedShortLinkRequest set(String fieldName, Object value) {
    return (CreateManagedShortLinkRequest) super.set(fieldName, value);
  }

  @Override
  public CreateManagedShortLinkRequest clone() {
    return (CreateManagedShortLinkRequest) super.clone();
  }

}
