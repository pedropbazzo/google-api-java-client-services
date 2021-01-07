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
 * Request message for CertificateAuthorityService.EnableCertificateAuthority.
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
public final class EnableCertificateAuthorityRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. An ID to identify requests. Specify a unique request ID so that if you must retry
   * your request, the server will know to ignore the request if it has already been completed. The
   * server will guarantee that for at least 60 minutes since the first request. For example,
   * consider a situation where you make an initial request and t he request times out. If you make
   * the request again with the same request ID, the server can check if original operation with the
   * same request ID was received, and if so, will ignore the second request. This prevents clients
   * from accidentally creating duplicate commitments. The request ID must be a valid UUID with the
   * exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * Optional. An ID to identify requests. Specify a unique request ID so that if you must retry
   * your request, the server will know to ignore the request if it has already been completed. The
   * server will guarantee that for at least 60 minutes since the first request. For example,
   * consider a situation where you make an initial request and t he request times out. If you make
   * the request again with the same request ID, the server can check if original operation with the
   * same request ID was received, and if so, will ignore the second request. This prevents clients
   * from accidentally creating duplicate commitments. The request ID must be a valid UUID with the
   * exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * Optional. An ID to identify requests. Specify a unique request ID so that if you must retry
   * your request, the server will know to ignore the request if it has already been completed. The
   * server will guarantee that for at least 60 minutes since the first request. For example,
   * consider a situation where you make an initial request and t he request times out. If you make
   * the request again with the same request ID, the server can check if original operation with the
   * same request ID was received, and if so, will ignore the second request. This prevents clients
   * from accidentally creating duplicate commitments. The request ID must be a valid UUID with the
   * exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
   * @param requestId requestId or {@code null} for none
   */
  public EnableCertificateAuthorityRequest setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  @Override
  public EnableCertificateAuthorityRequest set(String fieldName, Object value) {
    return (EnableCertificateAuthorityRequest) super.set(fieldName, value);
  }

  @Override
  public EnableCertificateAuthorityRequest clone() {
    return (EnableCertificateAuthorityRequest) super.clone();
  }

}
