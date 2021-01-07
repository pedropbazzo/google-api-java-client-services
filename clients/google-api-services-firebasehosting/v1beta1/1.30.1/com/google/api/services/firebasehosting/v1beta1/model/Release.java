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

package com.google.api.services.firebasehosting.v1beta1.model;

/**
 * A `Release` is a particular [collection of configurations and files](sites.versions) that is set
 * to be public at a particular time.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Hosting API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Release extends com.google.api.client.json.GenericJson {

  /**
   * The deploy description when the release was created. The value can be up to 512 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * Output only. The unique identifier for the release, in the format: sites/ site-
   * name/releases/releaseID This name is provided in the response body when you call the
   * [`CreateRelease`](sites.releases/create) endpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The time at which the version is set to be public.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String releaseTime;

  /**
   * Output only. Identifies the user who created the release.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ActingUser releaseUser;

  /**
   * Explains the reason for the release. Specify a value for this field only when creating a
   * `SITE_DISABLE` type release.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Output only. The configuration and content that was released.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Version version;

  /**
   * The deploy description when the release was created. The value can be up to 512 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * The deploy description when the release was created. The value can be up to 512 characters.
   * @param message message or {@code null} for none
   */
  public Release setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * Output only. The unique identifier for the release, in the format: sites/ site-
   * name/releases/releaseID This name is provided in the response body when you call the
   * [`CreateRelease`](sites.releases/create) endpoint.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The unique identifier for the release, in the format: sites/ site-
   * name/releases/releaseID This name is provided in the response body when you call the
   * [`CreateRelease`](sites.releases/create) endpoint.
   * @param name name or {@code null} for none
   */
  public Release setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The time at which the version is set to be public.
   * @return value or {@code null} for none
   */
  public String getReleaseTime() {
    return releaseTime;
  }

  /**
   * Output only. The time at which the version is set to be public.
   * @param releaseTime releaseTime or {@code null} for none
   */
  public Release setReleaseTime(String releaseTime) {
    this.releaseTime = releaseTime;
    return this;
  }

  /**
   * Output only. Identifies the user who created the release.
   * @return value or {@code null} for none
   */
  public ActingUser getReleaseUser() {
    return releaseUser;
  }

  /**
   * Output only. Identifies the user who created the release.
   * @param releaseUser releaseUser or {@code null} for none
   */
  public Release setReleaseUser(ActingUser releaseUser) {
    this.releaseUser = releaseUser;
    return this;
  }

  /**
   * Explains the reason for the release. Specify a value for this field only when creating a
   * `SITE_DISABLE` type release.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Explains the reason for the release. Specify a value for this field only when creating a
   * `SITE_DISABLE` type release.
   * @param type type or {@code null} for none
   */
  public Release setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Output only. The configuration and content that was released.
   * @return value or {@code null} for none
   */
  public Version getVersion() {
    return version;
  }

  /**
   * Output only. The configuration and content that was released.
   * @param version version or {@code null} for none
   */
  public Release setVersion(Version version) {
    this.version = version;
    return this;
  }

  @Override
  public Release set(String fieldName, Object value) {
    return (Release) super.set(fieldName, value);
  }

  @Override
  public Release clone() {
    return (Release) super.clone();
  }

}
