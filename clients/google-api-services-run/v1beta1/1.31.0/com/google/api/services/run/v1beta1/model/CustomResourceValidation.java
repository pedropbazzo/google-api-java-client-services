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

package com.google.api.services.run.v1beta1.model;

/**
 * CustomResourceValidation is a list of validation methods for CustomResources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomResourceValidation extends com.google.api.client.json.GenericJson {

  /**
   * OpenAPIV3Schema is the OpenAPI v3 schema to be validated against. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JSONSchemaProps openAPIV3Schema;

  /**
   * OpenAPIV3Schema is the OpenAPI v3 schema to be validated against. +optional
   * @return value or {@code null} for none
   */
  public JSONSchemaProps getOpenAPIV3Schema() {
    return openAPIV3Schema;
  }

  /**
   * OpenAPIV3Schema is the OpenAPI v3 schema to be validated against. +optional
   * @param openAPIV3Schema openAPIV3Schema or {@code null} for none
   */
  public CustomResourceValidation setOpenAPIV3Schema(JSONSchemaProps openAPIV3Schema) {
    this.openAPIV3Schema = openAPIV3Schema;
    return this;
  }

  @Override
  public CustomResourceValidation set(String fieldName, Object value) {
    return (CustomResourceValidation) super.set(fieldName, value);
  }

  @Override
  public CustomResourceValidation clone() {
    return (CustomResourceValidation) super.clone();
  }

}
