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
 * Updates the Z-order of page elements. Z-order is an ordering of the elements on the page from
 * back to front. The page element in the front may cover the elements that are behind it.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdatePageElementsZOrderRequest extends com.google.api.client.json.GenericJson {

  /**
   * The Z-order operation to apply on the page elements. When applying the operation on multiple
   * page elements, the relative Z-orders within these page elements before the operation is
   * maintained.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operation;

  /**
   * The object IDs of the page elements to update. All the page elements must be on the same page
   * and must not be grouped.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> pageElementObjectIds;

  /**
   * The Z-order operation to apply on the page elements. When applying the operation on multiple
   * page elements, the relative Z-orders within these page elements before the operation is
   * maintained.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperation() {
    return operation;
  }

  /**
   * The Z-order operation to apply on the page elements. When applying the operation on multiple
   * page elements, the relative Z-orders within these page elements before the operation is
   * maintained.
   * @param operation operation or {@code null} for none
   */
  public UpdatePageElementsZOrderRequest setOperation(java.lang.String operation) {
    this.operation = operation;
    return this;
  }

  /**
   * The object IDs of the page elements to update. All the page elements must be on the same page
   * and must not be grouped.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPageElementObjectIds() {
    return pageElementObjectIds;
  }

  /**
   * The object IDs of the page elements to update. All the page elements must be on the same page
   * and must not be grouped.
   * @param pageElementObjectIds pageElementObjectIds or {@code null} for none
   */
  public UpdatePageElementsZOrderRequest setPageElementObjectIds(java.util.List<java.lang.String> pageElementObjectIds) {
    this.pageElementObjectIds = pageElementObjectIds;
    return this;
  }

  @Override
  public UpdatePageElementsZOrderRequest set(String fieldName, Object value) {
    return (UpdatePageElementsZOrderRequest) super.set(fieldName, value);
  }

  @Override
  public UpdatePageElementsZOrderRequest clone() {
    return (UpdatePageElementsZOrderRequest) super.clone();
  }

}
