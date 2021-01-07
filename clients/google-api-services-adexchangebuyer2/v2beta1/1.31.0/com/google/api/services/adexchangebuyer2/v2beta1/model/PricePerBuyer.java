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
 * Used to specify pricing rules for buyers/advertisers. Each PricePerBuyer in a product can become
 * 0 or 1 deals. To check if there is a PricePerBuyer for a particular buyer or buyer/advertiser
 * pair, we look for the most specific matching rule - we first look for a rule matching the buyer
 * and advertiser, next a rule with the buyer but an empty advertiser list, and otherwise look for a
 * matching rule where no buyer is set.
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
public final class PricePerBuyer extends com.google.api.client.json.GenericJson {

  /**
   * The list of advertisers for this price when associated with this buyer. If empty, all
   * advertisers with this buyer pay this price.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> advertiserIds;

  /**
   * The buyer who will pay this price. If unset, all buyers can pay this price (if the advertisers
   * match, and there's no more specific rule matching the buyer).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Buyer buyer;

  /**
   * The specified price.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price price;

  /**
   * The list of advertisers for this price when associated with this buyer. If empty, all
   * advertisers with this buyer pay this price.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAdvertiserIds() {
    return advertiserIds;
  }

  /**
   * The list of advertisers for this price when associated with this buyer. If empty, all
   * advertisers with this buyer pay this price.
   * @param advertiserIds advertiserIds or {@code null} for none
   */
  public PricePerBuyer setAdvertiserIds(java.util.List<java.lang.String> advertiserIds) {
    this.advertiserIds = advertiserIds;
    return this;
  }

  /**
   * The buyer who will pay this price. If unset, all buyers can pay this price (if the advertisers
   * match, and there's no more specific rule matching the buyer).
   * @return value or {@code null} for none
   */
  public Buyer getBuyer() {
    return buyer;
  }

  /**
   * The buyer who will pay this price. If unset, all buyers can pay this price (if the advertisers
   * match, and there's no more specific rule matching the buyer).
   * @param buyer buyer or {@code null} for none
   */
  public PricePerBuyer setBuyer(Buyer buyer) {
    this.buyer = buyer;
    return this;
  }

  /**
   * The specified price.
   * @return value or {@code null} for none
   */
  public Price getPrice() {
    return price;
  }

  /**
   * The specified price.
   * @param price price or {@code null} for none
   */
  public PricePerBuyer setPrice(Price price) {
    this.price = price;
    return this;
  }

  @Override
  public PricePerBuyer set(String fieldName, Object value) {
    return (PricePerBuyer) super.set(fieldName, value);
  }

  @Override
  public PricePerBuyer clone() {
    return (PricePerBuyer) super.clone();
  }

}
