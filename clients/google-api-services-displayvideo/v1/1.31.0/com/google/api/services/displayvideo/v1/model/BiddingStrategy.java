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
 * Settings that control the bid strategy. Bid strategy determines the bid price.
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
public final class BiddingStrategy extends com.google.api.client.json.GenericJson {

  /**
   * A strategy that uses a fixed bid price.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FixedBidStrategy fixedBid;

  /**
   * A strategy that automatically adjusts the bid to optimize to your performance goal while
   * spending the full budget. At insertion order level, the markup_type of line items cannot be set
   * to `PARTNER_REVENUE_MODEL_MARKUP_TYPE_CPM`. In addition, when performance_goal_type is one of:
   * * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CPA` * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CPC` *
   * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_AV_VIEWED` , the line_item_type of the insertion order
   * line items must be either: * `LINE_ITEM_TYPE_DISPLAY_DEFAULT` * `LINE_ITEM_TYPE_VIDEO_DEFAULT`
   * , and when performance_goal_type is either: * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CIVA` *
   * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_IVO_TEN` the line_item_type of the insertion order line
   * items must be `LINE_ITEM_TYPE_VIDEO_DEFAULT`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MaximizeSpendBidStrategy maximizeSpendAutoBid;

  /**
   * A strategy that automatically adjusts the bid to meet or beat a specified performance goal. It
   * is to be used only for a line item entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PerformanceGoalBidStrategy performanceGoalAutoBid;

  /**
   * A strategy that uses a fixed bid price.
   * @return value or {@code null} for none
   */
  public FixedBidStrategy getFixedBid() {
    return fixedBid;
  }

  /**
   * A strategy that uses a fixed bid price.
   * @param fixedBid fixedBid or {@code null} for none
   */
  public BiddingStrategy setFixedBid(FixedBidStrategy fixedBid) {
    this.fixedBid = fixedBid;
    return this;
  }

  /**
   * A strategy that automatically adjusts the bid to optimize to your performance goal while
   * spending the full budget. At insertion order level, the markup_type of line items cannot be set
   * to `PARTNER_REVENUE_MODEL_MARKUP_TYPE_CPM`. In addition, when performance_goal_type is one of:
   * * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CPA` * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CPC` *
   * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_AV_VIEWED` , the line_item_type of the insertion order
   * line items must be either: * `LINE_ITEM_TYPE_DISPLAY_DEFAULT` * `LINE_ITEM_TYPE_VIDEO_DEFAULT`
   * , and when performance_goal_type is either: * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CIVA` *
   * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_IVO_TEN` the line_item_type of the insertion order line
   * items must be `LINE_ITEM_TYPE_VIDEO_DEFAULT`.
   * @return value or {@code null} for none
   */
  public MaximizeSpendBidStrategy getMaximizeSpendAutoBid() {
    return maximizeSpendAutoBid;
  }

  /**
   * A strategy that automatically adjusts the bid to optimize to your performance goal while
   * spending the full budget. At insertion order level, the markup_type of line items cannot be set
   * to `PARTNER_REVENUE_MODEL_MARKUP_TYPE_CPM`. In addition, when performance_goal_type is one of:
   * * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CPA` * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CPC` *
   * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_AV_VIEWED` , the line_item_type of the insertion order
   * line items must be either: * `LINE_ITEM_TYPE_DISPLAY_DEFAULT` * `LINE_ITEM_TYPE_VIDEO_DEFAULT`
   * , and when performance_goal_type is either: * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CIVA` *
   * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_IVO_TEN` the line_item_type of the insertion order line
   * items must be `LINE_ITEM_TYPE_VIDEO_DEFAULT`.
   * @param maximizeSpendAutoBid maximizeSpendAutoBid or {@code null} for none
   */
  public BiddingStrategy setMaximizeSpendAutoBid(MaximizeSpendBidStrategy maximizeSpendAutoBid) {
    this.maximizeSpendAutoBid = maximizeSpendAutoBid;
    return this;
  }

  /**
   * A strategy that automatically adjusts the bid to meet or beat a specified performance goal. It
   * is to be used only for a line item entity.
   * @return value or {@code null} for none
   */
  public PerformanceGoalBidStrategy getPerformanceGoalAutoBid() {
    return performanceGoalAutoBid;
  }

  /**
   * A strategy that automatically adjusts the bid to meet or beat a specified performance goal. It
   * is to be used only for a line item entity.
   * @param performanceGoalAutoBid performanceGoalAutoBid or {@code null} for none
   */
  public BiddingStrategy setPerformanceGoalAutoBid(PerformanceGoalBidStrategy performanceGoalAutoBid) {
    this.performanceGoalAutoBid = performanceGoalAutoBid;
    return this;
  }

  @Override
  public BiddingStrategy set(String fieldName, Object value) {
    return (BiddingStrategy) super.set(fieldName, value);
  }

  @Override
  public BiddingStrategy clone() {
    return (BiddingStrategy) super.clone();
  }

}
