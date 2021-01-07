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

package com.google.api.services.dfareporting.model;

/**
 * Contains properties of a placement.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Campaign Manager 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Placement extends com.google.api.client.json.GenericJson {

  /**
   * Account ID of this placement. This field can be left blank.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long accountId;

  /**
   * Whether this placement opts out of ad blocking. When true, ad blocking is disabled for this
   * placement. When false, the campaign and site settings take effect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean adBlockingOptOut;

  /**
   * Additional sizes associated with this placement. When inserting or updating a placement, only
   * the size ID field is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Size> additionalSizes;

  /**
   * Advertiser ID of this placement. This field can be left blank.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long advertiserId;

  /**
   * Dimension value for the ID of the advertiser. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionValue advertiserIdDimensionValue;

  /**
   * Whether this placement is archived.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean archived;

  /**
   * Campaign ID of this placement. This field is a required field on insertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long campaignId;

  /**
   * Dimension value for the ID of the campaign. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionValue campaignIdDimensionValue;

  /**
   * Comments for this placement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String comment;

  /**
   * Placement compatibility. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering on desktop, on
   * mobile devices or in mobile apps for regular or interstitial ads respectively. APP and
   * APP_INTERSTITIAL are no longer allowed for new placement insertions. Instead, use DISPLAY or
   * DISPLAY_INTERSTITIAL. IN_STREAM_VIDEO refers to rendering in in-stream video ads developed with
   * the VAST standard. This field is required on insertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String compatibility;

  /**
   * ID of the content category assigned to this placement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long contentCategoryId;

  /**
   * Information about the creation of this placement. This is a read-only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LastModifiedInfo createInfo;

  /**
   * Directory site ID of this placement. On insert, you must set either this field or the siteId
   * field to specify the site associated with this placement. This is a required field that is
   * read-only after insertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long directorySiteId;

  /**
   * Dimension value for the ID of the directory site. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionValue directorySiteIdDimensionValue;

  /**
   * External ID for this placement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalId;

  /**
   * ID of this placement. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * Dimension value for the ID of this placement. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionValue idDimensionValue;

  /**
   * Key name of this placement. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String keyName;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#placement".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Information about the most recent modification of this placement. This is a read-only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LastModifiedInfo lastModifiedInfo;

  /**
   * Lookback window settings for this placement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LookbackConfiguration lookbackConfiguration;

  /**
   * Name of this placement.This is a required field and must be less than or equal to 256
   * characters long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Whether payment was approved for this placement. This is a read-only field relevant only to
   * publisher-paid placements.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean paymentApproved;

  /**
   * Payment source for this placement. This is a required field that is read-only after insertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String paymentSource;

  /**
   * ID of this placement's group, if applicable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long placementGroupId;

  /**
   * Dimension value for the ID of the placement group. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionValue placementGroupIdDimensionValue;

  /**
   * ID of the placement strategy assigned to this placement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long placementStrategyId;

  /**
   * Pricing schedule of this placement. This field is required on insertion, specifically subfields
   * startDate, endDate and pricingType.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PricingSchedule pricingSchedule;

  /**
   * Whether this placement is the primary placement of a roadblock (placement group). You cannot
   * change this field from true to false. Setting this field to true will automatically set the
   * primary field on the original primary placement of the roadblock to false, and it will
   * automatically set the roadblock's primaryPlacementId field to the ID of this placement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean primary;

  /**
   * Information about the last publisher update. This is a read-only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LastModifiedInfo publisherUpdateInfo;

  /**
   * Site ID associated with this placement. On insert, you must set either this field or the
   * directorySiteId field to specify the site associated with this placement. This is a required
   * field that is read-only after insertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long siteId;

  /**
   * Dimension value for the ID of the site. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionValue siteIdDimensionValue;

  /**
   * Size associated with this placement. When inserting or updating a placement, only the size ID
   * field is used. This field is required on insertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Size size;

  /**
   * Whether creatives assigned to this placement must be SSL-compliant.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean sslRequired;

  /**
   * Third-party placement status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Subaccount ID of this placement. This field can be left blank.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long subaccountId;

  /**
   * Tag formats to generate for this placement. This field is required on insertion. Acceptable
   * values are: - "PLACEMENT_TAG_STANDARD" - "PLACEMENT_TAG_IFRAME_JAVASCRIPT" -
   * "PLACEMENT_TAG_IFRAME_ILAYER" - "PLACEMENT_TAG_INTERNAL_REDIRECT" - "PLACEMENT_TAG_JAVASCRIPT"
   * - "PLACEMENT_TAG_INTERSTITIAL_IFRAME_JAVASCRIPT" -
   * "PLACEMENT_TAG_INTERSTITIAL_INTERNAL_REDIRECT" - "PLACEMENT_TAG_INTERSTITIAL_JAVASCRIPT" -
   * "PLACEMENT_TAG_CLICK_COMMANDS" - "PLACEMENT_TAG_INSTREAM_VIDEO_PREFETCH" -
   * "PLACEMENT_TAG_INSTREAM_VIDEO_PREFETCH_VAST_3" - "PLACEMENT_TAG_INSTREAM_VIDEO_PREFETCH_VAST_4"
   * - "PLACEMENT_TAG_TRACKING" - "PLACEMENT_TAG_TRACKING_IFRAME" -
   * "PLACEMENT_TAG_TRACKING_JAVASCRIPT"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tagFormats;

  /**
   * Tag settings for this placement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TagSetting tagSetting;

  /**
   * Whether Verification and ActiveView are disabled for in-stream video creatives for this
   * placement. The same setting videoActiveViewOptOut exists on the site level -- the opt out
   * occurs if either of these settings are true. These settings are distinct from
   * DirectorySites.settings.activeViewOptOut or Sites.siteSettings.activeViewOptOut which only
   * apply to display ads. However, Accounts.activeViewOptOut opts out both video traffic, as well
   * as display ads, from Verification and ActiveView.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean videoActiveViewOptOut;

  /**
   * A collection of settings which affect video creatives served through this placement. Applicable
   * to placements with IN_STREAM_VIDEO compatibility.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VideoSettings videoSettings;

  /**
   * VPAID adapter setting for this placement. Controls which VPAID format the measurement adapter
   * will use for in-stream video creatives assigned to this placement. *Note:* Flash is no longer
   * supported. This field now defaults to HTML5 when the following values are provided: FLASH,
   * BOTH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vpaidAdapterChoice;

  /**
   * Account ID of this placement. This field can be left blank.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAccountId() {
    return accountId;
  }

  /**
   * Account ID of this placement. This field can be left blank.
   * @param accountId accountId or {@code null} for none
   */
  public Placement setAccountId(java.lang.Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Whether this placement opts out of ad blocking. When true, ad blocking is disabled for this
   * placement. When false, the campaign and site settings take effect.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAdBlockingOptOut() {
    return adBlockingOptOut;
  }

  /**
   * Whether this placement opts out of ad blocking. When true, ad blocking is disabled for this
   * placement. When false, the campaign and site settings take effect.
   * @param adBlockingOptOut adBlockingOptOut or {@code null} for none
   */
  public Placement setAdBlockingOptOut(java.lang.Boolean adBlockingOptOut) {
    this.adBlockingOptOut = adBlockingOptOut;
    return this;
  }

  /**
   * Additional sizes associated with this placement. When inserting or updating a placement, only
   * the size ID field is used.
   * @return value or {@code null} for none
   */
  public java.util.List<Size> getAdditionalSizes() {
    return additionalSizes;
  }

  /**
   * Additional sizes associated with this placement. When inserting or updating a placement, only
   * the size ID field is used.
   * @param additionalSizes additionalSizes or {@code null} for none
   */
  public Placement setAdditionalSizes(java.util.List<Size> additionalSizes) {
    this.additionalSizes = additionalSizes;
    return this;
  }

  /**
   * Advertiser ID of this placement. This field can be left blank.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAdvertiserId() {
    return advertiserId;
  }

  /**
   * Advertiser ID of this placement. This field can be left blank.
   * @param advertiserId advertiserId or {@code null} for none
   */
  public Placement setAdvertiserId(java.lang.Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  /**
   * Dimension value for the ID of the advertiser. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public DimensionValue getAdvertiserIdDimensionValue() {
    return advertiserIdDimensionValue;
  }

  /**
   * Dimension value for the ID of the advertiser. This is a read-only, auto-generated field.
   * @param advertiserIdDimensionValue advertiserIdDimensionValue or {@code null} for none
   */
  public Placement setAdvertiserIdDimensionValue(DimensionValue advertiserIdDimensionValue) {
    this.advertiserIdDimensionValue = advertiserIdDimensionValue;
    return this;
  }

  /**
   * Whether this placement is archived.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getArchived() {
    return archived;
  }

  /**
   * Whether this placement is archived.
   * @param archived archived or {@code null} for none
   */
  public Placement setArchived(java.lang.Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * Campaign ID of this placement. This field is a required field on insertion.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCampaignId() {
    return campaignId;
  }

  /**
   * Campaign ID of this placement. This field is a required field on insertion.
   * @param campaignId campaignId or {@code null} for none
   */
  public Placement setCampaignId(java.lang.Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Dimension value for the ID of the campaign. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public DimensionValue getCampaignIdDimensionValue() {
    return campaignIdDimensionValue;
  }

  /**
   * Dimension value for the ID of the campaign. This is a read-only, auto-generated field.
   * @param campaignIdDimensionValue campaignIdDimensionValue or {@code null} for none
   */
  public Placement setCampaignIdDimensionValue(DimensionValue campaignIdDimensionValue) {
    this.campaignIdDimensionValue = campaignIdDimensionValue;
    return this;
  }

  /**
   * Comments for this placement.
   * @return value or {@code null} for none
   */
  public java.lang.String getComment() {
    return comment;
  }

  /**
   * Comments for this placement.
   * @param comment comment or {@code null} for none
   */
  public Placement setComment(java.lang.String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Placement compatibility. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering on desktop, on
   * mobile devices or in mobile apps for regular or interstitial ads respectively. APP and
   * APP_INTERSTITIAL are no longer allowed for new placement insertions. Instead, use DISPLAY or
   * DISPLAY_INTERSTITIAL. IN_STREAM_VIDEO refers to rendering in in-stream video ads developed with
   * the VAST standard. This field is required on insertion.
   * @return value or {@code null} for none
   */
  public java.lang.String getCompatibility() {
    return compatibility;
  }

  /**
   * Placement compatibility. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering on desktop, on
   * mobile devices or in mobile apps for regular or interstitial ads respectively. APP and
   * APP_INTERSTITIAL are no longer allowed for new placement insertions. Instead, use DISPLAY or
   * DISPLAY_INTERSTITIAL. IN_STREAM_VIDEO refers to rendering in in-stream video ads developed with
   * the VAST standard. This field is required on insertion.
   * @param compatibility compatibility or {@code null} for none
   */
  public Placement setCompatibility(java.lang.String compatibility) {
    this.compatibility = compatibility;
    return this;
  }

  /**
   * ID of the content category assigned to this placement.
   * @return value or {@code null} for none
   */
  public java.lang.Long getContentCategoryId() {
    return contentCategoryId;
  }

  /**
   * ID of the content category assigned to this placement.
   * @param contentCategoryId contentCategoryId or {@code null} for none
   */
  public Placement setContentCategoryId(java.lang.Long contentCategoryId) {
    this.contentCategoryId = contentCategoryId;
    return this;
  }

  /**
   * Information about the creation of this placement. This is a read-only field.
   * @return value or {@code null} for none
   */
  public LastModifiedInfo getCreateInfo() {
    return createInfo;
  }

  /**
   * Information about the creation of this placement. This is a read-only field.
   * @param createInfo createInfo or {@code null} for none
   */
  public Placement setCreateInfo(LastModifiedInfo createInfo) {
    this.createInfo = createInfo;
    return this;
  }

  /**
   * Directory site ID of this placement. On insert, you must set either this field or the siteId
   * field to specify the site associated with this placement. This is a required field that is
   * read-only after insertion.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDirectorySiteId() {
    return directorySiteId;
  }

  /**
   * Directory site ID of this placement. On insert, you must set either this field or the siteId
   * field to specify the site associated with this placement. This is a required field that is
   * read-only after insertion.
   * @param directorySiteId directorySiteId or {@code null} for none
   */
  public Placement setDirectorySiteId(java.lang.Long directorySiteId) {
    this.directorySiteId = directorySiteId;
    return this;
  }

  /**
   * Dimension value for the ID of the directory site. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public DimensionValue getDirectorySiteIdDimensionValue() {
    return directorySiteIdDimensionValue;
  }

  /**
   * Dimension value for the ID of the directory site. This is a read-only, auto-generated field.
   * @param directorySiteIdDimensionValue directorySiteIdDimensionValue or {@code null} for none
   */
  public Placement setDirectorySiteIdDimensionValue(DimensionValue directorySiteIdDimensionValue) {
    this.directorySiteIdDimensionValue = directorySiteIdDimensionValue;
    return this;
  }

  /**
   * External ID for this placement.
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalId() {
    return externalId;
  }

  /**
   * External ID for this placement.
   * @param externalId externalId or {@code null} for none
   */
  public Placement setExternalId(java.lang.String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * ID of this placement. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * ID of this placement. This is a read-only, auto-generated field.
   * @param id id or {@code null} for none
   */
  public Placement setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * Dimension value for the ID of this placement. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public DimensionValue getIdDimensionValue() {
    return idDimensionValue;
  }

  /**
   * Dimension value for the ID of this placement. This is a read-only, auto-generated field.
   * @param idDimensionValue idDimensionValue or {@code null} for none
   */
  public Placement setIdDimensionValue(DimensionValue idDimensionValue) {
    this.idDimensionValue = idDimensionValue;
    return this;
  }

  /**
   * Key name of this placement. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public java.lang.String getKeyName() {
    return keyName;
  }

  /**
   * Key name of this placement. This is a read-only, auto-generated field.
   * @param keyName keyName or {@code null} for none
   */
  public Placement setKeyName(java.lang.String keyName) {
    this.keyName = keyName;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#placement".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#placement".
   * @param kind kind or {@code null} for none
   */
  public Placement setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Information about the most recent modification of this placement. This is a read-only field.
   * @return value or {@code null} for none
   */
  public LastModifiedInfo getLastModifiedInfo() {
    return lastModifiedInfo;
  }

  /**
   * Information about the most recent modification of this placement. This is a read-only field.
   * @param lastModifiedInfo lastModifiedInfo or {@code null} for none
   */
  public Placement setLastModifiedInfo(LastModifiedInfo lastModifiedInfo) {
    this.lastModifiedInfo = lastModifiedInfo;
    return this;
  }

  /**
   * Lookback window settings for this placement.
   * @return value or {@code null} for none
   */
  public LookbackConfiguration getLookbackConfiguration() {
    return lookbackConfiguration;
  }

  /**
   * Lookback window settings for this placement.
   * @param lookbackConfiguration lookbackConfiguration or {@code null} for none
   */
  public Placement setLookbackConfiguration(LookbackConfiguration lookbackConfiguration) {
    this.lookbackConfiguration = lookbackConfiguration;
    return this;
  }

  /**
   * Name of this placement.This is a required field and must be less than or equal to 256
   * characters long.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this placement.This is a required field and must be less than or equal to 256
   * characters long.
   * @param name name or {@code null} for none
   */
  public Placement setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Whether payment was approved for this placement. This is a read-only field relevant only to
   * publisher-paid placements.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPaymentApproved() {
    return paymentApproved;
  }

  /**
   * Whether payment was approved for this placement. This is a read-only field relevant only to
   * publisher-paid placements.
   * @param paymentApproved paymentApproved or {@code null} for none
   */
  public Placement setPaymentApproved(java.lang.Boolean paymentApproved) {
    this.paymentApproved = paymentApproved;
    return this;
  }

  /**
   * Payment source for this placement. This is a required field that is read-only after insertion.
   * @return value or {@code null} for none
   */
  public java.lang.String getPaymentSource() {
    return paymentSource;
  }

  /**
   * Payment source for this placement. This is a required field that is read-only after insertion.
   * @param paymentSource paymentSource or {@code null} for none
   */
  public Placement setPaymentSource(java.lang.String paymentSource) {
    this.paymentSource = paymentSource;
    return this;
  }

  /**
   * ID of this placement's group, if applicable.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPlacementGroupId() {
    return placementGroupId;
  }

  /**
   * ID of this placement's group, if applicable.
   * @param placementGroupId placementGroupId or {@code null} for none
   */
  public Placement setPlacementGroupId(java.lang.Long placementGroupId) {
    this.placementGroupId = placementGroupId;
    return this;
  }

  /**
   * Dimension value for the ID of the placement group. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public DimensionValue getPlacementGroupIdDimensionValue() {
    return placementGroupIdDimensionValue;
  }

  /**
   * Dimension value for the ID of the placement group. This is a read-only, auto-generated field.
   * @param placementGroupIdDimensionValue placementGroupIdDimensionValue or {@code null} for none
   */
  public Placement setPlacementGroupIdDimensionValue(DimensionValue placementGroupIdDimensionValue) {
    this.placementGroupIdDimensionValue = placementGroupIdDimensionValue;
    return this;
  }

  /**
   * ID of the placement strategy assigned to this placement.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPlacementStrategyId() {
    return placementStrategyId;
  }

  /**
   * ID of the placement strategy assigned to this placement.
   * @param placementStrategyId placementStrategyId or {@code null} for none
   */
  public Placement setPlacementStrategyId(java.lang.Long placementStrategyId) {
    this.placementStrategyId = placementStrategyId;
    return this;
  }

  /**
   * Pricing schedule of this placement. This field is required on insertion, specifically subfields
   * startDate, endDate and pricingType.
   * @return value or {@code null} for none
   */
  public PricingSchedule getPricingSchedule() {
    return pricingSchedule;
  }

  /**
   * Pricing schedule of this placement. This field is required on insertion, specifically subfields
   * startDate, endDate and pricingType.
   * @param pricingSchedule pricingSchedule or {@code null} for none
   */
  public Placement setPricingSchedule(PricingSchedule pricingSchedule) {
    this.pricingSchedule = pricingSchedule;
    return this;
  }

  /**
   * Whether this placement is the primary placement of a roadblock (placement group). You cannot
   * change this field from true to false. Setting this field to true will automatically set the
   * primary field on the original primary placement of the roadblock to false, and it will
   * automatically set the roadblock's primaryPlacementId field to the ID of this placement.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPrimary() {
    return primary;
  }

  /**
   * Whether this placement is the primary placement of a roadblock (placement group). You cannot
   * change this field from true to false. Setting this field to true will automatically set the
   * primary field on the original primary placement of the roadblock to false, and it will
   * automatically set the roadblock's primaryPlacementId field to the ID of this placement.
   * @param primary primary or {@code null} for none
   */
  public Placement setPrimary(java.lang.Boolean primary) {
    this.primary = primary;
    return this;
  }

  /**
   * Information about the last publisher update. This is a read-only field.
   * @return value or {@code null} for none
   */
  public LastModifiedInfo getPublisherUpdateInfo() {
    return publisherUpdateInfo;
  }

  /**
   * Information about the last publisher update. This is a read-only field.
   * @param publisherUpdateInfo publisherUpdateInfo or {@code null} for none
   */
  public Placement setPublisherUpdateInfo(LastModifiedInfo publisherUpdateInfo) {
    this.publisherUpdateInfo = publisherUpdateInfo;
    return this;
  }

  /**
   * Site ID associated with this placement. On insert, you must set either this field or the
   * directorySiteId field to specify the site associated with this placement. This is a required
   * field that is read-only after insertion.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSiteId() {
    return siteId;
  }

  /**
   * Site ID associated with this placement. On insert, you must set either this field or the
   * directorySiteId field to specify the site associated with this placement. This is a required
   * field that is read-only after insertion.
   * @param siteId siteId or {@code null} for none
   */
  public Placement setSiteId(java.lang.Long siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Dimension value for the ID of the site. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public DimensionValue getSiteIdDimensionValue() {
    return siteIdDimensionValue;
  }

  /**
   * Dimension value for the ID of the site. This is a read-only, auto-generated field.
   * @param siteIdDimensionValue siteIdDimensionValue or {@code null} for none
   */
  public Placement setSiteIdDimensionValue(DimensionValue siteIdDimensionValue) {
    this.siteIdDimensionValue = siteIdDimensionValue;
    return this;
  }

  /**
   * Size associated with this placement. When inserting or updating a placement, only the size ID
   * field is used. This field is required on insertion.
   * @return value or {@code null} for none
   */
  public Size getSize() {
    return size;
  }

  /**
   * Size associated with this placement. When inserting or updating a placement, only the size ID
   * field is used. This field is required on insertion.
   * @param size size or {@code null} for none
   */
  public Placement setSize(Size size) {
    this.size = size;
    return this;
  }

  /**
   * Whether creatives assigned to this placement must be SSL-compliant.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSslRequired() {
    return sslRequired;
  }

  /**
   * Whether creatives assigned to this placement must be SSL-compliant.
   * @param sslRequired sslRequired or {@code null} for none
   */
  public Placement setSslRequired(java.lang.Boolean sslRequired) {
    this.sslRequired = sslRequired;
    return this;
  }

  /**
   * Third-party placement status.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Third-party placement status.
   * @param status status or {@code null} for none
   */
  public Placement setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Subaccount ID of this placement. This field can be left blank.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSubaccountId() {
    return subaccountId;
  }

  /**
   * Subaccount ID of this placement. This field can be left blank.
   * @param subaccountId subaccountId or {@code null} for none
   */
  public Placement setSubaccountId(java.lang.Long subaccountId) {
    this.subaccountId = subaccountId;
    return this;
  }

  /**
   * Tag formats to generate for this placement. This field is required on insertion. Acceptable
   * values are: - "PLACEMENT_TAG_STANDARD" - "PLACEMENT_TAG_IFRAME_JAVASCRIPT" -
   * "PLACEMENT_TAG_IFRAME_ILAYER" - "PLACEMENT_TAG_INTERNAL_REDIRECT" - "PLACEMENT_TAG_JAVASCRIPT"
   * - "PLACEMENT_TAG_INTERSTITIAL_IFRAME_JAVASCRIPT" -
   * "PLACEMENT_TAG_INTERSTITIAL_INTERNAL_REDIRECT" - "PLACEMENT_TAG_INTERSTITIAL_JAVASCRIPT" -
   * "PLACEMENT_TAG_CLICK_COMMANDS" - "PLACEMENT_TAG_INSTREAM_VIDEO_PREFETCH" -
   * "PLACEMENT_TAG_INSTREAM_VIDEO_PREFETCH_VAST_3" - "PLACEMENT_TAG_INSTREAM_VIDEO_PREFETCH_VAST_4"
   * - "PLACEMENT_TAG_TRACKING" - "PLACEMENT_TAG_TRACKING_IFRAME" -
   * "PLACEMENT_TAG_TRACKING_JAVASCRIPT"
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTagFormats() {
    return tagFormats;
  }

  /**
   * Tag formats to generate for this placement. This field is required on insertion. Acceptable
   * values are: - "PLACEMENT_TAG_STANDARD" - "PLACEMENT_TAG_IFRAME_JAVASCRIPT" -
   * "PLACEMENT_TAG_IFRAME_ILAYER" - "PLACEMENT_TAG_INTERNAL_REDIRECT" - "PLACEMENT_TAG_JAVASCRIPT"
   * - "PLACEMENT_TAG_INTERSTITIAL_IFRAME_JAVASCRIPT" -
   * "PLACEMENT_TAG_INTERSTITIAL_INTERNAL_REDIRECT" - "PLACEMENT_TAG_INTERSTITIAL_JAVASCRIPT" -
   * "PLACEMENT_TAG_CLICK_COMMANDS" - "PLACEMENT_TAG_INSTREAM_VIDEO_PREFETCH" -
   * "PLACEMENT_TAG_INSTREAM_VIDEO_PREFETCH_VAST_3" - "PLACEMENT_TAG_INSTREAM_VIDEO_PREFETCH_VAST_4"
   * - "PLACEMENT_TAG_TRACKING" - "PLACEMENT_TAG_TRACKING_IFRAME" -
   * "PLACEMENT_TAG_TRACKING_JAVASCRIPT"
   * @param tagFormats tagFormats or {@code null} for none
   */
  public Placement setTagFormats(java.util.List<java.lang.String> tagFormats) {
    this.tagFormats = tagFormats;
    return this;
  }

  /**
   * Tag settings for this placement.
   * @return value or {@code null} for none
   */
  public TagSetting getTagSetting() {
    return tagSetting;
  }

  /**
   * Tag settings for this placement.
   * @param tagSetting tagSetting or {@code null} for none
   */
  public Placement setTagSetting(TagSetting tagSetting) {
    this.tagSetting = tagSetting;
    return this;
  }

  /**
   * Whether Verification and ActiveView are disabled for in-stream video creatives for this
   * placement. The same setting videoActiveViewOptOut exists on the site level -- the opt out
   * occurs if either of these settings are true. These settings are distinct from
   * DirectorySites.settings.activeViewOptOut or Sites.siteSettings.activeViewOptOut which only
   * apply to display ads. However, Accounts.activeViewOptOut opts out both video traffic, as well
   * as display ads, from Verification and ActiveView.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVideoActiveViewOptOut() {
    return videoActiveViewOptOut;
  }

  /**
   * Whether Verification and ActiveView are disabled for in-stream video creatives for this
   * placement. The same setting videoActiveViewOptOut exists on the site level -- the opt out
   * occurs if either of these settings are true. These settings are distinct from
   * DirectorySites.settings.activeViewOptOut or Sites.siteSettings.activeViewOptOut which only
   * apply to display ads. However, Accounts.activeViewOptOut opts out both video traffic, as well
   * as display ads, from Verification and ActiveView.
   * @param videoActiveViewOptOut videoActiveViewOptOut or {@code null} for none
   */
  public Placement setVideoActiveViewOptOut(java.lang.Boolean videoActiveViewOptOut) {
    this.videoActiveViewOptOut = videoActiveViewOptOut;
    return this;
  }

  /**
   * A collection of settings which affect video creatives served through this placement. Applicable
   * to placements with IN_STREAM_VIDEO compatibility.
   * @return value or {@code null} for none
   */
  public VideoSettings getVideoSettings() {
    return videoSettings;
  }

  /**
   * A collection of settings which affect video creatives served through this placement. Applicable
   * to placements with IN_STREAM_VIDEO compatibility.
   * @param videoSettings videoSettings or {@code null} for none
   */
  public Placement setVideoSettings(VideoSettings videoSettings) {
    this.videoSettings = videoSettings;
    return this;
  }

  /**
   * VPAID adapter setting for this placement. Controls which VPAID format the measurement adapter
   * will use for in-stream video creatives assigned to this placement. *Note:* Flash is no longer
   * supported. This field now defaults to HTML5 when the following values are provided: FLASH,
   * BOTH.
   * @return value or {@code null} for none
   */
  public java.lang.String getVpaidAdapterChoice() {
    return vpaidAdapterChoice;
  }

  /**
   * VPAID adapter setting for this placement. Controls which VPAID format the measurement adapter
   * will use for in-stream video creatives assigned to this placement. *Note:* Flash is no longer
   * supported. This field now defaults to HTML5 when the following values are provided: FLASH,
   * BOTH.
   * @param vpaidAdapterChoice vpaidAdapterChoice or {@code null} for none
   */
  public Placement setVpaidAdapterChoice(java.lang.String vpaidAdapterChoice) {
    this.vpaidAdapterChoice = vpaidAdapterChoice;
    return this;
  }

  @Override
  public Placement set(String fieldName, Object value) {
    return (Placement) super.set(fieldName, value);
  }

  @Override
  public Placement clone() {
    return (Placement) super.clone();
  }

}
