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
 * The request for Firestore.PartitionQuery.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PartitionQueryRequest extends com.google.api.client.json.GenericJson {

  /**
   * The maximum number of partitions to return in this call, subject to `partition_count`. For
   * example, if `partition_count` = 10 and `page_size` = 8, the first call to PartitionQuery will
   * return up to 8 partitions and a `next_page_token` if more results exist. A second call to
   * PartitionQuery will return up to 2 partitions, to complete the total of 10 specified in
   * `partition_count`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * The `next_page_token` value returned from a previous call to PartitionQuery that may be used to
   * get an additional set of results. There are no ordering guarantees between sets of results.
   * Thus, using multiple sets of results will require merging the different result sets. For
   * example, two subsequent calls using a page_token may return: * cursor B, cursor M, cursor Q *
   * cursor A, cursor U, cursor W To obtain a complete result set ordered with respect to the
   * results of the query supplied to PartitionQuery, the results sets should be merged: cursor A,
   * cursor B, cursor M, cursor Q, cursor U, cursor W
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * The desired maximum number of partition points. The partitions may be returned across multiple
   * pages of results. The number must be positive. The actual number of partitions returned may be
   * fewer. For example, this may be set to one fewer than the number of parallel queries to be run,
   * or in running a data pipeline job, one fewer than the number of workers or compute instances
   * available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long partitionCount;

  /**
   * A structured query. Query must specify collection with all descendants and be ordered by name
   * ascending. Other filters, order bys, limits, offsets, and start/end cursors are not supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StructuredQuery structuredQuery;

  /**
   * The maximum number of partitions to return in this call, subject to `partition_count`. For
   * example, if `partition_count` = 10 and `page_size` = 8, the first call to PartitionQuery will
   * return up to 8 partitions and a `next_page_token` if more results exist. A second call to
   * PartitionQuery will return up to 2 partitions, to complete the total of 10 specified in
   * `partition_count`.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * The maximum number of partitions to return in this call, subject to `partition_count`. For
   * example, if `partition_count` = 10 and `page_size` = 8, the first call to PartitionQuery will
   * return up to 8 partitions and a `next_page_token` if more results exist. A second call to
   * PartitionQuery will return up to 2 partitions, to complete the total of 10 specified in
   * `partition_count`.
   * @param pageSize pageSize or {@code null} for none
   */
  public PartitionQueryRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * The `next_page_token` value returned from a previous call to PartitionQuery that may be used to
   * get an additional set of results. There are no ordering guarantees between sets of results.
   * Thus, using multiple sets of results will require merging the different result sets. For
   * example, two subsequent calls using a page_token may return: * cursor B, cursor M, cursor Q *
   * cursor A, cursor U, cursor W To obtain a complete result set ordered with respect to the
   * results of the query supplied to PartitionQuery, the results sets should be merged: cursor A,
   * cursor B, cursor M, cursor Q, cursor U, cursor W
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * The `next_page_token` value returned from a previous call to PartitionQuery that may be used to
   * get an additional set of results. There are no ordering guarantees between sets of results.
   * Thus, using multiple sets of results will require merging the different result sets. For
   * example, two subsequent calls using a page_token may return: * cursor B, cursor M, cursor Q *
   * cursor A, cursor U, cursor W To obtain a complete result set ordered with respect to the
   * results of the query supplied to PartitionQuery, the results sets should be merged: cursor A,
   * cursor B, cursor M, cursor Q, cursor U, cursor W
   * @param pageToken pageToken or {@code null} for none
   */
  public PartitionQueryRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * The desired maximum number of partition points. The partitions may be returned across multiple
   * pages of results. The number must be positive. The actual number of partitions returned may be
   * fewer. For example, this may be set to one fewer than the number of parallel queries to be run,
   * or in running a data pipeline job, one fewer than the number of workers or compute instances
   * available.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPartitionCount() {
    return partitionCount;
  }

  /**
   * The desired maximum number of partition points. The partitions may be returned across multiple
   * pages of results. The number must be positive. The actual number of partitions returned may be
   * fewer. For example, this may be set to one fewer than the number of parallel queries to be run,
   * or in running a data pipeline job, one fewer than the number of workers or compute instances
   * available.
   * @param partitionCount partitionCount or {@code null} for none
   */
  public PartitionQueryRequest setPartitionCount(java.lang.Long partitionCount) {
    this.partitionCount = partitionCount;
    return this;
  }

  /**
   * A structured query. Query must specify collection with all descendants and be ordered by name
   * ascending. Other filters, order bys, limits, offsets, and start/end cursors are not supported.
   * @return value or {@code null} for none
   */
  public StructuredQuery getStructuredQuery() {
    return structuredQuery;
  }

  /**
   * A structured query. Query must specify collection with all descendants and be ordered by name
   * ascending. Other filters, order bys, limits, offsets, and start/end cursors are not supported.
   * @param structuredQuery structuredQuery or {@code null} for none
   */
  public PartitionQueryRequest setStructuredQuery(StructuredQuery structuredQuery) {
    this.structuredQuery = structuredQuery;
    return this;
  }

  @Override
  public PartitionQueryRequest set(String fieldName, Object value) {
    return (PartitionQueryRequest) super.set(fieldName, value);
  }

  @Override
  public PartitionQueryRequest clone() {
    return (PartitionQueryRequest) super.clone();
  }

}
