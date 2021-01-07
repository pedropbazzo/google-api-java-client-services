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

package com.google.api.services.gamesManagement.model;

/**
 * 1P/3P metadata about a user's level.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Management. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GamesPlayerLevelResource extends com.google.api.client.json.GenericJson {

  /**
   * The level for the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer level;

  /**
   * The maximum experience points for this level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxExperiencePoints;

  /**
   * The minimum experience points for this level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long minExperiencePoints;

  /**
   * The level for the user.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLevel() {
    return level;
  }

  /**
   * The level for the user.
   * @param level level or {@code null} for none
   */
  public GamesPlayerLevelResource setLevel(java.lang.Integer level) {
    this.level = level;
    return this;
  }

  /**
   * The maximum experience points for this level.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxExperiencePoints() {
    return maxExperiencePoints;
  }

  /**
   * The maximum experience points for this level.
   * @param maxExperiencePoints maxExperiencePoints or {@code null} for none
   */
  public GamesPlayerLevelResource setMaxExperiencePoints(java.lang.Long maxExperiencePoints) {
    this.maxExperiencePoints = maxExperiencePoints;
    return this;
  }

  /**
   * The minimum experience points for this level.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMinExperiencePoints() {
    return minExperiencePoints;
  }

  /**
   * The minimum experience points for this level.
   * @param minExperiencePoints minExperiencePoints or {@code null} for none
   */
  public GamesPlayerLevelResource setMinExperiencePoints(java.lang.Long minExperiencePoints) {
    this.minExperiencePoints = minExperiencePoints;
    return this;
  }

  @Override
  public GamesPlayerLevelResource set(String fieldName, Object value) {
    return (GamesPlayerLevelResource) super.set(fieldName, value);
  }

  @Override
  public GamesPlayerLevelResource clone() {
    return (GamesPlayerLevelResource) super.clone();
  }

}
