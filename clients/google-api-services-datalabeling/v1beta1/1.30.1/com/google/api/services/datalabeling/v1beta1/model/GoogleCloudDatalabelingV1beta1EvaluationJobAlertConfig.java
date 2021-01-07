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
 * Provides details for how an evaluation job sends email alerts based on the results of a run.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Data Labeling API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. An email address to send alerts to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * Required. A number between 0 and 1 that describes a minimum mean average precision threshold.
   * When the evaluation job runs, if it calculates that your model version's predictions from the
   * recent interval have meanAveragePrecision below this threshold, then it sends an alert to your
   * specified email.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double minAcceptableMeanAveragePrecision;

  /**
   * Required. An email address to send alerts to.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * Required. An email address to send alerts to.
   * @param email email or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * Required. A number between 0 and 1 that describes a minimum mean average precision threshold.
   * When the evaluation job runs, if it calculates that your model version's predictions from the
   * recent interval have meanAveragePrecision below this threshold, then it sends an alert to your
   * specified email.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMinAcceptableMeanAveragePrecision() {
    return minAcceptableMeanAveragePrecision;
  }

  /**
   * Required. A number between 0 and 1 that describes a minimum mean average precision threshold.
   * When the evaluation job runs, if it calculates that your model version's predictions from the
   * recent interval have meanAveragePrecision below this threshold, then it sends an alert to your
   * specified email.
   * @param minAcceptableMeanAveragePrecision minAcceptableMeanAveragePrecision or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig setMinAcceptableMeanAveragePrecision(java.lang.Double minAcceptableMeanAveragePrecision) {
    this.minAcceptableMeanAveragePrecision = minAcceptableMeanAveragePrecision;
    return this;
  }

  @Override
  public GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig set(String fieldName, Object value) {
    return (GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig clone() {
    return (GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig) super.clone();
  }

}
