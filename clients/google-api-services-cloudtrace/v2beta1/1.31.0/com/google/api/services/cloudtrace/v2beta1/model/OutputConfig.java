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

package com.google.api.services.cloudtrace.v2beta1.model;

/**
 * OutputConfig contains a destination for writing trace data.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Trace API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OutputConfig extends com.google.api.client.json.GenericJson {

  /**
   * The destination for writing trace data. Currently only BigQuery is supported. E.g.:
   * "bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destination;

  /**
   * The destination for writing trace data. Currently only BigQuery is supported. E.g.:
   * "bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]"
   * @return value or {@code null} for none
   */
  public java.lang.String getDestination() {
    return destination;
  }

  /**
   * The destination for writing trace data. Currently only BigQuery is supported. E.g.:
   * "bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]"
   * @param destination destination or {@code null} for none
   */
  public OutputConfig setDestination(java.lang.String destination) {
    this.destination = destination;
    return this;
  }

  @Override
  public OutputConfig set(String fieldName, Object value) {
    return (OutputConfig) super.set(fieldName, value);
  }

  @Override
  public OutputConfig clone() {
    return (OutputConfig) super.clone();
  }

}
