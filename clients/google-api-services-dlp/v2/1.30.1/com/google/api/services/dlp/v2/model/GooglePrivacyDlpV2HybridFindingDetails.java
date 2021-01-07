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

package com.google.api.services.dlp.v2.model;

/**
 * Populate to associate additional data with each finding.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2HybridFindingDetails extends com.google.api.client.json.GenericJson {

  /**
   * Details about the container where the content being inspected is from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2Container containerDetails;

  /**
   * Offset in bytes of the line, from the beginning of the file, where the finding is located.
   * Populate if the item being scanned is only part of a bigger item, such as a shard of a file and
   * you want to track the absolute position of the finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long fileOffset;

  /**
   * Labels to represent user provided metadata about the data being inspected. If configured by the
   * job, some key values may be required. The labels associated with `Finding`'s produced by hybrid
   * inspection. Label keys must be between 1 and 63 characters long and must conform to the
   * following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. Label values must be between 0 and
   * 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
   * No more than 10 labels can be associated with a given finding. Examples: * `"environment" :
   * "production"` * `"pipeline" : "etl"`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Offset of the row for tables. Populate if the row(s) being scanned are part of a bigger dataset
   * and you want to keep track of their absolute position.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long rowOffset;

  /**
   * If the container is a table, additional information to make findings meaningful such as the
   * columns that are primary keys. If not known ahead of time, can also be set within each inspect
   * hybrid call and the two will be merged. Note that identifying_fields will only be stored to
   * BigQuery, and only if the BigQuery action has been included.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2TableOptions tableOptions;

  /**
   * Details about the container where the content being inspected is from.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2Container getContainerDetails() {
    return containerDetails;
  }

  /**
   * Details about the container where the content being inspected is from.
   * @param containerDetails containerDetails or {@code null} for none
   */
  public GooglePrivacyDlpV2HybridFindingDetails setContainerDetails(GooglePrivacyDlpV2Container containerDetails) {
    this.containerDetails = containerDetails;
    return this;
  }

  /**
   * Offset in bytes of the line, from the beginning of the file, where the finding is located.
   * Populate if the item being scanned is only part of a bigger item, such as a shard of a file and
   * you want to track the absolute position of the finding.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFileOffset() {
    return fileOffset;
  }

  /**
   * Offset in bytes of the line, from the beginning of the file, where the finding is located.
   * Populate if the item being scanned is only part of a bigger item, such as a shard of a file and
   * you want to track the absolute position of the finding.
   * @param fileOffset fileOffset or {@code null} for none
   */
  public GooglePrivacyDlpV2HybridFindingDetails setFileOffset(java.lang.Long fileOffset) {
    this.fileOffset = fileOffset;
    return this;
  }

  /**
   * Labels to represent user provided metadata about the data being inspected. If configured by the
   * job, some key values may be required. The labels associated with `Finding`'s produced by hybrid
   * inspection. Label keys must be between 1 and 63 characters long and must conform to the
   * following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. Label values must be between 0 and
   * 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
   * No more than 10 labels can be associated with a given finding. Examples: * `"environment" :
   * "production"` * `"pipeline" : "etl"`
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels to represent user provided metadata about the data being inspected. If configured by the
   * job, some key values may be required. The labels associated with `Finding`'s produced by hybrid
   * inspection. Label keys must be between 1 and 63 characters long and must conform to the
   * following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. Label values must be between 0 and
   * 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
   * No more than 10 labels can be associated with a given finding. Examples: * `"environment" :
   * "production"` * `"pipeline" : "etl"`
   * @param labels labels or {@code null} for none
   */
  public GooglePrivacyDlpV2HybridFindingDetails setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Offset of the row for tables. Populate if the row(s) being scanned are part of a bigger dataset
   * and you want to keep track of their absolute position.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRowOffset() {
    return rowOffset;
  }

  /**
   * Offset of the row for tables. Populate if the row(s) being scanned are part of a bigger dataset
   * and you want to keep track of their absolute position.
   * @param rowOffset rowOffset or {@code null} for none
   */
  public GooglePrivacyDlpV2HybridFindingDetails setRowOffset(java.lang.Long rowOffset) {
    this.rowOffset = rowOffset;
    return this;
  }

  /**
   * If the container is a table, additional information to make findings meaningful such as the
   * columns that are primary keys. If not known ahead of time, can also be set within each inspect
   * hybrid call and the two will be merged. Note that identifying_fields will only be stored to
   * BigQuery, and only if the BigQuery action has been included.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2TableOptions getTableOptions() {
    return tableOptions;
  }

  /**
   * If the container is a table, additional information to make findings meaningful such as the
   * columns that are primary keys. If not known ahead of time, can also be set within each inspect
   * hybrid call and the two will be merged. Note that identifying_fields will only be stored to
   * BigQuery, and only if the BigQuery action has been included.
   * @param tableOptions tableOptions or {@code null} for none
   */
  public GooglePrivacyDlpV2HybridFindingDetails setTableOptions(GooglePrivacyDlpV2TableOptions tableOptions) {
    this.tableOptions = tableOptions;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2HybridFindingDetails set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2HybridFindingDetails) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2HybridFindingDetails clone() {
    return (GooglePrivacyDlpV2HybridFindingDetails) super.clone();
  }

}
