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

package com.google.api.services.privateca.v1beta1.model;

/**
 * Describes fields that are relavent to the revocation of a Certificate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Certificate Authority API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RevocationDetails extends com.google.api.client.json.GenericJson {

  /**
   * Indicates why a Certificate was revoked.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revocationState;

  /**
   * The time at which this Certificate was revoked.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String revocationTime;

  /**
   * Indicates why a Certificate was revoked.
   * @return value or {@code null} for none
   */
  public java.lang.String getRevocationState() {
    return revocationState;
  }

  /**
   * Indicates why a Certificate was revoked.
   * @param revocationState revocationState or {@code null} for none
   */
  public RevocationDetails setRevocationState(java.lang.String revocationState) {
    this.revocationState = revocationState;
    return this;
  }

  /**
   * The time at which this Certificate was revoked.
   * @return value or {@code null} for none
   */
  public String getRevocationTime() {
    return revocationTime;
  }

  /**
   * The time at which this Certificate was revoked.
   * @param revocationTime revocationTime or {@code null} for none
   */
  public RevocationDetails setRevocationTime(String revocationTime) {
    this.revocationTime = revocationTime;
    return this;
  }

  @Override
  public RevocationDetails set(String fieldName, Object value) {
    return (RevocationDetails) super.set(fieldName, value);
  }

  @Override
  public RevocationDetails clone() {
    return (RevocationDetails) super.clone();
  }

}
