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

package com.google.api.services.firestore.v1.model;

/**
 * The request for Firestore.BatchWrite.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchWriteRequest extends com.google.api.client.json.GenericJson {

  /**
   * Labels associated with this batch write.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The writes to apply. Method does not apply writes atomically and does not guarantee ordering.
   * Each write succeeds or fails independently. You cannot write to the same document more than
   * once per request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Write> writes;

  /**
   * Labels associated with this batch write.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels associated with this batch write.
   * @param labels labels or {@code null} for none
   */
  public BatchWriteRequest setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The writes to apply. Method does not apply writes atomically and does not guarantee ordering.
   * Each write succeeds or fails independently. You cannot write to the same document more than
   * once per request.
   * @return value or {@code null} for none
   */
  public java.util.List<Write> getWrites() {
    return writes;
  }

  /**
   * The writes to apply. Method does not apply writes atomically and does not guarantee ordering.
   * Each write succeeds or fails independently. You cannot write to the same document more than
   * once per request.
   * @param writes writes or {@code null} for none
   */
  public BatchWriteRequest setWrites(java.util.List<Write> writes) {
    this.writes = writes;
    return this;
  }

  @Override
  public BatchWriteRequest set(String fieldName, Object value) {
    return (BatchWriteRequest) super.set(fieldName, value);
  }

  @Override
  public BatchWriteRequest clone() {
    return (BatchWriteRequest) super.clone();
  }

}
