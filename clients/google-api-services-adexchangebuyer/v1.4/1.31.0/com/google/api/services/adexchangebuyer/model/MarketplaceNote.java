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

package com.google.api.services.adexchangebuyer.model;

/**
 * A proposal is associated with a bunch of notes which may optionally be associated with a deal
 * and/or revision number.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MarketplaceNote extends com.google.api.client.json.GenericJson {

  /**
   * The role of the person (buyer/seller) creating the note. (readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creatorRole;

  /**
   * Notes can optionally be associated with a deal. (readonly, except on create)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dealId;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "adexchangebuyer#marketplaceNote".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The actual note to attach. (readonly, except on create)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String note;

  /**
   * The unique id for the note. (readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String noteId;

  /**
   * The proposalId that a note is attached to. (readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String proposalId;

  /**
   * If the note is associated with a proposal revision number, then store that here. (readonly,
   * except on create)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long proposalRevisionNumber;

  /**
   * The timestamp (ms since epoch) that this note was created. (readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long timestampMs;

  /**
   * The role of the person (buyer/seller) creating the note. (readonly)
   * @return value or {@code null} for none
   */
  public java.lang.String getCreatorRole() {
    return creatorRole;
  }

  /**
   * The role of the person (buyer/seller) creating the note. (readonly)
   * @param creatorRole creatorRole or {@code null} for none
   */
  public MarketplaceNote setCreatorRole(java.lang.String creatorRole) {
    this.creatorRole = creatorRole;
    return this;
  }

  /**
   * Notes can optionally be associated with a deal. (readonly, except on create)
   * @return value or {@code null} for none
   */
  public java.lang.String getDealId() {
    return dealId;
  }

  /**
   * Notes can optionally be associated with a deal. (readonly, except on create)
   * @param dealId dealId or {@code null} for none
   */
  public MarketplaceNote setDealId(java.lang.String dealId) {
    this.dealId = dealId;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "adexchangebuyer#marketplaceNote".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "adexchangebuyer#marketplaceNote".
   * @param kind kind or {@code null} for none
   */
  public MarketplaceNote setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The actual note to attach. (readonly, except on create)
   * @return value or {@code null} for none
   */
  public java.lang.String getNote() {
    return note;
  }

  /**
   * The actual note to attach. (readonly, except on create)
   * @param note note or {@code null} for none
   */
  public MarketplaceNote setNote(java.lang.String note) {
    this.note = note;
    return this;
  }

  /**
   * The unique id for the note. (readonly)
   * @return value or {@code null} for none
   */
  public java.lang.String getNoteId() {
    return noteId;
  }

  /**
   * The unique id for the note. (readonly)
   * @param noteId noteId or {@code null} for none
   */
  public MarketplaceNote setNoteId(java.lang.String noteId) {
    this.noteId = noteId;
    return this;
  }

  /**
   * The proposalId that a note is attached to. (readonly)
   * @return value or {@code null} for none
   */
  public java.lang.String getProposalId() {
    return proposalId;
  }

  /**
   * The proposalId that a note is attached to. (readonly)
   * @param proposalId proposalId or {@code null} for none
   */
  public MarketplaceNote setProposalId(java.lang.String proposalId) {
    this.proposalId = proposalId;
    return this;
  }

  /**
   * If the note is associated with a proposal revision number, then store that here. (readonly,
   * except on create)
   * @return value or {@code null} for none
   */
  public java.lang.Long getProposalRevisionNumber() {
    return proposalRevisionNumber;
  }

  /**
   * If the note is associated with a proposal revision number, then store that here. (readonly,
   * except on create)
   * @param proposalRevisionNumber proposalRevisionNumber or {@code null} for none
   */
  public MarketplaceNote setProposalRevisionNumber(java.lang.Long proposalRevisionNumber) {
    this.proposalRevisionNumber = proposalRevisionNumber;
    return this;
  }

  /**
   * The timestamp (ms since epoch) that this note was created. (readonly)
   * @return value or {@code null} for none
   */
  public java.lang.Long getTimestampMs() {
    return timestampMs;
  }

  /**
   * The timestamp (ms since epoch) that this note was created. (readonly)
   * @param timestampMs timestampMs or {@code null} for none
   */
  public MarketplaceNote setTimestampMs(java.lang.Long timestampMs) {
    this.timestampMs = timestampMs;
    return this;
  }

  @Override
  public MarketplaceNote set(String fieldName, Object value) {
    return (MarketplaceNote) super.set(fieldName, value);
  }

  @Override
  public MarketplaceNote clone() {
    return (MarketplaceNote) super.clone();
  }

}
