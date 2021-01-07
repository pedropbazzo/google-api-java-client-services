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

package com.google.api.services.cloudbuild.v1alpha2.model;

/**
 * An artifact that was uploaded during a build. This is a single record in the artifact manifest
 * JSON file.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ArtifactResult extends com.google.api.client.json.GenericJson {

  /**
   * The file hash of the artifact.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FileHashes> fileHash;

  /**
   * The path of an artifact in a Google Cloud Storage bucket, with the generation number. For
   * example, `gs://mybucket/path/to/output.jar#generation`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * The file hash of the artifact.
   * @return value or {@code null} for none
   */
  public java.util.List<FileHashes> getFileHash() {
    return fileHash;
  }

  /**
   * The file hash of the artifact.
   * @param fileHash fileHash or {@code null} for none
   */
  public ArtifactResult setFileHash(java.util.List<FileHashes> fileHash) {
    this.fileHash = fileHash;
    return this;
  }

  /**
   * The path of an artifact in a Google Cloud Storage bucket, with the generation number. For
   * example, `gs://mybucket/path/to/output.jar#generation`.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * The path of an artifact in a Google Cloud Storage bucket, with the generation number. For
   * example, `gs://mybucket/path/to/output.jar#generation`.
   * @param location location or {@code null} for none
   */
  public ArtifactResult setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  @Override
  public ArtifactResult set(String fieldName, Object value) {
    return (ArtifactResult) super.set(fieldName, value);
  }

  @Override
  public ArtifactResult clone() {
    return (ArtifactResult) super.clone();
  }

}
