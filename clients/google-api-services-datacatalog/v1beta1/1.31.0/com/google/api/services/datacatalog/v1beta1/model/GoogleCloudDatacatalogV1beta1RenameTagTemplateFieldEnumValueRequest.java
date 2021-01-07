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

package com.google.api.services.datacatalog.v1beta1.model;

/**
 * Request message for RenameTagTemplateFieldEnumValue.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Data Catalog API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldEnumValueRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The new display name of the enum value. For example, `my_new_enum_value`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String newEnumValueDisplayName;

  /**
   * Required. The new display name of the enum value. For example, `my_new_enum_value`.
   * @return value or {@code null} for none
   */
  public java.lang.String getNewEnumValueDisplayName() {
    return newEnumValueDisplayName;
  }

  /**
   * Required. The new display name of the enum value. For example, `my_new_enum_value`.
   * @param newEnumValueDisplayName newEnumValueDisplayName or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldEnumValueRequest setNewEnumValueDisplayName(java.lang.String newEnumValueDisplayName) {
    this.newEnumValueDisplayName = newEnumValueDisplayName;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldEnumValueRequest set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldEnumValueRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldEnumValueRequest clone() {
    return (GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldEnumValueRequest) super.clone();
  }

}
