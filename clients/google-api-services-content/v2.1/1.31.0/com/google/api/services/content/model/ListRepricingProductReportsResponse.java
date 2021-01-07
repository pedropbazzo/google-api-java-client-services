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

package com.google.api.services.content.model;

/**
 * Response message for the ListRepricingProductReports method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListRepricingProductReportsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token for retrieving the next page. Its absence means there is no subsequent page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Periodic reports for the given Repricing product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RepricingProductReport> repricingProductReports;

  /**
   * A token for retrieving the next page. Its absence means there is no subsequent page.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token for retrieving the next page. Its absence means there is no subsequent page.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListRepricingProductReportsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Periodic reports for the given Repricing product.
   * @return value or {@code null} for none
   */
  public java.util.List<RepricingProductReport> getRepricingProductReports() {
    return repricingProductReports;
  }

  /**
   * Periodic reports for the given Repricing product.
   * @param repricingProductReports repricingProductReports or {@code null} for none
   */
  public ListRepricingProductReportsResponse setRepricingProductReports(java.util.List<RepricingProductReport> repricingProductReports) {
    this.repricingProductReports = repricingProductReports;
    return this;
  }

  @Override
  public ListRepricingProductReportsResponse set(String fieldName, Object value) {
    return (ListRepricingProductReportsResponse) super.set(fieldName, value);
  }

  @Override
  public ListRepricingProductReportsResponse clone() {
    return (ListRepricingProductReportsResponse) super.clone();
  }

}
