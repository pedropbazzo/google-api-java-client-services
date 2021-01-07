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
 * Model definition for SuperChatEventSnippet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SuperChatEventSnippet extends com.google.api.client.json.GenericJson {

  /**
   * The purchase amount, in micros of the purchase currency. e.g., 1 is represented as 1000000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger amountMicros;

  /**
   * Channel id where the event occurred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channelId;

  /**
   * The text contents of the comment left by the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String commentText;

  /**
   * The date and time when the event occurred. The value is specified in ISO 8601 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String createdAt;

  /**
   * The currency in which the purchase was made. ISO 4217.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currency;

  /**
   * A rendered string that displays the purchase amount and currency (e.g., "$1.00"). The string is
   * rendered for the given language.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayString;

  /**
   * True if this event is a Super Sticker event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isSuperStickerEvent;

  /**
   * The tier for the paid message, which is based on the amount of money spent to purchase the
   * message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long messageType;

  /**
   * If this event is a Super Sticker event, this field will contain metadata about the Super
   * Sticker.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SuperStickerMetadata superStickerMetadata;

  /**
   * Details about the supporter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChannelProfileDetails supporterDetails;

  /**
   * The purchase amount, in micros of the purchase currency. e.g., 1 is represented as 1000000.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getAmountMicros() {
    return amountMicros;
  }

  /**
   * The purchase amount, in micros of the purchase currency. e.g., 1 is represented as 1000000.
   * @param amountMicros amountMicros or {@code null} for none
   */
  public SuperChatEventSnippet setAmountMicros(java.math.BigInteger amountMicros) {
    this.amountMicros = amountMicros;
    return this;
  }

  /**
   * Channel id where the event occurred.
   * @return value or {@code null} for none
   */
  public java.lang.String getChannelId() {
    return channelId;
  }

  /**
   * Channel id where the event occurred.
   * @param channelId channelId or {@code null} for none
   */
  public SuperChatEventSnippet setChannelId(java.lang.String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The text contents of the comment left by the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getCommentText() {
    return commentText;
  }

  /**
   * The text contents of the comment left by the user.
   * @param commentText commentText or {@code null} for none
   */
  public SuperChatEventSnippet setCommentText(java.lang.String commentText) {
    this.commentText = commentText;
    return this;
  }

  /**
   * The date and time when the event occurred. The value is specified in ISO 8601 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreatedAt() {
    return createdAt;
  }

  /**
   * The date and time when the event occurred. The value is specified in ISO 8601 format.
   * @param createdAt createdAt or {@code null} for none
   */
  public SuperChatEventSnippet setCreatedAt(java.lang.String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The currency in which the purchase was made. ISO 4217.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrency() {
    return currency;
  }

  /**
   * The currency in which the purchase was made. ISO 4217.
   * @param currency currency or {@code null} for none
   */
  public SuperChatEventSnippet setCurrency(java.lang.String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * A rendered string that displays the purchase amount and currency (e.g., "$1.00"). The string is
   * rendered for the given language.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayString() {
    return displayString;
  }

  /**
   * A rendered string that displays the purchase amount and currency (e.g., "$1.00"). The string is
   * rendered for the given language.
   * @param displayString displayString or {@code null} for none
   */
  public SuperChatEventSnippet setDisplayString(java.lang.String displayString) {
    this.displayString = displayString;
    return this;
  }

  /**
   * True if this event is a Super Sticker event.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsSuperStickerEvent() {
    return isSuperStickerEvent;
  }

  /**
   * True if this event is a Super Sticker event.
   * @param isSuperStickerEvent isSuperStickerEvent or {@code null} for none
   */
  public SuperChatEventSnippet setIsSuperStickerEvent(java.lang.Boolean isSuperStickerEvent) {
    this.isSuperStickerEvent = isSuperStickerEvent;
    return this;
  }

  /**
   * The tier for the paid message, which is based on the amount of money spent to purchase the
   * message.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMessageType() {
    return messageType;
  }

  /**
   * The tier for the paid message, which is based on the amount of money spent to purchase the
   * message.
   * @param messageType messageType or {@code null} for none
   */
  public SuperChatEventSnippet setMessageType(java.lang.Long messageType) {
    this.messageType = messageType;
    return this;
  }

  /**
   * If this event is a Super Sticker event, this field will contain metadata about the Super
   * Sticker.
   * @return value or {@code null} for none
   */
  public SuperStickerMetadata getSuperStickerMetadata() {
    return superStickerMetadata;
  }

  /**
   * If this event is a Super Sticker event, this field will contain metadata about the Super
   * Sticker.
   * @param superStickerMetadata superStickerMetadata or {@code null} for none
   */
  public SuperChatEventSnippet setSuperStickerMetadata(SuperStickerMetadata superStickerMetadata) {
    this.superStickerMetadata = superStickerMetadata;
    return this;
  }

  /**
   * Details about the supporter.
   * @return value or {@code null} for none
   */
  public ChannelProfileDetails getSupporterDetails() {
    return supporterDetails;
  }

  /**
   * Details about the supporter.
   * @param supporterDetails supporterDetails or {@code null} for none
   */
  public SuperChatEventSnippet setSupporterDetails(ChannelProfileDetails supporterDetails) {
    this.supporterDetails = supporterDetails;
    return this;
  }

  @Override
  public SuperChatEventSnippet set(String fieldName, Object value) {
    return (SuperChatEventSnippet) super.set(fieldName, value);
  }

  @Override
  public SuperChatEventSnippet clone() {
    return (SuperChatEventSnippet) super.clone();
  }

}
