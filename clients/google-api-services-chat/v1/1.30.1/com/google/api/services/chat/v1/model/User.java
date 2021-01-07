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

package com.google.api.services.chat.v1.model;

/**
 * A user in Hangouts Chat.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Hangouts Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class User extends com.google.api.client.json.GenericJson {

  /**
   * The user's display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Obfuscated domain information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domainId;

  /**
   * True when the user is deleted or the user's proifle is not visible.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isAnonymous;

  /**
   * Resource name, in the format "users".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * User type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The user's display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The user's display name.
   * @param displayName displayName or {@code null} for none
   */
  public User setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Obfuscated domain information.
   * @return value or {@code null} for none
   */
  public java.lang.String getDomainId() {
    return domainId;
  }

  /**
   * Obfuscated domain information.
   * @param domainId domainId or {@code null} for none
   */
  public User setDomainId(java.lang.String domainId) {
    this.domainId = domainId;
    return this;
  }

  /**
   * True when the user is deleted or the user's proifle is not visible.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsAnonymous() {
    return isAnonymous;
  }

  /**
   * True when the user is deleted or the user's proifle is not visible.
   * @param isAnonymous isAnonymous or {@code null} for none
   */
  public User setIsAnonymous(java.lang.Boolean isAnonymous) {
    this.isAnonymous = isAnonymous;
    return this;
  }

  /**
   * Resource name, in the format "users".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource name, in the format "users".
   * @param name name or {@code null} for none
   */
  public User setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * User type.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * User type.
   * @param type type or {@code null} for none
   */
  public User setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public User set(String fieldName, Object value) {
    return (User) super.set(fieldName, value);
  }

  @Override
  public User clone() {
    return (User) super.clone();
  }

}
