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

package com.google.api.services.recommendationengine.v1beta1.model;

/**
 * ProductEventDetail captures user event information specific to retail products.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Recommendations AI. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecommendationengineV1beta1ProductEventDetail extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The id or name of the associated shopping cart. This id is used to associate multiple
   * items added or present in the cart before purchase. This can only be set for `add-to-cart`,
   * `remove-from-cart`, `checkout-start`, `purchase-complete`, or `shopping-cart-page-view` events.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cartId;

  /**
   * Required for `add-to-list` and `remove-from-list` events. The id or name of the list that the
   * item is being added to or removed from. Other event types should not set this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String listId;

  /**
   * Required for `category-page-view` events. Other event types should not set this field. The
   * categories associated with a category page. Category pages include special pages such as sales
   * or promotions. For instance, a special sale page may have the category hierarchy: categories :
   * ["Sales", "2017 Black Friday Deals"].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy> pageCategories;

  static {
    // hack to force ProGuard to consider GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy.class);
  }

  /**
   * The main product details related to the event. This field is required for the following event
   * types: * `add-to-cart` * `add-to-list` * `checkout-start` * `detail-page-view` * `purchase-
   * complete` * `refund` * `remove-from-cart` * `remove-from-list` This field is optional for the
   * following event types: * `page-visit` * `shopping-cart-page-view` - note that 'product_details'
   * should be set for this unless the shopping cart is empty. * `search` (highly encouraged) In a
   * `search` event, this field represents the products returned to the end user on the current page
   * (the end user may have not finished broswing the whole page yet). When a new page is returned
   * to the end user, after pagination/filtering/ordering even for the same query, a new SEARCH
   * event with different product_details is desired. The end user may have not finished broswing
   * the whole page yet. This field is not allowed for the following event types: * `category-page-
   * view` * `home-page-view`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRecommendationengineV1beta1ProductDetail> productDetails;

  static {
    // hack to force ProGuard to consider GoogleCloudRecommendationengineV1beta1ProductDetail used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRecommendationengineV1beta1ProductDetail.class);
  }

  /**
   * Optional. A transaction represents the entire purchase transaction. Required for `purchase-
   * complete` events. Optional for `checkout-start` events. Other event types should not set this
   * field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRecommendationengineV1beta1PurchaseTransaction purchaseTransaction;

  /**
   * Required for `search` events. Other event types should not set this field. The user's search
   * query as UTF-8 encoded text with a length limit of 5 KiB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String searchQuery;

  /**
   * Optional. The id or name of the associated shopping cart. This id is used to associate multiple
   * items added or present in the cart before purchase. This can only be set for `add-to-cart`,
   * `remove-from-cart`, `checkout-start`, `purchase-complete`, or `shopping-cart-page-view` events.
   * @return value or {@code null} for none
   */
  public java.lang.String getCartId() {
    return cartId;
  }

  /**
   * Optional. The id or name of the associated shopping cart. This id is used to associate multiple
   * items added or present in the cart before purchase. This can only be set for `add-to-cart`,
   * `remove-from-cart`, `checkout-start`, `purchase-complete`, or `shopping-cart-page-view` events.
   * @param cartId cartId or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1ProductEventDetail setCartId(java.lang.String cartId) {
    this.cartId = cartId;
    return this;
  }

  /**
   * Required for `add-to-list` and `remove-from-list` events. The id or name of the list that the
   * item is being added to or removed from. Other event types should not set this field.
   * @return value or {@code null} for none
   */
  public java.lang.String getListId() {
    return listId;
  }

  /**
   * Required for `add-to-list` and `remove-from-list` events. The id or name of the list that the
   * item is being added to or removed from. Other event types should not set this field.
   * @param listId listId or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1ProductEventDetail setListId(java.lang.String listId) {
    this.listId = listId;
    return this;
  }

  /**
   * Required for `category-page-view` events. Other event types should not set this field. The
   * categories associated with a category page. Category pages include special pages such as sales
   * or promotions. For instance, a special sale page may have the category hierarchy: categories :
   * ["Sales", "2017 Black Friday Deals"].
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy> getPageCategories() {
    return pageCategories;
  }

  /**
   * Required for `category-page-view` events. Other event types should not set this field. The
   * categories associated with a category page. Category pages include special pages such as sales
   * or promotions. For instance, a special sale page may have the category hierarchy: categories :
   * ["Sales", "2017 Black Friday Deals"].
   * @param pageCategories pageCategories or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1ProductEventDetail setPageCategories(java.util.List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy> pageCategories) {
    this.pageCategories = pageCategories;
    return this;
  }

  /**
   * The main product details related to the event. This field is required for the following event
   * types: * `add-to-cart` * `add-to-list` * `checkout-start` * `detail-page-view` * `purchase-
   * complete` * `refund` * `remove-from-cart` * `remove-from-list` This field is optional for the
   * following event types: * `page-visit` * `shopping-cart-page-view` - note that 'product_details'
   * should be set for this unless the shopping cart is empty. * `search` (highly encouraged) In a
   * `search` event, this field represents the products returned to the end user on the current page
   * (the end user may have not finished broswing the whole page yet). When a new page is returned
   * to the end user, after pagination/filtering/ordering even for the same query, a new SEARCH
   * event with different product_details is desired. The end user may have not finished broswing
   * the whole page yet. This field is not allowed for the following event types: * `category-page-
   * view` * `home-page-view`
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRecommendationengineV1beta1ProductDetail> getProductDetails() {
    return productDetails;
  }

  /**
   * The main product details related to the event. This field is required for the following event
   * types: * `add-to-cart` * `add-to-list` * `checkout-start` * `detail-page-view` * `purchase-
   * complete` * `refund` * `remove-from-cart` * `remove-from-list` This field is optional for the
   * following event types: * `page-visit` * `shopping-cart-page-view` - note that 'product_details'
   * should be set for this unless the shopping cart is empty. * `search` (highly encouraged) In a
   * `search` event, this field represents the products returned to the end user on the current page
   * (the end user may have not finished broswing the whole page yet). When a new page is returned
   * to the end user, after pagination/filtering/ordering even for the same query, a new SEARCH
   * event with different product_details is desired. The end user may have not finished broswing
   * the whole page yet. This field is not allowed for the following event types: * `category-page-
   * view` * `home-page-view`
   * @param productDetails productDetails or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1ProductEventDetail setProductDetails(java.util.List<GoogleCloudRecommendationengineV1beta1ProductDetail> productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * Optional. A transaction represents the entire purchase transaction. Required for `purchase-
   * complete` events. Optional for `checkout-start` events. Other event types should not set this
   * field.
   * @return value or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1PurchaseTransaction getPurchaseTransaction() {
    return purchaseTransaction;
  }

  /**
   * Optional. A transaction represents the entire purchase transaction. Required for `purchase-
   * complete` events. Optional for `checkout-start` events. Other event types should not set this
   * field.
   * @param purchaseTransaction purchaseTransaction or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1ProductEventDetail setPurchaseTransaction(GoogleCloudRecommendationengineV1beta1PurchaseTransaction purchaseTransaction) {
    this.purchaseTransaction = purchaseTransaction;
    return this;
  }

  /**
   * Required for `search` events. Other event types should not set this field. The user's search
   * query as UTF-8 encoded text with a length limit of 5 KiB.
   * @return value or {@code null} for none
   */
  public java.lang.String getSearchQuery() {
    return searchQuery;
  }

  /**
   * Required for `search` events. Other event types should not set this field. The user's search
   * query as UTF-8 encoded text with a length limit of 5 KiB.
   * @param searchQuery searchQuery or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1ProductEventDetail setSearchQuery(java.lang.String searchQuery) {
    this.searchQuery = searchQuery;
    return this;
  }

  @Override
  public GoogleCloudRecommendationengineV1beta1ProductEventDetail set(String fieldName, Object value) {
    return (GoogleCloudRecommendationengineV1beta1ProductEventDetail) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecommendationengineV1beta1ProductEventDetail clone() {
    return (GoogleCloudRecommendationengineV1beta1ProductEventDetail) super.clone();
  }

}
