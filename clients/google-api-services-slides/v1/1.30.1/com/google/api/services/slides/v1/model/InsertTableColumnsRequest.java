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

package com.google.api.services.slides.v1.model;

/**
 * Inserts columns into a table. Other columns in the table will be resized to fit the new column.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InsertTableColumnsRequest extends com.google.api.client.json.GenericJson {

  /**
   * The reference table cell location from which columns will be inserted. A new column will be
   * inserted to the left (or right) of the column where the reference cell is. If the reference
   * cell is a merged cell, a new column will be inserted to the left (or right) of the merged cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableCellLocation cellLocation;

  /**
   * Whether to insert new columns to the right of the reference cell location. - `True`: insert to
   * the right. - `False`: insert to the left.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean insertRight;

  /**
   * The number of columns to be inserted. Maximum 20 per request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer number;

  /**
   * The table to insert columns into.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tableObjectId;

  /**
   * The reference table cell location from which columns will be inserted. A new column will be
   * inserted to the left (or right) of the column where the reference cell is. If the reference
   * cell is a merged cell, a new column will be inserted to the left (or right) of the merged cell.
   * @return value or {@code null} for none
   */
  public TableCellLocation getCellLocation() {
    return cellLocation;
  }

  /**
   * The reference table cell location from which columns will be inserted. A new column will be
   * inserted to the left (or right) of the column where the reference cell is. If the reference
   * cell is a merged cell, a new column will be inserted to the left (or right) of the merged cell.
   * @param cellLocation cellLocation or {@code null} for none
   */
  public InsertTableColumnsRequest setCellLocation(TableCellLocation cellLocation) {
    this.cellLocation = cellLocation;
    return this;
  }

  /**
   * Whether to insert new columns to the right of the reference cell location. - `True`: insert to
   * the right. - `False`: insert to the left.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getInsertRight() {
    return insertRight;
  }

  /**
   * Whether to insert new columns to the right of the reference cell location. - `True`: insert to
   * the right. - `False`: insert to the left.
   * @param insertRight insertRight or {@code null} for none
   */
  public InsertTableColumnsRequest setInsertRight(java.lang.Boolean insertRight) {
    this.insertRight = insertRight;
    return this;
  }

  /**
   * The number of columns to be inserted. Maximum 20 per request.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumber() {
    return number;
  }

  /**
   * The number of columns to be inserted. Maximum 20 per request.
   * @param number number or {@code null} for none
   */
  public InsertTableColumnsRequest setNumber(java.lang.Integer number) {
    this.number = number;
    return this;
  }

  /**
   * The table to insert columns into.
   * @return value or {@code null} for none
   */
  public java.lang.String getTableObjectId() {
    return tableObjectId;
  }

  /**
   * The table to insert columns into.
   * @param tableObjectId tableObjectId or {@code null} for none
   */
  public InsertTableColumnsRequest setTableObjectId(java.lang.String tableObjectId) {
    this.tableObjectId = tableObjectId;
    return this;
  }

  @Override
  public InsertTableColumnsRequest set(String fieldName, Object value) {
    return (InsertTableColumnsRequest) super.set(fieldName, value);
  }

  @Override
  public InsertTableColumnsRequest clone() {
    return (InsertTableColumnsRequest) super.clone();
  }

}
