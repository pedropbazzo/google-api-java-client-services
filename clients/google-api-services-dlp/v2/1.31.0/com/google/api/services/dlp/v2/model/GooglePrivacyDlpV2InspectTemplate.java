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
 * The inspectTemplate contains a configuration (set of types of sensitive data to be detected) to
 * be used anywhere you otherwise would normally specify InspectConfig. See
 * https://cloud.google.com/dlp/docs/concepts-templates to learn more.
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
public final class GooglePrivacyDlpV2InspectTemplate extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The creation timestamp of an inspectTemplate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Short description (max 256 chars).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Display name (max 256 chars).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The core content of the template. Configuration of the scanning process.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2InspectConfig inspectConfig;

  /**
   * Output only. The template name. The template will have one of the following formats:
   * `projects/PROJECT_ID/inspectTemplates/TEMPLATE_ID` OR
   * `organizations/ORGANIZATION_ID/inspectTemplates/TEMPLATE_ID`;
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The last update timestamp of an inspectTemplate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The creation timestamp of an inspectTemplate.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The creation timestamp of an inspectTemplate.
   * @param createTime createTime or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectTemplate setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Short description (max 256 chars).
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Short description (max 256 chars).
   * @param description description or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectTemplate setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Display name (max 256 chars).
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Display name (max 256 chars).
   * @param displayName displayName or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectTemplate setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The core content of the template. Configuration of the scanning process.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectConfig getInspectConfig() {
    return inspectConfig;
  }

  /**
   * The core content of the template. Configuration of the scanning process.
   * @param inspectConfig inspectConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectTemplate setInspectConfig(GooglePrivacyDlpV2InspectConfig inspectConfig) {
    this.inspectConfig = inspectConfig;
    return this;
  }

  /**
   * Output only. The template name. The template will have one of the following formats:
   * `projects/PROJECT_ID/inspectTemplates/TEMPLATE_ID` OR
   * `organizations/ORGANIZATION_ID/inspectTemplates/TEMPLATE_ID`;
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The template name. The template will have one of the following formats:
   * `projects/PROJECT_ID/inspectTemplates/TEMPLATE_ID` OR
   * `organizations/ORGANIZATION_ID/inspectTemplates/TEMPLATE_ID`;
   * @param name name or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectTemplate setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The last update timestamp of an inspectTemplate.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last update timestamp of an inspectTemplate.
   * @param updateTime updateTime or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectTemplate setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2InspectTemplate set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2InspectTemplate) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2InspectTemplate clone() {
    return (GooglePrivacyDlpV2InspectTemplate) super.clone();
  }

}
