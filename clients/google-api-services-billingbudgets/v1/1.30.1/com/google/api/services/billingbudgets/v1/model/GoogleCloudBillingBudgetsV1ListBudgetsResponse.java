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

package com.google.api.services.billingbudgets.v1.model;

/**
 * Response for ListBudgets
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Billing Budget API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudBillingBudgetsV1ListBudgetsResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of the budgets owned by the requested billing account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudBillingBudgetsV1Budget> budgets;

  static {
    // hack to force ProGuard to consider GoogleCloudBillingBudgetsV1Budget used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudBillingBudgetsV1Budget.class);
  }

  /**
   * If not empty, indicates that there may be more budgets that match the request; this value
   * should be passed in a new `ListBudgetsRequest`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of the budgets owned by the requested billing account.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudBillingBudgetsV1Budget> getBudgets() {
    return budgets;
  }

  /**
   * List of the budgets owned by the requested billing account.
   * @param budgets budgets or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1ListBudgetsResponse setBudgets(java.util.List<GoogleCloudBillingBudgetsV1Budget> budgets) {
    this.budgets = budgets;
    return this;
  }

  /**
   * If not empty, indicates that there may be more budgets that match the request; this value
   * should be passed in a new `ListBudgetsRequest`.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * If not empty, indicates that there may be more budgets that match the request; this value
   * should be passed in a new `ListBudgetsRequest`.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1ListBudgetsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleCloudBillingBudgetsV1ListBudgetsResponse set(String fieldName, Object value) {
    return (GoogleCloudBillingBudgetsV1ListBudgetsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudBillingBudgetsV1ListBudgetsResponse clone() {
    return (GoogleCloudBillingBudgetsV1ListBudgetsResponse) super.clone();
  }

}
