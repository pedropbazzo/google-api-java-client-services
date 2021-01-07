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

package com.google.api.services.gameservices.v1beta.model;

/**
 * Fleet configs for Agones.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Game Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FleetConfig extends com.google.api.client.json.GenericJson {

  /**
   * Agones fleet spec. Example spec: `https://agones.dev/site/docs/reference/fleet/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fleetSpec;

  /**
   * The name of the FleetConfig.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Agones fleet spec. Example spec: `https://agones.dev/site/docs/reference/fleet/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getFleetSpec() {
    return fleetSpec;
  }

  /**
   * Agones fleet spec. Example spec: `https://agones.dev/site/docs/reference/fleet/`.
   * @param fleetSpec fleetSpec or {@code null} for none
   */
  public FleetConfig setFleetSpec(java.lang.String fleetSpec) {
    this.fleetSpec = fleetSpec;
    return this;
  }

  /**
   * The name of the FleetConfig.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the FleetConfig.
   * @param name name or {@code null} for none
   */
  public FleetConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public FleetConfig set(String fieldName, Object value) {
    return (FleetConfig) super.set(fieldName, value);
  }

  @Override
  public FleetConfig clone() {
    return (FleetConfig) super.clone();
  }

}
