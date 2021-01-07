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

package com.google.api.services.alertcenter.v1beta1.model;

/**
 * Alerts that get triggered on violations of Data Loss Prevention (DLP) rules.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Workspace Alert Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DlpRuleViolation extends com.google.api.client.json.GenericJson {

  /**
   * Details about the violated DLP rule. Admins can use the predefined detectors provided by Google
   * Cloud DLP https://cloud.google.com/dlp/ when setting up a DLP rule. Matched Cloud DLP detectors
   * in this violation if any will be captured in the MatchInfo.predefined_detector.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RuleViolationInfo ruleViolationInfo;

  /**
   * Details about the violated DLP rule. Admins can use the predefined detectors provided by Google
   * Cloud DLP https://cloud.google.com/dlp/ when setting up a DLP rule. Matched Cloud DLP detectors
   * in this violation if any will be captured in the MatchInfo.predefined_detector.
   * @return value or {@code null} for none
   */
  public RuleViolationInfo getRuleViolationInfo() {
    return ruleViolationInfo;
  }

  /**
   * Details about the violated DLP rule. Admins can use the predefined detectors provided by Google
   * Cloud DLP https://cloud.google.com/dlp/ when setting up a DLP rule. Matched Cloud DLP detectors
   * in this violation if any will be captured in the MatchInfo.predefined_detector.
   * @param ruleViolationInfo ruleViolationInfo or {@code null} for none
   */
  public DlpRuleViolation setRuleViolationInfo(RuleViolationInfo ruleViolationInfo) {
    this.ruleViolationInfo = ruleViolationInfo;
    return this;
  }

  @Override
  public DlpRuleViolation set(String fieldName, Object value) {
    return (DlpRuleViolation) super.set(fieldName, value);
  }

  @Override
  public DlpRuleViolation clone() {
    return (DlpRuleViolation) super.clone();
  }

}
