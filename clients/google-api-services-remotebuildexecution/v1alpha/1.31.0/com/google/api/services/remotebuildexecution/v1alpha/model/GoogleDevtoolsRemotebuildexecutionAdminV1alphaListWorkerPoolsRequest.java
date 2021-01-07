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

package com.google.api.services.remotebuildexecution.v1alpha.model;

/**
 * Model definition for GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. A filter expression that filters resources listed in the response. The expression
   * must specify the field name, a comparison operator, and the value that you want to use for
   * filtering. The value must be a string, a number, or a boolean. String values are case-
   * insensitive. The comparison operator must be either `:`, `=`, `!=`, `>`, `>=`, `<=` or `<`. The
   * `:` operator can be used with string fields to match substrings. For non-string fields it is
   * equivalent to the `=` operator. The `:*` comparison can be used to test whether a key has been
   * defined. You can also filter on nested fields. To filter on multiple expressions, you can
   * separate expression using `AND` and `OR` operators, using parentheses to specify precedence. If
   * neither operator is specified, `AND` is assumed. Examples: Include only pools with more than
   * 100 reserved workers: `(worker_count > 100) (worker_config.reserved = true)` Include only pools
   * with a certain label or machines of the n1-standard family: `worker_config.labels.key1 : * OR
   * worker_config.machine_type: n1-standard`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * Resource name of the instance. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * Optional. A filter expression that filters resources listed in the response. The expression
   * must specify the field name, a comparison operator, and the value that you want to use for
   * filtering. The value must be a string, a number, or a boolean. String values are case-
   * insensitive. The comparison operator must be either `:`, `=`, `!=`, `>`, `>=`, `<=` or `<`. The
   * `:` operator can be used with string fields to match substrings. For non-string fields it is
   * equivalent to the `=` operator. The `:*` comparison can be used to test whether a key has been
   * defined. You can also filter on nested fields. To filter on multiple expressions, you can
   * separate expression using `AND` and `OR` operators, using parentheses to specify precedence. If
   * neither operator is specified, `AND` is assumed. Examples: Include only pools with more than
   * 100 reserved workers: `(worker_count > 100) (worker_config.reserved = true)` Include only pools
   * with a certain label or machines of the n1-standard family: `worker_config.labels.key1 : * OR
   * worker_config.machine_type: n1-standard`
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Optional. A filter expression that filters resources listed in the response. The expression
   * must specify the field name, a comparison operator, and the value that you want to use for
   * filtering. The value must be a string, a number, or a boolean. String values are case-
   * insensitive. The comparison operator must be either `:`, `=`, `!=`, `>`, `>=`, `<=` or `<`. The
   * `:` operator can be used with string fields to match substrings. For non-string fields it is
   * equivalent to the `=` operator. The `:*` comparison can be used to test whether a key has been
   * defined. You can also filter on nested fields. To filter on multiple expressions, you can
   * separate expression using `AND` and `OR` operators, using parentheses to specify precedence. If
   * neither operator is specified, `AND` is assumed. Examples: Include only pools with more than
   * 100 reserved workers: `(worker_count > 100) (worker_config.reserved = true)` Include only pools
   * with a certain label or machines of the n1-standard family: `worker_config.labels.key1 : * OR
   * worker_config.machine_type: n1-standard`
   * @param filter filter or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Resource name of the instance. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * Resource name of the instance. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
   * @param parent parent or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest set(String fieldName, Object value) {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest clone() {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest) super.clone();
  }

}
