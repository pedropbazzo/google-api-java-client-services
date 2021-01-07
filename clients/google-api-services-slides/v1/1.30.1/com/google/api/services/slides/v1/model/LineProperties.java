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
 * The properties of the Line. When unset, these fields default to values that match the appearance
 * of new lines created in the Slides editor.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LineProperties extends com.google.api.client.json.GenericJson {

  /**
   * The dash style of the line.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dashStyle;

  /**
   * The style of the arrow at the end of the line.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endArrow;

  /**
   * The connection at the end of the line. If unset, there is no connection. Only lines with a Type
   * indicating it is a "connector" can have an `end_connection`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LineConnection endConnection;

  /**
   * The fill of the line. The default line fill matches the defaults for new lines created in the
   * Slides editor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LineFill lineFill;

  /**
   * The hyperlink destination of the line. If unset, there is no link.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Link link;

  /**
   * The style of the arrow at the beginning of the line.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startArrow;

  /**
   * The connection at the beginning of the line. If unset, there is no connection. Only lines with
   * a Type indicating it is a "connector" can have a `start_connection`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LineConnection startConnection;

  /**
   * The thickness of the line.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension weight;

  /**
   * The dash style of the line.
   * @return value or {@code null} for none
   */
  public java.lang.String getDashStyle() {
    return dashStyle;
  }

  /**
   * The dash style of the line.
   * @param dashStyle dashStyle or {@code null} for none
   */
  public LineProperties setDashStyle(java.lang.String dashStyle) {
    this.dashStyle = dashStyle;
    return this;
  }

  /**
   * The style of the arrow at the end of the line.
   * @return value or {@code null} for none
   */
  public java.lang.String getEndArrow() {
    return endArrow;
  }

  /**
   * The style of the arrow at the end of the line.
   * @param endArrow endArrow or {@code null} for none
   */
  public LineProperties setEndArrow(java.lang.String endArrow) {
    this.endArrow = endArrow;
    return this;
  }

  /**
   * The connection at the end of the line. If unset, there is no connection. Only lines with a Type
   * indicating it is a "connector" can have an `end_connection`.
   * @return value or {@code null} for none
   */
  public LineConnection getEndConnection() {
    return endConnection;
  }

  /**
   * The connection at the end of the line. If unset, there is no connection. Only lines with a Type
   * indicating it is a "connector" can have an `end_connection`.
   * @param endConnection endConnection or {@code null} for none
   */
  public LineProperties setEndConnection(LineConnection endConnection) {
    this.endConnection = endConnection;
    return this;
  }

  /**
   * The fill of the line. The default line fill matches the defaults for new lines created in the
   * Slides editor.
   * @return value or {@code null} for none
   */
  public LineFill getLineFill() {
    return lineFill;
  }

  /**
   * The fill of the line. The default line fill matches the defaults for new lines created in the
   * Slides editor.
   * @param lineFill lineFill or {@code null} for none
   */
  public LineProperties setLineFill(LineFill lineFill) {
    this.lineFill = lineFill;
    return this;
  }

  /**
   * The hyperlink destination of the line. If unset, there is no link.
   * @return value or {@code null} for none
   */
  public Link getLink() {
    return link;
  }

  /**
   * The hyperlink destination of the line. If unset, there is no link.
   * @param link link or {@code null} for none
   */
  public LineProperties setLink(Link link) {
    this.link = link;
    return this;
  }

  /**
   * The style of the arrow at the beginning of the line.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartArrow() {
    return startArrow;
  }

  /**
   * The style of the arrow at the beginning of the line.
   * @param startArrow startArrow or {@code null} for none
   */
  public LineProperties setStartArrow(java.lang.String startArrow) {
    this.startArrow = startArrow;
    return this;
  }

  /**
   * The connection at the beginning of the line. If unset, there is no connection. Only lines with
   * a Type indicating it is a "connector" can have a `start_connection`.
   * @return value or {@code null} for none
   */
  public LineConnection getStartConnection() {
    return startConnection;
  }

  /**
   * The connection at the beginning of the line. If unset, there is no connection. Only lines with
   * a Type indicating it is a "connector" can have a `start_connection`.
   * @param startConnection startConnection or {@code null} for none
   */
  public LineProperties setStartConnection(LineConnection startConnection) {
    this.startConnection = startConnection;
    return this;
  }

  /**
   * The thickness of the line.
   * @return value or {@code null} for none
   */
  public Dimension getWeight() {
    return weight;
  }

  /**
   * The thickness of the line.
   * @param weight weight or {@code null} for none
   */
  public LineProperties setWeight(Dimension weight) {
    this.weight = weight;
    return this;
  }

  @Override
  public LineProperties set(String fieldName, Object value) {
    return (LineProperties) super.set(fieldName, value);
  }

  @Override
  public LineProperties clone() {
    return (LineProperties) super.clone();
  }

}
