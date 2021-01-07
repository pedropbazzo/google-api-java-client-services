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

package com.google.api.services.cloudasset.v1p5beta1.model;

/**
 * A representation of a Google Cloud resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Resource extends com.google.api.client.json.GenericJson {

  /**
   * The content of the resource, in which some sensitive fields are removed and may not be present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> data;

  /**
   * The URL of the discovery document containing the resource's JSON schema. Example:
   * `https://www.googleapis.com/discovery/v1/apis/compute/v1/rest` This value is unspecified for
   * resources that do not have an API based on a discovery document, such as Cloud Bigtable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String discoveryDocumentUri;

  /**
   * The JSON schema name listed in the discovery document. Example: `Project` This value is
   * unspecified for resources that do not have an API based on a discovery document, such as Cloud
   * Bigtable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String discoveryName;

  /**
   * The full name of the immediate parent of this resource. See [Resource
   * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more
   * information. For Google Cloud assets, this value is the parent resource defined in the [Cloud
   * IAM policy hierarchy](https://cloud.google.com/iam/docs/overview#policy_hierarchy). Example:
   * `//cloudresourcemanager.googleapis.com/projects/my_project_123` For third-party assets, this
   * field may be set differently.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * The REST URL for accessing the resource. An HTTP `GET` request using this URL returns the
   * resource itself. Example: `https://cloudresourcemanager.googleapis.com/v1/projects/my-
   * project-123` This value is unspecified for resources without a REST API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceUrl;

  /**
   * The API version. Example: "v1".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * The content of the resource, in which some sensitive fields are removed and may not be present.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getData() {
    return data;
  }

  /**
   * The content of the resource, in which some sensitive fields are removed and may not be present.
   * @param data data or {@code null} for none
   */
  public Resource setData(java.util.Map<String, java.lang.Object> data) {
    this.data = data;
    return this;
  }

  /**
   * The URL of the discovery document containing the resource's JSON schema. Example:
   * `https://www.googleapis.com/discovery/v1/apis/compute/v1/rest` This value is unspecified for
   * resources that do not have an API based on a discovery document, such as Cloud Bigtable.
   * @return value or {@code null} for none
   */
  public java.lang.String getDiscoveryDocumentUri() {
    return discoveryDocumentUri;
  }

  /**
   * The URL of the discovery document containing the resource's JSON schema. Example:
   * `https://www.googleapis.com/discovery/v1/apis/compute/v1/rest` This value is unspecified for
   * resources that do not have an API based on a discovery document, such as Cloud Bigtable.
   * @param discoveryDocumentUri discoveryDocumentUri or {@code null} for none
   */
  public Resource setDiscoveryDocumentUri(java.lang.String discoveryDocumentUri) {
    this.discoveryDocumentUri = discoveryDocumentUri;
    return this;
  }

  /**
   * The JSON schema name listed in the discovery document. Example: `Project` This value is
   * unspecified for resources that do not have an API based on a discovery document, such as Cloud
   * Bigtable.
   * @return value or {@code null} for none
   */
  public java.lang.String getDiscoveryName() {
    return discoveryName;
  }

  /**
   * The JSON schema name listed in the discovery document. Example: `Project` This value is
   * unspecified for resources that do not have an API based on a discovery document, such as Cloud
   * Bigtable.
   * @param discoveryName discoveryName or {@code null} for none
   */
  public Resource setDiscoveryName(java.lang.String discoveryName) {
    this.discoveryName = discoveryName;
    return this;
  }

  /**
   * The full name of the immediate parent of this resource. See [Resource
   * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more
   * information. For Google Cloud assets, this value is the parent resource defined in the [Cloud
   * IAM policy hierarchy](https://cloud.google.com/iam/docs/overview#policy_hierarchy). Example:
   * `//cloudresourcemanager.googleapis.com/projects/my_project_123` For third-party assets, this
   * field may be set differently.
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * The full name of the immediate parent of this resource. See [Resource
   * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more
   * information. For Google Cloud assets, this value is the parent resource defined in the [Cloud
   * IAM policy hierarchy](https://cloud.google.com/iam/docs/overview#policy_hierarchy). Example:
   * `//cloudresourcemanager.googleapis.com/projects/my_project_123` For third-party assets, this
   * field may be set differently.
   * @param parent parent or {@code null} for none
   */
  public Resource setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * The REST URL for accessing the resource. An HTTP `GET` request using this URL returns the
   * resource itself. Example: `https://cloudresourcemanager.googleapis.com/v1/projects/my-
   * project-123` This value is unspecified for resources without a REST API.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceUrl() {
    return resourceUrl;
  }

  /**
   * The REST URL for accessing the resource. An HTTP `GET` request using this URL returns the
   * resource itself. Example: `https://cloudresourcemanager.googleapis.com/v1/projects/my-
   * project-123` This value is unspecified for resources without a REST API.
   * @param resourceUrl resourceUrl or {@code null} for none
   */
  public Resource setResourceUrl(java.lang.String resourceUrl) {
    this.resourceUrl = resourceUrl;
    return this;
  }

  /**
   * The API version. Example: "v1".
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * The API version. Example: "v1".
   * @param version version or {@code null} for none
   */
  public Resource setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public Resource set(String fieldName, Object value) {
    return (Resource) super.set(fieldName, value);
  }

  @Override
  public Resource clone() {
    return (Resource) super.clone();
  }

}
