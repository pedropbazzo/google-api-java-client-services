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

package com.google.api.services.workflows.v1beta.model;

/**
 * Workflow program to be executed by Workflows.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Workflows API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Workflow extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The timestamp of when the workflow was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Labels associated with this workflow. Labels can contain at most 64 entries. Keys and values
   * can be no longer than 63 characters and can only contain lowercase letters, numeric characters,
   * underscores and dashes. Label keys must start with a letter. International characters are
   * allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The resource name of the workflow. Format:
   * projects/{project}/locations/{location}/workflows/{workflow}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The timestamp that the latest revision of the workflow was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String revisionCreateTime;

  /**
   * Output only. The revision of the workflow. A new revision of a workflow is created as a result
   * of updating the following fields of a workflow: - `source_code` - `service_account` The format
   * is "000001-a4d", where the first 6 characters define the zero-padded revision ordinal number.
   * They are followed by a hyphen and 3 hexadecimal random characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revisionId;

  /**
   * Name of the service account associated with the latest workflow version. This service account
   * represents the identity of the workflow and determines what permissions the workflow has.
   * Format: projects/{project}/serviceAccounts/{account} Using `-` as a wildcard for the
   * `{project}` will infer the project from the account. The `{account}` value can be the `email`
   * address or the `unique_id` of the service account. If not provided, workflow will use the
   * project's default service account. Modifying this field for an existing workflow results in a
   * new workflow revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Workflow code to be executed. The size limit is 32KB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceContents;

  /**
   * Output only. State of the workflow deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The last update timestamp of the workflow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The timestamp of when the workflow was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The timestamp of when the workflow was created.
   * @param createTime createTime or {@code null} for none
   */
  public Workflow setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
   * @param description description or {@code null} for none
   */
  public Workflow setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Labels associated with this workflow. Labels can contain at most 64 entries. Keys and values
   * can be no longer than 63 characters and can only contain lowercase letters, numeric characters,
   * underscores and dashes. Label keys must start with a letter. International characters are
   * allowed.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels associated with this workflow. Labels can contain at most 64 entries. Keys and values
   * can be no longer than 63 characters and can only contain lowercase letters, numeric characters,
   * underscores and dashes. Label keys must start with a letter. International characters are
   * allowed.
   * @param labels labels or {@code null} for none
   */
  public Workflow setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The resource name of the workflow. Format:
   * projects/{project}/locations/{location}/workflows/{workflow}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the workflow. Format:
   * projects/{project}/locations/{location}/workflows/{workflow}
   * @param name name or {@code null} for none
   */
  public Workflow setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The timestamp that the latest revision of the workflow was created.
   * @return value or {@code null} for none
   */
  public String getRevisionCreateTime() {
    return revisionCreateTime;
  }

  /**
   * Output only. The timestamp that the latest revision of the workflow was created.
   * @param revisionCreateTime revisionCreateTime or {@code null} for none
   */
  public Workflow setRevisionCreateTime(String revisionCreateTime) {
    this.revisionCreateTime = revisionCreateTime;
    return this;
  }

  /**
   * Output only. The revision of the workflow. A new revision of a workflow is created as a result
   * of updating the following fields of a workflow: - `source_code` - `service_account` The format
   * is "000001-a4d", where the first 6 characters define the zero-padded revision ordinal number.
   * They are followed by a hyphen and 3 hexadecimal random characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getRevisionId() {
    return revisionId;
  }

  /**
   * Output only. The revision of the workflow. A new revision of a workflow is created as a result
   * of updating the following fields of a workflow: - `source_code` - `service_account` The format
   * is "000001-a4d", where the first 6 characters define the zero-padded revision ordinal number.
   * They are followed by a hyphen and 3 hexadecimal random characters.
   * @param revisionId revisionId or {@code null} for none
   */
  public Workflow setRevisionId(java.lang.String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  /**
   * Name of the service account associated with the latest workflow version. This service account
   * represents the identity of the workflow and determines what permissions the workflow has.
   * Format: projects/{project}/serviceAccounts/{account} Using `-` as a wildcard for the
   * `{project}` will infer the project from the account. The `{account}` value can be the `email`
   * address or the `unique_id` of the service account. If not provided, workflow will use the
   * project's default service account. Modifying this field for an existing workflow results in a
   * new workflow revision.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * Name of the service account associated with the latest workflow version. This service account
   * represents the identity of the workflow and determines what permissions the workflow has.
   * Format: projects/{project}/serviceAccounts/{account} Using `-` as a wildcard for the
   * `{project}` will infer the project from the account. The `{account}` value can be the `email`
   * address or the `unique_id` of the service account. If not provided, workflow will use the
   * project's default service account. Modifying this field for an existing workflow results in a
   * new workflow revision.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public Workflow setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Workflow code to be executed. The size limit is 32KB.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceContents() {
    return sourceContents;
  }

  /**
   * Workflow code to be executed. The size limit is 32KB.
   * @param sourceContents sourceContents or {@code null} for none
   */
  public Workflow setSourceContents(java.lang.String sourceContents) {
    this.sourceContents = sourceContents;
    return this;
  }

  /**
   * Output only. State of the workflow deployment.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of the workflow deployment.
   * @param state state or {@code null} for none
   */
  public Workflow setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The last update timestamp of the workflow.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last update timestamp of the workflow.
   * @param updateTime updateTime or {@code null} for none
   */
  public Workflow setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Workflow set(String fieldName, Object value) {
    return (Workflow) super.set(fieldName, value);
  }

  @Override
  public Workflow clone() {
    return (Workflow) super.clone();
  }

}
