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

package com.google.api.services.container.v1beta1.model;

/**
 * NodePoolAutoscaling contains information required by cluster autoscaler to adjust the size of the
 * node pool to the current cluster usage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NodePoolAutoscaling extends com.google.api.client.json.GenericJson {

  /**
   * Can this node pool be deleted automatically.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoprovisioned;

  /**
   * Is autoscaling enabled for this node pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * Maximum number of nodes in the NodePool. Must be >= min_node_count. There has to enough quota
   * to scale up the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxNodeCount;

  /**
   * Minimum number of nodes in the NodePool. Must be >= 1 and <= max_node_count.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minNodeCount;

  /**
   * Can this node pool be deleted automatically.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoprovisioned() {
    return autoprovisioned;
  }

  /**
   * Can this node pool be deleted automatically.
   * @param autoprovisioned autoprovisioned or {@code null} for none
   */
  public NodePoolAutoscaling setAutoprovisioned(java.lang.Boolean autoprovisioned) {
    this.autoprovisioned = autoprovisioned;
    return this;
  }

  /**
   * Is autoscaling enabled for this node pool.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Is autoscaling enabled for this node pool.
   * @param enabled enabled or {@code null} for none
   */
  public NodePoolAutoscaling setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Maximum number of nodes in the NodePool. Must be >= min_node_count. There has to enough quota
   * to scale up the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxNodeCount() {
    return maxNodeCount;
  }

  /**
   * Maximum number of nodes in the NodePool. Must be >= min_node_count. There has to enough quota
   * to scale up the cluster.
   * @param maxNodeCount maxNodeCount or {@code null} for none
   */
  public NodePoolAutoscaling setMaxNodeCount(java.lang.Integer maxNodeCount) {
    this.maxNodeCount = maxNodeCount;
    return this;
  }

  /**
   * Minimum number of nodes in the NodePool. Must be >= 1 and <= max_node_count.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinNodeCount() {
    return minNodeCount;
  }

  /**
   * Minimum number of nodes in the NodePool. Must be >= 1 and <= max_node_count.
   * @param minNodeCount minNodeCount or {@code null} for none
   */
  public NodePoolAutoscaling setMinNodeCount(java.lang.Integer minNodeCount) {
    this.minNodeCount = minNodeCount;
    return this;
  }

  @Override
  public NodePoolAutoscaling set(String fieldName, Object value) {
    return (NodePoolAutoscaling) super.set(fieldName, value);
  }

  @Override
  public NodePoolAutoscaling clone() {
    return (NodePoolAutoscaling) super.clone();
  }

}
