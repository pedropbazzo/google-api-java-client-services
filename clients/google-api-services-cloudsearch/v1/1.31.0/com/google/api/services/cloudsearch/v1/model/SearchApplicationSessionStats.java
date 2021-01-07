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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Model definition for SearchApplicationSessionStats.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchApplicationSessionStats extends com.google.api.client.json.GenericJson {

  /**
   * Date for which session stats were calculated. Stats calculated on the next day close to
   * midnight are returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date date;

  /**
   * The count of search sessions on the day
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long searchSessionsCount;

  /**
   * Date for which session stats were calculated. Stats calculated on the next day close to
   * midnight are returned.
   * @return value or {@code null} for none
   */
  public Date getDate() {
    return date;
  }

  /**
   * Date for which session stats were calculated. Stats calculated on the next day close to
   * midnight are returned.
   * @param date date or {@code null} for none
   */
  public SearchApplicationSessionStats setDate(Date date) {
    this.date = date;
    return this;
  }

  /**
   * The count of search sessions on the day
   * @return value or {@code null} for none
   */
  public java.lang.Long getSearchSessionsCount() {
    return searchSessionsCount;
  }

  /**
   * The count of search sessions on the day
   * @param searchSessionsCount searchSessionsCount or {@code null} for none
   */
  public SearchApplicationSessionStats setSearchSessionsCount(java.lang.Long searchSessionsCount) {
    this.searchSessionsCount = searchSessionsCount;
    return this;
  }

  @Override
  public SearchApplicationSessionStats set(String fieldName, Object value) {
    return (SearchApplicationSessionStats) super.set(fieldName, value);
  }

  @Override
  public SearchApplicationSessionStats clone() {
    return (SearchApplicationSessionStats) super.clone();
  }

}
