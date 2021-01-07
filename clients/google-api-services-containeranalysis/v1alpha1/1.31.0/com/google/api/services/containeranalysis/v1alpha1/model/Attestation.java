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
 * Occurrence that represents a single "attestation". The authenticity of an Attestation can be
 * verified using the attached signature. If the verifier trusts the public key of the signer, then
 * verifying the signature is sufficient to establish trust. In this circumstance, the
 * AttestationAuthority to which this Attestation is attached is primarily useful for look-up (how
 * to find this Attestation if you already know the Authority and artifact to be verified) and
 * intent (which authority was this attestation intended to sign for).
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
public final class Attestation extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PgpSignedAttestation pgpSignedAttestation;

  /**
   * @return value or {@code null} for none
   */
  public PgpSignedAttestation getPgpSignedAttestation() {
    return pgpSignedAttestation;
  }

  /**
   * @param pgpSignedAttestation pgpSignedAttestation or {@code null} for none
   */
  public Attestation setPgpSignedAttestation(PgpSignedAttestation pgpSignedAttestation) {
    this.pgpSignedAttestation = pgpSignedAttestation;
    return this;
  }

  @Override
  public Attestation set(String fieldName, Object value) {
    return (Attestation) super.set(fieldName, value);
  }

  @Override
  public Attestation clone() {
    return (Attestation) super.clone();
  }

}
