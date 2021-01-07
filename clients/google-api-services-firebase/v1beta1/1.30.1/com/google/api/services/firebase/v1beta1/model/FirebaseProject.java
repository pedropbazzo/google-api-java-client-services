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

package com.google.api.services.firebase.v1beta1.model;

/**
 * A `FirebaseProject` is the top-level Firebase entity. It is the container for Firebase Apps,
 * Firebase Hosting sites, storage systems (Firebase Realtime Database, Cloud Firestore, Cloud
 * Storage buckets), and other Firebase and Google Cloud Platform (GCP) resources. You create a
 * `FirebaseProject` by calling AddFirebase and specifying an *existing* [GCP
 * `Project`](https://cloud.google.com/resource-manager/reference/rest/v1/projects). This adds
 * Firebase resources to the existing GCP `Project`. Since a FirebaseProject is actually also a GCP
 * `Project`, a `FirebaseProject` has the same underlying GCP identifiers (`projectNumber` and
 * `projectId`). This allows for easy interop with Google APIs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FirebaseProject extends com.google.api.client.json.GenericJson {

  /**
   * The user-assigned display name of the Project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The resource name of the Project, in the format: projects/PROJECT_IDENTIFIER
   * PROJECT_IDENTIFIER: the Project's
   * [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its
   * [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project
   * identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the
   * value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Immutable. A user-assigned unique identifier for the Project. This identifier may appear in
   * URLs or names for some Firebase resources associated with the Project, but it should generally
   * be treated as a convenience alias to reference the Project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Immutable. The globally unique, Google-assigned canonical identifier for the Project. Use this
   * identifier when configuring integrations and/or making API calls to Firebase or third-party
   * services.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long projectNumber;

  /**
   * The default Firebase resources associated with the Project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DefaultResources resources;

  /**
   * Output only. The lifecycle state of the Project. Updates to the state must be performed via
   * com.google.cloudresourcemanager.v1.Projects.DeleteProject and
   * com.google.cloudresourcemanager.v1.Projects.UndeleteProject
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The user-assigned display name of the Project.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The user-assigned display name of the Project.
   * @param displayName displayName or {@code null} for none
   */
  public FirebaseProject setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The resource name of the Project, in the format: projects/PROJECT_IDENTIFIER
   * PROJECT_IDENTIFIER: the Project's
   * [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its
   * [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project
   * identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the
   * value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the Project, in the format: projects/PROJECT_IDENTIFIER
   * PROJECT_IDENTIFIER: the Project's
   * [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its
   * [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project
   * identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the
   * value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`.
   * @param name name or {@code null} for none
   */
  public FirebaseProject setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Immutable. A user-assigned unique identifier for the Project. This identifier may appear in
   * URLs or names for some Firebase resources associated with the Project, but it should generally
   * be treated as a convenience alias to reference the Project.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Immutable. A user-assigned unique identifier for the Project. This identifier may appear in
   * URLs or names for some Firebase resources associated with the Project, but it should generally
   * be treated as a convenience alias to reference the Project.
   * @param projectId projectId or {@code null} for none
   */
  public FirebaseProject setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Immutable. The globally unique, Google-assigned canonical identifier for the Project. Use this
   * identifier when configuring integrations and/or making API calls to Firebase or third-party
   * services.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProjectNumber() {
    return projectNumber;
  }

  /**
   * Immutable. The globally unique, Google-assigned canonical identifier for the Project. Use this
   * identifier when configuring integrations and/or making API calls to Firebase or third-party
   * services.
   * @param projectNumber projectNumber or {@code null} for none
   */
  public FirebaseProject setProjectNumber(java.lang.Long projectNumber) {
    this.projectNumber = projectNumber;
    return this;
  }

  /**
   * The default Firebase resources associated with the Project.
   * @return value or {@code null} for none
   */
  public DefaultResources getResources() {
    return resources;
  }

  /**
   * The default Firebase resources associated with the Project.
   * @param resources resources or {@code null} for none
   */
  public FirebaseProject setResources(DefaultResources resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Output only. The lifecycle state of the Project. Updates to the state must be performed via
   * com.google.cloudresourcemanager.v1.Projects.DeleteProject and
   * com.google.cloudresourcemanager.v1.Projects.UndeleteProject
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The lifecycle state of the Project. Updates to the state must be performed via
   * com.google.cloudresourcemanager.v1.Projects.DeleteProject and
   * com.google.cloudresourcemanager.v1.Projects.UndeleteProject
   * @param state state or {@code null} for none
   */
  public FirebaseProject setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public FirebaseProject set(String fieldName, Object value) {
    return (FirebaseProject) super.set(fieldName, value);
  }

  @Override
  public FirebaseProject clone() {
    return (FirebaseProject) super.clone();
  }

}
