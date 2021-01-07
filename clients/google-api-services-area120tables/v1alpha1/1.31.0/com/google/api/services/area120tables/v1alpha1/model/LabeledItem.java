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

package com.google.api.services.area120tables.v1alpha1.model;

/**
 * A single item in a labeled column.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Area120 Tables API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LabeledItem extends com.google.api.client.json.GenericJson {

  /**
   * Internal id associated with the item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Display string as entered by user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Internal id associated with the item.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Internal id associated with the item.
   * @param id id or {@code null} for none
   */
  public LabeledItem setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Display string as entered by user.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Display string as entered by user.
   * @param name name or {@code null} for none
   */
  public LabeledItem setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public LabeledItem set(String fieldName, Object value) {
    return (LabeledItem) super.set(fieldName, value);
  }

  @Override
  public LabeledItem clone() {
    return (LabeledItem) super.clone();
  }

}
