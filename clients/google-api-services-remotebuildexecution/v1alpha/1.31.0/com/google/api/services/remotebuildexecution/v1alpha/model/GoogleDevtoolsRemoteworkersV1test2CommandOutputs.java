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

package com.google.api.services.remotebuildexecution.v1alpha.model;

/**
 * DEPRECATED - use CommandResult instead. Describes the actual outputs from the task.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDevtoolsRemoteworkersV1test2CommandOutputs extends com.google.api.client.json.GenericJson {

  /**
   * exit_code is only fully reliable if the status' code is OK. If the task exceeded its deadline
   * or was cancelled, the process may still produce an exit code as it is cancelled, and this will
   * be populated, but a successful (zero) is unlikely to be correct unless the status code is OK.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer exitCode;

  /**
   * The output files. The blob referenced by the digest should contain one of the following
   * (implementation-dependent): * A marshalled DirectoryMetadata of the returned filesystem * A
   * LUCI-style .isolated file
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDevtoolsRemoteworkersV1test2Digest outputs;

  /**
   * exit_code is only fully reliable if the status' code is OK. If the task exceeded its deadline
   * or was cancelled, the process may still produce an exit code as it is cancelled, and this will
   * be populated, but a successful (zero) is unlikely to be correct unless the status code is OK.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getExitCode() {
    return exitCode;
  }

  /**
   * exit_code is only fully reliable if the status' code is OK. If the task exceeded its deadline
   * or was cancelled, the process may still produce an exit code as it is cancelled, and this will
   * be populated, but a successful (zero) is unlikely to be correct unless the status code is OK.
   * @param exitCode exitCode or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2CommandOutputs setExitCode(java.lang.Integer exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  /**
   * The output files. The blob referenced by the digest should contain one of the following
   * (implementation-dependent): * A marshalled DirectoryMetadata of the returned filesystem * A
   * LUCI-style .isolated file
   * @return value or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2Digest getOutputs() {
    return outputs;
  }

  /**
   * The output files. The blob referenced by the digest should contain one of the following
   * (implementation-dependent): * A marshalled DirectoryMetadata of the returned filesystem * A
   * LUCI-style .isolated file
   * @param outputs outputs or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2CommandOutputs setOutputs(GoogleDevtoolsRemoteworkersV1test2Digest outputs) {
    this.outputs = outputs;
    return this;
  }

  @Override
  public GoogleDevtoolsRemoteworkersV1test2CommandOutputs set(String fieldName, Object value) {
    return (GoogleDevtoolsRemoteworkersV1test2CommandOutputs) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemoteworkersV1test2CommandOutputs clone() {
    return (GoogleDevtoolsRemoteworkersV1test2CommandOutputs) super.clone();
  }

}
