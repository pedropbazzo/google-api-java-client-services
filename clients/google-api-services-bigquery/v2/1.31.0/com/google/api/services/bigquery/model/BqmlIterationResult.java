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
 * Model definition for BqmlIterationResult.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BqmlIterationResult extends com.google.api.client.json.GenericJson {

  /**
   * [Output-only, Beta] Time taken to run the training iteration in milliseconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long durationMs;

  /**
   * [Output-only, Beta] Eval loss computed on the eval data at the end of the iteration. The eval
   * loss is used for early stopping to avoid overfitting. No eval loss if eval_split_method option
   * is specified as no_split or auto_split with input data size less than 500 rows.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double evalLoss;

  /**
   * [Output-only, Beta] Index of the ML training iteration, starting from zero for each training
   * run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer index;

  /**
   * [Output-only, Beta] Learning rate used for this iteration, it varies for different training
   * iterations if learn_rate_strategy option is not constant.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double learnRate;

  /**
   * [Output-only, Beta] Training loss computed on the training data at the end of the iteration.
   * The training loss function is defined by model type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double trainingLoss;

  /**
   * [Output-only, Beta] Time taken to run the training iteration in milliseconds.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDurationMs() {
    return durationMs;
  }

  /**
   * [Output-only, Beta] Time taken to run the training iteration in milliseconds.
   * @param durationMs durationMs or {@code null} for none
   */
  public BqmlIterationResult setDurationMs(java.lang.Long durationMs) {
    this.durationMs = durationMs;
    return this;
  }

  /**
   * [Output-only, Beta] Eval loss computed on the eval data at the end of the iteration. The eval
   * loss is used for early stopping to avoid overfitting. No eval loss if eval_split_method option
   * is specified as no_split or auto_split with input data size less than 500 rows.
   * @return value or {@code null} for none
   */
  public java.lang.Double getEvalLoss() {
    return evalLoss;
  }

  /**
   * [Output-only, Beta] Eval loss computed on the eval data at the end of the iteration. The eval
   * loss is used for early stopping to avoid overfitting. No eval loss if eval_split_method option
   * is specified as no_split or auto_split with input data size less than 500 rows.
   * @param evalLoss evalLoss or {@code null} for none
   */
  public BqmlIterationResult setEvalLoss(java.lang.Double evalLoss) {
    this.evalLoss = evalLoss;
    return this;
  }

  /**
   * [Output-only, Beta] Index of the ML training iteration, starting from zero for each training
   * run.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIndex() {
    return index;
  }

  /**
   * [Output-only, Beta] Index of the ML training iteration, starting from zero for each training
   * run.
   * @param index index or {@code null} for none
   */
  public BqmlIterationResult setIndex(java.lang.Integer index) {
    this.index = index;
    return this;
  }

  /**
   * [Output-only, Beta] Learning rate used for this iteration, it varies for different training
   * iterations if learn_rate_strategy option is not constant.
   * @return value or {@code null} for none
   */
  public java.lang.Double getLearnRate() {
    return learnRate;
  }

  /**
   * [Output-only, Beta] Learning rate used for this iteration, it varies for different training
   * iterations if learn_rate_strategy option is not constant.
   * @param learnRate learnRate or {@code null} for none
   */
  public BqmlIterationResult setLearnRate(java.lang.Double learnRate) {
    this.learnRate = learnRate;
    return this;
  }

  /**
   * [Output-only, Beta] Training loss computed on the training data at the end of the iteration.
   * The training loss function is defined by model type.
   * @return value or {@code null} for none
   */
  public java.lang.Double getTrainingLoss() {
    return trainingLoss;
  }

  /**
   * [Output-only, Beta] Training loss computed on the training data at the end of the iteration.
   * The training loss function is defined by model type.
   * @param trainingLoss trainingLoss or {@code null} for none
   */
  public BqmlIterationResult setTrainingLoss(java.lang.Double trainingLoss) {
    this.trainingLoss = trainingLoss;
    return this;
  }

  @Override
  public BqmlIterationResult set(String fieldName, Object value) {
    return (BqmlIterationResult) super.set(fieldName, value);
  }

  @Override
  public BqmlIterationResult clone() {
    return (BqmlIterationResult) super.clone();
  }

}
