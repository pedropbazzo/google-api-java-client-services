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

package com.google.api.services.bigquery.model;

/**
 * Information about a single cluster for clustering model.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ClusterInfo extends com.google.api.client.json.GenericJson {

  /**
   * Centroid id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long centroidId;

  /**
   * Cluster radius, the average distance from centroid to each point assigned to the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double clusterRadius;

  /**
   * Cluster size, the total number of points assigned to the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long clusterSize;

  /**
   * Centroid id.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCentroidId() {
    return centroidId;
  }

  /**
   * Centroid id.
   * @param centroidId centroidId or {@code null} for none
   */
  public ClusterInfo setCentroidId(java.lang.Long centroidId) {
    this.centroidId = centroidId;
    return this;
  }

  /**
   * Cluster radius, the average distance from centroid to each point assigned to the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.Double getClusterRadius() {
    return clusterRadius;
  }

  /**
   * Cluster radius, the average distance from centroid to each point assigned to the cluster.
   * @param clusterRadius clusterRadius or {@code null} for none
   */
  public ClusterInfo setClusterRadius(java.lang.Double clusterRadius) {
    this.clusterRadius = clusterRadius;
    return this;
  }

  /**
   * Cluster size, the total number of points assigned to the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.Long getClusterSize() {
    return clusterSize;
  }

  /**
   * Cluster size, the total number of points assigned to the cluster.
   * @param clusterSize clusterSize or {@code null} for none
   */
  public ClusterInfo setClusterSize(java.lang.Long clusterSize) {
    this.clusterSize = clusterSize;
    return this;
  }

  @Override
  public ClusterInfo set(String fieldName, Object value) {
    return (ClusterInfo) super.set(fieldName, value);
  }

  @Override
  public ClusterInfo clone() {
    return (ClusterInfo) super.clone();
  }

}
