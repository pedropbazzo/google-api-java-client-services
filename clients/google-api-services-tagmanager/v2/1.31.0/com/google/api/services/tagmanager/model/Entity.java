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

package com.google.api.services.tagmanager.model;

/**
 * A workspace entity that may represent a tag, trigger, variable, or folder in addition to its
 * status in the workspace.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Tag Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Entity extends com.google.api.client.json.GenericJson {

  /**
   * Represents how the entity has been changed in the workspace.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String changeStatus;

  /**
   * The client being represented by the entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Client client;

  /**
   * The folder being represented by the entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Folder folder;

  /**
   * The tag being represented by the entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Tag tag;

  /**
   * The trigger being represented by the entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Trigger trigger;

  /**
   * The variable being represented by the entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Variable variable;

  /**
   * Represents how the entity has been changed in the workspace.
   * @return value or {@code null} for none
   */
  public java.lang.String getChangeStatus() {
    return changeStatus;
  }

  /**
   * Represents how the entity has been changed in the workspace.
   * @param changeStatus changeStatus or {@code null} for none
   */
  public Entity setChangeStatus(java.lang.String changeStatus) {
    this.changeStatus = changeStatus;
    return this;
  }

  /**
   * The client being represented by the entity.
   * @return value or {@code null} for none
   */
  public Client getClient() {
    return client;
  }

  /**
   * The client being represented by the entity.
   * @param client client or {@code null} for none
   */
  public Entity setClient(Client client) {
    this.client = client;
    return this;
  }

  /**
   * The folder being represented by the entity.
   * @return value or {@code null} for none
   */
  public Folder getFolder() {
    return folder;
  }

  /**
   * The folder being represented by the entity.
   * @param folder folder or {@code null} for none
   */
  public Entity setFolder(Folder folder) {
    this.folder = folder;
    return this;
  }

  /**
   * The tag being represented by the entity.
   * @return value or {@code null} for none
   */
  public Tag getTag() {
    return tag;
  }

  /**
   * The tag being represented by the entity.
   * @param tag tag or {@code null} for none
   */
  public Entity setTag(Tag tag) {
    this.tag = tag;
    return this;
  }

  /**
   * The trigger being represented by the entity.
   * @return value or {@code null} for none
   */
  public Trigger getTrigger() {
    return trigger;
  }

  /**
   * The trigger being represented by the entity.
   * @param trigger trigger or {@code null} for none
   */
  public Entity setTrigger(Trigger trigger) {
    this.trigger = trigger;
    return this;
  }

  /**
   * The variable being represented by the entity.
   * @return value or {@code null} for none
   */
  public Variable getVariable() {
    return variable;
  }

  /**
   * The variable being represented by the entity.
   * @param variable variable or {@code null} for none
   */
  public Entity setVariable(Variable variable) {
    this.variable = variable;
    return this;
  }

  @Override
  public Entity set(String fieldName, Object value) {
    return (Entity) super.set(fieldName, value);
  }

  @Override
  public Entity clone() {
    return (Entity) super.clone();
  }

}
