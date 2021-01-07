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

package com.google.api.services.androidpublisher.model;

/**
 * Response listing all localized listings.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListingsListResponse extends com.google.api.client.json.GenericJson {

  /**
   * The kind of this response ("androidpublisher#listingsListResponse").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * All localized listings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Listing> listings;

  static {
    // hack to force ProGuard to consider Listing used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Listing.class);
  }

  /**
   * The kind of this response ("androidpublisher#listingsListResponse").
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of this response ("androidpublisher#listingsListResponse").
   * @param kind kind or {@code null} for none
   */
  public ListingsListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * All localized listings.
   * @return value or {@code null} for none
   */
  public java.util.List<Listing> getListings() {
    return listings;
  }

  /**
   * All localized listings.
   * @param listings listings or {@code null} for none
   */
  public ListingsListResponse setListings(java.util.List<Listing> listings) {
    this.listings = listings;
    return this;
  }

  @Override
  public ListingsListResponse set(String fieldName, Object value) {
    return (ListingsListResponse) super.set(fieldName, value);
  }

  @Override
  public ListingsListResponse clone() {
    return (ListingsListResponse) super.clone();
  }

}
