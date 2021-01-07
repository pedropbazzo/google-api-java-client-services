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

package com.google.api.services.cloudasset.v1.model;

/**
 * Policy for ingress into ServicePerimeter. IngressPolicies match requests based on `ingress_from`
 * and `ingress_to` stanzas. For an ingress policy to match, both the `ingress_from` and
 * `ingress_to` stanzas must be matched. If an IngressPolicy matches a request, the request is
 * allowed through the perimeter boundary from outside the perimeter. For example, access from the
 * internet can be allowed either based on an AccessLevel or, for traffic hosted on Google Cloud,
 * the project of the source network. For access from private networks, using the project of the
 * hosting network is required. Individual ingress policies can be limited by restricting which
 * services and/or actions they match using the `ingress_to` field.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleIdentityAccesscontextmanagerV1IngressPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Defines the conditions on the source of a request causing this IngressPolicy to apply.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleIdentityAccesscontextmanagerV1IngressFrom ingressFrom;

  /**
   * Defines the conditions on the ApiOperation and request destination that cause this
   * IngressPolicy to apply.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleIdentityAccesscontextmanagerV1IngressTo ingressTo;

  /**
   * Defines the conditions on the source of a request causing this IngressPolicy to apply.
   * @return value or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1IngressFrom getIngressFrom() {
    return ingressFrom;
  }

  /**
   * Defines the conditions on the source of a request causing this IngressPolicy to apply.
   * @param ingressFrom ingressFrom or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1IngressPolicy setIngressFrom(GoogleIdentityAccesscontextmanagerV1IngressFrom ingressFrom) {
    this.ingressFrom = ingressFrom;
    return this;
  }

  /**
   * Defines the conditions on the ApiOperation and request destination that cause this
   * IngressPolicy to apply.
   * @return value or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1IngressTo getIngressTo() {
    return ingressTo;
  }

  /**
   * Defines the conditions on the ApiOperation and request destination that cause this
   * IngressPolicy to apply.
   * @param ingressTo ingressTo or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1IngressPolicy setIngressTo(GoogleIdentityAccesscontextmanagerV1IngressTo ingressTo) {
    this.ingressTo = ingressTo;
    return this;
  }

  @Override
  public GoogleIdentityAccesscontextmanagerV1IngressPolicy set(String fieldName, Object value) {
    return (GoogleIdentityAccesscontextmanagerV1IngressPolicy) super.set(fieldName, value);
  }

  @Override
  public GoogleIdentityAccesscontextmanagerV1IngressPolicy clone() {
    return (GoogleIdentityAccesscontextmanagerV1IngressPolicy) super.clone();
  }

}
