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

package com.google.api.services.deploymentmanager.model;

/**
 * Model definition for TargetConfiguration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Deployment Manager V2 API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TargetConfiguration extends com.google.api.client.json.GenericJson {

  /**
   * The configuration to use for this deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigFile config;

  /**
   * Specifies any files to import for this configuration. This can be used to import templates or
   * other files. For example, you might import a text file in order to use the file in a template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ImportFile> imports;

  static {
    // hack to force ProGuard to consider ImportFile used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ImportFile.class);
  }

  /**
   * The configuration to use for this deployment.
   * @return value or {@code null} for none
   */
  public ConfigFile getConfig() {
    return config;
  }

  /**
   * The configuration to use for this deployment.
   * @param config config or {@code null} for none
   */
  public TargetConfiguration setConfig(ConfigFile config) {
    this.config = config;
    return this;
  }

  /**
   * Specifies any files to import for this configuration. This can be used to import templates or
   * other files. For example, you might import a text file in order to use the file in a template.
   * @return value or {@code null} for none
   */
  public java.util.List<ImportFile> getImports() {
    return imports;
  }

  /**
   * Specifies any files to import for this configuration. This can be used to import templates or
   * other files. For example, you might import a text file in order to use the file in a template.
   * @param imports imports or {@code null} for none
   */
  public TargetConfiguration setImports(java.util.List<ImportFile> imports) {
    this.imports = imports;
    return this;
  }

  @Override
  public TargetConfiguration set(String fieldName, Object value) {
    return (TargetConfiguration) super.set(fieldName, value);
  }

  @Override
  public TargetConfiguration clone() {
    return (TargetConfiguration) super.clone();
  }

}
