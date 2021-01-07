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

package com.google.api.services.slides.v1.model;

/**
 * Groups objects to create an object group. For example, groups PageElements to create a Group on
 * the same page as all the children.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GroupObjectsRequest extends com.google.api.client.json.GenericJson {

  /**
   * The object IDs of the objects to group. Only page elements can be grouped. There should be at
   * least two page elements on the same page that are not already in another group. Some page
   * elements, such as videos, tables and placeholder shapes cannot be grouped.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> childrenObjectIds;

  /**
   * A user-supplied object ID for the group to be created. If you specify an ID, it must be unique
   * among all pages and page elements in the presentation. The ID must start with an alphanumeric
   * character or an underscore (matches regex `[a-zA-Z0-9_]`); remaining characters may include
   * those as well as a hyphen or colon (matches regex `[a-zA-Z0-9_-:]`). The length of the ID must
   * not be less than 5 or greater than 50. If you don't specify an ID, a unique one is generated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String groupObjectId;

  /**
   * The object IDs of the objects to group. Only page elements can be grouped. There should be at
   * least two page elements on the same page that are not already in another group. Some page
   * elements, such as videos, tables and placeholder shapes cannot be grouped.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getChildrenObjectIds() {
    return childrenObjectIds;
  }

  /**
   * The object IDs of the objects to group. Only page elements can be grouped. There should be at
   * least two page elements on the same page that are not already in another group. Some page
   * elements, such as videos, tables and placeholder shapes cannot be grouped.
   * @param childrenObjectIds childrenObjectIds or {@code null} for none
   */
  public GroupObjectsRequest setChildrenObjectIds(java.util.List<java.lang.String> childrenObjectIds) {
    this.childrenObjectIds = childrenObjectIds;
    return this;
  }

  /**
   * A user-supplied object ID for the group to be created. If you specify an ID, it must be unique
   * among all pages and page elements in the presentation. The ID must start with an alphanumeric
   * character or an underscore (matches regex `[a-zA-Z0-9_]`); remaining characters may include
   * those as well as a hyphen or colon (matches regex `[a-zA-Z0-9_-:]`). The length of the ID must
   * not be less than 5 or greater than 50. If you don't specify an ID, a unique one is generated.
   * @return value or {@code null} for none
   */
  public java.lang.String getGroupObjectId() {
    return groupObjectId;
  }

  /**
   * A user-supplied object ID for the group to be created. If you specify an ID, it must be unique
   * among all pages and page elements in the presentation. The ID must start with an alphanumeric
   * character or an underscore (matches regex `[a-zA-Z0-9_]`); remaining characters may include
   * those as well as a hyphen or colon (matches regex `[a-zA-Z0-9_-:]`). The length of the ID must
   * not be less than 5 or greater than 50. If you don't specify an ID, a unique one is generated.
   * @param groupObjectId groupObjectId or {@code null} for none
   */
  public GroupObjectsRequest setGroupObjectId(java.lang.String groupObjectId) {
    this.groupObjectId = groupObjectId;
    return this;
  }

  @Override
  public GroupObjectsRequest set(String fieldName, Object value) {
    return (GroupObjectsRequest) super.set(fieldName, value);
  }

  @Override
  public GroupObjectsRequest clone() {
    return (GroupObjectsRequest) super.clone();
  }

}
