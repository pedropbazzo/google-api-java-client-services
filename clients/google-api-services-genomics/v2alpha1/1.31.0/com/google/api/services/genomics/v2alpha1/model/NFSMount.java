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

package com.google.api.services.genomics.v2alpha1.model;

/**
 * Configuration for an `NFSMount` to be attached to the VM.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NFSMount extends com.google.api.client.json.GenericJson {

  /**
   * A target NFS mount. The target must be specified as `address:/mount".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String target;

  /**
   * A target NFS mount. The target must be specified as `address:/mount".
   * @return value or {@code null} for none
   */
  public java.lang.String getTarget() {
    return target;
  }

  /**
   * A target NFS mount. The target must be specified as `address:/mount".
   * @param target target or {@code null} for none
   */
  public NFSMount setTarget(java.lang.String target) {
    this.target = target;
    return this;
  }

  @Override
  public NFSMount set(String fieldName, Object value) {
    return (NFSMount) super.set(fieldName, value);
  }

  @Override
  public NFSMount clone() {
    return (NFSMount) super.clone();
  }

}
