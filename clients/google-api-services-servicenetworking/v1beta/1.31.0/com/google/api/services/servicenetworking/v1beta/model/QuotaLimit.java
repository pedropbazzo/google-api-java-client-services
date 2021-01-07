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

package com.google.api.services.servicenetworking.v1beta.model;

/**
 * `QuotaLimit` defines a specific limit that applies over a specified duration for a limit type.
 * There can be at most one limit for a duration and limit type combination defined within a
 * `QuotaGroup`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Networking API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QuotaLimit extends com.google.api.client.json.GenericJson {

  /**
   * Default number of tokens that can be consumed during the specified duration. This is the number
   * of tokens assigned when a client application developer activates the service for his/her
   * project. Specifying a value of 0 will block all requests. This can be used if you are
   * provisioning quota to selected consumers and blocking others. Similarly, a value of -1 will
   * indicate an unlimited quota. No other negative values are allowed. Used by group-based quotas
   * only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long defaultLimit;

  /**
   * Optional. User-visible, extended description for this quota limit. Should be used only when
   * more context is needed to understand this limit than provided by the limit's display name (see:
   * `display_name`).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * User-visible display name for this limit. Optional. If not set, the UI will provide a default
   * display name based on the quota configuration. This field can be used to override the default
   * display name generated from the configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Duration of this limit in textual notation. Must be "100s" or "1d". Used by group-based quotas
   * only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String duration;

  /**
   * Free tier value displayed in the Developers Console for this limit. The free tier is the number
   * of tokens that will be subtracted from the billed amount when billing is enabled. This field
   * can only be set on a limit with duration "1d", in a billable group; it is invalid on any other
   * limit. If this field is not set, it defaults to 0, indicating that there is no free tier for
   * this service. Used by group-based quotas only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long freeTier;

  /**
   * Maximum number of tokens that can be consumed during the specified duration. Client application
   * developers can override the default limit up to this maximum. If specified, this value cannot
   * be set to a value less than the default limit. If not specified, it is set to the default
   * limit. To allow clients to apply overrides with no upper bound, set this to -1, indicating
   * unlimited maximum quota. Used by group-based quotas only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxLimit;

  /**
   * The name of the metric this quota limit applies to. The quota limits with the same metric will
   * be checked together during runtime. The metric must be defined within the service config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metric;

  /**
   * Name of the quota limit. The name must be provided, and it must be unique within the service.
   * The name can only include alphanumeric characters as well as '-'. The maximum length of the
   * limit name is 64 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Specify the unit of the quota limit. It uses the same syntax as Metric.unit. The supported unit
   * kinds are determined by the quota backend system. Here are some examples: * "1/min/{project}"
   * for quota per minute per project. Note: the order of unit components is insignificant. The "1"
   * at the beginning is required to follow the metric unit syntax.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unit;

  /**
   * Tiered limit values. You must specify this as a key:value pair, with an integer value that is
   * the maximum number of requests allowed for the specified unit. Currently only STANDARD is
   * supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.Map<String, java.lang.Long> values;

  /**
   * Default number of tokens that can be consumed during the specified duration. This is the number
   * of tokens assigned when a client application developer activates the service for his/her
   * project. Specifying a value of 0 will block all requests. This can be used if you are
   * provisioning quota to selected consumers and blocking others. Similarly, a value of -1 will
   * indicate an unlimited quota. No other negative values are allowed. Used by group-based quotas
   * only.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDefaultLimit() {
    return defaultLimit;
  }

  /**
   * Default number of tokens that can be consumed during the specified duration. This is the number
   * of tokens assigned when a client application developer activates the service for his/her
   * project. Specifying a value of 0 will block all requests. This can be used if you are
   * provisioning quota to selected consumers and blocking others. Similarly, a value of -1 will
   * indicate an unlimited quota. No other negative values are allowed. Used by group-based quotas
   * only.
   * @param defaultLimit defaultLimit or {@code null} for none
   */
  public QuotaLimit setDefaultLimit(java.lang.Long defaultLimit) {
    this.defaultLimit = defaultLimit;
    return this;
  }

  /**
   * Optional. User-visible, extended description for this quota limit. Should be used only when
   * more context is needed to understand this limit than provided by the limit's display name (see:
   * `display_name`).
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. User-visible, extended description for this quota limit. Should be used only when
   * more context is needed to understand this limit than provided by the limit's display name (see:
   * `display_name`).
   * @param description description or {@code null} for none
   */
  public QuotaLimit setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * User-visible display name for this limit. Optional. If not set, the UI will provide a default
   * display name based on the quota configuration. This field can be used to override the default
   * display name generated from the configuration.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * User-visible display name for this limit. Optional. If not set, the UI will provide a default
   * display name based on the quota configuration. This field can be used to override the default
   * display name generated from the configuration.
   * @param displayName displayName or {@code null} for none
   */
  public QuotaLimit setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Duration of this limit in textual notation. Must be "100s" or "1d". Used by group-based quotas
   * only.
   * @return value or {@code null} for none
   */
  public java.lang.String getDuration() {
    return duration;
  }

  /**
   * Duration of this limit in textual notation. Must be "100s" or "1d". Used by group-based quotas
   * only.
   * @param duration duration or {@code null} for none
   */
  public QuotaLimit setDuration(java.lang.String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Free tier value displayed in the Developers Console for this limit. The free tier is the number
   * of tokens that will be subtracted from the billed amount when billing is enabled. This field
   * can only be set on a limit with duration "1d", in a billable group; it is invalid on any other
   * limit. If this field is not set, it defaults to 0, indicating that there is no free tier for
   * this service. Used by group-based quotas only.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFreeTier() {
    return freeTier;
  }

  /**
   * Free tier value displayed in the Developers Console for this limit. The free tier is the number
   * of tokens that will be subtracted from the billed amount when billing is enabled. This field
   * can only be set on a limit with duration "1d", in a billable group; it is invalid on any other
   * limit. If this field is not set, it defaults to 0, indicating that there is no free tier for
   * this service. Used by group-based quotas only.
   * @param freeTier freeTier or {@code null} for none
   */
  public QuotaLimit setFreeTier(java.lang.Long freeTier) {
    this.freeTier = freeTier;
    return this;
  }

  /**
   * Maximum number of tokens that can be consumed during the specified duration. Client application
   * developers can override the default limit up to this maximum. If specified, this value cannot
   * be set to a value less than the default limit. If not specified, it is set to the default
   * limit. To allow clients to apply overrides with no upper bound, set this to -1, indicating
   * unlimited maximum quota. Used by group-based quotas only.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxLimit() {
    return maxLimit;
  }

  /**
   * Maximum number of tokens that can be consumed during the specified duration. Client application
   * developers can override the default limit up to this maximum. If specified, this value cannot
   * be set to a value less than the default limit. If not specified, it is set to the default
   * limit. To allow clients to apply overrides with no upper bound, set this to -1, indicating
   * unlimited maximum quota. Used by group-based quotas only.
   * @param maxLimit maxLimit or {@code null} for none
   */
  public QuotaLimit setMaxLimit(java.lang.Long maxLimit) {
    this.maxLimit = maxLimit;
    return this;
  }

  /**
   * The name of the metric this quota limit applies to. The quota limits with the same metric will
   * be checked together during runtime. The metric must be defined within the service config.
   * @return value or {@code null} for none
   */
  public java.lang.String getMetric() {
    return metric;
  }

  /**
   * The name of the metric this quota limit applies to. The quota limits with the same metric will
   * be checked together during runtime. The metric must be defined within the service config.
   * @param metric metric or {@code null} for none
   */
  public QuotaLimit setMetric(java.lang.String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Name of the quota limit. The name must be provided, and it must be unique within the service.
   * The name can only include alphanumeric characters as well as '-'. The maximum length of the
   * limit name is 64 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the quota limit. The name must be provided, and it must be unique within the service.
   * The name can only include alphanumeric characters as well as '-'. The maximum length of the
   * limit name is 64 characters.
   * @param name name or {@code null} for none
   */
  public QuotaLimit setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Specify the unit of the quota limit. It uses the same syntax as Metric.unit. The supported unit
   * kinds are determined by the quota backend system. Here are some examples: * "1/min/{project}"
   * for quota per minute per project. Note: the order of unit components is insignificant. The "1"
   * at the beginning is required to follow the metric unit syntax.
   * @return value or {@code null} for none
   */
  public java.lang.String getUnit() {
    return unit;
  }

  /**
   * Specify the unit of the quota limit. It uses the same syntax as Metric.unit. The supported unit
   * kinds are determined by the quota backend system. Here are some examples: * "1/min/{project}"
   * for quota per minute per project. Note: the order of unit components is insignificant. The "1"
   * at the beginning is required to follow the metric unit syntax.
   * @param unit unit or {@code null} for none
   */
  public QuotaLimit setUnit(java.lang.String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Tiered limit values. You must specify this as a key:value pair, with an integer value that is
   * the maximum number of requests allowed for the specified unit. Currently only STANDARD is
   * supported.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Long> getValues() {
    return values;
  }

  /**
   * Tiered limit values. You must specify this as a key:value pair, with an integer value that is
   * the maximum number of requests allowed for the specified unit. Currently only STANDARD is
   * supported.
   * @param values values or {@code null} for none
   */
  public QuotaLimit setValues(java.util.Map<String, java.lang.Long> values) {
    this.values = values;
    return this;
  }

  @Override
  public QuotaLimit set(String fieldName, Object value) {
    return (QuotaLimit) super.set(fieldName, value);
  }

  @Override
  public QuotaLimit clone() {
    return (QuotaLimit) super.clone();
  }

}
