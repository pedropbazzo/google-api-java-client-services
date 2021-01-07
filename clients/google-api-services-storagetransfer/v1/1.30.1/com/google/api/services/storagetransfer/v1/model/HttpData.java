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

package com.google.api.services.storagetransfer.v1.model;

/**
 * An HttpData resource specifies a list of objects on the web to be transferred over HTTP. The
 * information of the objects to be transferred is contained in a file referenced by a URL. The
 * first line in the file must be `"TsvHttpData-1.0"`, which specifies the format of the file.
 * Subsequent lines specify the information of the list of objects, one object per list entry. Each
 * entry has the following tab-delimited fields: * **HTTP URL** — The location of the object. *
 * **Length** — The size of the object in bytes. * **MD5** — The base64-encoded MD5 hash of the
 * object. For an example of a valid TSV file, see [Transferring data from
 * URLs](https://cloud.google.com/storage-transfer/docs/create-url-list). When transferring data
 * based on a URL list, keep the following in mind: * When an object located at
 * `http(s)://hostname:port/` is transferred to a data sink, the name of the object at the data sink
 * is `/`. * If the specified size of an object does not match the actual size of the object
 * fetched, the object will not be transferred. * If the specified MD5 does not match the MD5
 * computed from the transferred bytes, the object transfer will fail. For more information, see
 * [Generating MD5 hashes] (https://cloud.google.com/storage-transfer/docs/create-url-
 * list#md5-checksum) * Ensure that each URL you specify is publicly accessible. For example, in
 * Cloud Storage you can [share an object publicly] (https://cloud.google.com/storage/docs/cloud-
 * console#_sharingdata) and get a link to it. * Storage Transfer Service obeys `robots.txt` rules
 * and requires the source HTTP server to support `Range` requests and to return a `Content-Length`
 * header in each response. * ObjectConditions have no effect when filtering objects to transfer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Storage Transfer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpData extends com.google.api.client.json.GenericJson {

  /**
   * Required. The URL that points to the file that stores the object list entries. This file must
   * allow public access. Currently, only URLs with HTTP and HTTPS schemes are supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String listUrl;

  /**
   * Required. The URL that points to the file that stores the object list entries. This file must
   * allow public access. Currently, only URLs with HTTP and HTTPS schemes are supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getListUrl() {
    return listUrl;
  }

  /**
   * Required. The URL that points to the file that stores the object list entries. This file must
   * allow public access. Currently, only URLs with HTTP and HTTPS schemes are supported.
   * @param listUrl listUrl or {@code null} for none
   */
  public HttpData setListUrl(java.lang.String listUrl) {
    this.listUrl = listUrl;
    return this;
  }

  @Override
  public HttpData set(String fieldName, Object value) {
    return (HttpData) super.set(fieldName, value);
  }

  @Override
  public HttpData clone() {
    return (HttpData) super.clone();
  }

}
