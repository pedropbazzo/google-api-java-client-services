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

package com.google.api.services.analytics.model;

/**
 * JSON template for an Analytics Entity-User Link. Returns permissions that a user has for an
 * entity.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EntityUserLink extends com.google.api.client.json.GenericJson {

  /**
   * Entity for this link. It can be an account, a web property, or a view (profile).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Entity entity;

  /**
   * Entity user link ID
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Resource type for entity user link.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Permissions the user has for this entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Permissions permissions;

  /**
   * Self link for this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * User reference.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UserRef userRef;

  /**
   * Entity for this link. It can be an account, a web property, or a view (profile).
   * @return value or {@code null} for none
   */
  public Entity getEntity() {
    return entity;
  }

  /**
   * Entity for this link. It can be an account, a web property, or a view (profile).
   * @param entity entity or {@code null} for none
   */
  public EntityUserLink setEntity(Entity entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Entity user link ID
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Entity user link ID
   * @param id id or {@code null} for none
   */
  public EntityUserLink setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Resource type for entity user link.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type for entity user link.
   * @param kind kind or {@code null} for none
   */
  public EntityUserLink setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Permissions the user has for this entity.
   * @return value or {@code null} for none
   */
  public Permissions getPermissions() {
    return permissions;
  }

  /**
   * Permissions the user has for this entity.
   * @param permissions permissions or {@code null} for none
   */
  public EntityUserLink setPermissions(Permissions permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Self link for this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * Self link for this resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public EntityUserLink setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * User reference.
   * @return value or {@code null} for none
   */
  public UserRef getUserRef() {
    return userRef;
  }

  /**
   * User reference.
   * @param userRef userRef or {@code null} for none
   */
  public EntityUserLink setUserRef(UserRef userRef) {
    this.userRef = userRef;
    return this;
  }

  @Override
  public EntityUserLink set(String fieldName, Object value) {
    return (EntityUserLink) super.set(fieldName, value);
  }

  @Override
  public EntityUserLink clone() {
    return (EntityUserLink) super.clone();
  }

  /**
   * Entity for this link. It can be an account, a web property, or a view (profile).
   */
  public static final class Entity extends com.google.api.client.json.GenericJson {

    /**
     * Account for this link.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private AccountRef accountRef;

    /**
     * View (Profile) for this link.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private ProfileRef profileRef;

    /**
     * Web property for this link.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private WebPropertyRef webPropertyRef;

    /**
     * Account for this link.
     * @return value or {@code null} for none
     */
    public AccountRef getAccountRef() {
      return accountRef;
    }

    /**
     * Account for this link.
     * @param accountRef accountRef or {@code null} for none
     */
    public Entity setAccountRef(AccountRef accountRef) {
      this.accountRef = accountRef;
      return this;
    }

    /**
     * View (Profile) for this link.
     * @return value or {@code null} for none
     */
    public ProfileRef getProfileRef() {
      return profileRef;
    }

    /**
     * View (Profile) for this link.
     * @param profileRef profileRef or {@code null} for none
     */
    public Entity setProfileRef(ProfileRef profileRef) {
      this.profileRef = profileRef;
      return this;
    }

    /**
     * Web property for this link.
     * @return value or {@code null} for none
     */
    public WebPropertyRef getWebPropertyRef() {
      return webPropertyRef;
    }

    /**
     * Web property for this link.
     * @param webPropertyRef webPropertyRef or {@code null} for none
     */
    public Entity setWebPropertyRef(WebPropertyRef webPropertyRef) {
      this.webPropertyRef = webPropertyRef;
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

  /**
   * Permissions the user has for this entity.
   */
  public static final class Permissions extends com.google.api.client.json.GenericJson {

    /**
     * Effective permissions represent all the permissions that a user has for this entity. These
     * include any implied permissions (e.g., EDIT implies VIEW) or inherited permissions from the
     * parent entity. Effective permissions are read-only.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> effective;

    /**
     * Permissions that a user has been assigned at this very level. Does not include any implied or
     * inherited permissions. Local permissions are modifiable.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> local;

    /**
     * Effective permissions represent all the permissions that a user has for this entity. These
     * include any implied permissions (e.g., EDIT implies VIEW) or inherited permissions from the
     * parent entity. Effective permissions are read-only.
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getEffective() {
      return effective;
    }

    /**
     * Effective permissions represent all the permissions that a user has for this entity. These
     * include any implied permissions (e.g., EDIT implies VIEW) or inherited permissions from the
     * parent entity. Effective permissions are read-only.
     * @param effective effective or {@code null} for none
     */
    public Permissions setEffective(java.util.List<java.lang.String> effective) {
      this.effective = effective;
      return this;
    }

    /**
     * Permissions that a user has been assigned at this very level. Does not include any implied or
     * inherited permissions. Local permissions are modifiable.
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getLocal() {
      return local;
    }

    /**
     * Permissions that a user has been assigned at this very level. Does not include any implied or
     * inherited permissions. Local permissions are modifiable.
     * @param local local or {@code null} for none
     */
    public Permissions setLocal(java.util.List<java.lang.String> local) {
      this.local = local;
      return this;
    }

    @Override
    public Permissions set(String fieldName, Object value) {
      return (Permissions) super.set(fieldName, value);
    }

    @Override
    public Permissions clone() {
      return (Permissions) super.clone();
    }

  }

}
