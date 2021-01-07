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

package com.google.api.services.trafficdirector.v2.model;

/**
 * Request for client status of clients identified by a list of NodeMatchers.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Traffic Director API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ClientStatusRequest extends com.google.api.client.json.GenericJson {

  /**
   * Management server can use these match criteria to identify clients. The match follows OR
   * semantics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NodeMatcher> nodeMatchers;

  /**
   * Management server can use these match criteria to identify clients. The match follows OR
   * semantics.
   * @return value or {@code null} for none
   */
  public java.util.List<NodeMatcher> getNodeMatchers() {
    return nodeMatchers;
  }

  /**
   * Management server can use these match criteria to identify clients. The match follows OR
   * semantics.
   * @param nodeMatchers nodeMatchers or {@code null} for none
   */
  public ClientStatusRequest setNodeMatchers(java.util.List<NodeMatcher> nodeMatchers) {
    this.nodeMatchers = nodeMatchers;
    return this;
  }

  @Override
  public ClientStatusRequest set(String fieldName, Object value) {
    return (ClientStatusRequest) super.set(fieldName, value);
  }

  @Override
  public ClientStatusRequest clone() {
    return (ClientStatusRequest) super.clone();
  }

}
