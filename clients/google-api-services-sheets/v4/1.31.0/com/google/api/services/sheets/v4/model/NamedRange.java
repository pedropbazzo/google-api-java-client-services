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
 * A named range.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NamedRange extends com.google.api.client.json.GenericJson {

  /**
   * The name of the named range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The ID of the named range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String namedRangeId;

  /**
   * The range this represents.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GridRange range;

  /**
   * The name of the named range.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the named range.
   * @param name name or {@code null} for none
   */
  public NamedRange setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The ID of the named range.
   * @return value or {@code null} for none
   */
  public java.lang.String getNamedRangeId() {
    return namedRangeId;
  }

  /**
   * The ID of the named range.
   * @param namedRangeId namedRangeId or {@code null} for none
   */
  public NamedRange setNamedRangeId(java.lang.String namedRangeId) {
    this.namedRangeId = namedRangeId;
    return this;
  }

  /**
   * The range this represents.
   * @return value or {@code null} for none
   */
  public GridRange getRange() {
    return range;
  }

  /**
   * The range this represents.
   * @param range range or {@code null} for none
   */
  public NamedRange setRange(GridRange range) {
    this.range = range;
    return this;
  }

  @Override
  public NamedRange set(String fieldName, Object value) {
    return (NamedRange) super.set(fieldName, value);
  }

  @Override
  public NamedRange clone() {
    return (NamedRange) super.clone();
  }

}
