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

package com.google.api.services.datalabeling.v1beta1.model;

/**
 * Response used for ExportDataset longrunning operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Data Labeling API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatalabelingV1p2alpha1ExportDataOperationResponse extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The name of annotated dataset in format "projects/datasets/annotatedDatasets".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String annotatedDataset;

  /**
   * Ouptut only. The name of dataset. "projects/datasets"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataset;

  /**
   * Output only. Number of examples exported successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer exportCount;

  /**
   * Output only. Statistic infos of labels in the exported dataset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatalabelingV1p2alpha1LabelStats labelStats;

  /**
   * Output only. output_config in the ExportData request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatalabelingV1p2alpha1OutputConfig outputConfig;

  /**
   * Output only. Total number of examples requested to export
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalCount;

  /**
   * Output only. The name of annotated dataset in format "projects/datasets/annotatedDatasets".
   * @return value or {@code null} for none
   */
  public java.lang.String getAnnotatedDataset() {
    return annotatedDataset;
  }

  /**
   * Output only. The name of annotated dataset in format "projects/datasets/annotatedDatasets".
   * @param annotatedDataset annotatedDataset or {@code null} for none
   */
  public GoogleCloudDatalabelingV1p2alpha1ExportDataOperationResponse setAnnotatedDataset(java.lang.String annotatedDataset) {
    this.annotatedDataset = annotatedDataset;
    return this;
  }

  /**
   * Ouptut only. The name of dataset. "projects/datasets"
   * @return value or {@code null} for none
   */
  public java.lang.String getDataset() {
    return dataset;
  }

  /**
   * Ouptut only. The name of dataset. "projects/datasets"
   * @param dataset dataset or {@code null} for none
   */
  public GoogleCloudDatalabelingV1p2alpha1ExportDataOperationResponse setDataset(java.lang.String dataset) {
    this.dataset = dataset;
    return this;
  }

  /**
   * Output only. Number of examples exported successfully.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getExportCount() {
    return exportCount;
  }

  /**
   * Output only. Number of examples exported successfully.
   * @param exportCount exportCount or {@code null} for none
   */
  public GoogleCloudDatalabelingV1p2alpha1ExportDataOperationResponse setExportCount(java.lang.Integer exportCount) {
    this.exportCount = exportCount;
    return this;
  }

  /**
   * Output only. Statistic infos of labels in the exported dataset.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatalabelingV1p2alpha1LabelStats getLabelStats() {
    return labelStats;
  }

  /**
   * Output only. Statistic infos of labels in the exported dataset.
   * @param labelStats labelStats or {@code null} for none
   */
  public GoogleCloudDatalabelingV1p2alpha1ExportDataOperationResponse setLabelStats(GoogleCloudDatalabelingV1p2alpha1LabelStats labelStats) {
    this.labelStats = labelStats;
    return this;
  }

  /**
   * Output only. output_config in the ExportData request.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatalabelingV1p2alpha1OutputConfig getOutputConfig() {
    return outputConfig;
  }

  /**
   * Output only. output_config in the ExportData request.
   * @param outputConfig outputConfig or {@code null} for none
   */
  public GoogleCloudDatalabelingV1p2alpha1ExportDataOperationResponse setOutputConfig(GoogleCloudDatalabelingV1p2alpha1OutputConfig outputConfig) {
    this.outputConfig = outputConfig;
    return this;
  }

  /**
   * Output only. Total number of examples requested to export
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalCount() {
    return totalCount;
  }

  /**
   * Output only. Total number of examples requested to export
   * @param totalCount totalCount or {@code null} for none
   */
  public GoogleCloudDatalabelingV1p2alpha1ExportDataOperationResponse setTotalCount(java.lang.Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  @Override
  public GoogleCloudDatalabelingV1p2alpha1ExportDataOperationResponse set(String fieldName, Object value) {
    return (GoogleCloudDatalabelingV1p2alpha1ExportDataOperationResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatalabelingV1p2alpha1ExportDataOperationResponse clone() {
    return (GoogleCloudDatalabelingV1p2alpha1ExportDataOperationResponse) super.clone();
  }

}
