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

package com.google.api.services.youtube.model;

/**
 * Basic details about a playlist, including title, description and thumbnails. Basic details of a
 * YouTube Playlist item provided by the author. Next ID: 15
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PlaylistItemSnippet extends com.google.api.client.json.GenericJson {

  /**
   * The ID that YouTube uses to uniquely identify the user that added the item to the playlist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channelId;

  /**
   * Channel title for the channel that the playlist item belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channelTitle;

  /**
   * The item's description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The ID that YouTube uses to uniquely identify thGe playlist that the playlist item is in.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String playlistId;

  /**
   * The order in which the item appears in the playlist. The value uses a zero-based index, so the
   * first item has a position of 0, the second item has a position of 1, and so forth.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long position;

  /**
   * The date and time that the item was added to the playlist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime publishedAt;

  /**
   * The id object contains information that can be used to uniquely identify the resource that is
   * included in the playlist as the playlist item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourceId resourceId;

  /**
   * A map of thumbnail images associated with the playlist item. For each object in the map, the
   * key is the name of the thumbnail image, and the value is an object that contains other
   * information about the thumbnail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ThumbnailDetails thumbnails;

  /**
   * The item's title.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Channel id for the channel this video belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String videoOwnerChannelId;

  /**
   * Channel title for the channel this video belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String videoOwnerChannelTitle;

  /**
   * The ID that YouTube uses to uniquely identify the user that added the item to the playlist.
   * @return value or {@code null} for none
   */
  public java.lang.String getChannelId() {
    return channelId;
  }

  /**
   * The ID that YouTube uses to uniquely identify the user that added the item to the playlist.
   * @param channelId channelId or {@code null} for none
   */
  public PlaylistItemSnippet setChannelId(java.lang.String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * Channel title for the channel that the playlist item belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getChannelTitle() {
    return channelTitle;
  }

  /**
   * Channel title for the channel that the playlist item belongs to.
   * @param channelTitle channelTitle or {@code null} for none
   */
  public PlaylistItemSnippet setChannelTitle(java.lang.String channelTitle) {
    this.channelTitle = channelTitle;
    return this;
  }

  /**
   * The item's description.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The item's description.
   * @param description description or {@code null} for none
   */
  public PlaylistItemSnippet setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify thGe playlist that the playlist item is in.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlaylistId() {
    return playlistId;
  }

  /**
   * The ID that YouTube uses to uniquely identify thGe playlist that the playlist item is in.
   * @param playlistId playlistId or {@code null} for none
   */
  public PlaylistItemSnippet setPlaylistId(java.lang.String playlistId) {
    this.playlistId = playlistId;
    return this;
  }

  /**
   * The order in which the item appears in the playlist. The value uses a zero-based index, so the
   * first item has a position of 0, the second item has a position of 1, and so forth.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPosition() {
    return position;
  }

  /**
   * The order in which the item appears in the playlist. The value uses a zero-based index, so the
   * first item has a position of 0, the second item has a position of 1, and so forth.
   * @param position position or {@code null} for none
   */
  public PlaylistItemSnippet setPosition(java.lang.Long position) {
    this.position = position;
    return this;
  }

  /**
   * The date and time that the item was added to the playlist.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getPublishedAt() {
    return publishedAt;
  }

  /**
   * The date and time that the item was added to the playlist.
   * @param publishedAt publishedAt or {@code null} for none
   */
  public PlaylistItemSnippet setPublishedAt(com.google.api.client.util.DateTime publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * The id object contains information that can be used to uniquely identify the resource that is
   * included in the playlist as the playlist item.
   * @return value or {@code null} for none
   */
  public ResourceId getResourceId() {
    return resourceId;
  }

  /**
   * The id object contains information that can be used to uniquely identify the resource that is
   * included in the playlist as the playlist item.
   * @param resourceId resourceId or {@code null} for none
   */
  public PlaylistItemSnippet setResourceId(ResourceId resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * A map of thumbnail images associated with the playlist item. For each object in the map, the
   * key is the name of the thumbnail image, and the value is an object that contains other
   * information about the thumbnail.
   * @return value or {@code null} for none
   */
  public ThumbnailDetails getThumbnails() {
    return thumbnails;
  }

  /**
   * A map of thumbnail images associated with the playlist item. For each object in the map, the
   * key is the name of the thumbnail image, and the value is an object that contains other
   * information about the thumbnail.
   * @param thumbnails thumbnails or {@code null} for none
   */
  public PlaylistItemSnippet setThumbnails(ThumbnailDetails thumbnails) {
    this.thumbnails = thumbnails;
    return this;
  }

  /**
   * The item's title.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The item's title.
   * @param title title or {@code null} for none
   */
  public PlaylistItemSnippet setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Channel id for the channel this video belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getVideoOwnerChannelId() {
    return videoOwnerChannelId;
  }

  /**
   * Channel id for the channel this video belongs to.
   * @param videoOwnerChannelId videoOwnerChannelId or {@code null} for none
   */
  public PlaylistItemSnippet setVideoOwnerChannelId(java.lang.String videoOwnerChannelId) {
    this.videoOwnerChannelId = videoOwnerChannelId;
    return this;
  }

  /**
   * Channel title for the channel this video belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getVideoOwnerChannelTitle() {
    return videoOwnerChannelTitle;
  }

  /**
   * Channel title for the channel this video belongs to.
   * @param videoOwnerChannelTitle videoOwnerChannelTitle or {@code null} for none
   */
  public PlaylistItemSnippet setVideoOwnerChannelTitle(java.lang.String videoOwnerChannelTitle) {
    this.videoOwnerChannelTitle = videoOwnerChannelTitle;
    return this;
  }

  @Override
  public PlaylistItemSnippet set(String fieldName, Object value) {
    return (PlaylistItemSnippet) super.set(fieldName, value);
  }

  @Override
  public PlaylistItemSnippet clone() {
    return (PlaylistItemSnippet) super.clone();
  }

}
