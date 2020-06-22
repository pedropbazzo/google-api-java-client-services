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

package com.google.api.services.serviceusage.v1.model;

/**
 * Quota policy created by quota administrator.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AdminQuotaPolicy extends com.google.api.client.json.GenericJson {

  /**
   * The cloud resource container at which the quota policy is created. The format is
   * {container_type}/{container_number}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String container;

  /**
   * If this map is nonempty, then this policy applies only to specific values for dimensions
   * defined in the limit unit.
   *
   * For example, an policy on a limit with the unit 1/{project}/{region} could contain an entry
   * with the key "region" and the value "us-east-1"; the policy is only applied to quota consumed
   * in that region.
   *
   * This map has the following restrictions:
   *
   * *   If "region" appears as a key, its value must be a valid Cloud region. *   If "zone" appears
   * as a key, its value must be a valid Cloud zone. *   Keys other than "region" or "zone" are not
   * valid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> dimensions;

  /**
   * The name of the metric to which this policy applies.
   *
   * An example name would be: `compute.googleapis.com/cpus`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metric;

  /**
   * The resource name of the policy. This name is generated by the server when the policy is
   * created.
   *
   * Example names would be: `organizations/123/services/compute.googleapis.com/consumerQuotaMetrics
   * /compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/adminQuotaPolicies/4a3f2c1d`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The quota policy value. Can be any nonnegative integer, or -1 (unlimited quota).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long policyValue;

  /**
   * The limit unit of the limit to which this policy applies.
   *
   * An example unit would be: `1/{project}/{region}` Note that `{project}` and `{region}` are not
   * placeholders in this example; the literal characters `{` and `}` occur in the string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unit;

  /**
   * The cloud resource container at which the quota policy is created. The format is
   * {container_type}/{container_number}
   * @return value or {@code null} for none
   */
  public java.lang.String getContainer() {
    return container;
  }

  /**
   * The cloud resource container at which the quota policy is created. The format is
   * {container_type}/{container_number}
   * @param container container or {@code null} for none
   */
  public AdminQuotaPolicy setContainer(java.lang.String container) {
    this.container = container;
    return this;
  }

  /**
   * If this map is nonempty, then this policy applies only to specific values for dimensions
   * defined in the limit unit.
   *
   * For example, an policy on a limit with the unit 1/{project}/{region} could contain an entry
   * with the key "region" and the value "us-east-1"; the policy is only applied to quota consumed
   * in that region.
   *
   * This map has the following restrictions:
   *
   * *   If "region" appears as a key, its value must be a valid Cloud region. *   If "zone" appears
   * as a key, its value must be a valid Cloud zone. *   Keys other than "region" or "zone" are not
   * valid.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getDimensions() {
    return dimensions;
  }

  /**
   * If this map is nonempty, then this policy applies only to specific values for dimensions
   * defined in the limit unit.
   *
   * For example, an policy on a limit with the unit 1/{project}/{region} could contain an entry
   * with the key "region" and the value "us-east-1"; the policy is only applied to quota consumed
   * in that region.
   *
   * This map has the following restrictions:
   *
   * *   If "region" appears as a key, its value must be a valid Cloud region. *   If "zone" appears
   * as a key, its value must be a valid Cloud zone. *   Keys other than "region" or "zone" are not
   * valid.
   * @param dimensions dimensions or {@code null} for none
   */
  public AdminQuotaPolicy setDimensions(java.util.Map<String, java.lang.String> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  /**
   * The name of the metric to which this policy applies.
   *
   * An example name would be: `compute.googleapis.com/cpus`
   * @return value or {@code null} for none
   */
  public java.lang.String getMetric() {
    return metric;
  }

  /**
   * The name of the metric to which this policy applies.
   *
   * An example name would be: `compute.googleapis.com/cpus`
   * @param metric metric or {@code null} for none
   */
  public AdminQuotaPolicy setMetric(java.lang.String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * The resource name of the policy. This name is generated by the server when the policy is
   * created.
   *
   * Example names would be: `organizations/123/services/compute.googleapis.com/consumerQuotaMetrics
   * /compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/adminQuotaPolicies/4a3f2c1d`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the policy. This name is generated by the server when the policy is
   * created.
   *
   * Example names would be: `organizations/123/services/compute.googleapis.com/consumerQuotaMetrics
   * /compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/adminQuotaPolicies/4a3f2c1d`
   * @param name name or {@code null} for none
   */
  public AdminQuotaPolicy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The quota policy value. Can be any nonnegative integer, or -1 (unlimited quota).
   * @return value or {@code null} for none
   */
  public java.lang.Long getPolicyValue() {
    return policyValue;
  }

  /**
   * The quota policy value. Can be any nonnegative integer, or -1 (unlimited quota).
   * @param policyValue policyValue or {@code null} for none
   */
  public AdminQuotaPolicy setPolicyValue(java.lang.Long policyValue) {
    this.policyValue = policyValue;
    return this;
  }

  /**
   * The limit unit of the limit to which this policy applies.
   *
   * An example unit would be: `1/{project}/{region}` Note that `{project}` and `{region}` are not
   * placeholders in this example; the literal characters `{` and `}` occur in the string.
   * @return value or {@code null} for none
   */
  public java.lang.String getUnit() {
    return unit;
  }

  /**
   * The limit unit of the limit to which this policy applies.
   *
   * An example unit would be: `1/{project}/{region}` Note that `{project}` and `{region}` are not
   * placeholders in this example; the literal characters `{` and `}` occur in the string.
   * @param unit unit or {@code null} for none
   */
  public AdminQuotaPolicy setUnit(java.lang.String unit) {
    this.unit = unit;
    return this;
  }

  @Override
  public AdminQuotaPolicy set(String fieldName, Object value) {
    return (AdminQuotaPolicy) super.set(fieldName, value);
  }

  @Override
  public AdminQuotaPolicy clone() {
    return (AdminQuotaPolicy) super.clone();
  }

}
