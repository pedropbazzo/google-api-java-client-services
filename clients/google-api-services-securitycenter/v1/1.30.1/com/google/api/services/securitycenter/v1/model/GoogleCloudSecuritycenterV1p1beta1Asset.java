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

package com.google.api.services.securitycenter.v1.model;

/**
 * Cloud Security Command Center's (Cloud SCC) representation of a Google Cloud Platform (GCP)
 * resource.
 *
 * The Asset is a Cloud SCC resource that captures information about a single GCP resource. All
 * modifications to an Asset are only within the context of Cloud SCC and don't affect the
 * referenced GCP resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudSecuritycenterV1p1beta1Asset extends com.google.api.client.json.GenericJson {

  /**
   * The time at which the asset was created in Cloud SCC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * IAM Policy information associated with the GCP resource described by the Cloud SCC asset. This
   * information is managed and defined by the GCP resource and cannot be modified by the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudSecuritycenterV1p1beta1IamPolicy iamPolicy;

  /**
   * The relative resource name of this asset. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
   * "organizations/{organization_id}/assets/{asset_id}".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Resource managed properties. These properties are managed and defined by the GCP resource and
   * cannot be modified by the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> resourceProperties;

  /**
   * Cloud SCC managed properties. These properties are managed by Cloud SCC and cannot be modified
   * by the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudSecuritycenterV1p1beta1SecurityCenterProperties securityCenterProperties;

  /**
   * User specified security marks. These marks are entirely managed by the user and come from the
   * SecurityMarks resource that belongs to the asset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudSecuritycenterV1p1beta1SecurityMarks securityMarks;

  /**
   * The time at which the asset was last updated, added, or deleted in Cloud SCC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The time at which the asset was created in Cloud SCC.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time at which the asset was created in Cloud SCC.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1Asset setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * IAM Policy information associated with the GCP resource described by the Cloud SCC asset. This
   * information is managed and defined by the GCP resource and cannot be modified by the user.
   * @return value or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1IamPolicy getIamPolicy() {
    return iamPolicy;
  }

  /**
   * IAM Policy information associated with the GCP resource described by the Cloud SCC asset. This
   * information is managed and defined by the GCP resource and cannot be modified by the user.
   * @param iamPolicy iamPolicy or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1Asset setIamPolicy(GoogleCloudSecuritycenterV1p1beta1IamPolicy iamPolicy) {
    this.iamPolicy = iamPolicy;
    return this;
  }

  /**
   * The relative resource name of this asset. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
   * "organizations/{organization_id}/assets/{asset_id}".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The relative resource name of this asset. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
   * "organizations/{organization_id}/assets/{asset_id}".
   * @param name name or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1Asset setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Resource managed properties. These properties are managed and defined by the GCP resource and
   * cannot be modified by the user.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getResourceProperties() {
    return resourceProperties;
  }

  /**
   * Resource managed properties. These properties are managed and defined by the GCP resource and
   * cannot be modified by the user.
   * @param resourceProperties resourceProperties or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1Asset setResourceProperties(java.util.Map<String, java.lang.Object> resourceProperties) {
    this.resourceProperties = resourceProperties;
    return this;
  }

  /**
   * Cloud SCC managed properties. These properties are managed by Cloud SCC and cannot be modified
   * by the user.
   * @return value or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1SecurityCenterProperties getSecurityCenterProperties() {
    return securityCenterProperties;
  }

  /**
   * Cloud SCC managed properties. These properties are managed by Cloud SCC and cannot be modified
   * by the user.
   * @param securityCenterProperties securityCenterProperties or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1Asset setSecurityCenterProperties(GoogleCloudSecuritycenterV1p1beta1SecurityCenterProperties securityCenterProperties) {
    this.securityCenterProperties = securityCenterProperties;
    return this;
  }

  /**
   * User specified security marks. These marks are entirely managed by the user and come from the
   * SecurityMarks resource that belongs to the asset.
   * @return value or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1SecurityMarks getSecurityMarks() {
    return securityMarks;
  }

  /**
   * User specified security marks. These marks are entirely managed by the user and come from the
   * SecurityMarks resource that belongs to the asset.
   * @param securityMarks securityMarks or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1Asset setSecurityMarks(GoogleCloudSecuritycenterV1p1beta1SecurityMarks securityMarks) {
    this.securityMarks = securityMarks;
    return this;
  }

  /**
   * The time at which the asset was last updated, added, or deleted in Cloud SCC.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The time at which the asset was last updated, added, or deleted in Cloud SCC.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1Asset setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudSecuritycenterV1p1beta1Asset set(String fieldName, Object value) {
    return (GoogleCloudSecuritycenterV1p1beta1Asset) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSecuritycenterV1p1beta1Asset clone() {
    return (GoogleCloudSecuritycenterV1p1beta1Asset) super.clone();
  }

}
