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

package com.google.api.services.displayvideo.v1.model;

/**
 * An enabled exchange in the partner.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExchangeConfigEnabledExchange extends com.google.api.client.json.GenericJson {

  /**
   * The enabled exchange.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String exchange;

  /**
   * Output only. Agency ID of Google Ad Manager. The field is only relevant when Google Ad Manager
   * is the enabled exchange.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String googleAdManagerAgencyId;

  /**
   * Output only. Network ID of Google Ad Manager. The field is only relevant when Google Ad Manager
   * is the enabled exchange.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String googleAdManagerBuyerNetworkId;

  /**
   * Output only. Seat ID of the enabled exchange.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String seatId;

  /**
   * The enabled exchange.
   * @return value or {@code null} for none
   */
  public java.lang.String getExchange() {
    return exchange;
  }

  /**
   * The enabled exchange.
   * @param exchange exchange or {@code null} for none
   */
  public ExchangeConfigEnabledExchange setExchange(java.lang.String exchange) {
    this.exchange = exchange;
    return this;
  }

  /**
   * Output only. Agency ID of Google Ad Manager. The field is only relevant when Google Ad Manager
   * is the enabled exchange.
   * @return value or {@code null} for none
   */
  public java.lang.String getGoogleAdManagerAgencyId() {
    return googleAdManagerAgencyId;
  }

  /**
   * Output only. Agency ID of Google Ad Manager. The field is only relevant when Google Ad Manager
   * is the enabled exchange.
   * @param googleAdManagerAgencyId googleAdManagerAgencyId or {@code null} for none
   */
  public ExchangeConfigEnabledExchange setGoogleAdManagerAgencyId(java.lang.String googleAdManagerAgencyId) {
    this.googleAdManagerAgencyId = googleAdManagerAgencyId;
    return this;
  }

  /**
   * Output only. Network ID of Google Ad Manager. The field is only relevant when Google Ad Manager
   * is the enabled exchange.
   * @return value or {@code null} for none
   */
  public java.lang.String getGoogleAdManagerBuyerNetworkId() {
    return googleAdManagerBuyerNetworkId;
  }

  /**
   * Output only. Network ID of Google Ad Manager. The field is only relevant when Google Ad Manager
   * is the enabled exchange.
   * @param googleAdManagerBuyerNetworkId googleAdManagerBuyerNetworkId or {@code null} for none
   */
  public ExchangeConfigEnabledExchange setGoogleAdManagerBuyerNetworkId(java.lang.String googleAdManagerBuyerNetworkId) {
    this.googleAdManagerBuyerNetworkId = googleAdManagerBuyerNetworkId;
    return this;
  }

  /**
   * Output only. Seat ID of the enabled exchange.
   * @return value or {@code null} for none
   */
  public java.lang.String getSeatId() {
    return seatId;
  }

  /**
   * Output only. Seat ID of the enabled exchange.
   * @param seatId seatId or {@code null} for none
   */
  public ExchangeConfigEnabledExchange setSeatId(java.lang.String seatId) {
    this.seatId = seatId;
    return this;
  }

  @Override
  public ExchangeConfigEnabledExchange set(String fieldName, Object value) {
    return (ExchangeConfigEnabledExchange) super.set(fieldName, value);
  }

  @Override
  public ExchangeConfigEnabledExchange clone() {
    return (ExchangeConfigEnabledExchange) super.clone();
  }

}
