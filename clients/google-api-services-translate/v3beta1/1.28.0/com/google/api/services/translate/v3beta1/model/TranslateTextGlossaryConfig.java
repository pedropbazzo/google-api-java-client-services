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

package com.google.api.services.translate.v3beta1.model;

/**
 * Configures which glossary should be used for a specific target language, and defines options for
 * applying that glossary.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Translation API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TranslateTextGlossaryConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. Specifies the glossary used for this translation. Use this format:
   * projects/locations/glossaries
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String glossary;

  /**
   * Optional. Indicates match is case-insensitive. Default value is false if missing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean ignoreCase;

  /**
   * Required. Specifies the glossary used for this translation. Use this format:
   * projects/locations/glossaries
   * @return value or {@code null} for none
   */
  public java.lang.String getGlossary() {
    return glossary;
  }

  /**
   * Required. Specifies the glossary used for this translation. Use this format:
   * projects/locations/glossaries
   * @param glossary glossary or {@code null} for none
   */
  public TranslateTextGlossaryConfig setGlossary(java.lang.String glossary) {
    this.glossary = glossary;
    return this;
  }

  /**
   * Optional. Indicates match is case-insensitive. Default value is false if missing.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIgnoreCase() {
    return ignoreCase;
  }

  /**
   * Optional. Indicates match is case-insensitive. Default value is false if missing.
   * @param ignoreCase ignoreCase or {@code null} for none
   */
  public TranslateTextGlossaryConfig setIgnoreCase(java.lang.Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
    return this;
  }

  @Override
  public TranslateTextGlossaryConfig set(String fieldName, Object value) {
    return (TranslateTextGlossaryConfig) super.set(fieldName, value);
  }

  @Override
  public TranslateTextGlossaryConfig clone() {
    return (TranslateTextGlossaryConfig) super.clone();
  }

}
