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

package com.google.api.services.doubleclickbidmanager.model;

/**
 * Additional query options.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DoubleClick Bid Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Options extends com.google.api.client.json.GenericJson {

  /**
   * Set to true and filter your report by `FILTER_INSERTION_ORDER` or `FILTER_LINE_ITEM` to include
   * data for audience lists specifically targeted by those items.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeOnlyTargetedUserLists;

  /**
   * Options that contain Path Filters and Custom Channel Groupings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PathQueryOptions pathQueryOptions;

  /**
   * Set to true and filter your report by `FILTER_INSERTION_ORDER` or `FILTER_LINE_ITEM` to include
   * data for audience lists specifically targeted by those items.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeOnlyTargetedUserLists() {
    return includeOnlyTargetedUserLists;
  }

  /**
   * Set to true and filter your report by `FILTER_INSERTION_ORDER` or `FILTER_LINE_ITEM` to include
   * data for audience lists specifically targeted by those items.
   * @param includeOnlyTargetedUserLists includeOnlyTargetedUserLists or {@code null} for none
   */
  public Options setIncludeOnlyTargetedUserLists(java.lang.Boolean includeOnlyTargetedUserLists) {
    this.includeOnlyTargetedUserLists = includeOnlyTargetedUserLists;
    return this;
  }

  /**
   * Options that contain Path Filters and Custom Channel Groupings.
   * @return value or {@code null} for none
   */
  public PathQueryOptions getPathQueryOptions() {
    return pathQueryOptions;
  }

  /**
   * Options that contain Path Filters and Custom Channel Groupings.
   * @param pathQueryOptions pathQueryOptions or {@code null} for none
   */
  public Options setPathQueryOptions(PathQueryOptions pathQueryOptions) {
    this.pathQueryOptions = pathQueryOptions;
    return this;
  }

  @Override
  public Options set(String fieldName, Object value) {
    return (Options) super.set(fieldName, value);
  }

  @Override
  public Options clone() {
    return (Options) super.clone();
  }

}
