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

package com.google.api.services.dataproc.model;

/**
 * Specifies Kerberos related configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class KerberosConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The admin server (IP or hostname) for the remote trusted realm in a cross realm trust
   * relationship.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String crossRealmTrustAdminServer;

  /**
   * Optional. The KDC (IP or hostname) for the remote trusted realm in a cross realm trust
   * relationship.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String crossRealmTrustKdc;

  /**
   * Optional. The remote realm the Dataproc on-cluster KDC will trust, should the user enable cross
   * realm trust.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String crossRealmTrustRealm;

  /**
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the shared password between
   * the on-cluster Kerberos realm and the remote trusted realm, in a cross realm trust
   * relationship.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String crossRealmTrustSharedPasswordUri;

  /**
   * Optional. Flag to indicate whether to Kerberize the cluster (default: false). Set this field to
   * true to enable Kerberos on a cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableKerberos;

  /**
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the master key of the KDC
   * database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kdcDbKeyUri;

  /**
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user
   * provided key. For the self-signed certificate, this password is generated by Dataproc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String keyPasswordUri;

  /**
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user
   * provided keystore. For the self-signed certificate, this password is generated by Dataproc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String keystorePasswordUri;

  /**
   * Optional. The Cloud Storage URI of the keystore file used for SSL encryption. If not provided,
   * Dataproc will provide a self-signed certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String keystoreUri;

  /**
   * Optional. The uri of the KMS key used to encrypt various sensitive files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKeyUri;

  /**
   * Optional. The name of the on-cluster Kerberos realm. If not specified, the uppercased domain of
   * hostnames will be the realm.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String realm;

  /**
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the root principal password.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rootPrincipalPasswordUri;

  /**
   * Optional. The lifetime of the ticket granting ticket, in hours. If not specified, or user
   * specifies 0, then default value 10 will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer tgtLifetimeHours;

  /**
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user
   * provided truststore. For the self-signed certificate, this password is generated by Dataproc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String truststorePasswordUri;

  /**
   * Optional. The Cloud Storage URI of the truststore file used for SSL encryption. If not
   * provided, Dataproc will provide a self-signed certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String truststoreUri;

  /**
   * Optional. The admin server (IP or hostname) for the remote trusted realm in a cross realm trust
   * relationship.
   * @return value or {@code null} for none
   */
  public java.lang.String getCrossRealmTrustAdminServer() {
    return crossRealmTrustAdminServer;
  }

  /**
   * Optional. The admin server (IP or hostname) for the remote trusted realm in a cross realm trust
   * relationship.
   * @param crossRealmTrustAdminServer crossRealmTrustAdminServer or {@code null} for none
   */
  public KerberosConfig setCrossRealmTrustAdminServer(java.lang.String crossRealmTrustAdminServer) {
    this.crossRealmTrustAdminServer = crossRealmTrustAdminServer;
    return this;
  }

  /**
   * Optional. The KDC (IP or hostname) for the remote trusted realm in a cross realm trust
   * relationship.
   * @return value or {@code null} for none
   */
  public java.lang.String getCrossRealmTrustKdc() {
    return crossRealmTrustKdc;
  }

  /**
   * Optional. The KDC (IP or hostname) for the remote trusted realm in a cross realm trust
   * relationship.
   * @param crossRealmTrustKdc crossRealmTrustKdc or {@code null} for none
   */
  public KerberosConfig setCrossRealmTrustKdc(java.lang.String crossRealmTrustKdc) {
    this.crossRealmTrustKdc = crossRealmTrustKdc;
    return this;
  }

  /**
   * Optional. The remote realm the Dataproc on-cluster KDC will trust, should the user enable cross
   * realm trust.
   * @return value or {@code null} for none
   */
  public java.lang.String getCrossRealmTrustRealm() {
    return crossRealmTrustRealm;
  }

  /**
   * Optional. The remote realm the Dataproc on-cluster KDC will trust, should the user enable cross
   * realm trust.
   * @param crossRealmTrustRealm crossRealmTrustRealm or {@code null} for none
   */
  public KerberosConfig setCrossRealmTrustRealm(java.lang.String crossRealmTrustRealm) {
    this.crossRealmTrustRealm = crossRealmTrustRealm;
    return this;
  }

  /**
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the shared password between
   * the on-cluster Kerberos realm and the remote trusted realm, in a cross realm trust
   * relationship.
   * @return value or {@code null} for none
   */
  public java.lang.String getCrossRealmTrustSharedPasswordUri() {
    return crossRealmTrustSharedPasswordUri;
  }

  /**
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the shared password between
   * the on-cluster Kerberos realm and the remote trusted realm, in a cross realm trust
   * relationship.
   * @param crossRealmTrustSharedPasswordUri crossRealmTrustSharedPasswordUri or {@code null} for none
   */
  public KerberosConfig setCrossRealmTrustSharedPasswordUri(java.lang.String crossRealmTrustSharedPasswordUri) {
    this.crossRealmTrustSharedPasswordUri = crossRealmTrustSharedPasswordUri;
    return this;
  }

  /**
   * Optional. Flag to indicate whether to Kerberize the cluster (default: false). Set this field to
   * true to enable Kerberos on a cluster.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableKerberos() {
    return enableKerberos;
  }

  /**
   * Optional. Flag to indicate whether to Kerberize the cluster (default: false). Set this field to
   * true to enable Kerberos on a cluster.
   * @param enableKerberos enableKerberos or {@code null} for none
   */
  public KerberosConfig setEnableKerberos(java.lang.Boolean enableKerberos) {
    this.enableKerberos = enableKerberos;
    return this;
  }

  /**
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the master key of the KDC
   * database.
   * @return value or {@code null} for none
   */
  public java.lang.String getKdcDbKeyUri() {
    return kdcDbKeyUri;
  }

  /**
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the master key of the KDC
   * database.
   * @param kdcDbKeyUri kdcDbKeyUri or {@code null} for none
   */
  public KerberosConfig setKdcDbKeyUri(java.lang.String kdcDbKeyUri) {
    this.kdcDbKeyUri = kdcDbKeyUri;
    return this;
  }

  /**
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user
   * provided key. For the self-signed certificate, this password is generated by Dataproc.
   * @return value or {@code null} for none
   */
  public java.lang.String getKeyPasswordUri() {
    return keyPasswordUri;
  }

  /**
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user
   * provided key. For the self-signed certificate, this password is generated by Dataproc.
   * @param keyPasswordUri keyPasswordUri or {@code null} for none
   */
  public KerberosConfig setKeyPasswordUri(java.lang.String keyPasswordUri) {
    this.keyPasswordUri = keyPasswordUri;
    return this;
  }

  /**
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user
   * provided keystore. For the self-signed certificate, this password is generated by Dataproc.
   * @return value or {@code null} for none
   */
  public java.lang.String getKeystorePasswordUri() {
    return keystorePasswordUri;
  }

  /**
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user
   * provided keystore. For the self-signed certificate, this password is generated by Dataproc.
   * @param keystorePasswordUri keystorePasswordUri or {@code null} for none
   */
  public KerberosConfig setKeystorePasswordUri(java.lang.String keystorePasswordUri) {
    this.keystorePasswordUri = keystorePasswordUri;
    return this;
  }

  /**
   * Optional. The Cloud Storage URI of the keystore file used for SSL encryption. If not provided,
   * Dataproc will provide a self-signed certificate.
   * @return value or {@code null} for none
   */
  public java.lang.String getKeystoreUri() {
    return keystoreUri;
  }

  /**
   * Optional. The Cloud Storage URI of the keystore file used for SSL encryption. If not provided,
   * Dataproc will provide a self-signed certificate.
   * @param keystoreUri keystoreUri or {@code null} for none
   */
  public KerberosConfig setKeystoreUri(java.lang.String keystoreUri) {
    this.keystoreUri = keystoreUri;
    return this;
  }

  /**
   * Optional. The uri of the KMS key used to encrypt various sensitive files.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKeyUri() {
    return kmsKeyUri;
  }

  /**
   * Optional. The uri of the KMS key used to encrypt various sensitive files.
   * @param kmsKeyUri kmsKeyUri or {@code null} for none
   */
  public KerberosConfig setKmsKeyUri(java.lang.String kmsKeyUri) {
    this.kmsKeyUri = kmsKeyUri;
    return this;
  }

  /**
   * Optional. The name of the on-cluster Kerberos realm. If not specified, the uppercased domain of
   * hostnames will be the realm.
   * @return value or {@code null} for none
   */
  public java.lang.String getRealm() {
    return realm;
  }

  /**
   * Optional. The name of the on-cluster Kerberos realm. If not specified, the uppercased domain of
   * hostnames will be the realm.
   * @param realm realm or {@code null} for none
   */
  public KerberosConfig setRealm(java.lang.String realm) {
    this.realm = realm;
    return this;
  }

  /**
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the root principal password.
   * @return value or {@code null} for none
   */
  public java.lang.String getRootPrincipalPasswordUri() {
    return rootPrincipalPasswordUri;
  }

  /**
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the root principal password.
   * @param rootPrincipalPasswordUri rootPrincipalPasswordUri or {@code null} for none
   */
  public KerberosConfig setRootPrincipalPasswordUri(java.lang.String rootPrincipalPasswordUri) {
    this.rootPrincipalPasswordUri = rootPrincipalPasswordUri;
    return this;
  }

  /**
   * Optional. The lifetime of the ticket granting ticket, in hours. If not specified, or user
   * specifies 0, then default value 10 will be used.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTgtLifetimeHours() {
    return tgtLifetimeHours;
  }

  /**
   * Optional. The lifetime of the ticket granting ticket, in hours. If not specified, or user
   * specifies 0, then default value 10 will be used.
   * @param tgtLifetimeHours tgtLifetimeHours or {@code null} for none
   */
  public KerberosConfig setTgtLifetimeHours(java.lang.Integer tgtLifetimeHours) {
    this.tgtLifetimeHours = tgtLifetimeHours;
    return this;
  }

  /**
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user
   * provided truststore. For the self-signed certificate, this password is generated by Dataproc.
   * @return value or {@code null} for none
   */
  public java.lang.String getTruststorePasswordUri() {
    return truststorePasswordUri;
  }

  /**
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user
   * provided truststore. For the self-signed certificate, this password is generated by Dataproc.
   * @param truststorePasswordUri truststorePasswordUri or {@code null} for none
   */
  public KerberosConfig setTruststorePasswordUri(java.lang.String truststorePasswordUri) {
    this.truststorePasswordUri = truststorePasswordUri;
    return this;
  }

  /**
   * Optional. The Cloud Storage URI of the truststore file used for SSL encryption. If not
   * provided, Dataproc will provide a self-signed certificate.
   * @return value or {@code null} for none
   */
  public java.lang.String getTruststoreUri() {
    return truststoreUri;
  }

  /**
   * Optional. The Cloud Storage URI of the truststore file used for SSL encryption. If not
   * provided, Dataproc will provide a self-signed certificate.
   * @param truststoreUri truststoreUri or {@code null} for none
   */
  public KerberosConfig setTruststoreUri(java.lang.String truststoreUri) {
    this.truststoreUri = truststoreUri;
    return this;
  }

  @Override
  public KerberosConfig set(String fieldName, Object value) {
    return (KerberosConfig) super.set(fieldName, value);
  }

  @Override
  public KerberosConfig clone() {
    return (KerberosConfig) super.clone();
  }

}
