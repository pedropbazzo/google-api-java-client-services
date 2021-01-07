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

package com.google.api.services.composer.v1beta1.model;

/**
 * Image Version information
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Composer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImageVersion extends com.google.api.client.json.GenericJson {

  /**
   * Whether it is impossible to create an environment with the image version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean creationDisabled;

  /**
   * The string identifier of the ImageVersion, in the form: "composer-x.y.z-airflow-a.b(.c)"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageVersionId;

  /**
   * Whether this is the default ImageVersion used by Composer during environment creation if no
   * input ImageVersion is specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isDefault;

  /**
   * The date of the version release.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date releaseDate;

  /**
   * supported python versions
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> supportedPythonVersions;

  /**
   * Whether it is impossible to upgrade an environment running with the image version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean upgradeDisabled;

  /**
   * Whether it is impossible to create an environment with the image version.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCreationDisabled() {
    return creationDisabled;
  }

  /**
   * Whether it is impossible to create an environment with the image version.
   * @param creationDisabled creationDisabled or {@code null} for none
   */
  public ImageVersion setCreationDisabled(java.lang.Boolean creationDisabled) {
    this.creationDisabled = creationDisabled;
    return this;
  }

  /**
   * The string identifier of the ImageVersion, in the form: "composer-x.y.z-airflow-a.b(.c)"
   * @return value or {@code null} for none
   */
  public java.lang.String getImageVersionId() {
    return imageVersionId;
  }

  /**
   * The string identifier of the ImageVersion, in the form: "composer-x.y.z-airflow-a.b(.c)"
   * @param imageVersionId imageVersionId or {@code null} for none
   */
  public ImageVersion setImageVersionId(java.lang.String imageVersionId) {
    this.imageVersionId = imageVersionId;
    return this;
  }

  /**
   * Whether this is the default ImageVersion used by Composer during environment creation if no
   * input ImageVersion is specified.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDefault() {
    return isDefault;
  }

  /**
   * Whether this is the default ImageVersion used by Composer during environment creation if no
   * input ImageVersion is specified.
   * @param isDefault isDefault or {@code null} for none
   */
  public ImageVersion setIsDefault(java.lang.Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * The date of the version release.
   * @return value or {@code null} for none
   */
  public Date getReleaseDate() {
    return releaseDate;
  }

  /**
   * The date of the version release.
   * @param releaseDate releaseDate or {@code null} for none
   */
  public ImageVersion setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * supported python versions
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSupportedPythonVersions() {
    return supportedPythonVersions;
  }

  /**
   * supported python versions
   * @param supportedPythonVersions supportedPythonVersions or {@code null} for none
   */
  public ImageVersion setSupportedPythonVersions(java.util.List<java.lang.String> supportedPythonVersions) {
    this.supportedPythonVersions = supportedPythonVersions;
    return this;
  }

  /**
   * Whether it is impossible to upgrade an environment running with the image version.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUpgradeDisabled() {
    return upgradeDisabled;
  }

  /**
   * Whether it is impossible to upgrade an environment running with the image version.
   * @param upgradeDisabled upgradeDisabled or {@code null} for none
   */
  public ImageVersion setUpgradeDisabled(java.lang.Boolean upgradeDisabled) {
    this.upgradeDisabled = upgradeDisabled;
    return this;
  }

  @Override
  public ImageVersion set(String fieldName, Object value) {
    return (ImageVersion) super.set(fieldName, value);
  }

  @Override
  public ImageVersion clone() {
    return (ImageVersion) super.clone();
  }

}
