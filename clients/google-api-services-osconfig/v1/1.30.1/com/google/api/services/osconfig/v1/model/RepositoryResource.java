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

package com.google.api.services.osconfig.v1.model;

/**
 * A resource that manages a package repository.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RepositoryResource extends com.google.api.client.json.GenericJson {

  /**
   * An Apt Repository.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RepositoryResourceAptRepository apt;

  /**
   * A Goo Repository.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RepositoryResourceGooRepository goo;

  /**
   * A Yum Repository.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RepositoryResourceYumRepository yum;

  /**
   * A Zypper Repository.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RepositoryResourceZypperRepository zypper;

  /**
   * An Apt Repository.
   * @return value or {@code null} for none
   */
  public RepositoryResourceAptRepository getApt() {
    return apt;
  }

  /**
   * An Apt Repository.
   * @param apt apt or {@code null} for none
   */
  public RepositoryResource setApt(RepositoryResourceAptRepository apt) {
    this.apt = apt;
    return this;
  }

  /**
   * A Goo Repository.
   * @return value or {@code null} for none
   */
  public RepositoryResourceGooRepository getGoo() {
    return goo;
  }

  /**
   * A Goo Repository.
   * @param goo goo or {@code null} for none
   */
  public RepositoryResource setGoo(RepositoryResourceGooRepository goo) {
    this.goo = goo;
    return this;
  }

  /**
   * A Yum Repository.
   * @return value or {@code null} for none
   */
  public RepositoryResourceYumRepository getYum() {
    return yum;
  }

  /**
   * A Yum Repository.
   * @param yum yum or {@code null} for none
   */
  public RepositoryResource setYum(RepositoryResourceYumRepository yum) {
    this.yum = yum;
    return this;
  }

  /**
   * A Zypper Repository.
   * @return value or {@code null} for none
   */
  public RepositoryResourceZypperRepository getZypper() {
    return zypper;
  }

  /**
   * A Zypper Repository.
   * @param zypper zypper or {@code null} for none
   */
  public RepositoryResource setZypper(RepositoryResourceZypperRepository zypper) {
    this.zypper = zypper;
    return this;
  }

  @Override
  public RepositoryResource set(String fieldName, Object value) {
    return (RepositoryResource) super.set(fieldName, value);
  }

  @Override
  public RepositoryResource clone() {
    return (RepositoryResource) super.clone();
  }

}
