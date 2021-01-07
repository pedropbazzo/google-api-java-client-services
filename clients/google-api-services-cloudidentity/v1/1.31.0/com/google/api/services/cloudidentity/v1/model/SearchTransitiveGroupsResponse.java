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

package com.google.api.services.cloudidentity.v1.model;

/**
 * The response message for MembershipsService.SearchTransitiveGroups.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchTransitiveGroupsResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of transitive groups satisfying the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GroupRelation> memberships;

  static {
    // hack to force ProGuard to consider GroupRelation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GroupRelation.class);
  }

  /**
   * Token to retrieve the next page of results, or empty if there are no more results available for
   * listing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of transitive groups satisfying the query.
   * @return value or {@code null} for none
   */
  public java.util.List<GroupRelation> getMemberships() {
    return memberships;
  }

  /**
   * List of transitive groups satisfying the query.
   * @param memberships memberships or {@code null} for none
   */
  public SearchTransitiveGroupsResponse setMemberships(java.util.List<GroupRelation> memberships) {
    this.memberships = memberships;
    return this;
  }

  /**
   * Token to retrieve the next page of results, or empty if there are no more results available for
   * listing.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token to retrieve the next page of results, or empty if there are no more results available for
   * listing.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public SearchTransitiveGroupsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public SearchTransitiveGroupsResponse set(String fieldName, Object value) {
    return (SearchTransitiveGroupsResponse) super.set(fieldName, value);
  }

  @Override
  public SearchTransitiveGroupsResponse clone() {
    return (SearchTransitiveGroupsResponse) super.clone();
  }

}
