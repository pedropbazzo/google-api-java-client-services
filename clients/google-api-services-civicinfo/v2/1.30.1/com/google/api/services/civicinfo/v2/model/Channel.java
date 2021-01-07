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

package com.google.api.services.civicinfo.v2.model;

/**
 * A social media or web channel for a candidate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Civic Information API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Channel extends com.google.api.client.json.GenericJson {

  /**
   * The unique public identifier for the candidate's channel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The type of channel. The following is a list of types of channels, but is not exhaustive. More
   * channel types may be added at a later time. One of: GooglePlus, YouTube, Facebook, Twitter
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The unique public identifier for the candidate's channel.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The unique public identifier for the candidate's channel.
   * @param id id or {@code null} for none
   */
  public Channel setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The type of channel. The following is a list of types of channels, but is not exhaustive. More
   * channel types may be added at a later time. One of: GooglePlus, YouTube, Facebook, Twitter
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of channel. The following is a list of types of channels, but is not exhaustive. More
   * channel types may be added at a later time. One of: GooglePlus, YouTube, Facebook, Twitter
   * @param type type or {@code null} for none
   */
  public Channel setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Channel set(String fieldName, Object value) {
    return (Channel) super.set(fieldName, value);
  }

  @Override
  public Channel clone() {
    return (Channel) super.clone();
  }

}
