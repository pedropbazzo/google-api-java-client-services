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

package com.google.api.services.dataflow.model;

/**
 * Specification of one of the bundles produced as a result of splitting a Source (e.g. when
 * executing a SourceSplitRequest, or when splitting an active task using
 * WorkItemStatus.dynamic_source_split), relative to the source being split.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DerivedSource extends com.google.api.client.json.GenericJson {

  /**
   * What source to base the produced source on (if any).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String derivationMode;

  /**
   * Specification of the source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Source source;

  /**
   * What source to base the produced source on (if any).
   * @return value or {@code null} for none
   */
  public java.lang.String getDerivationMode() {
    return derivationMode;
  }

  /**
   * What source to base the produced source on (if any).
   * @param derivationMode derivationMode or {@code null} for none
   */
  public DerivedSource setDerivationMode(java.lang.String derivationMode) {
    this.derivationMode = derivationMode;
    return this;
  }

  /**
   * Specification of the source.
   * @return value or {@code null} for none
   */
  public Source getSource() {
    return source;
  }

  /**
   * Specification of the source.
   * @param source source or {@code null} for none
   */
  public DerivedSource setSource(Source source) {
    this.source = source;
    return this;
  }

  @Override
  public DerivedSource set(String fieldName, Object value) {
    return (DerivedSource) super.set(fieldName, value);
  }

  @Override
  public DerivedSource clone() {
    return (DerivedSource) super.clone();
  }

}
