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
 * Detailed settings of a stream.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LiveStreamContentDetails extends com.google.api.client.json.GenericJson {

  /**
   * The ingestion URL where the closed captions of this stream are sent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String closedCaptionsIngestionUrl;

  /**
   * Indicates whether the stream is reusable, which means that it can be bound to multiple
   * broadcasts. It is common for broadcasters to reuse the same stream for many different
   * broadcasts if those broadcasts occur at different times. If you set this value to false, then
   * the stream will not be reusable, which means that it can only be bound to one broadcast. Non-
   * reusable streams differ from reusable streams in the following ways: - A non-reusable stream
   * can only be bound to one broadcast. - A non-reusable stream might be deleted by an automated
   * process after the broadcast ends. - The liveStreams.list method does not list non-reusable
   * streams if you call the method and set the mine parameter to true. The only way to use that
   * method to retrieve the resource for a non-reusable stream is to use the id parameter to
   * identify the stream.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isReusable;

  /**
   * The ingestion URL where the closed captions of this stream are sent.
   * @return value or {@code null} for none
   */
  public java.lang.String getClosedCaptionsIngestionUrl() {
    return closedCaptionsIngestionUrl;
  }

  /**
   * The ingestion URL where the closed captions of this stream are sent.
   * @param closedCaptionsIngestionUrl closedCaptionsIngestionUrl or {@code null} for none
   */
  public LiveStreamContentDetails setClosedCaptionsIngestionUrl(java.lang.String closedCaptionsIngestionUrl) {
    this.closedCaptionsIngestionUrl = closedCaptionsIngestionUrl;
    return this;
  }

  /**
   * Indicates whether the stream is reusable, which means that it can be bound to multiple
   * broadcasts. It is common for broadcasters to reuse the same stream for many different
   * broadcasts if those broadcasts occur at different times. If you set this value to false, then
   * the stream will not be reusable, which means that it can only be bound to one broadcast. Non-
   * reusable streams differ from reusable streams in the following ways: - A non-reusable stream
   * can only be bound to one broadcast. - A non-reusable stream might be deleted by an automated
   * process after the broadcast ends. - The liveStreams.list method does not list non-reusable
   * streams if you call the method and set the mine parameter to true. The only way to use that
   * method to retrieve the resource for a non-reusable stream is to use the id parameter to
   * identify the stream.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsReusable() {
    return isReusable;
  }

  /**
   * Indicates whether the stream is reusable, which means that it can be bound to multiple
   * broadcasts. It is common for broadcasters to reuse the same stream for many different
   * broadcasts if those broadcasts occur at different times. If you set this value to false, then
   * the stream will not be reusable, which means that it can only be bound to one broadcast. Non-
   * reusable streams differ from reusable streams in the following ways: - A non-reusable stream
   * can only be bound to one broadcast. - A non-reusable stream might be deleted by an automated
   * process after the broadcast ends. - The liveStreams.list method does not list non-reusable
   * streams if you call the method and set the mine parameter to true. The only way to use that
   * method to retrieve the resource for a non-reusable stream is to use the id parameter to
   * identify the stream.
   * @param isReusable isReusable or {@code null} for none
   */
  public LiveStreamContentDetails setIsReusable(java.lang.Boolean isReusable) {
    this.isReusable = isReusable;
    return this;
  }

  @Override
  public LiveStreamContentDetails set(String fieldName, Object value) {
    return (LiveStreamContentDetails) super.set(fieldName, value);
  }

  @Override
  public LiveStreamContentDetails clone() {
    return (LiveStreamContentDetails) super.clone();
  }

}
