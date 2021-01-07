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

package com.google.api.services.managedidentities.v1beta1.model;

/**
 * ListSQLIntegrationsResponse is the response message for ListSQLIntegrations method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Managed Service for Microsoft Active Directory API.
 * For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListSQLIntegrationsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Token to retrieve the next page of results, or empty if there are no more results in the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A list of SQLIntegrations of a domain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SQLIntegration> sqlIntegrations;

  /**
   * A list of locations that could not be reached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * Token to retrieve the next page of results, or empty if there are no more results in the list.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token to retrieve the next page of results, or empty if there are no more results in the list.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListSQLIntegrationsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A list of SQLIntegrations of a domain.
   * @return value or {@code null} for none
   */
  public java.util.List<SQLIntegration> getSqlIntegrations() {
    return sqlIntegrations;
  }

  /**
   * A list of SQLIntegrations of a domain.
   * @param sqlIntegrations sqlIntegrations or {@code null} for none
   */
  public ListSQLIntegrationsResponse setSqlIntegrations(java.util.List<SQLIntegration> sqlIntegrations) {
    this.sqlIntegrations = sqlIntegrations;
    return this;
  }

  /**
   * A list of locations that could not be reached.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * A list of locations that could not be reached.
   * @param unreachable unreachable or {@code null} for none
   */
  public ListSQLIntegrationsResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public ListSQLIntegrationsResponse set(String fieldName, Object value) {
    return (ListSQLIntegrationsResponse) super.set(fieldName, value);
  }

  @Override
  public ListSQLIntegrationsResponse clone() {
    return (ListSQLIntegrationsResponse) super.clone();
  }

}
