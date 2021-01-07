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

package com.google.api.services.secretmanager.v1.model;

/**
 * A replication policy that replicates the Secret payload without any restrictions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Secret Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Automatic extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The customer-managed encryption configuration of the Secret. If no configuration is
   * provided, Google-managed default encryption is used. Updates to the Secret encryption
   * configuration only apply to SecretVersions added afterwards. They do not apply retroactively to
   * existing SecretVersions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomerManagedEncryption customerManagedEncryption;

  /**
   * Optional. The customer-managed encryption configuration of the Secret. If no configuration is
   * provided, Google-managed default encryption is used. Updates to the Secret encryption
   * configuration only apply to SecretVersions added afterwards. They do not apply retroactively to
   * existing SecretVersions.
   * @return value or {@code null} for none
   */
  public CustomerManagedEncryption getCustomerManagedEncryption() {
    return customerManagedEncryption;
  }

  /**
   * Optional. The customer-managed encryption configuration of the Secret. If no configuration is
   * provided, Google-managed default encryption is used. Updates to the Secret encryption
   * configuration only apply to SecretVersions added afterwards. They do not apply retroactively to
   * existing SecretVersions.
   * @param customerManagedEncryption customerManagedEncryption or {@code null} for none
   */
  public Automatic setCustomerManagedEncryption(CustomerManagedEncryption customerManagedEncryption) {
    this.customerManagedEncryption = customerManagedEncryption;
    return this;
  }

  @Override
  public Automatic set(String fieldName, Object value) {
    return (Automatic) super.set(fieldName, value);
  }

  @Override
  public Automatic clone() {
    return (Automatic) super.clone();
  }

}
