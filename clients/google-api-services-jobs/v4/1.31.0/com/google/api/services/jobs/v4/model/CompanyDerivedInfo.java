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

package com.google.api.services.jobs.v4.model;

/**
 * Derived details about the company.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CompanyDerivedInfo extends com.google.api.client.json.GenericJson {

  /**
   * A structured headquarters location of the company, resolved from Company.headquarters_address
   * if provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Location headquartersLocation;

  /**
   * A structured headquarters location of the company, resolved from Company.headquarters_address
   * if provided.
   * @return value or {@code null} for none
   */
  public Location getHeadquartersLocation() {
    return headquartersLocation;
  }

  /**
   * A structured headquarters location of the company, resolved from Company.headquarters_address
   * if provided.
   * @param headquartersLocation headquartersLocation or {@code null} for none
   */
  public CompanyDerivedInfo setHeadquartersLocation(Location headquartersLocation) {
    this.headquartersLocation = headquartersLocation;
    return this;
  }

  @Override
  public CompanyDerivedInfo set(String fieldName, Object value) {
    return (CompanyDerivedInfo) super.set(fieldName, value);
  }

  @Override
  public CompanyDerivedInfo clone() {
    return (CompanyDerivedInfo) super.clone();
  }

}
