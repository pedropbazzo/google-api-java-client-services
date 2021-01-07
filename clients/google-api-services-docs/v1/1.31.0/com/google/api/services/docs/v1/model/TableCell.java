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

package com.google.api.services.docs.v1.model;

/**
 * The contents and style of a cell in a Table.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TableCell extends com.google.api.client.json.GenericJson {

  /**
   * The content of the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<StructuralElement> content;

  static {
    // hack to force ProGuard to consider StructuralElement used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(StructuralElement.class);
  }

  /**
   * The zero-based end index of this cell, exclusive, in UTF-16 code units.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer endIndex;

  /**
   * The zero-based start index of this cell, in UTF-16 code units.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer startIndex;

  /**
   * The suggested deletion IDs. If empty, then there are no suggested deletions of this content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> suggestedDeletionIds;

  /**
   * The suggested insertion IDs. A TableCell may have multiple insertion IDs if it is a nested
   * suggested change. If empty, then this is not a suggested insertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> suggestedInsertionIds;

  /**
   * The suggested changes to the table cell style, keyed by suggestion ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, SuggestedTableCellStyle> suggestedTableCellStyleChanges;

  static {
    // hack to force ProGuard to consider SuggestedTableCellStyle used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(SuggestedTableCellStyle.class);
  }

  /**
   * The style of the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableCellStyle tableCellStyle;

  /**
   * The content of the cell.
   * @return value or {@code null} for none
   */
  public java.util.List<StructuralElement> getContent() {
    return content;
  }

  /**
   * The content of the cell.
   * @param content content or {@code null} for none
   */
  public TableCell setContent(java.util.List<StructuralElement> content) {
    this.content = content;
    return this;
  }

  /**
   * The zero-based end index of this cell, exclusive, in UTF-16 code units.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEndIndex() {
    return endIndex;
  }

  /**
   * The zero-based end index of this cell, exclusive, in UTF-16 code units.
   * @param endIndex endIndex or {@code null} for none
   */
  public TableCell setEndIndex(java.lang.Integer endIndex) {
    this.endIndex = endIndex;
    return this;
  }

  /**
   * The zero-based start index of this cell, in UTF-16 code units.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStartIndex() {
    return startIndex;
  }

  /**
   * The zero-based start index of this cell, in UTF-16 code units.
   * @param startIndex startIndex or {@code null} for none
   */
  public TableCell setStartIndex(java.lang.Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * The suggested deletion IDs. If empty, then there are no suggested deletions of this content.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSuggestedDeletionIds() {
    return suggestedDeletionIds;
  }

  /**
   * The suggested deletion IDs. If empty, then there are no suggested deletions of this content.
   * @param suggestedDeletionIds suggestedDeletionIds or {@code null} for none
   */
  public TableCell setSuggestedDeletionIds(java.util.List<java.lang.String> suggestedDeletionIds) {
    this.suggestedDeletionIds = suggestedDeletionIds;
    return this;
  }

  /**
   * The suggested insertion IDs. A TableCell may have multiple insertion IDs if it is a nested
   * suggested change. If empty, then this is not a suggested insertion.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSuggestedInsertionIds() {
    return suggestedInsertionIds;
  }

  /**
   * The suggested insertion IDs. A TableCell may have multiple insertion IDs if it is a nested
   * suggested change. If empty, then this is not a suggested insertion.
   * @param suggestedInsertionIds suggestedInsertionIds or {@code null} for none
   */
  public TableCell setSuggestedInsertionIds(java.util.List<java.lang.String> suggestedInsertionIds) {
    this.suggestedInsertionIds = suggestedInsertionIds;
    return this;
  }

  /**
   * The suggested changes to the table cell style, keyed by suggestion ID.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, SuggestedTableCellStyle> getSuggestedTableCellStyleChanges() {
    return suggestedTableCellStyleChanges;
  }

  /**
   * The suggested changes to the table cell style, keyed by suggestion ID.
   * @param suggestedTableCellStyleChanges suggestedTableCellStyleChanges or {@code null} for none
   */
  public TableCell setSuggestedTableCellStyleChanges(java.util.Map<String, SuggestedTableCellStyle> suggestedTableCellStyleChanges) {
    this.suggestedTableCellStyleChanges = suggestedTableCellStyleChanges;
    return this;
  }

  /**
   * The style of the cell.
   * @return value or {@code null} for none
   */
  public TableCellStyle getTableCellStyle() {
    return tableCellStyle;
  }

  /**
   * The style of the cell.
   * @param tableCellStyle tableCellStyle or {@code null} for none
   */
  public TableCell setTableCellStyle(TableCellStyle tableCellStyle) {
    this.tableCellStyle = tableCellStyle;
    return this;
  }

  @Override
  public TableCell set(String fieldName, Object value) {
    return (TableCell) super.set(fieldName, value);
  }

  @Override
  public TableCell clone() {
    return (TableCell) super.clone();
  }

}
