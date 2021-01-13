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

package com.google.api.services.privateca.v1beta1.model;

/**
 * A common proto for logging HTTP requests. Only contains semantics defined by the HTTP
 * specification. Product-specific logging information MUST be defined in a separate message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Certificate Authority API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleApiServicecontrolV1HttpRequest extends com.google.api.client.json.GenericJson {

  /**
   * The number of HTTP response bytes inserted into cache. Set only when a cache fill was
   * attempted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long cacheFillBytes;

  /**
   * Whether or not an entity was served from cache (with or without validation).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean cacheHit;

  /**
   * Whether or not a cache lookup was attempted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean cacheLookup;

  /**
   * Whether or not the response was validated with the origin server before being served from
   * cache. This field is only meaningful if `cache_hit` is True.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean cacheValidatedWithOriginServer;

  /**
   * The request processing latency on the server, from the time the request was received until the
   * response was sent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String latency;

  /**
   * Protocol used for the request. Examples: "HTTP/1.1", "HTTP/2", "websocket"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String protocol;

  /**
   * The referer URL of the request, as defined in [HTTP/1.1 Header Field
   * Definitions](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String referer;

  /**
   * The IP address (IPv4 or IPv6) of the client that issued the HTTP request. Examples:
   * `"192.168.1.1"`, `"FE80::0202:B3FF:FE1E:8329"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String remoteIp;

  /**
   * The request method. Examples: `"GET"`, `"HEAD"`, `"PUT"`, `"POST"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestMethod;

  /**
   * The size of the HTTP request message in bytes, including the request headers and the request
   * body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long requestSize;

  /**
   * The scheme (http, https), the host name, the path, and the query portion of the URL that was
   * requested. Example: `"http://example.com/some/info?color=red"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestUrl;

  /**
   * The size of the HTTP response message sent back to the client, in bytes, including the response
   * headers and the response body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long responseSize;

  /**
   * The IP address (IPv4 or IPv6) of the origin server that the request was sent to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serverIp;

  /**
   * The response code indicating the status of the response. Examples: 200, 404.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer status;

  /**
   * The user agent sent by the client. Example: `"Mozilla/4.0 (compatible; MSIE 6.0; Windows 98;
   * Q312461; .NET CLR 1.0.3705)"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userAgent;

  /**
   * The number of HTTP response bytes inserted into cache. Set only when a cache fill was
   * attempted.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCacheFillBytes() {
    return cacheFillBytes;
  }

  /**
   * The number of HTTP response bytes inserted into cache. Set only when a cache fill was
   * attempted.
   * @param cacheFillBytes cacheFillBytes or {@code null} for none
   */
  public GoogleApiServicecontrolV1HttpRequest setCacheFillBytes(java.lang.Long cacheFillBytes) {
    this.cacheFillBytes = cacheFillBytes;
    return this;
  }

  /**
   * Whether or not an entity was served from cache (with or without validation).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCacheHit() {
    return cacheHit;
  }

  /**
   * Whether or not an entity was served from cache (with or without validation).
   * @param cacheHit cacheHit or {@code null} for none
   */
  public GoogleApiServicecontrolV1HttpRequest setCacheHit(java.lang.Boolean cacheHit) {
    this.cacheHit = cacheHit;
    return this;
  }

  /**
   * Whether or not a cache lookup was attempted.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCacheLookup() {
    return cacheLookup;
  }

  /**
   * Whether or not a cache lookup was attempted.
   * @param cacheLookup cacheLookup or {@code null} for none
   */
  public GoogleApiServicecontrolV1HttpRequest setCacheLookup(java.lang.Boolean cacheLookup) {
    this.cacheLookup = cacheLookup;
    return this;
  }

  /**
   * Whether or not the response was validated with the origin server before being served from
   * cache. This field is only meaningful if `cache_hit` is True.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCacheValidatedWithOriginServer() {
    return cacheValidatedWithOriginServer;
  }

  /**
   * Whether or not the response was validated with the origin server before being served from
   * cache. This field is only meaningful if `cache_hit` is True.
   * @param cacheValidatedWithOriginServer cacheValidatedWithOriginServer or {@code null} for none
   */
  public GoogleApiServicecontrolV1HttpRequest setCacheValidatedWithOriginServer(java.lang.Boolean cacheValidatedWithOriginServer) {
    this.cacheValidatedWithOriginServer = cacheValidatedWithOriginServer;
    return this;
  }

  /**
   * The request processing latency on the server, from the time the request was received until the
   * response was sent.
   * @return value or {@code null} for none
   */
  public String getLatency() {
    return latency;
  }

  /**
   * The request processing latency on the server, from the time the request was received until the
   * response was sent.
   * @param latency latency or {@code null} for none
   */
  public GoogleApiServicecontrolV1HttpRequest setLatency(String latency) {
    this.latency = latency;
    return this;
  }

  /**
   * Protocol used for the request. Examples: "HTTP/1.1", "HTTP/2", "websocket"
   * @return value or {@code null} for none
   */
  public java.lang.String getProtocol() {
    return protocol;
  }

  /**
   * Protocol used for the request. Examples: "HTTP/1.1", "HTTP/2", "websocket"
   * @param protocol protocol or {@code null} for none
   */
  public GoogleApiServicecontrolV1HttpRequest setProtocol(java.lang.String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * The referer URL of the request, as defined in [HTTP/1.1 Header Field
   * Definitions](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html).
   * @return value or {@code null} for none
   */
  public java.lang.String getReferer() {
    return referer;
  }

  /**
   * The referer URL of the request, as defined in [HTTP/1.1 Header Field
   * Definitions](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html).
   * @param referer referer or {@code null} for none
   */
  public GoogleApiServicecontrolV1HttpRequest setReferer(java.lang.String referer) {
    this.referer = referer;
    return this;
  }

  /**
   * The IP address (IPv4 or IPv6) of the client that issued the HTTP request. Examples:
   * `"192.168.1.1"`, `"FE80::0202:B3FF:FE1E:8329"`.
   * @return value or {@code null} for none
   */
  public java.lang.String getRemoteIp() {
    return remoteIp;
  }

  /**
   * The IP address (IPv4 or IPv6) of the client that issued the HTTP request. Examples:
   * `"192.168.1.1"`, `"FE80::0202:B3FF:FE1E:8329"`.
   * @param remoteIp remoteIp or {@code null} for none
   */
  public GoogleApiServicecontrolV1HttpRequest setRemoteIp(java.lang.String remoteIp) {
    this.remoteIp = remoteIp;
    return this;
  }

  /**
   * The request method. Examples: `"GET"`, `"HEAD"`, `"PUT"`, `"POST"`.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestMethod() {
    return requestMethod;
  }

  /**
   * The request method. Examples: `"GET"`, `"HEAD"`, `"PUT"`, `"POST"`.
   * @param requestMethod requestMethod or {@code null} for none
   */
  public GoogleApiServicecontrolV1HttpRequest setRequestMethod(java.lang.String requestMethod) {
    this.requestMethod = requestMethod;
    return this;
  }

  /**
   * The size of the HTTP request message in bytes, including the request headers and the request
   * body.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRequestSize() {
    return requestSize;
  }

  /**
   * The size of the HTTP request message in bytes, including the request headers and the request
   * body.
   * @param requestSize requestSize or {@code null} for none
   */
  public GoogleApiServicecontrolV1HttpRequest setRequestSize(java.lang.Long requestSize) {
    this.requestSize = requestSize;
    return this;
  }

  /**
   * The scheme (http, https), the host name, the path, and the query portion of the URL that was
   * requested. Example: `"http://example.com/some/info?color=red"`.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestUrl() {
    return requestUrl;
  }

  /**
   * The scheme (http, https), the host name, the path, and the query portion of the URL that was
   * requested. Example: `"http://example.com/some/info?color=red"`.
   * @param requestUrl requestUrl or {@code null} for none
   */
  public GoogleApiServicecontrolV1HttpRequest setRequestUrl(java.lang.String requestUrl) {
    this.requestUrl = requestUrl;
    return this;
  }

  /**
   * The size of the HTTP response message sent back to the client, in bytes, including the response
   * headers and the response body.
   * @return value or {@code null} for none
   */
  public java.lang.Long getResponseSize() {
    return responseSize;
  }

  /**
   * The size of the HTTP response message sent back to the client, in bytes, including the response
   * headers and the response body.
   * @param responseSize responseSize or {@code null} for none
   */
  public GoogleApiServicecontrolV1HttpRequest setResponseSize(java.lang.Long responseSize) {
    this.responseSize = responseSize;
    return this;
  }

  /**
   * The IP address (IPv4 or IPv6) of the origin server that the request was sent to.
   * @return value or {@code null} for none
   */
  public java.lang.String getServerIp() {
    return serverIp;
  }

  /**
   * The IP address (IPv4 or IPv6) of the origin server that the request was sent to.
   * @param serverIp serverIp or {@code null} for none
   */
  public GoogleApiServicecontrolV1HttpRequest setServerIp(java.lang.String serverIp) {
    this.serverIp = serverIp;
    return this;
  }

  /**
   * The response code indicating the status of the response. Examples: 200, 404.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStatus() {
    return status;
  }

  /**
   * The response code indicating the status of the response. Examples: 200, 404.
   * @param status status or {@code null} for none
   */
  public GoogleApiServicecontrolV1HttpRequest setStatus(java.lang.Integer status) {
    this.status = status;
    return this;
  }

  /**
   * The user agent sent by the client. Example: `"Mozilla/4.0 (compatible; MSIE 6.0; Windows 98;
   * Q312461; .NET CLR 1.0.3705)"`.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserAgent() {
    return userAgent;
  }

  /**
   * The user agent sent by the client. Example: `"Mozilla/4.0 (compatible; MSIE 6.0; Windows 98;
   * Q312461; .NET CLR 1.0.3705)"`.
   * @param userAgent userAgent or {@code null} for none
   */
  public GoogleApiServicecontrolV1HttpRequest setUserAgent(java.lang.String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  @Override
  public GoogleApiServicecontrolV1HttpRequest set(String fieldName, Object value) {
    return (GoogleApiServicecontrolV1HttpRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleApiServicecontrolV1HttpRequest clone() {
    return (GoogleApiServicecontrolV1HttpRequest) super.clone();
  }

}
