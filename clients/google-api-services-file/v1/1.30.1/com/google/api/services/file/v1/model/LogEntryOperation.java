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

package com.google.api.services.file.v1.model;

/**
 * Additional information about a potentially long-running operation with which a log entry is
 * associated.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Filestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LogEntryOperation extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Set this to True if this is the first log entry in the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean first;

  /**
   * Optional. An arbitrary operation identifier. Log entries with the same identifier are assumed
   * to be part of the same operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Optional. Set this to True if this is the last log entry in the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean last;

  /**
   * Optional. An arbitrary producer identifier. The combination of `id` and `producer` must be
   * globally unique.  Examples for `producer`: `"MyDivision.MyBigCompany.com"`,
   * `"github.com/MyProject/MyApplication"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String producer;

  /**
   * Optional. Set this to True if this is the first log entry in the operation.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFirst() {
    return first;
  }

  /**
   * Optional. Set this to True if this is the first log entry in the operation.
   * @param first first or {@code null} for none
   */
  public LogEntryOperation setFirst(java.lang.Boolean first) {
    this.first = first;
    return this;
  }

  /**
   * Optional. An arbitrary operation identifier. Log entries with the same identifier are assumed
   * to be part of the same operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Optional. An arbitrary operation identifier. Log entries with the same identifier are assumed
   * to be part of the same operation.
   * @param id id or {@code null} for none
   */
  public LogEntryOperation setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Optional. Set this to True if this is the last log entry in the operation.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLast() {
    return last;
  }

  /**
   * Optional. Set this to True if this is the last log entry in the operation.
   * @param last last or {@code null} for none
   */
  public LogEntryOperation setLast(java.lang.Boolean last) {
    this.last = last;
    return this;
  }

  /**
   * Optional. An arbitrary producer identifier. The combination of `id` and `producer` must be
   * globally unique.  Examples for `producer`: `"MyDivision.MyBigCompany.com"`,
   * `"github.com/MyProject/MyApplication"`.
   * @return value or {@code null} for none
   */
  public java.lang.String getProducer() {
    return producer;
  }

  /**
   * Optional. An arbitrary producer identifier. The combination of `id` and `producer` must be
   * globally unique.  Examples for `producer`: `"MyDivision.MyBigCompany.com"`,
   * `"github.com/MyProject/MyApplication"`.
   * @param producer producer or {@code null} for none
   */
  public LogEntryOperation setProducer(java.lang.String producer) {
    this.producer = producer;
    return this;
  }

  @Override
  public LogEntryOperation set(String fieldName, Object value) {
    return (LogEntryOperation) super.set(fieldName, value);
  }

  @Override
  public LogEntryOperation clone() {
    return (LogEntryOperation) super.clone();
  }

}
