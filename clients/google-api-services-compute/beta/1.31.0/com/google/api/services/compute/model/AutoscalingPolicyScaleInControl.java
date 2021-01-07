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

package com.google.api.services.compute.model;

/**
 * Configuration that allows for slower scale in so that even if Autoscaler recommends an abrupt
 * scale in of a MIG, it will be throttled as specified by the parameters below.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AutoscalingPolicyScaleInControl extends com.google.api.client.json.GenericJson {

  /**
   * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during
   * the window autoscaler looks at when computing recommendations. Possibly all these VMs can be
   * deleted at once so user service needs to be prepared to lose that many VMs in one step.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FixedOrPercent maxScaledInReplicas;

  /**
   * How far back autoscaling looks when computing recommendations to include directives regarding
   * slower scale in, as described above.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer timeWindowSec;

  /**
   * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during
   * the window autoscaler looks at when computing recommendations. Possibly all these VMs can be
   * deleted at once so user service needs to be prepared to lose that many VMs in one step.
   * @return value or {@code null} for none
   */
  public FixedOrPercent getMaxScaledInReplicas() {
    return maxScaledInReplicas;
  }

  /**
   * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during
   * the window autoscaler looks at when computing recommendations. Possibly all these VMs can be
   * deleted at once so user service needs to be prepared to lose that many VMs in one step.
   * @param maxScaledInReplicas maxScaledInReplicas or {@code null} for none
   */
  public AutoscalingPolicyScaleInControl setMaxScaledInReplicas(FixedOrPercent maxScaledInReplicas) {
    this.maxScaledInReplicas = maxScaledInReplicas;
    return this;
  }

  /**
   * How far back autoscaling looks when computing recommendations to include directives regarding
   * slower scale in, as described above.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTimeWindowSec() {
    return timeWindowSec;
  }

  /**
   * How far back autoscaling looks when computing recommendations to include directives regarding
   * slower scale in, as described above.
   * @param timeWindowSec timeWindowSec or {@code null} for none
   */
  public AutoscalingPolicyScaleInControl setTimeWindowSec(java.lang.Integer timeWindowSec) {
    this.timeWindowSec = timeWindowSec;
    return this;
  }

  @Override
  public AutoscalingPolicyScaleInControl set(String fieldName, Object value) {
    return (AutoscalingPolicyScaleInControl) super.set(fieldName, value);
  }

  @Override
  public AutoscalingPolicyScaleInControl clone() {
    return (AutoscalingPolicyScaleInControl) super.clone();
  }

}
