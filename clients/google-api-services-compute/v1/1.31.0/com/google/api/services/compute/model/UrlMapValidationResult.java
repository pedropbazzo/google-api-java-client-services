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

package com.google.api.services.compute.model;

/**
 * Message representing the validation result for a UrlMap.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UrlMapValidationResult extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> loadErrors;

  /**
   * Whether the given UrlMap can be successfully loaded. If false, 'loadErrors' indicates the
   * reasons.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean loadSucceeded;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TestFailure> testFailures;

  static {
    // hack to force ProGuard to consider TestFailure used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(TestFailure.class);
  }

  /**
   * If successfully loaded, this field indicates whether the test passed. If false, 'testFailures's
   * indicate the reason of failure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean testPassed;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLoadErrors() {
    return loadErrors;
  }

  /**
   * @param loadErrors loadErrors or {@code null} for none
   */
  public UrlMapValidationResult setLoadErrors(java.util.List<java.lang.String> loadErrors) {
    this.loadErrors = loadErrors;
    return this;
  }

  /**
   * Whether the given UrlMap can be successfully loaded. If false, 'loadErrors' indicates the
   * reasons.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLoadSucceeded() {
    return loadSucceeded;
  }

  /**
   * Whether the given UrlMap can be successfully loaded. If false, 'loadErrors' indicates the
   * reasons.
   * @param loadSucceeded loadSucceeded or {@code null} for none
   */
  public UrlMapValidationResult setLoadSucceeded(java.lang.Boolean loadSucceeded) {
    this.loadSucceeded = loadSucceeded;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<TestFailure> getTestFailures() {
    return testFailures;
  }

  /**
   * @param testFailures testFailures or {@code null} for none
   */
  public UrlMapValidationResult setTestFailures(java.util.List<TestFailure> testFailures) {
    this.testFailures = testFailures;
    return this;
  }

  /**
   * If successfully loaded, this field indicates whether the test passed. If false, 'testFailures's
   * indicate the reason of failure.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTestPassed() {
    return testPassed;
  }

  /**
   * If successfully loaded, this field indicates whether the test passed. If false, 'testFailures's
   * indicate the reason of failure.
   * @param testPassed testPassed or {@code null} for none
   */
  public UrlMapValidationResult setTestPassed(java.lang.Boolean testPassed) {
    this.testPassed = testPassed;
    return this;
  }

  @Override
  public UrlMapValidationResult set(String fieldName, Object value) {
    return (UrlMapValidationResult) super.set(fieldName, value);
  }

  @Override
  public UrlMapValidationResult clone() {
    return (UrlMapValidationResult) super.clone();
  }

}
