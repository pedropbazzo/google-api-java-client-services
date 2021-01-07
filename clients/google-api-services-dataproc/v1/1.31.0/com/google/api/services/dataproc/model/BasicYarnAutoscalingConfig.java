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

package com.google.api.services.dataproc.model;

/**
 * Basic autoscaling configurations for YARN.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BasicYarnAutoscalingConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. Timeout for YARN graceful decommissioning of Node Managers. Specifies the duration to
   * wait for jobs to complete before forcefully removing workers (and potentially interrupting
   * jobs). Only applicable to downscaling operations.Bounds: 0s, 1d.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String gracefulDecommissionTimeout;

  /**
   * Required. Fraction of average YARN pending memory in the last cooldown period for which to
   * remove workers. A scale-down factor of 1 will result in scaling down so that there is no
   * available memory remaining after the update (more aggressive scaling). A scale-down factor of 0
   * disables removing workers, which can be beneficial for autoscaling a single job. See How
   * autoscaling works (https://cloud.google.com/dataproc/docs/concepts/configuring-
   * clusters/autoscaling#how_autoscaling_works) for more information.Bounds: 0.0, 1.0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double scaleDownFactor;

  /**
   * Optional. Minimum scale-down threshold as a fraction of total cluster size before scaling
   * occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must
   * recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0 means the
   * autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double scaleDownMinWorkerFraction;

  /**
   * Required. Fraction of average YARN pending memory in the last cooldown period for which to add
   * workers. A scale-up factor of 1.0 will result in scaling up so that there is no pending memory
   * remaining after the update (more aggressive scaling). A scale-up factor closer to 0 will result
   * in a smaller magnitude of scaling up (less aggressive scaling). See How autoscaling works
   * (https://cloud.google.com/dataproc/docs/concepts/configuring-
   * clusters/autoscaling#how_autoscaling_works) for more information.Bounds: 0.0, 1.0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double scaleUpFactor;

  /**
   * Optional. Minimum scale-up threshold as a fraction of total cluster size before scaling occurs.
   * For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at
   * least a 2-worker scale-up for the cluster to scale. A threshold of 0 means the autoscaler will
   * scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double scaleUpMinWorkerFraction;

  /**
   * Required. Timeout for YARN graceful decommissioning of Node Managers. Specifies the duration to
   * wait for jobs to complete before forcefully removing workers (and potentially interrupting
   * jobs). Only applicable to downscaling operations.Bounds: 0s, 1d.
   * @return value or {@code null} for none
   */
  public String getGracefulDecommissionTimeout() {
    return gracefulDecommissionTimeout;
  }

  /**
   * Required. Timeout for YARN graceful decommissioning of Node Managers. Specifies the duration to
   * wait for jobs to complete before forcefully removing workers (and potentially interrupting
   * jobs). Only applicable to downscaling operations.Bounds: 0s, 1d.
   * @param gracefulDecommissionTimeout gracefulDecommissionTimeout or {@code null} for none
   */
  public BasicYarnAutoscalingConfig setGracefulDecommissionTimeout(String gracefulDecommissionTimeout) {
    this.gracefulDecommissionTimeout = gracefulDecommissionTimeout;
    return this;
  }

  /**
   * Required. Fraction of average YARN pending memory in the last cooldown period for which to
   * remove workers. A scale-down factor of 1 will result in scaling down so that there is no
   * available memory remaining after the update (more aggressive scaling). A scale-down factor of 0
   * disables removing workers, which can be beneficial for autoscaling a single job. See How
   * autoscaling works (https://cloud.google.com/dataproc/docs/concepts/configuring-
   * clusters/autoscaling#how_autoscaling_works) for more information.Bounds: 0.0, 1.0.
   * @return value or {@code null} for none
   */
  public java.lang.Double getScaleDownFactor() {
    return scaleDownFactor;
  }

  /**
   * Required. Fraction of average YARN pending memory in the last cooldown period for which to
   * remove workers. A scale-down factor of 1 will result in scaling down so that there is no
   * available memory remaining after the update (more aggressive scaling). A scale-down factor of 0
   * disables removing workers, which can be beneficial for autoscaling a single job. See How
   * autoscaling works (https://cloud.google.com/dataproc/docs/concepts/configuring-
   * clusters/autoscaling#how_autoscaling_works) for more information.Bounds: 0.0, 1.0.
   * @param scaleDownFactor scaleDownFactor or {@code null} for none
   */
  public BasicYarnAutoscalingConfig setScaleDownFactor(java.lang.Double scaleDownFactor) {
    this.scaleDownFactor = scaleDownFactor;
    return this;
  }

  /**
   * Optional. Minimum scale-down threshold as a fraction of total cluster size before scaling
   * occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must
   * recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0 means the
   * autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
   * @return value or {@code null} for none
   */
  public java.lang.Double getScaleDownMinWorkerFraction() {
    return scaleDownMinWorkerFraction;
  }

  /**
   * Optional. Minimum scale-down threshold as a fraction of total cluster size before scaling
   * occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must
   * recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0 means the
   * autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
   * @param scaleDownMinWorkerFraction scaleDownMinWorkerFraction or {@code null} for none
   */
  public BasicYarnAutoscalingConfig setScaleDownMinWorkerFraction(java.lang.Double scaleDownMinWorkerFraction) {
    this.scaleDownMinWorkerFraction = scaleDownMinWorkerFraction;
    return this;
  }

  /**
   * Required. Fraction of average YARN pending memory in the last cooldown period for which to add
   * workers. A scale-up factor of 1.0 will result in scaling up so that there is no pending memory
   * remaining after the update (more aggressive scaling). A scale-up factor closer to 0 will result
   * in a smaller magnitude of scaling up (less aggressive scaling). See How autoscaling works
   * (https://cloud.google.com/dataproc/docs/concepts/configuring-
   * clusters/autoscaling#how_autoscaling_works) for more information.Bounds: 0.0, 1.0.
   * @return value or {@code null} for none
   */
  public java.lang.Double getScaleUpFactor() {
    return scaleUpFactor;
  }

  /**
   * Required. Fraction of average YARN pending memory in the last cooldown period for which to add
   * workers. A scale-up factor of 1.0 will result in scaling up so that there is no pending memory
   * remaining after the update (more aggressive scaling). A scale-up factor closer to 0 will result
   * in a smaller magnitude of scaling up (less aggressive scaling). See How autoscaling works
   * (https://cloud.google.com/dataproc/docs/concepts/configuring-
   * clusters/autoscaling#how_autoscaling_works) for more information.Bounds: 0.0, 1.0.
   * @param scaleUpFactor scaleUpFactor or {@code null} for none
   */
  public BasicYarnAutoscalingConfig setScaleUpFactor(java.lang.Double scaleUpFactor) {
    this.scaleUpFactor = scaleUpFactor;
    return this;
  }

  /**
   * Optional. Minimum scale-up threshold as a fraction of total cluster size before scaling occurs.
   * For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at
   * least a 2-worker scale-up for the cluster to scale. A threshold of 0 means the autoscaler will
   * scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
   * @return value or {@code null} for none
   */
  public java.lang.Double getScaleUpMinWorkerFraction() {
    return scaleUpMinWorkerFraction;
  }

  /**
   * Optional. Minimum scale-up threshold as a fraction of total cluster size before scaling occurs.
   * For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at
   * least a 2-worker scale-up for the cluster to scale. A threshold of 0 means the autoscaler will
   * scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
   * @param scaleUpMinWorkerFraction scaleUpMinWorkerFraction or {@code null} for none
   */
  public BasicYarnAutoscalingConfig setScaleUpMinWorkerFraction(java.lang.Double scaleUpMinWorkerFraction) {
    this.scaleUpMinWorkerFraction = scaleUpMinWorkerFraction;
    return this;
  }

  @Override
  public BasicYarnAutoscalingConfig set(String fieldName, Object value) {
    return (BasicYarnAutoscalingConfig) super.set(fieldName, value);
  }

  @Override
  public BasicYarnAutoscalingConfig clone() {
    return (BasicYarnAutoscalingConfig) super.clone();
  }

}
