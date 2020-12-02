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

package com.google.api.services.osconfig.v1beta.model;

/**
 * An assignment represents the group or groups of VM instances that the policy applies to. If an
 * assignment is empty, it applies to all VM instances. Otherwise, the targeted VM instances must
 * meet all the criteria specified. So if both labels and zones are specified, the policy applies to
 * VM instances with those labels and in those zones.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Assignment extends com.google.api.client.json.GenericJson {

  /**
   * Targets instances matching at least one of these label sets. This allows an assignment to
   * target disparate groups, for example "env=prod or env=staging".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AssignmentGroupLabel> groupLabels;

  /**
   * Targets VM instances whose name starts with one of these prefixes. Like labels, this is another
   * way to group VM instances when targeting configs, for example prefix="prod-". Only supported
   * for project-level policies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> instanceNamePrefixes;

  /**
   * Targets any of the instances specified. Instances are specified by their URI in the form
   * `zones/[ZONE]/instances/[INSTANCE_NAME]`. Instance targeting is uncommon and is supported to
   * facilitate the management of changes by the instance or to target specific VM instances for
   * development and testing. Only supported for project-level policies and must reference instances
   * within this project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> instances;

  /**
   * Targets VM instances matching at least one of the following OS types. VM instances must match
   * all supplied criteria for a given OsType to be included.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AssignmentOsType> osTypes;

  /**
   * Targets instances in any of these zones. Leave empty to target instances in any zone. Zonal
   * targeting is uncommon and is supported to facilitate the management of changes by zone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> zones;

  /**
   * Targets instances matching at least one of these label sets. This allows an assignment to
   * target disparate groups, for example "env=prod or env=staging".
   * @return value or {@code null} for none
   */
  public java.util.List<AssignmentGroupLabel> getGroupLabels() {
    return groupLabels;
  }

  /**
   * Targets instances matching at least one of these label sets. This allows an assignment to
   * target disparate groups, for example "env=prod or env=staging".
   * @param groupLabels groupLabels or {@code null} for none
   */
  public Assignment setGroupLabels(java.util.List<AssignmentGroupLabel> groupLabels) {
    this.groupLabels = groupLabels;
    return this;
  }

  /**
   * Targets VM instances whose name starts with one of these prefixes. Like labels, this is another
   * way to group VM instances when targeting configs, for example prefix="prod-". Only supported
   * for project-level policies.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInstanceNamePrefixes() {
    return instanceNamePrefixes;
  }

  /**
   * Targets VM instances whose name starts with one of these prefixes. Like labels, this is another
   * way to group VM instances when targeting configs, for example prefix="prod-". Only supported
   * for project-level policies.
   * @param instanceNamePrefixes instanceNamePrefixes or {@code null} for none
   */
  public Assignment setInstanceNamePrefixes(java.util.List<java.lang.String> instanceNamePrefixes) {
    this.instanceNamePrefixes = instanceNamePrefixes;
    return this;
  }

  /**
   * Targets any of the instances specified. Instances are specified by their URI in the form
   * `zones/[ZONE]/instances/[INSTANCE_NAME]`. Instance targeting is uncommon and is supported to
   * facilitate the management of changes by the instance or to target specific VM instances for
   * development and testing. Only supported for project-level policies and must reference instances
   * within this project.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInstances() {
    return instances;
  }

  /**
   * Targets any of the instances specified. Instances are specified by their URI in the form
   * `zones/[ZONE]/instances/[INSTANCE_NAME]`. Instance targeting is uncommon and is supported to
   * facilitate the management of changes by the instance or to target specific VM instances for
   * development and testing. Only supported for project-level policies and must reference instances
   * within this project.
   * @param instances instances or {@code null} for none
   */
  public Assignment setInstances(java.util.List<java.lang.String> instances) {
    this.instances = instances;
    return this;
  }

  /**
   * Targets VM instances matching at least one of the following OS types. VM instances must match
   * all supplied criteria for a given OsType to be included.
   * @return value or {@code null} for none
   */
  public java.util.List<AssignmentOsType> getOsTypes() {
    return osTypes;
  }

  /**
   * Targets VM instances matching at least one of the following OS types. VM instances must match
   * all supplied criteria for a given OsType to be included.
   * @param osTypes osTypes or {@code null} for none
   */
  public Assignment setOsTypes(java.util.List<AssignmentOsType> osTypes) {
    this.osTypes = osTypes;
    return this;
  }

  /**
   * Targets instances in any of these zones. Leave empty to target instances in any zone. Zonal
   * targeting is uncommon and is supported to facilitate the management of changes by zone.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getZones() {
    return zones;
  }

  /**
   * Targets instances in any of these zones. Leave empty to target instances in any zone. Zonal
   * targeting is uncommon and is supported to facilitate the management of changes by zone.
   * @param zones zones or {@code null} for none
   */
  public Assignment setZones(java.util.List<java.lang.String> zones) {
    this.zones = zones;
    return this;
  }

  @Override
  public Assignment set(String fieldName, Object value) {
    return (Assignment) super.set(fieldName, value);
  }

  @Override
  public Assignment clone() {
    return (Assignment) super.clone();
  }

}
