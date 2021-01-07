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
 * Next ID: 15
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
public final class NamespacedDebugInput extends com.google.api.client.json.GenericJson {

  /**
   * Set of experiment names to be absolutely forced. These experiments will be forced without
   * evaluating the conditions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> absolutelyForcedExpNames;

  /**
   * Set of experiment tags to be absolutely forced. The experiments with these tags will be forced
   * without evaluating the conditions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> absolutelyForcedExpTags;

  /**
   * Set of experiment ids to be absolutely forced. These ids will be forced without evaluating the
   * conditions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> absolutelyForcedExps;

  /**
   * Set of experiment names to be conditionally forced. These experiments will be forced only if
   * their conditions and their parent domain's conditions are true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> conditionallyForcedExpNames;

  /**
   * Set of experiment tags to be conditionally forced. The experiments with these tags will be
   * forced only if their conditions and their parent domain's conditions are true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> conditionallyForcedExpTags;

  /**
   * Set of experiment ids to be conditionally forced. These ids will be forced only if their
   * conditions and their parent domain's conditions are true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> conditionallyForcedExps;

  /**
   * If true, disable automatic enrollment selection (at all diversion points). Automatic enrollment
   * selection means experiment selection process based on the experiment's automatic enrollment
   * condition. This does not disable selection of forced experiments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableAutomaticEnrollmentSelection;

  /**
   * Set of experiment names to be disabled. If an experiment is disabled, it is never selected nor
   * forced. If an aggregate experiment is disabled, its partitions are disabled together. If an
   * experiment with an enrollment is disabled, the enrollment is disabled together. If a name
   * corresponds to a domain, the domain itself and all descendant experiments and domains are
   * disabled together.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> disableExpNames;

  /**
   * Set of experiment tags to be disabled. All experiments that are tagged with one or more of
   * these tags are disabled. If an experiment is disabled, it is never selected nor forced. If an
   * aggregate experiment is disabled, its partitions are disabled together. If an experiment with
   * an enrollment is disabled, the enrollment is disabled together.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> disableExpTags;

  /**
   * Set of experiment ids to be disabled. If an experiment is disabled, it is never selected nor
   * forced. If an aggregate experiment is disabled, its partitions are disabled together. If an
   * experiment with an enrollment is disabled, the enrollment is disabled together. If an ID
   * corresponds to a domain, the domain itself and all descendant experiments and domains are
   * disabled together.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> disableExps;

  /**
   * If true, disable manual enrollment selection (at all diversion points). Manual enrollment
   * selection means experiment selection process based on the request's manual enrollment states
   * (a.k.a. opt-in experiments). This does not disable selection of forced experiments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableManualEnrollmentSelection;

  /**
   * If true, disable organic experiment selection (at all diversion points). Organic selection
   * means experiment selection process based on traffic allocation and diversion condition
   * evaluation. This does not disable selection of forced experiments. This is useful in cases when
   * it is not known whether experiment selection behavior is responsible for a error or breakage.
   * Disabling organic selection may help to isolate the cause of a given problem.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableOrganicSelection;

  /**
   * Flags to force in a particular experiment state. Map from flag name to flag value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> forcedFlags;

  /**
   * Rollouts to force in a particular experiment state. Map from rollout name to rollout value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Boolean> forcedRollouts;

  /**
   * Set of experiment names to be absolutely forced. These experiments will be forced without
   * evaluating the conditions.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAbsolutelyForcedExpNames() {
    return absolutelyForcedExpNames;
  }

  /**
   * Set of experiment names to be absolutely forced. These experiments will be forced without
   * evaluating the conditions.
   * @param absolutelyForcedExpNames absolutelyForcedExpNames or {@code null} for none
   */
  public NamespacedDebugInput setAbsolutelyForcedExpNames(java.util.List<java.lang.String> absolutelyForcedExpNames) {
    this.absolutelyForcedExpNames = absolutelyForcedExpNames;
    return this;
  }

  /**
   * Set of experiment tags to be absolutely forced. The experiments with these tags will be forced
   * without evaluating the conditions.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAbsolutelyForcedExpTags() {
    return absolutelyForcedExpTags;
  }

  /**
   * Set of experiment tags to be absolutely forced. The experiments with these tags will be forced
   * without evaluating the conditions.
   * @param absolutelyForcedExpTags absolutelyForcedExpTags or {@code null} for none
   */
  public NamespacedDebugInput setAbsolutelyForcedExpTags(java.util.List<java.lang.String> absolutelyForcedExpTags) {
    this.absolutelyForcedExpTags = absolutelyForcedExpTags;
    return this;
  }

  /**
   * Set of experiment ids to be absolutely forced. These ids will be forced without evaluating the
   * conditions.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getAbsolutelyForcedExps() {
    return absolutelyForcedExps;
  }

  /**
   * Set of experiment ids to be absolutely forced. These ids will be forced without evaluating the
   * conditions.
   * @param absolutelyForcedExps absolutelyForcedExps or {@code null} for none
   */
  public NamespacedDebugInput setAbsolutelyForcedExps(java.util.List<java.lang.Integer> absolutelyForcedExps) {
    this.absolutelyForcedExps = absolutelyForcedExps;
    return this;
  }

  /**
   * Set of experiment names to be conditionally forced. These experiments will be forced only if
   * their conditions and their parent domain's conditions are true.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getConditionallyForcedExpNames() {
    return conditionallyForcedExpNames;
  }

  /**
   * Set of experiment names to be conditionally forced. These experiments will be forced only if
   * their conditions and their parent domain's conditions are true.
   * @param conditionallyForcedExpNames conditionallyForcedExpNames or {@code null} for none
   */
  public NamespacedDebugInput setConditionallyForcedExpNames(java.util.List<java.lang.String> conditionallyForcedExpNames) {
    this.conditionallyForcedExpNames = conditionallyForcedExpNames;
    return this;
  }

  /**
   * Set of experiment tags to be conditionally forced. The experiments with these tags will be
   * forced only if their conditions and their parent domain's conditions are true.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getConditionallyForcedExpTags() {
    return conditionallyForcedExpTags;
  }

  /**
   * Set of experiment tags to be conditionally forced. The experiments with these tags will be
   * forced only if their conditions and their parent domain's conditions are true.
   * @param conditionallyForcedExpTags conditionallyForcedExpTags or {@code null} for none
   */
  public NamespacedDebugInput setConditionallyForcedExpTags(java.util.List<java.lang.String> conditionallyForcedExpTags) {
    this.conditionallyForcedExpTags = conditionallyForcedExpTags;
    return this;
  }

  /**
   * Set of experiment ids to be conditionally forced. These ids will be forced only if their
   * conditions and their parent domain's conditions are true.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getConditionallyForcedExps() {
    return conditionallyForcedExps;
  }

  /**
   * Set of experiment ids to be conditionally forced. These ids will be forced only if their
   * conditions and their parent domain's conditions are true.
   * @param conditionallyForcedExps conditionallyForcedExps or {@code null} for none
   */
  public NamespacedDebugInput setConditionallyForcedExps(java.util.List<java.lang.Integer> conditionallyForcedExps) {
    this.conditionallyForcedExps = conditionallyForcedExps;
    return this;
  }

  /**
   * If true, disable automatic enrollment selection (at all diversion points). Automatic enrollment
   * selection means experiment selection process based on the experiment's automatic enrollment
   * condition. This does not disable selection of forced experiments.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableAutomaticEnrollmentSelection() {
    return disableAutomaticEnrollmentSelection;
  }

  /**
   * If true, disable automatic enrollment selection (at all diversion points). Automatic enrollment
   * selection means experiment selection process based on the experiment's automatic enrollment
   * condition. This does not disable selection of forced experiments.
   * @param disableAutomaticEnrollmentSelection disableAutomaticEnrollmentSelection or {@code null} for none
   */
  public NamespacedDebugInput setDisableAutomaticEnrollmentSelection(java.lang.Boolean disableAutomaticEnrollmentSelection) {
    this.disableAutomaticEnrollmentSelection = disableAutomaticEnrollmentSelection;
    return this;
  }

  /**
   * Set of experiment names to be disabled. If an experiment is disabled, it is never selected nor
   * forced. If an aggregate experiment is disabled, its partitions are disabled together. If an
   * experiment with an enrollment is disabled, the enrollment is disabled together. If a name
   * corresponds to a domain, the domain itself and all descendant experiments and domains are
   * disabled together.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDisableExpNames() {
    return disableExpNames;
  }

  /**
   * Set of experiment names to be disabled. If an experiment is disabled, it is never selected nor
   * forced. If an aggregate experiment is disabled, its partitions are disabled together. If an
   * experiment with an enrollment is disabled, the enrollment is disabled together. If a name
   * corresponds to a domain, the domain itself and all descendant experiments and domains are
   * disabled together.
   * @param disableExpNames disableExpNames or {@code null} for none
   */
  public NamespacedDebugInput setDisableExpNames(java.util.List<java.lang.String> disableExpNames) {
    this.disableExpNames = disableExpNames;
    return this;
  }

  /**
   * Set of experiment tags to be disabled. All experiments that are tagged with one or more of
   * these tags are disabled. If an experiment is disabled, it is never selected nor forced. If an
   * aggregate experiment is disabled, its partitions are disabled together. If an experiment with
   * an enrollment is disabled, the enrollment is disabled together.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDisableExpTags() {
    return disableExpTags;
  }

  /**
   * Set of experiment tags to be disabled. All experiments that are tagged with one or more of
   * these tags are disabled. If an experiment is disabled, it is never selected nor forced. If an
   * aggregate experiment is disabled, its partitions are disabled together. If an experiment with
   * an enrollment is disabled, the enrollment is disabled together.
   * @param disableExpTags disableExpTags or {@code null} for none
   */
  public NamespacedDebugInput setDisableExpTags(java.util.List<java.lang.String> disableExpTags) {
    this.disableExpTags = disableExpTags;
    return this;
  }

  /**
   * Set of experiment ids to be disabled. If an experiment is disabled, it is never selected nor
   * forced. If an aggregate experiment is disabled, its partitions are disabled together. If an
   * experiment with an enrollment is disabled, the enrollment is disabled together. If an ID
   * corresponds to a domain, the domain itself and all descendant experiments and domains are
   * disabled together.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getDisableExps() {
    return disableExps;
  }

  /**
   * Set of experiment ids to be disabled. If an experiment is disabled, it is never selected nor
   * forced. If an aggregate experiment is disabled, its partitions are disabled together. If an
   * experiment with an enrollment is disabled, the enrollment is disabled together. If an ID
   * corresponds to a domain, the domain itself and all descendant experiments and domains are
   * disabled together.
   * @param disableExps disableExps or {@code null} for none
   */
  public NamespacedDebugInput setDisableExps(java.util.List<java.lang.Integer> disableExps) {
    this.disableExps = disableExps;
    return this;
  }

  /**
   * If true, disable manual enrollment selection (at all diversion points). Manual enrollment
   * selection means experiment selection process based on the request's manual enrollment states
   * (a.k.a. opt-in experiments). This does not disable selection of forced experiments.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableManualEnrollmentSelection() {
    return disableManualEnrollmentSelection;
  }

  /**
   * If true, disable manual enrollment selection (at all diversion points). Manual enrollment
   * selection means experiment selection process based on the request's manual enrollment states
   * (a.k.a. opt-in experiments). This does not disable selection of forced experiments.
   * @param disableManualEnrollmentSelection disableManualEnrollmentSelection or {@code null} for none
   */
  public NamespacedDebugInput setDisableManualEnrollmentSelection(java.lang.Boolean disableManualEnrollmentSelection) {
    this.disableManualEnrollmentSelection = disableManualEnrollmentSelection;
    return this;
  }

  /**
   * If true, disable organic experiment selection (at all diversion points). Organic selection
   * means experiment selection process based on traffic allocation and diversion condition
   * evaluation. This does not disable selection of forced experiments. This is useful in cases when
   * it is not known whether experiment selection behavior is responsible for a error or breakage.
   * Disabling organic selection may help to isolate the cause of a given problem.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableOrganicSelection() {
    return disableOrganicSelection;
  }

  /**
   * If true, disable organic experiment selection (at all diversion points). Organic selection
   * means experiment selection process based on traffic allocation and diversion condition
   * evaluation. This does not disable selection of forced experiments. This is useful in cases when
   * it is not known whether experiment selection behavior is responsible for a error or breakage.
   * Disabling organic selection may help to isolate the cause of a given problem.
   * @param disableOrganicSelection disableOrganicSelection or {@code null} for none
   */
  public NamespacedDebugInput setDisableOrganicSelection(java.lang.Boolean disableOrganicSelection) {
    this.disableOrganicSelection = disableOrganicSelection;
    return this;
  }

  /**
   * Flags to force in a particular experiment state. Map from flag name to flag value.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getForcedFlags() {
    return forcedFlags;
  }

  /**
   * Flags to force in a particular experiment state. Map from flag name to flag value.
   * @param forcedFlags forcedFlags or {@code null} for none
   */
  public NamespacedDebugInput setForcedFlags(java.util.Map<String, java.lang.String> forcedFlags) {
    this.forcedFlags = forcedFlags;
    return this;
  }

  /**
   * Rollouts to force in a particular experiment state. Map from rollout name to rollout value.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Boolean> getForcedRollouts() {
    return forcedRollouts;
  }

  /**
   * Rollouts to force in a particular experiment state. Map from rollout name to rollout value.
   * @param forcedRollouts forcedRollouts or {@code null} for none
   */
  public NamespacedDebugInput setForcedRollouts(java.util.Map<String, java.lang.Boolean> forcedRollouts) {
    this.forcedRollouts = forcedRollouts;
    return this;
  }

  @Override
  public NamespacedDebugInput set(String fieldName, Object value) {
    return (NamespacedDebugInput) super.set(fieldName, value);
  }

  @Override
  public NamespacedDebugInput clone() {
    return (NamespacedDebugInput) super.clone();
  }

}
