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

package com.google.api.services.translate.v3beta1.model;

/**
 * The Google Cloud Storage location for the output content.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Translation API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GcsDestination extends com.google.api.client.json.GenericJson {

  /**
   * Required. There must be no files under 'output_uri_prefix'. 'output_uri_prefix' must end with
   * "/" and start with "gs://", otherwise an INVALID_ARGUMENT (400) error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputUriPrefix;

  /**
   * Required. There must be no files under 'output_uri_prefix'. 'output_uri_prefix' must end with
   * "/" and start with "gs://", otherwise an INVALID_ARGUMENT (400) error is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputUriPrefix() {
    return outputUriPrefix;
  }

  /**
   * Required. There must be no files under 'output_uri_prefix'. 'output_uri_prefix' must end with
   * "/" and start with "gs://", otherwise an INVALID_ARGUMENT (400) error is returned.
   * @param outputUriPrefix outputUriPrefix or {@code null} for none
   */
  public GcsDestination setOutputUriPrefix(java.lang.String outputUriPrefix) {
    this.outputUriPrefix = outputUriPrefix;
    return this;
  }

  @Override
  public GcsDestination set(String fieldName, Object value) {
    return (GcsDestination) super.set(fieldName, value);
  }

  @Override
  public GcsDestination clone() {
    return (GcsDestination) super.clone();
  }

}
