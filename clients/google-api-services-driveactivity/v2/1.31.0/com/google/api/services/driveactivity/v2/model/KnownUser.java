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

package com.google.api.services.driveactivity.v2.model;

/**
 * A known user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Activity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class KnownUser extends com.google.api.client.json.GenericJson {

  /**
   * True if this is the user making the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isCurrentUser;

  /**
   * The identifier for this user that can be used with the People API to get more information. The
   * format is "people/ACCOUNT_ID". See https://developers.google.com/people/.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String personName;

  /**
   * True if this is the user making the request.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsCurrentUser() {
    return isCurrentUser;
  }

  /**
   * True if this is the user making the request.
   * @param isCurrentUser isCurrentUser or {@code null} for none
   */
  public KnownUser setIsCurrentUser(java.lang.Boolean isCurrentUser) {
    this.isCurrentUser = isCurrentUser;
    return this;
  }

  /**
   * The identifier for this user that can be used with the People API to get more information. The
   * format is "people/ACCOUNT_ID". See https://developers.google.com/people/.
   * @return value or {@code null} for none
   */
  public java.lang.String getPersonName() {
    return personName;
  }

  /**
   * The identifier for this user that can be used with the People API to get more information. The
   * format is "people/ACCOUNT_ID". See https://developers.google.com/people/.
   * @param personName personName or {@code null} for none
   */
  public KnownUser setPersonName(java.lang.String personName) {
    this.personName = personName;
    return this;
  }

  @Override
  public KnownUser set(String fieldName, Object value) {
    return (KnownUser) super.set(fieldName, value);
  }

  @Override
  public KnownUser clone() {
    return (KnownUser) super.clone();
  }

}
