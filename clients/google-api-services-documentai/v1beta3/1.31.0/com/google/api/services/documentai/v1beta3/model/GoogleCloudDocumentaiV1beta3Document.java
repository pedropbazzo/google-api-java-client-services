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

package com.google.api.services.documentai.v1beta3.model;

/**
 * Document represents the canonical document resource in Document Understanding AI. It is an
 * interchange format that provides insights into documents and allows for collaboration between
 * users and Document Understanding AI to iterate and optimize for quality.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1beta3Document extends com.google.api.client.json.GenericJson {

  /**
   * Inline document content, represented as a stream of bytes. Note: As with all `bytes` fields,
   * protobuffers use a pure binary representation, whereas JSON representations use base64.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * A list of entities detected on Document.text. For document shards, entities in this list may
   * cross shard boundaries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta3DocumentEntity> entities;

  /**
   * Relationship among Document.entities.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta3DocumentEntityRelation> entityRelations;

  /**
   * Any error that occurred while processing this document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleRpcStatus error;

  /**
   * An IANA published MIME type (also referred to as media type). For more information, see
   * https://www.iana.org/assignments/media-types/media-types.xhtml.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mimeType;

  /**
   * Visual page layout for the Document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta3DocumentPage> pages;

  /**
   * Revision history of this document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta3DocumentRevision> revisions;

  /**
   * Information about the sharding if this document is sharded part of a larger document. If the
   * document is not sharded, this message is not specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta3DocumentShardInfo shardInfo;

  /**
   * UTF-8 encoded text in reading order from the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * A list of text corrections made to [Document.text]. This is usually used for annotating
   * corrections to OCR mistakes. Text changes for a given revision may not overlap with each other.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta3DocumentTextChange> textChanges;

  /**
   * Styles for the Document.text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta3DocumentStyle> textStyles;

  /**
   * A list of translations on Document.text. For document shards, translations in this list may
   * cross shard boundaries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta3DocumentTranslation> translations;

  /**
   * Currently supports Google Cloud Storage URI of the form `gs://bucket_name/object_name`. Object
   * versioning is not supported. See [Google Cloud Storage Request
   * URIs](https://cloud.google.com/storage/docs/reference-uris) for more info.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Inline document content, represented as a stream of bytes. Note: As with all `bytes` fields,
   * protobuffers use a pure binary representation, whereas JSON representations use base64.
   * @see #decodeContent()
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * Inline document content, represented as a stream of bytes. Note: As with all `bytes` fields,
   * protobuffers use a pure binary representation, whereas JSON representations use base64.
   * @see #getContent()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeContent() {
    return com.google.api.client.util.Base64.decodeBase64(content);
  }

  /**
   * Inline document content, represented as a stream of bytes. Note: As with all `bytes` fields,
   * protobuffers use a pure binary representation, whereas JSON representations use base64.
   * @see #encodeContent()
   * @param content content or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3Document setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * Inline document content, represented as a stream of bytes. Note: As with all `bytes` fields,
   * protobuffers use a pure binary representation, whereas JSON representations use base64.
   * @see #setContent()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudDocumentaiV1beta3Document encodeContent(byte[] content) {
    this.content = com.google.api.client.util.Base64.encodeBase64URLSafeString(content);
    return this;
  }

  /**
   * A list of entities detected on Document.text. For document shards, entities in this list may
   * cross shard boundaries.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta3DocumentEntity> getEntities() {
    return entities;
  }

  /**
   * A list of entities detected on Document.text. For document shards, entities in this list may
   * cross shard boundaries.
   * @param entities entities or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3Document setEntities(java.util.List<GoogleCloudDocumentaiV1beta3DocumentEntity> entities) {
    this.entities = entities;
    return this;
  }

  /**
   * Relationship among Document.entities.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta3DocumentEntityRelation> getEntityRelations() {
    return entityRelations;
  }

  /**
   * Relationship among Document.entities.
   * @param entityRelations entityRelations or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3Document setEntityRelations(java.util.List<GoogleCloudDocumentaiV1beta3DocumentEntityRelation> entityRelations) {
    this.entityRelations = entityRelations;
    return this;
  }

  /**
   * Any error that occurred while processing this document.
   * @return value or {@code null} for none
   */
  public GoogleRpcStatus getError() {
    return error;
  }

  /**
   * Any error that occurred while processing this document.
   * @param error error or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3Document setError(GoogleRpcStatus error) {
    this.error = error;
    return this;
  }

  /**
   * An IANA published MIME type (also referred to as media type). For more information, see
   * https://www.iana.org/assignments/media-types/media-types.xhtml.
   * @return value or {@code null} for none
   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * An IANA published MIME type (also referred to as media type). For more information, see
   * https://www.iana.org/assignments/media-types/media-types.xhtml.
   * @param mimeType mimeType or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3Document setMimeType(java.lang.String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * Visual page layout for the Document.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta3DocumentPage> getPages() {
    return pages;
  }

  /**
   * Visual page layout for the Document.
   * @param pages pages or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3Document setPages(java.util.List<GoogleCloudDocumentaiV1beta3DocumentPage> pages) {
    this.pages = pages;
    return this;
  }

  /**
   * Revision history of this document.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta3DocumentRevision> getRevisions() {
    return revisions;
  }

  /**
   * Revision history of this document.
   * @param revisions revisions or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3Document setRevisions(java.util.List<GoogleCloudDocumentaiV1beta3DocumentRevision> revisions) {
    this.revisions = revisions;
    return this;
  }

  /**
   * Information about the sharding if this document is sharded part of a larger document. If the
   * document is not sharded, this message is not specified.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3DocumentShardInfo getShardInfo() {
    return shardInfo;
  }

  /**
   * Information about the sharding if this document is sharded part of a larger document. If the
   * document is not sharded, this message is not specified.
   * @param shardInfo shardInfo or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3Document setShardInfo(GoogleCloudDocumentaiV1beta3DocumentShardInfo shardInfo) {
    this.shardInfo = shardInfo;
    return this;
  }

  /**
   * UTF-8 encoded text in reading order from the document.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * UTF-8 encoded text in reading order from the document.
   * @param text text or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3Document setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  /**
   * A list of text corrections made to [Document.text]. This is usually used for annotating
   * corrections to OCR mistakes. Text changes for a given revision may not overlap with each other.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta3DocumentTextChange> getTextChanges() {
    return textChanges;
  }

  /**
   * A list of text corrections made to [Document.text]. This is usually used for annotating
   * corrections to OCR mistakes. Text changes for a given revision may not overlap with each other.
   * @param textChanges textChanges or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3Document setTextChanges(java.util.List<GoogleCloudDocumentaiV1beta3DocumentTextChange> textChanges) {
    this.textChanges = textChanges;
    return this;
  }

  /**
   * Styles for the Document.text.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta3DocumentStyle> getTextStyles() {
    return textStyles;
  }

  /**
   * Styles for the Document.text.
   * @param textStyles textStyles or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3Document setTextStyles(java.util.List<GoogleCloudDocumentaiV1beta3DocumentStyle> textStyles) {
    this.textStyles = textStyles;
    return this;
  }

  /**
   * A list of translations on Document.text. For document shards, translations in this list may
   * cross shard boundaries.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta3DocumentTranslation> getTranslations() {
    return translations;
  }

  /**
   * A list of translations on Document.text. For document shards, translations in this list may
   * cross shard boundaries.
   * @param translations translations or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3Document setTranslations(java.util.List<GoogleCloudDocumentaiV1beta3DocumentTranslation> translations) {
    this.translations = translations;
    return this;
  }

  /**
   * Currently supports Google Cloud Storage URI of the form `gs://bucket_name/object_name`. Object
   * versioning is not supported. See [Google Cloud Storage Request
   * URIs](https://cloud.google.com/storage/docs/reference-uris) for more info.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Currently supports Google Cloud Storage URI of the form `gs://bucket_name/object_name`. Object
   * versioning is not supported. See [Google Cloud Storage Request
   * URIs](https://cloud.google.com/storage/docs/reference-uris) for more info.
   * @param uri uri or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3Document setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta3Document set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta3Document) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta3Document clone() {
    return (GoogleCloudDocumentaiV1beta3Document) super.clone();
  }

}
