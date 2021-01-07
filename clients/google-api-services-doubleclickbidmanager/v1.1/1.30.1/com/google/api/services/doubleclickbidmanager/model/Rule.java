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
 * A Rule defines a name, and a boolean expression in [conjunctive normal form](http:
 * //mathworld.wolfram.com/ConjunctiveNormalForm.html){.external} that can be // applied to a path
 * event to determine if that name should be applied.
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
public final class Rule extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DisjunctiveMatchStatement> disjunctiveMatchStatements;

  static {
    // hack to force ProGuard to consider DisjunctiveMatchStatement used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DisjunctiveMatchStatement.class);
  }

  /**
   * Rule name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<DisjunctiveMatchStatement> getDisjunctiveMatchStatements() {
    return disjunctiveMatchStatements;
  }

  /**
   * @param disjunctiveMatchStatements disjunctiveMatchStatements or {@code null} for none
   */
  public Rule setDisjunctiveMatchStatements(java.util.List<DisjunctiveMatchStatement> disjunctiveMatchStatements) {
    this.disjunctiveMatchStatements = disjunctiveMatchStatements;
    return this;
  }

  /**
   * Rule name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Rule name.
   * @param name name or {@code null} for none
   */
  public Rule setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public Rule set(String fieldName, Object value) {
    return (Rule) super.set(fieldName, value);
  }

  @Override
  public Rule clone() {
    return (Rule) super.clone();
  }

}
