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

package com.google.api.services.safebrowsing.v4.model;

/**
 * The client metadata associated with Safe Browsing API requests.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Safe Browsing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ClientInfo extends com.google.api.client.json.GenericJson {

  /**
   * A client ID that (hopefully) uniquely identifies the client implementation of the Safe Browsing
   * API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientId;

  /**
   * The version of the client implementation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientVersion;

  /**
   * A client ID that (hopefully) uniquely identifies the client implementation of the Safe Browsing
   * API.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientId() {
    return clientId;
  }

  /**
   * A client ID that (hopefully) uniquely identifies the client implementation of the Safe Browsing
   * API.
   * @param clientId clientId or {@code null} for none
   */
  public ClientInfo setClientId(java.lang.String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * The version of the client implementation.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientVersion() {
    return clientVersion;
  }

  /**
   * The version of the client implementation.
   * @param clientVersion clientVersion or {@code null} for none
   */
  public ClientInfo setClientVersion(java.lang.String clientVersion) {
    this.clientVersion = clientVersion;
    return this;
  }

  @Override
  public ClientInfo set(String fieldName, Object value) {
    return (ClientInfo) super.set(fieldName, value);
  }

  @Override
  public ClientInfo clone() {
    return (ClientInfo) super.clone();
  }

}
