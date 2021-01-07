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

package com.google.api.services.sqladmin.model;

/**
 * Preferred location. This specifies where a Cloud SQL instance is located, either in a specific
 * Compute Engine zone, or co-located with an App Engine application. Note that if the preferred
 * location is not available, the instance will be located as close as possible within the region.
 * Only one location may be specified.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LocationPreference extends com.google.api.client.json.GenericJson {

  /**
   * The App Engine application to follow, it must be in the same region as the Cloud SQL instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String followGaeApplication;

  /**
   * This is always *sql#locationPreference*.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The preferred Compute Engine zone for the secondary/failover (for example: us-central1-a, us-
   * central1-b, etc.). Reserved for future use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secondaryZone;

  /**
   * The preferred Compute Engine zone (for example: us-central1-a, us-central1-b, etc.).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * The App Engine application to follow, it must be in the same region as the Cloud SQL instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getFollowGaeApplication() {
    return followGaeApplication;
  }

  /**
   * The App Engine application to follow, it must be in the same region as the Cloud SQL instance.
   * @param followGaeApplication followGaeApplication or {@code null} for none
   */
  public LocationPreference setFollowGaeApplication(java.lang.String followGaeApplication) {
    this.followGaeApplication = followGaeApplication;
    return this;
  }

  /**
   * This is always *sql#locationPreference*.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always *sql#locationPreference*.
   * @param kind kind or {@code null} for none
   */
  public LocationPreference setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The preferred Compute Engine zone for the secondary/failover (for example: us-central1-a, us-
   * central1-b, etc.). Reserved for future use.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecondaryZone() {
    return secondaryZone;
  }

  /**
   * The preferred Compute Engine zone for the secondary/failover (for example: us-central1-a, us-
   * central1-b, etc.). Reserved for future use.
   * @param secondaryZone secondaryZone or {@code null} for none
   */
  public LocationPreference setSecondaryZone(java.lang.String secondaryZone) {
    this.secondaryZone = secondaryZone;
    return this;
  }

  /**
   * The preferred Compute Engine zone (for example: us-central1-a, us-central1-b, etc.).
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * The preferred Compute Engine zone (for example: us-central1-a, us-central1-b, etc.).
   * @param zone zone or {@code null} for none
   */
  public LocationPreference setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public LocationPreference set(String fieldName, Object value) {
    return (LocationPreference) super.set(fieldName, value);
  }

  @Override
  public LocationPreference clone() {
    return (LocationPreference) super.clone();
  }

}
