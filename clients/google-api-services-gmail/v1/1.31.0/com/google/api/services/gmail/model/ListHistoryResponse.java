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

package com.google.api.services.gmail.model;

/**
 * Model definition for ListHistoryResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Gmail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListHistoryResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of history records. Any `messages` contained in the response will typically only have `id`
   * and `threadId` fields populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<History> history;

  static {
    // hack to force ProGuard to consider History used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(History.class);
  }

  /**
   * The ID of the mailbox's current history record.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger historyId;

  /**
   * Page token to retrieve the next page of results in the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of history records. Any `messages` contained in the response will typically only have `id`
   * and `threadId` fields populated.
   * @return value or {@code null} for none
   */
  public java.util.List<History> getHistory() {
    return history;
  }

  /**
   * List of history records. Any `messages` contained in the response will typically only have `id`
   * and `threadId` fields populated.
   * @param history history or {@code null} for none
   */
  public ListHistoryResponse setHistory(java.util.List<History> history) {
    this.history = history;
    return this;
  }

  /**
   * The ID of the mailbox's current history record.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getHistoryId() {
    return historyId;
  }

  /**
   * The ID of the mailbox's current history record.
   * @param historyId historyId or {@code null} for none
   */
  public ListHistoryResponse setHistoryId(java.math.BigInteger historyId) {
    this.historyId = historyId;
    return this;
  }

  /**
   * Page token to retrieve the next page of results in the list.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Page token to retrieve the next page of results in the list.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListHistoryResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListHistoryResponse set(String fieldName, Object value) {
    return (ListHistoryResponse) super.set(fieldName, value);
  }

  @Override
  public ListHistoryResponse clone() {
    return (ListHistoryResponse) super.clone();
  }

}
