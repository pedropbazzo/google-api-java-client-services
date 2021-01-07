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

package com.google.api.services.alertcenter.v1beta1.model;

/**
 * A takeout operation for the entire domain was initiated by an admin. Derived from audit logs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Workspace Alert Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DomainWideTakeoutInitiated extends com.google.api.client.json.GenericJson {

  /**
   * The email of the admin who initiated the takeout.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The takeout request ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String takeoutRequestId;

  /**
   * The email of the admin who initiated the takeout.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * The email of the admin who initiated the takeout.
   * @param email email or {@code null} for none
   */
  public DomainWideTakeoutInitiated setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * The takeout request ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getTakeoutRequestId() {
    return takeoutRequestId;
  }

  /**
   * The takeout request ID.
   * @param takeoutRequestId takeoutRequestId or {@code null} for none
   */
  public DomainWideTakeoutInitiated setTakeoutRequestId(java.lang.String takeoutRequestId) {
    this.takeoutRequestId = takeoutRequestId;
    return this;
  }

  @Override
  public DomainWideTakeoutInitiated set(String fieldName, Object value) {
    return (DomainWideTakeoutInitiated) super.set(fieldName, value);
  }

  @Override
  public DomainWideTakeoutInitiated clone() {
    return (DomainWideTakeoutInitiated) super.clone();
  }

}
