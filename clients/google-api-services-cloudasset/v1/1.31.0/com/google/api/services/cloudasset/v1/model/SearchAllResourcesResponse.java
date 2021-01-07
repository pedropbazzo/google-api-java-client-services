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

package com.google.api.services.cloudasset.v1.model;

/**
 * Search all resources response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchAllResourcesResponse extends com.google.api.client.json.GenericJson {

  /**
   * If there are more results than those appearing in this response, then `next_page_token` is
   * included. To get the next set of results, call this method again using the value of
   * `next_page_token` as `page_token`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A list of Resources that match the search query. It contains the resource standard metadata
   * information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ResourceSearchResult> results;

  static {
    // hack to force ProGuard to consider ResourceSearchResult used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ResourceSearchResult.class);
  }

  /**
   * If there are more results than those appearing in this response, then `next_page_token` is
   * included. To get the next set of results, call this method again using the value of
   * `next_page_token` as `page_token`.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * If there are more results than those appearing in this response, then `next_page_token` is
   * included. To get the next set of results, call this method again using the value of
   * `next_page_token` as `page_token`.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public SearchAllResourcesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A list of Resources that match the search query. It contains the resource standard metadata
   * information.
   * @return value or {@code null} for none
   */
  public java.util.List<ResourceSearchResult> getResults() {
    return results;
  }

  /**
   * A list of Resources that match the search query. It contains the resource standard metadata
   * information.
   * @param results results or {@code null} for none
   */
  public SearchAllResourcesResponse setResults(java.util.List<ResourceSearchResult> results) {
    this.results = results;
    return this;
  }

  @Override
  public SearchAllResourcesResponse set(String fieldName, Object value) {
    return (SearchAllResourcesResponse) super.set(fieldName, value);
  }

  @Override
  public SearchAllResourcesResponse clone() {
    return (SearchAllResourcesResponse) super.clone();
  }

}
