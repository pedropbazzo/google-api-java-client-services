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
 * Settings for one set of data labels. Data labels are annotations that appear next to a set of
 * data, such as the points on a line chart, and provide additional information about what the data
 * represents, such as a text representation of the value behind that point on the graph.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataLabel extends com.google.api.client.json.GenericJson {

  /**
   * Data to use for custom labels. Only used if type is set to CUSTOM. This data must be the same
   * length as the series or other element this data label is applied to. In addition, if the series
   * is split into multiple source ranges, this source data must come from the next column in the
   * source data. For example, if the series is B2:B4,E6:E8 then this data must come from
   * C2:C4,F6:F8.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChartData customLabelData;

  /**
   * The placement of the data label relative to the labeled data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String placement;

  /**
   * The text format used for the data label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextFormat textFormat;

  /**
   * The type of the data label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Data to use for custom labels. Only used if type is set to CUSTOM. This data must be the same
   * length as the series or other element this data label is applied to. In addition, if the series
   * is split into multiple source ranges, this source data must come from the next column in the
   * source data. For example, if the series is B2:B4,E6:E8 then this data must come from
   * C2:C4,F6:F8.
   * @return value or {@code null} for none
   */
  public ChartData getCustomLabelData() {
    return customLabelData;
  }

  /**
   * Data to use for custom labels. Only used if type is set to CUSTOM. This data must be the same
   * length as the series or other element this data label is applied to. In addition, if the series
   * is split into multiple source ranges, this source data must come from the next column in the
   * source data. For example, if the series is B2:B4,E6:E8 then this data must come from
   * C2:C4,F6:F8.
   * @param customLabelData customLabelData or {@code null} for none
   */
  public DataLabel setCustomLabelData(ChartData customLabelData) {
    this.customLabelData = customLabelData;
    return this;
  }

  /**
   * The placement of the data label relative to the labeled data.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlacement() {
    return placement;
  }

  /**
   * The placement of the data label relative to the labeled data.
   * @param placement placement or {@code null} for none
   */
  public DataLabel setPlacement(java.lang.String placement) {
    this.placement = placement;
    return this;
  }

  /**
   * The text format used for the data label.
   * @return value or {@code null} for none
   */
  public TextFormat getTextFormat() {
    return textFormat;
  }

  /**
   * The text format used for the data label.
   * @param textFormat textFormat or {@code null} for none
   */
  public DataLabel setTextFormat(TextFormat textFormat) {
    this.textFormat = textFormat;
    return this;
  }

  /**
   * The type of the data label.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the data label.
   * @param type type or {@code null} for none
   */
  public DataLabel setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public DataLabel set(String fieldName, Object value) {
    return (DataLabel) super.set(fieldName, value);
  }

  @Override
  public DataLabel clone() {
    return (DataLabel) super.clone();
  }

}
