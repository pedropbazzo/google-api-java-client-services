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

package com.google.api.services.trafficdirector.v2.model;

/**
 * Describes a dynamically loaded cluster via the CDS API.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Traffic Director API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DynamicCluster extends com.google.api.client.json.GenericJson {

  /**
   * The cluster config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> cluster;

  /**
   * The timestamp when the Cluster was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastUpdated;

  /**
   * This is the per-resource version information. This version is currently taken from the
   * :ref:`version_info ` field at the time that the cluster was loaded. In the future, discrete
   * per-cluster versions may be supported by the API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String versionInfo;

  /**
   * The cluster config.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getCluster() {
    return cluster;
  }

  /**
   * The cluster config.
   * @param cluster cluster or {@code null} for none
   */
  public DynamicCluster setCluster(java.util.Map<String, java.lang.Object> cluster) {
    this.cluster = cluster;
    return this;
  }

  /**
   * The timestamp when the Cluster was last updated.
   * @return value or {@code null} for none
   */
  public String getLastUpdated() {
    return lastUpdated;
  }

  /**
   * The timestamp when the Cluster was last updated.
   * @param lastUpdated lastUpdated or {@code null} for none
   */
  public DynamicCluster setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * This is the per-resource version information. This version is currently taken from the
   * :ref:`version_info ` field at the time that the cluster was loaded. In the future, discrete
   * per-cluster versions may be supported by the API.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersionInfo() {
    return versionInfo;
  }

  /**
   * This is the per-resource version information. This version is currently taken from the
   * :ref:`version_info ` field at the time that the cluster was loaded. In the future, discrete
   * per-cluster versions may be supported by the API.
   * @param versionInfo versionInfo or {@code null} for none
   */
  public DynamicCluster setVersionInfo(java.lang.String versionInfo) {
    this.versionInfo = versionInfo;
    return this;
  }

  @Override
  public DynamicCluster set(String fieldName, Object value) {
    return (DynamicCluster) super.set(fieldName, value);
  }

  @Override
  public DynamicCluster clone() {
    return (DynamicCluster) super.clone();
  }

}
