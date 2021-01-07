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

package com.google.api.services.youtube.model;

/**
 * JSON template for the status part of a channel.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChannelStatus extends com.google.api.client.json.GenericJson {

  /**
   * If true, then the user is linked to either a YouTube username or G+ account. Otherwise, the
   * user doesn't have a public YouTube identity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isLinked;

  /**
   * The long uploads status of this channel. See https://support.google.com/youtube/answer/71673
   * for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String longUploadsStatus;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean madeForKids;

  /**
   * Privacy status of the channel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String privacyStatus;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean selfDeclaredMadeForKids;

  /**
   * If true, then the user is linked to either a YouTube username or G+ account. Otherwise, the
   * user doesn't have a public YouTube identity.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsLinked() {
    return isLinked;
  }

  /**
   * If true, then the user is linked to either a YouTube username or G+ account. Otherwise, the
   * user doesn't have a public YouTube identity.
   * @param isLinked isLinked or {@code null} for none
   */
  public ChannelStatus setIsLinked(java.lang.Boolean isLinked) {
    this.isLinked = isLinked;
    return this;
  }

  /**
   * The long uploads status of this channel. See https://support.google.com/youtube/answer/71673
   * for more information.
   * @return value or {@code null} for none
   */
  public java.lang.String getLongUploadsStatus() {
    return longUploadsStatus;
  }

  /**
   * The long uploads status of this channel. See https://support.google.com/youtube/answer/71673
   * for more information.
   * @param longUploadsStatus longUploadsStatus or {@code null} for none
   */
  public ChannelStatus setLongUploadsStatus(java.lang.String longUploadsStatus) {
    this.longUploadsStatus = longUploadsStatus;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMadeForKids() {
    return madeForKids;
  }

  /**
   * @param madeForKids madeForKids or {@code null} for none
   */
  public ChannelStatus setMadeForKids(java.lang.Boolean madeForKids) {
    this.madeForKids = madeForKids;
    return this;
  }

  /**
   * Privacy status of the channel.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrivacyStatus() {
    return privacyStatus;
  }

  /**
   * Privacy status of the channel.
   * @param privacyStatus privacyStatus or {@code null} for none
   */
  public ChannelStatus setPrivacyStatus(java.lang.String privacyStatus) {
    this.privacyStatus = privacyStatus;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSelfDeclaredMadeForKids() {
    return selfDeclaredMadeForKids;
  }

  /**
   * @param selfDeclaredMadeForKids selfDeclaredMadeForKids or {@code null} for none
   */
  public ChannelStatus setSelfDeclaredMadeForKids(java.lang.Boolean selfDeclaredMadeForKids) {
    this.selfDeclaredMadeForKids = selfDeclaredMadeForKids;
    return this;
  }

  @Override
  public ChannelStatus set(String fieldName, Object value) {
    return (ChannelStatus) super.set(fieldName, value);
  }

  @Override
  public ChannelStatus clone() {
    return (ChannelStatus) super.clone();
  }

}
