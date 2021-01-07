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
 * A location of a single table cell within a table.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TableCellLocation extends com.google.api.client.json.GenericJson {

  /**
   * The 0-based column index.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer columnIndex;

  /**
   * The 0-based row index.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer rowIndex;

  /**
   * The 0-based column index.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getColumnIndex() {
    return columnIndex;
  }

  /**
   * The 0-based column index.
   * @param columnIndex columnIndex or {@code null} for none
   */
  public TableCellLocation setColumnIndex(java.lang.Integer columnIndex) {
    this.columnIndex = columnIndex;
    return this;
  }

  /**
   * The 0-based row index.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRowIndex() {
    return rowIndex;
  }

  /**
   * The 0-based row index.
   * @param rowIndex rowIndex or {@code null} for none
   */
  public TableCellLocation setRowIndex(java.lang.Integer rowIndex) {
    this.rowIndex = rowIndex;
    return this;
  }

  @Override
  public TableCellLocation set(String fieldName, Object value) {
    return (TableCellLocation) super.set(fieldName, value);
  }

  @Override
  public TableCellLocation clone() {
    return (TableCellLocation) super.clone();
  }

}
