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

package com.google.api.services.displayvideo.v1.model;

/**
 * Settings that control how advertiser related data may be accessed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AdvertiserDataAccessConfig extends com.google.api.client.json.GenericJson {

  /**
   * Structured Data Files (SDF) settings for the advertiser. If not specified, the SDF settings of
   * the parent partner are used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AdvertiserSdfConfig sdfConfig;

  /**
   * Structured Data Files (SDF) settings for the advertiser. If not specified, the SDF settings of
   * the parent partner are used.
   * @return value or {@code null} for none
   */
  public AdvertiserSdfConfig getSdfConfig() {
    return sdfConfig;
  }

  /**
   * Structured Data Files (SDF) settings for the advertiser. If not specified, the SDF settings of
   * the parent partner are used.
   * @param sdfConfig sdfConfig or {@code null} for none
   */
  public AdvertiserDataAccessConfig setSdfConfig(AdvertiserSdfConfig sdfConfig) {
    this.sdfConfig = sdfConfig;
    return this;
  }

  @Override
  public AdvertiserDataAccessConfig set(String fieldName, Object value) {
    return (AdvertiserDataAccessConfig) super.set(fieldName, value);
  }

  @Override
  public AdvertiserDataAccessConfig clone() {
    return (AdvertiserDataAccessConfig) super.clone();
  }

}
