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

package com.google.api.services.safebrowsing.v4.model;

/**
 * The information regarding one or more threats that a client submits when checking for matches in
 * threat lists.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Safe Browsing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ThreatInfo extends com.google.api.client.json.GenericJson {

  /**
   * The platform types to be checked.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> platformTypes;

  /**
   * The threat entries to be checked.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ThreatEntry> threatEntries;

  static {
    // hack to force ProGuard to consider ThreatEntry used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ThreatEntry.class);
  }

  /**
   * The entry types to be checked.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> threatEntryTypes;

  /**
   * The threat types to be checked.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> threatTypes;

  /**
   * The platform types to be checked.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPlatformTypes() {
    return platformTypes;
  }

  /**
   * The platform types to be checked.
   * @param platformTypes platformTypes or {@code null} for none
   */
  public ThreatInfo setPlatformTypes(java.util.List<java.lang.String> platformTypes) {
    this.platformTypes = platformTypes;
    return this;
  }

  /**
   * The threat entries to be checked.
   * @return value or {@code null} for none
   */
  public java.util.List<ThreatEntry> getThreatEntries() {
    return threatEntries;
  }

  /**
   * The threat entries to be checked.
   * @param threatEntries threatEntries or {@code null} for none
   */
  public ThreatInfo setThreatEntries(java.util.List<ThreatEntry> threatEntries) {
    this.threatEntries = threatEntries;
    return this;
  }

  /**
   * The entry types to be checked.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getThreatEntryTypes() {
    return threatEntryTypes;
  }

  /**
   * The entry types to be checked.
   * @param threatEntryTypes threatEntryTypes or {@code null} for none
   */
  public ThreatInfo setThreatEntryTypes(java.util.List<java.lang.String> threatEntryTypes) {
    this.threatEntryTypes = threatEntryTypes;
    return this;
  }

  /**
   * The threat types to be checked.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getThreatTypes() {
    return threatTypes;
  }

  /**
   * The threat types to be checked.
   * @param threatTypes threatTypes or {@code null} for none
   */
  public ThreatInfo setThreatTypes(java.util.List<java.lang.String> threatTypes) {
    this.threatTypes = threatTypes;
    return this;
  }

  @Override
  public ThreatInfo set(String fieldName, Object value) {
    return (ThreatInfo) super.set(fieldName, value);
  }

  @Override
  public ThreatInfo clone() {
    return (ThreatInfo) super.clone();
  }

}
