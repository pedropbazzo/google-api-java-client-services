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

package com.google.api.services.cloudkms.v1.model;

/**
 * A CryptoKey represents a logical key that can be used for cryptographic operations. A CryptoKey
 * is made up of zero or more versions, which represent the actual key material used in
 * cryptographic operations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Key Management Service (KMS) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CryptoKey extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time at which this CryptoKey was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Labels with user-defined metadata. For more information, see [Labeling
   * Keys](https://cloud.google.com/kms/docs/labeling-keys).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. The resource name for this CryptoKey in the format
   * `projects/locations/keyRings/cryptoKeys`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * At next_rotation_time, the Key Management Service will automatically: 1. Create a new version
   * of this CryptoKey. 2. Mark the new version as primary. Key rotations performed manually via
   * CreateCryptoKeyVersion and UpdateCryptoKeyPrimaryVersion do not affect next_rotation_time. Keys
   * with purpose ENCRYPT_DECRYPT support automatic rotation. For other keys, this field must be
   * omitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String nextRotationTime;

  /**
   * Output only. A copy of the "primary" CryptoKeyVersion that will be used by Encrypt when this
   * CryptoKey is given in EncryptRequest.name. The CryptoKey's primary version can be updated via
   * UpdateCryptoKeyPrimaryVersion. Keys with purpose ENCRYPT_DECRYPT may have a primary. For other
   * keys, this field will be omitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CryptoKeyVersion primary;

  /**
   * Immutable. The immutable purpose of this CryptoKey.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String purpose;

  /**
   * next_rotation_time will be advanced by this period when the service automatically rotates a
   * key. Must be at least 24 hours and at most 876,000 hours. If rotation_period is set,
   * next_rotation_time must also be set. Keys with purpose ENCRYPT_DECRYPT support automatic
   * rotation. For other keys, this field must be omitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String rotationPeriod;

  /**
   * A template describing settings for new CryptoKeyVersion instances. The properties of new
   * CryptoKeyVersion instances created by either CreateCryptoKeyVersion or auto-rotation are
   * controlled by this template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CryptoKeyVersionTemplate versionTemplate;

  /**
   * Output only. The time at which this CryptoKey was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time at which this CryptoKey was created.
   * @param createTime createTime or {@code null} for none
   */
  public CryptoKey setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Labels with user-defined metadata. For more information, see [Labeling
   * Keys](https://cloud.google.com/kms/docs/labeling-keys).
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels with user-defined metadata. For more information, see [Labeling
   * Keys](https://cloud.google.com/kms/docs/labeling-keys).
   * @param labels labels or {@code null} for none
   */
  public CryptoKey setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. The resource name for this CryptoKey in the format
   * `projects/locations/keyRings/cryptoKeys`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name for this CryptoKey in the format
   * `projects/locations/keyRings/cryptoKeys`.
   * @param name name or {@code null} for none
   */
  public CryptoKey setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * At next_rotation_time, the Key Management Service will automatically: 1. Create a new version
   * of this CryptoKey. 2. Mark the new version as primary. Key rotations performed manually via
   * CreateCryptoKeyVersion and UpdateCryptoKeyPrimaryVersion do not affect next_rotation_time. Keys
   * with purpose ENCRYPT_DECRYPT support automatic rotation. For other keys, this field must be
   * omitted.
   * @return value or {@code null} for none
   */
  public String getNextRotationTime() {
    return nextRotationTime;
  }

  /**
   * At next_rotation_time, the Key Management Service will automatically: 1. Create a new version
   * of this CryptoKey. 2. Mark the new version as primary. Key rotations performed manually via
   * CreateCryptoKeyVersion and UpdateCryptoKeyPrimaryVersion do not affect next_rotation_time. Keys
   * with purpose ENCRYPT_DECRYPT support automatic rotation. For other keys, this field must be
   * omitted.
   * @param nextRotationTime nextRotationTime or {@code null} for none
   */
  public CryptoKey setNextRotationTime(String nextRotationTime) {
    this.nextRotationTime = nextRotationTime;
    return this;
  }

  /**
   * Output only. A copy of the "primary" CryptoKeyVersion that will be used by Encrypt when this
   * CryptoKey is given in EncryptRequest.name. The CryptoKey's primary version can be updated via
   * UpdateCryptoKeyPrimaryVersion. Keys with purpose ENCRYPT_DECRYPT may have a primary. For other
   * keys, this field will be omitted.
   * @return value or {@code null} for none
   */
  public CryptoKeyVersion getPrimary() {
    return primary;
  }

  /**
   * Output only. A copy of the "primary" CryptoKeyVersion that will be used by Encrypt when this
   * CryptoKey is given in EncryptRequest.name. The CryptoKey's primary version can be updated via
   * UpdateCryptoKeyPrimaryVersion. Keys with purpose ENCRYPT_DECRYPT may have a primary. For other
   * keys, this field will be omitted.
   * @param primary primary or {@code null} for none
   */
  public CryptoKey setPrimary(CryptoKeyVersion primary) {
    this.primary = primary;
    return this;
  }

  /**
   * Immutable. The immutable purpose of this CryptoKey.
   * @return value or {@code null} for none
   */
  public java.lang.String getPurpose() {
    return purpose;
  }

  /**
   * Immutable. The immutable purpose of this CryptoKey.
   * @param purpose purpose or {@code null} for none
   */
  public CryptoKey setPurpose(java.lang.String purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * next_rotation_time will be advanced by this period when the service automatically rotates a
   * key. Must be at least 24 hours and at most 876,000 hours. If rotation_period is set,
   * next_rotation_time must also be set. Keys with purpose ENCRYPT_DECRYPT support automatic
   * rotation. For other keys, this field must be omitted.
   * @return value or {@code null} for none
   */
  public String getRotationPeriod() {
    return rotationPeriod;
  }

  /**
   * next_rotation_time will be advanced by this period when the service automatically rotates a
   * key. Must be at least 24 hours and at most 876,000 hours. If rotation_period is set,
   * next_rotation_time must also be set. Keys with purpose ENCRYPT_DECRYPT support automatic
   * rotation. For other keys, this field must be omitted.
   * @param rotationPeriod rotationPeriod or {@code null} for none
   */
  public CryptoKey setRotationPeriod(String rotationPeriod) {
    this.rotationPeriod = rotationPeriod;
    return this;
  }

  /**
   * A template describing settings for new CryptoKeyVersion instances. The properties of new
   * CryptoKeyVersion instances created by either CreateCryptoKeyVersion or auto-rotation are
   * controlled by this template.
   * @return value or {@code null} for none
   */
  public CryptoKeyVersionTemplate getVersionTemplate() {
    return versionTemplate;
  }

  /**
   * A template describing settings for new CryptoKeyVersion instances. The properties of new
   * CryptoKeyVersion instances created by either CreateCryptoKeyVersion or auto-rotation are
   * controlled by this template.
   * @param versionTemplate versionTemplate or {@code null} for none
   */
  public CryptoKey setVersionTemplate(CryptoKeyVersionTemplate versionTemplate) {
    this.versionTemplate = versionTemplate;
    return this;
  }

  @Override
  public CryptoKey set(String fieldName, Object value) {
    return (CryptoKey) super.set(fieldName, value);
  }

  @Override
  public CryptoKey clone() {
    return (CryptoKey) super.clone();
  }

}
