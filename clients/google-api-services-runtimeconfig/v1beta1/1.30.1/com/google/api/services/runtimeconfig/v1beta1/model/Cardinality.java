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

package com.google.api.services.runtimeconfig.v1beta1.model;

/**
 * A Cardinality condition for the Waiter resource. A cardinality condition is met when the number
 * of variables under a specified path prefix reaches a predefined number. For example, if you set a
 * Cardinality condition where the `path` is set to `/foo` and the number of paths is set to `2`,
 * the following variables would meet the condition in a RuntimeConfig resource: + `/foo/variable1 =
 * "value1"` + `/foo/variable2 = "value2"` + `/bar/variable3 = "value3"` It would not satisfy the
 * same condition with the `number` set to `3`, however, because there is only 2 paths that start
 * with `/foo`. Cardinality conditions are recursive; all subtrees under the specific path prefix
 * are counted.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Runtime Configuration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Cardinality extends com.google.api.client.json.GenericJson {

  /**
   * The number variables under the `path` that must exist to meet this condition. Defaults to 1 if
   * not specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer number;

  /**
   * The root of the variable subtree to monitor. For example, `/foo`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * The number variables under the `path` that must exist to meet this condition. Defaults to 1 if
   * not specified.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumber() {
    return number;
  }

  /**
   * The number variables under the `path` that must exist to meet this condition. Defaults to 1 if
   * not specified.
   * @param number number or {@code null} for none
   */
  public Cardinality setNumber(java.lang.Integer number) {
    this.number = number;
    return this;
  }

  /**
   * The root of the variable subtree to monitor. For example, `/foo`.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * The root of the variable subtree to monitor. For example, `/foo`.
   * @param path path or {@code null} for none
   */
  public Cardinality setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  @Override
  public Cardinality set(String fieldName, Object value) {
    return (Cardinality) super.set(fieldName, value);
  }

  @Override
  public Cardinality clone() {
    return (Cardinality) super.clone();
  }

}
