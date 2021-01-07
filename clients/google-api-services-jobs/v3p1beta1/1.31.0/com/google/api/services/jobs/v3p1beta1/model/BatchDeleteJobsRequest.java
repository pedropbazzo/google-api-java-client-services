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

package com.google.api.services.jobs.v3p1beta1.model;

/**
 * Input only. Batch delete jobs request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchDeleteJobsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The filter string specifies the jobs to be deleted. Supported operator: =, AND The
   * fields eligible for filtering are: * `companyName` (Required) * `requisitionId` (Required)
   * Sample Query: companyName = "projects/api-test-project/companies/123" AND requisitionId =
   * "req-1"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * Required. The filter string specifies the jobs to be deleted. Supported operator: =, AND The
   * fields eligible for filtering are: * `companyName` (Required) * `requisitionId` (Required)
   * Sample Query: companyName = "projects/api-test-project/companies/123" AND requisitionId =
   * "req-1"
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Required. The filter string specifies the jobs to be deleted. Supported operator: =, AND The
   * fields eligible for filtering are: * `companyName` (Required) * `requisitionId` (Required)
   * Sample Query: companyName = "projects/api-test-project/companies/123" AND requisitionId =
   * "req-1"
   * @param filter filter or {@code null} for none
   */
  public BatchDeleteJobsRequest setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  @Override
  public BatchDeleteJobsRequest set(String fieldName, Object value) {
    return (BatchDeleteJobsRequest) super.set(fieldName, value);
  }

  @Override
  public BatchDeleteJobsRequest clone() {
    return (BatchDeleteJobsRequest) super.clone();
  }

}
