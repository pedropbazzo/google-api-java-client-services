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

package com.google.api.services.adexchangebuyer2.v2beta1.model;

/**
 * Represents a seller of inventory. Each seller is identified by a unique Ad Manager account ID.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Seller extends com.google.api.client.json.GenericJson {

  /**
   * The unique ID for the seller. The seller fills in this field. The seller account ID is then
   * available to buyer in the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountId;

  /**
   * Optional sub-account ID for the seller.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subAccountId;

  /**
   * The unique ID for the seller. The seller fills in this field. The seller account ID is then
   * available to buyer in the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccountId() {
    return accountId;
  }

  /**
   * The unique ID for the seller. The seller fills in this field. The seller account ID is then
   * available to buyer in the product.
   * @param accountId accountId or {@code null} for none
   */
  public Seller setAccountId(java.lang.String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Optional sub-account ID for the seller.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubAccountId() {
    return subAccountId;
  }

  /**
   * Optional sub-account ID for the seller.
   * @param subAccountId subAccountId or {@code null} for none
   */
  public Seller setSubAccountId(java.lang.String subAccountId) {
    this.subAccountId = subAccountId;
    return this;
  }

  @Override
  public Seller set(String fieldName, Object value) {
    return (Seller) super.set(fieldName, value);
  }

  @Override
  public Seller clone() {
    return (Seller) super.clone();
  }

}
