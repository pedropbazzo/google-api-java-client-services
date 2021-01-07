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

package com.google.api.services.adexchangebuyer.model;

/**
 * Model definition for EditAllOrderDealsRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EditAllOrderDealsRequest extends com.google.api.client.json.GenericJson {

  /**
   * List of deals to edit. Service may perform 3 different operations based on comparison of deals
   * in this list vs deals already persisted in database: 1. Add new deal to proposal If a deal in
   * this list does not exist in the proposal, the service will create a new deal and add it to the
   * proposal. Validation will follow AddOrderDealsRequest. 2. Update existing deal in the proposal
   * If a deal in this list already exist in the proposal, the service will update that existing
   * deal to this new deal in the request. Validation will follow UpdateOrderDealsRequest. 3. Delete
   * deals from the proposal (just need the id) If a existing deal in the proposal is not present in
   * this list, the service will delete that deal from the proposal. Validation will follow
   * DeleteOrderDealsRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MarketplaceDeal> deals;

  /**
   * If specified, also updates the proposal in the batch transaction. This is useful when the
   * proposal and the deals need to be updated in one transaction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Proposal proposal;

  /**
   * The last known revision number for the proposal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long proposalRevisionNumber;

  /**
   * Indicates an optional action to take on the proposal
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String updateAction;

  /**
   * List of deals to edit. Service may perform 3 different operations based on comparison of deals
   * in this list vs deals already persisted in database: 1. Add new deal to proposal If a deal in
   * this list does not exist in the proposal, the service will create a new deal and add it to the
   * proposal. Validation will follow AddOrderDealsRequest. 2. Update existing deal in the proposal
   * If a deal in this list already exist in the proposal, the service will update that existing
   * deal to this new deal in the request. Validation will follow UpdateOrderDealsRequest. 3. Delete
   * deals from the proposal (just need the id) If a existing deal in the proposal is not present in
   * this list, the service will delete that deal from the proposal. Validation will follow
   * DeleteOrderDealsRequest.
   * @return value or {@code null} for none
   */
  public java.util.List<MarketplaceDeal> getDeals() {
    return deals;
  }

  /**
   * List of deals to edit. Service may perform 3 different operations based on comparison of deals
   * in this list vs deals already persisted in database: 1. Add new deal to proposal If a deal in
   * this list does not exist in the proposal, the service will create a new deal and add it to the
   * proposal. Validation will follow AddOrderDealsRequest. 2. Update existing deal in the proposal
   * If a deal in this list already exist in the proposal, the service will update that existing
   * deal to this new deal in the request. Validation will follow UpdateOrderDealsRequest. 3. Delete
   * deals from the proposal (just need the id) If a existing deal in the proposal is not present in
   * this list, the service will delete that deal from the proposal. Validation will follow
   * DeleteOrderDealsRequest.
   * @param deals deals or {@code null} for none
   */
  public EditAllOrderDealsRequest setDeals(java.util.List<MarketplaceDeal> deals) {
    this.deals = deals;
    return this;
  }

  /**
   * If specified, also updates the proposal in the batch transaction. This is useful when the
   * proposal and the deals need to be updated in one transaction.
   * @return value or {@code null} for none
   */
  public Proposal getProposal() {
    return proposal;
  }

  /**
   * If specified, also updates the proposal in the batch transaction. This is useful when the
   * proposal and the deals need to be updated in one transaction.
   * @param proposal proposal or {@code null} for none
   */
  public EditAllOrderDealsRequest setProposal(Proposal proposal) {
    this.proposal = proposal;
    return this;
  }

  /**
   * The last known revision number for the proposal.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProposalRevisionNumber() {
    return proposalRevisionNumber;
  }

  /**
   * The last known revision number for the proposal.
   * @param proposalRevisionNumber proposalRevisionNumber or {@code null} for none
   */
  public EditAllOrderDealsRequest setProposalRevisionNumber(java.lang.Long proposalRevisionNumber) {
    this.proposalRevisionNumber = proposalRevisionNumber;
    return this;
  }

  /**
   * Indicates an optional action to take on the proposal
   * @return value or {@code null} for none
   */
  public java.lang.String getUpdateAction() {
    return updateAction;
  }

  /**
   * Indicates an optional action to take on the proposal
   * @param updateAction updateAction or {@code null} for none
   */
  public EditAllOrderDealsRequest setUpdateAction(java.lang.String updateAction) {
    this.updateAction = updateAction;
    return this;
  }

  @Override
  public EditAllOrderDealsRequest set(String fieldName, Object value) {
    return (EditAllOrderDealsRequest) super.set(fieldName, value);
  }

  @Override
  public EditAllOrderDealsRequest clone() {
    return (EditAllOrderDealsRequest) super.clone();
  }

}
