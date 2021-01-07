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

package com.google.api.services.artifactregistry.v1beta2.model;

/**
 * Files store content that is potentially associated with Packages or Versions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Artifact Registry API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class File extends com.google.api.client.json.GenericJson {

  /**
   * The time when the File was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The hashes of the file content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Hash> hashes;

  /**
   * The name of the file, for example: "projects/p1/locations/us-
   * central1/repositories/repo1/files/a/b/c.txt".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The name of the Package or Version that owns this file, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String owner;

  /**
   * The size of the File in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long sizeBytes;

  /**
   * The time when the File was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The time when the File was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time when the File was created.
   * @param createTime createTime or {@code null} for none
   */
  public File setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The hashes of the file content.
   * @return value or {@code null} for none
   */
  public java.util.List<Hash> getHashes() {
    return hashes;
  }

  /**
   * The hashes of the file content.
   * @param hashes hashes or {@code null} for none
   */
  public File setHashes(java.util.List<Hash> hashes) {
    this.hashes = hashes;
    return this;
  }

  /**
   * The name of the file, for example: "projects/p1/locations/us-
   * central1/repositories/repo1/files/a/b/c.txt".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the file, for example: "projects/p1/locations/us-
   * central1/repositories/repo1/files/a/b/c.txt".
   * @param name name or {@code null} for none
   */
  public File setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the Package or Version that owns this file, if any.
   * @return value or {@code null} for none
   */
  public java.lang.String getOwner() {
    return owner;
  }

  /**
   * The name of the Package or Version that owns this file, if any.
   * @param owner owner or {@code null} for none
   */
  public File setOwner(java.lang.String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * The size of the File in bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSizeBytes() {
    return sizeBytes;
  }

  /**
   * The size of the File in bytes.
   * @param sizeBytes sizeBytes or {@code null} for none
   */
  public File setSizeBytes(java.lang.Long sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

  /**
   * The time when the File was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The time when the File was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public File setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public File set(String fieldName, Object value) {
    return (File) super.set(fieldName, value);
  }

  @Override
  public File clone() {
    return (File) super.clone();
  }

}
