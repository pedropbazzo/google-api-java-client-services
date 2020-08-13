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

package com.google.api.services.containeranalysis.v1alpha1.model;

/**
 * Message encapsulating build provenance details.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuildDetails extends com.google.api.client.json.GenericJson {

  /**
   * The actual provenance
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildProvenance provenance;

  /**
   * Serialized JSON representation of the provenance, used in generating the `BuildSignature` in
   * the corresponding Result. After verifying the signature, `provenance_bytes` can be unmarshalled
   * and compared to the provenance to confirm that it is unchanged. A base64-encoded string
   * representation of the provenance bytes is used for the signature in order to interoperate with
   * openssl which expects this format for signature verification. The serialized form is captured
   * both to avoid ambiguity in how the provenance is marshalled to json as well to prevent
   * incompatibilities with future changes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String provenanceBytes;

  /**
   * The actual provenance
   * @return value or {@code null} for none
   */
  public BuildProvenance getProvenance() {
    return provenance;
  }

  /**
   * The actual provenance
   * @param provenance provenance or {@code null} for none
   */
  public BuildDetails setProvenance(BuildProvenance provenance) {
    this.provenance = provenance;
    return this;
  }

  /**
   * Serialized JSON representation of the provenance, used in generating the `BuildSignature` in
   * the corresponding Result. After verifying the signature, `provenance_bytes` can be unmarshalled
   * and compared to the provenance to confirm that it is unchanged. A base64-encoded string
   * representation of the provenance bytes is used for the signature in order to interoperate with
   * openssl which expects this format for signature verification. The serialized form is captured
   * both to avoid ambiguity in how the provenance is marshalled to json as well to prevent
   * incompatibilities with future changes.
   * @return value or {@code null} for none
   */
  public java.lang.String getProvenanceBytes() {
    return provenanceBytes;
  }

  /**
   * Serialized JSON representation of the provenance, used in generating the `BuildSignature` in
   * the corresponding Result. After verifying the signature, `provenance_bytes` can be unmarshalled
   * and compared to the provenance to confirm that it is unchanged. A base64-encoded string
   * representation of the provenance bytes is used for the signature in order to interoperate with
   * openssl which expects this format for signature verification. The serialized form is captured
   * both to avoid ambiguity in how the provenance is marshalled to json as well to prevent
   * incompatibilities with future changes.
   * @param provenanceBytes provenanceBytes or {@code null} for none
   */
  public BuildDetails setProvenanceBytes(java.lang.String provenanceBytes) {
    this.provenanceBytes = provenanceBytes;
    return this;
  }

  @Override
  public BuildDetails set(String fieldName, Object value) {
    return (BuildDetails) super.set(fieldName, value);
  }

  @Override
  public BuildDetails clone() {
    return (BuildDetails) super.clone();
  }

}
