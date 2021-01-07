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

package com.google.api.services.healthcare.v1.model;

/**
 * Specifies the filter configuration for DICOM resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DicomFilterConfig extends com.google.api.client.json.GenericJson {

  /**
   * The Cloud Storage location of the filter configuration file. The `gcs_uri` must be in the
   * format `gs://bucket/path/to/object`. The filter configuration file must contain a list of
   * resource paths separated by newline characters (\n or \r\n). Each resource path must be in the
   * format "/studies/{studyUID}[/series/{seriesUID}[/instances/{instanceUID}]]" The Cloud
   * Healthcare API service account must have the `roles/storage.objectViewer` Cloud IAM role for
   * this Cloud Storage location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourcePathsGcsUri;

  /**
   * The Cloud Storage location of the filter configuration file. The `gcs_uri` must be in the
   * format `gs://bucket/path/to/object`. The filter configuration file must contain a list of
   * resource paths separated by newline characters (\n or \r\n). Each resource path must be in the
   * format "/studies/{studyUID}[/series/{seriesUID}[/instances/{instanceUID}]]" The Cloud
   * Healthcare API service account must have the `roles/storage.objectViewer` Cloud IAM role for
   * this Cloud Storage location.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourcePathsGcsUri() {
    return resourcePathsGcsUri;
  }

  /**
   * The Cloud Storage location of the filter configuration file. The `gcs_uri` must be in the
   * format `gs://bucket/path/to/object`. The filter configuration file must contain a list of
   * resource paths separated by newline characters (\n or \r\n). Each resource path must be in the
   * format "/studies/{studyUID}[/series/{seriesUID}[/instances/{instanceUID}]]" The Cloud
   * Healthcare API service account must have the `roles/storage.objectViewer` Cloud IAM role for
   * this Cloud Storage location.
   * @param resourcePathsGcsUri resourcePathsGcsUri or {@code null} for none
   */
  public DicomFilterConfig setResourcePathsGcsUri(java.lang.String resourcePathsGcsUri) {
    this.resourcePathsGcsUri = resourcePathsGcsUri;
    return this;
  }

  @Override
  public DicomFilterConfig set(String fieldName, Object value) {
    return (DicomFilterConfig) super.set(fieldName, value);
  }

  @Override
  public DicomFilterConfig clone() {
    return (DicomFilterConfig) super.clone();
  }

}
