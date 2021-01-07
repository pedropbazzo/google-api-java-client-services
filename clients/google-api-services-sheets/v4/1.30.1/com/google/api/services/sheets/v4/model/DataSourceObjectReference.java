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

package com.google.api.services.sheets.v4.model;

/**
 * Reference to a data source object.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataSourceObjectReference extends com.google.api.client.json.GenericJson {

  /**
   * References to a data source chart.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer chartId;

  /**
   * References to a cell containing DataSourceFormula.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GridCoordinate dataSourceFormulaCell;

  /**
   * References to a data source PivotTable anchored at the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GridCoordinate dataSourcePivotTableAnchorCell;

  /**
   * References to a DataSourceTable anchored at the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GridCoordinate dataSourceTableAnchorCell;

  /**
   * References to a DATA_SOURCE sheet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sheetId;

  /**
   * References to a data source chart.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getChartId() {
    return chartId;
  }

  /**
   * References to a data source chart.
   * @param chartId chartId or {@code null} for none
   */
  public DataSourceObjectReference setChartId(java.lang.Integer chartId) {
    this.chartId = chartId;
    return this;
  }

  /**
   * References to a cell containing DataSourceFormula.
   * @return value or {@code null} for none
   */
  public GridCoordinate getDataSourceFormulaCell() {
    return dataSourceFormulaCell;
  }

  /**
   * References to a cell containing DataSourceFormula.
   * @param dataSourceFormulaCell dataSourceFormulaCell or {@code null} for none
   */
  public DataSourceObjectReference setDataSourceFormulaCell(GridCoordinate dataSourceFormulaCell) {
    this.dataSourceFormulaCell = dataSourceFormulaCell;
    return this;
  }

  /**
   * References to a data source PivotTable anchored at the cell.
   * @return value or {@code null} for none
   */
  public GridCoordinate getDataSourcePivotTableAnchorCell() {
    return dataSourcePivotTableAnchorCell;
  }

  /**
   * References to a data source PivotTable anchored at the cell.
   * @param dataSourcePivotTableAnchorCell dataSourcePivotTableAnchorCell or {@code null} for none
   */
  public DataSourceObjectReference setDataSourcePivotTableAnchorCell(GridCoordinate dataSourcePivotTableAnchorCell) {
    this.dataSourcePivotTableAnchorCell = dataSourcePivotTableAnchorCell;
    return this;
  }

  /**
   * References to a DataSourceTable anchored at the cell.
   * @return value or {@code null} for none
   */
  public GridCoordinate getDataSourceTableAnchorCell() {
    return dataSourceTableAnchorCell;
  }

  /**
   * References to a DataSourceTable anchored at the cell.
   * @param dataSourceTableAnchorCell dataSourceTableAnchorCell or {@code null} for none
   */
  public DataSourceObjectReference setDataSourceTableAnchorCell(GridCoordinate dataSourceTableAnchorCell) {
    this.dataSourceTableAnchorCell = dataSourceTableAnchorCell;
    return this;
  }

  /**
   * References to a DATA_SOURCE sheet.
   * @return value or {@code null} for none
   */
  public java.lang.String getSheetId() {
    return sheetId;
  }

  /**
   * References to a DATA_SOURCE sheet.
   * @param sheetId sheetId or {@code null} for none
   */
  public DataSourceObjectReference setSheetId(java.lang.String sheetId) {
    this.sheetId = sheetId;
    return this;
  }

  @Override
  public DataSourceObjectReference set(String fieldName, Object value) {
    return (DataSourceObjectReference) super.set(fieldName, value);
  }

  @Override
  public DataSourceObjectReference clone() {
    return (DataSourceObjectReference) super.clone();
  }

}
