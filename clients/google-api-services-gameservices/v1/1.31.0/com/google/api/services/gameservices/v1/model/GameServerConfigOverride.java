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

package com.google.api.services.gameservices.v1.model;

/**
 * A game server config override.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Game Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GameServerConfigOverride extends com.google.api.client.json.GenericJson {

  /**
   * The game server config for this override.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String configVersion;

  /**
   * Selector for choosing applicable realms.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RealmSelector realmsSelector;

  /**
   * The game server config for this override.
   * @return value or {@code null} for none
   */
  public java.lang.String getConfigVersion() {
    return configVersion;
  }

  /**
   * The game server config for this override.
   * @param configVersion configVersion or {@code null} for none
   */
  public GameServerConfigOverride setConfigVersion(java.lang.String configVersion) {
    this.configVersion = configVersion;
    return this;
  }

  /**
   * Selector for choosing applicable realms.
   * @return value or {@code null} for none
   */
  public RealmSelector getRealmsSelector() {
    return realmsSelector;
  }

  /**
   * Selector for choosing applicable realms.
   * @param realmsSelector realmsSelector or {@code null} for none
   */
  public GameServerConfigOverride setRealmsSelector(RealmSelector realmsSelector) {
    this.realmsSelector = realmsSelector;
    return this;
  }

  @Override
  public GameServerConfigOverride set(String fieldName, Object value) {
    return (GameServerConfigOverride) super.set(fieldName, value);
  }

  @Override
  public GameServerConfigOverride clone() {
    return (GameServerConfigOverride) super.clone();
  }

}
