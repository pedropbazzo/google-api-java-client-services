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

package com.google.api.services.firebase.v1beta1.model;

/**
 * Model definition for ListWebAppsResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListWebAppsResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of each `WebApp` associated with the specified `FirebaseProject`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WebApp> apps;

  /**
   * If the result list is too large to fit in a single response, then a token is returned. If the
   * string is empty, then this response is the last page of results. This token can be used in a
   * subsequent call to `ListWebApps` to find the next group of Apps. Page tokens are short-lived
   * and should not be persisted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of each `WebApp` associated with the specified `FirebaseProject`.
   * @return value or {@code null} for none
   */
  public java.util.List<WebApp> getApps() {
    return apps;
  }

  /**
   * List of each `WebApp` associated with the specified `FirebaseProject`.
   * @param apps apps or {@code null} for none
   */
  public ListWebAppsResponse setApps(java.util.List<WebApp> apps) {
    this.apps = apps;
    return this;
  }

  /**
   * If the result list is too large to fit in a single response, then a token is returned. If the
   * string is empty, then this response is the last page of results. This token can be used in a
   * subsequent call to `ListWebApps` to find the next group of Apps. Page tokens are short-lived
   * and should not be persisted.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * If the result list is too large to fit in a single response, then a token is returned. If the
   * string is empty, then this response is the last page of results. This token can be used in a
   * subsequent call to `ListWebApps` to find the next group of Apps. Page tokens are short-lived
   * and should not be persisted.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListWebAppsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListWebAppsResponse set(String fieldName, Object value) {
    return (ListWebAppsResponse) super.set(fieldName, value);
  }

  @Override
  public ListWebAppsResponse clone() {
    return (ListWebAppsResponse) super.clone();
  }

}
