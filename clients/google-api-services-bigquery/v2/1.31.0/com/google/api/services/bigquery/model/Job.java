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

package com.google.api.services.bigquery.model;

/**
 * Model definition for Job.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Job extends com.google.api.client.json.GenericJson {

  /**
   * [Required] Describes the job configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobConfiguration configuration;

  /**
   * [Output-only] A hash of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * [Output-only] Opaque ID field of the job
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * [Optional] Reference describing the unique-per-user name of the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobReference jobReference;

  /**
   * [Output-only] The type of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * [Output-only] A URL that can be used to access this resource again.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output-only] Information about the job, including starting time and ending time of the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobStatistics statistics;

  /**
   * [Output-only] The status of this job. Examine this value when polling an asynchronous job to
   * see if the job is complete.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobStatus status;

  /**
   * [Output-only] Email address of the user who ran the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("user_email")
  private java.lang.String userEmail;

  /**
   * [Required] Describes the job configuration.
   * @return value or {@code null} for none
   */
  public JobConfiguration getConfiguration() {
    return configuration;
  }

  /**
   * [Required] Describes the job configuration.
   * @param configuration configuration or {@code null} for none
   */
  public Job setConfiguration(JobConfiguration configuration) {
    this.configuration = configuration;
    return this;
  }

  /**
   * [Output-only] A hash of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * [Output-only] A hash of this resource.
   * @param etag etag or {@code null} for none
   */
  public Job setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * [Output-only] Opaque ID field of the job
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * [Output-only] Opaque ID field of the job
   * @param id id or {@code null} for none
   */
  public Job setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * [Optional] Reference describing the unique-per-user name of the job.
   * @return value or {@code null} for none
   */
  public JobReference getJobReference() {
    return jobReference;
  }

  /**
   * [Optional] Reference describing the unique-per-user name of the job.
   * @param jobReference jobReference or {@code null} for none
   */
  public Job setJobReference(JobReference jobReference) {
    this.jobReference = jobReference;
    return this;
  }

  /**
   * [Output-only] The type of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output-only] The type of the resource.
   * @param kind kind or {@code null} for none
   */
  public Job setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * [Output-only] A URL that can be used to access this resource again.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output-only] A URL that can be used to access this resource again.
   * @param selfLink selfLink or {@code null} for none
   */
  public Job setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output-only] Information about the job, including starting time and ending time of the job.
   * @return value or {@code null} for none
   */
  public JobStatistics getStatistics() {
    return statistics;
  }

  /**
   * [Output-only] Information about the job, including starting time and ending time of the job.
   * @param statistics statistics or {@code null} for none
   */
  public Job setStatistics(JobStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

  /**
   * [Output-only] The status of this job. Examine this value when polling an asynchronous job to
   * see if the job is complete.
   * @return value or {@code null} for none
   */
  public JobStatus getStatus() {
    return status;
  }

  /**
   * [Output-only] The status of this job. Examine this value when polling an asynchronous job to
   * see if the job is complete.
   * @param status status or {@code null} for none
   */
  public Job setStatus(JobStatus status) {
    this.status = status;
    return this;
  }

  /**
   * [Output-only] Email address of the user who ran the job.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserEmail() {
    return userEmail;
  }

  /**
   * [Output-only] Email address of the user who ran the job.
   * @param userEmail userEmail or {@code null} for none
   */
  public Job setUserEmail(java.lang.String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  @Override
  public Job set(String fieldName, Object value) {
    return (Job) super.set(fieldName, value);
  }

  @Override
  public Job clone() {
    return (Job) super.clone();
  }

}
