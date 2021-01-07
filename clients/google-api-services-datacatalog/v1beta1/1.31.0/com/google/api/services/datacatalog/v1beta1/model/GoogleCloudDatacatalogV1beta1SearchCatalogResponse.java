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

package com.google.api.services.datacatalog.v1beta1.model;

/**
 * Response message for SearchCatalog.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Data Catalog API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatacatalogV1beta1SearchCatalogResponse extends com.google.api.client.json.GenericJson {

  /**
   * The token that can be used to retrieve the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Search results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDatacatalogV1beta1SearchCatalogResult> results;

  /**
   * Unreachable locations. Search result does not include data from those locations. Users can get
   * additional information on the error by repeating the search request with a more restrictive
   * parameter -- setting the value for `SearchDataCatalogRequest.scope.restricted_locations`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * The token that can be used to retrieve the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The token that can be used to retrieve the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1SearchCatalogResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Search results.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDatacatalogV1beta1SearchCatalogResult> getResults() {
    return results;
  }

  /**
   * Search results.
   * @param results results or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1SearchCatalogResponse setResults(java.util.List<GoogleCloudDatacatalogV1beta1SearchCatalogResult> results) {
    this.results = results;
    return this;
  }

  /**
   * Unreachable locations. Search result does not include data from those locations. Users can get
   * additional information on the error by repeating the search request with a more restrictive
   * parameter -- setting the value for `SearchDataCatalogRequest.scope.restricted_locations`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * Unreachable locations. Search result does not include data from those locations. Users can get
   * additional information on the error by repeating the search request with a more restrictive
   * parameter -- setting the value for `SearchDataCatalogRequest.scope.restricted_locations`.
   * @param unreachable unreachable or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1SearchCatalogResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1beta1SearchCatalogResponse set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1beta1SearchCatalogResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1beta1SearchCatalogResponse clone() {
    return (GoogleCloudDatacatalogV1beta1SearchCatalogResponse) super.clone();
  }

}
