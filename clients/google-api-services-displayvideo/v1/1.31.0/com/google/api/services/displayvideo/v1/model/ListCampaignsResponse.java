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

package com.google.api.services.displayvideo.v1.model;

/**
 * Model definition for ListCampaignsResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListCampaignsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of campaigns. This list will be absent if empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Campaign> campaigns;

  static {
    // hack to force ProGuard to consider Campaign used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Campaign.class);
  }

  /**
   * A token to retrieve the next page of results. Pass this value in the page_token field in the
   * subsequent call to `ListCampaigns` method to retrieve the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of campaigns. This list will be absent if empty.
   * @return value or {@code null} for none
   */
  public java.util.List<Campaign> getCampaigns() {
    return campaigns;
  }

  /**
   * The list of campaigns. This list will be absent if empty.
   * @param campaigns campaigns or {@code null} for none
   */
  public ListCampaignsResponse setCampaigns(java.util.List<Campaign> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  /**
   * A token to retrieve the next page of results. Pass this value in the page_token field in the
   * subsequent call to `ListCampaigns` method to retrieve the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token to retrieve the next page of results. Pass this value in the page_token field in the
   * subsequent call to `ListCampaigns` method to retrieve the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListCampaignsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListCampaignsResponse set(String fieldName, Object value) {
    return (ListCampaignsResponse) super.set(fieldName, value);
  }

  @Override
  public ListCampaignsResponse clone() {
    return (ListCampaignsResponse) super.clone();
  }

}
