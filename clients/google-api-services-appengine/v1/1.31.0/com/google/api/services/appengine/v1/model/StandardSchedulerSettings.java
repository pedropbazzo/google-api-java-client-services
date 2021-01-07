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

package com.google.api.services.appengine.v1.model;

/**
 * Scheduler settings for standard environment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StandardSchedulerSettings extends com.google.api.client.json.GenericJson {

  /**
   * Maximum number of instances to run for this version. Set to zero to disable max_instances
   * configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxInstances;

  /**
   * Minimum number of instances to run for this version. Set to zero to disable min_instances
   * configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minInstances;

  /**
   * Target CPU utilization ratio to maintain when scaling.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double targetCpuUtilization;

  /**
   * Target throughput utilization ratio to maintain when scaling
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double targetThroughputUtilization;

  /**
   * Maximum number of instances to run for this version. Set to zero to disable max_instances
   * configuration.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxInstances() {
    return maxInstances;
  }

  /**
   * Maximum number of instances to run for this version. Set to zero to disable max_instances
   * configuration.
   * @param maxInstances maxInstances or {@code null} for none
   */
  public StandardSchedulerSettings setMaxInstances(java.lang.Integer maxInstances) {
    this.maxInstances = maxInstances;
    return this;
  }

  /**
   * Minimum number of instances to run for this version. Set to zero to disable min_instances
   * configuration.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinInstances() {
    return minInstances;
  }

  /**
   * Minimum number of instances to run for this version. Set to zero to disable min_instances
   * configuration.
   * @param minInstances minInstances or {@code null} for none
   */
  public StandardSchedulerSettings setMinInstances(java.lang.Integer minInstances) {
    this.minInstances = minInstances;
    return this;
  }

  /**
   * Target CPU utilization ratio to maintain when scaling.
   * @return value or {@code null} for none
   */
  public java.lang.Double getTargetCpuUtilization() {
    return targetCpuUtilization;
  }

  /**
   * Target CPU utilization ratio to maintain when scaling.
   * @param targetCpuUtilization targetCpuUtilization or {@code null} for none
   */
  public StandardSchedulerSettings setTargetCpuUtilization(java.lang.Double targetCpuUtilization) {
    this.targetCpuUtilization = targetCpuUtilization;
    return this;
  }

  /**
   * Target throughput utilization ratio to maintain when scaling
   * @return value or {@code null} for none
   */
  public java.lang.Double getTargetThroughputUtilization() {
    return targetThroughputUtilization;
  }

  /**
   * Target throughput utilization ratio to maintain when scaling
   * @param targetThroughputUtilization targetThroughputUtilization or {@code null} for none
   */
  public StandardSchedulerSettings setTargetThroughputUtilization(java.lang.Double targetThroughputUtilization) {
    this.targetThroughputUtilization = targetThroughputUtilization;
    return this;
  }

  @Override
  public StandardSchedulerSettings set(String fieldName, Object value) {
    return (StandardSchedulerSettings) super.set(fieldName, value);
  }

  @Override
  public StandardSchedulerSettings clone() {
    return (StandardSchedulerSettings) super.clone();
  }

}
