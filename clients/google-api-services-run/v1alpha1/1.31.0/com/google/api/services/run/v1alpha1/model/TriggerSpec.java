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

package com.google.api.services.run.v1alpha1.model;

/**
 * The desired state of the Trigger.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TriggerSpec extends com.google.api.client.json.GenericJson {

  /**
   * Broker is the broker that this trigger receives events from. If not specified, will default to
   * 'default'. Not currently supported by Cloud Run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String broker;

  /**
   * Optional. Filter is the filter to apply against all events from the Broker. Only events that
   * pass this filter will be sent to the Subscriber. Note that filter is optional in knative and is
   * only required in fully managed due to different broker implementation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TriggerFilter filter;

  /**
   * Sink is the addressable that will receive events.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Destination subscriber;

  /**
   * Broker is the broker that this trigger receives events from. If not specified, will default to
   * 'default'. Not currently supported by Cloud Run.
   * @return value or {@code null} for none
   */
  public java.lang.String getBroker() {
    return broker;
  }

  /**
   * Broker is the broker that this trigger receives events from. If not specified, will default to
   * 'default'. Not currently supported by Cloud Run.
   * @param broker broker or {@code null} for none
   */
  public TriggerSpec setBroker(java.lang.String broker) {
    this.broker = broker;
    return this;
  }

  /**
   * Optional. Filter is the filter to apply against all events from the Broker. Only events that
   * pass this filter will be sent to the Subscriber. Note that filter is optional in knative and is
   * only required in fully managed due to different broker implementation.
   * @return value or {@code null} for none
   */
  public TriggerFilter getFilter() {
    return filter;
  }

  /**
   * Optional. Filter is the filter to apply against all events from the Broker. Only events that
   * pass this filter will be sent to the Subscriber. Note that filter is optional in knative and is
   * only required in fully managed due to different broker implementation.
   * @param filter filter or {@code null} for none
   */
  public TriggerSpec setFilter(TriggerFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Sink is the addressable that will receive events.
   * @return value or {@code null} for none
   */
  public Destination getSubscriber() {
    return subscriber;
  }

  /**
   * Sink is the addressable that will receive events.
   * @param subscriber subscriber or {@code null} for none
   */
  public TriggerSpec setSubscriber(Destination subscriber) {
    this.subscriber = subscriber;
    return this;
  }

  @Override
  public TriggerSpec set(String fieldName, Object value) {
    return (TriggerSpec) super.set(fieldName, value);
  }

  @Override
  public TriggerSpec clone() {
    return (TriggerSpec) super.clone();
  }

}
