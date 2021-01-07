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
 * A `Directory` represents a directory node in a file tree, containing zero or more children
 * FileNodes, DirectoryNodes and SymlinkNodes. Each `Node` contains its name in the directory,
 * either the digest of its content (either a file blob or a `Directory` proto) or a symlink target,
 * as well as possibly some metadata about the file or directory. In order to ensure that two
 * equivalent directory trees hash to the same value, the following restrictions MUST be obeyed when
 * constructing a a `Directory`: * Every child in the directory must have a path of exactly one
 * segment. Multiple levels of directory hierarchy may not be collapsed. * Each child in the
 * directory must have a unique path segment (file name). Note that while the API itself is case-
 * sensitive, the environment where the Action is executed may or may not be case-sensitive. That
 * is, it is legal to call the API with a Directory that has both "Foo" and "foo" as children, but
 * the Action may be rejected by the remote system upon execution. * The files, directories and
 * symlinks in the directory must each be sorted in lexicographical order by path. The path strings
 * must be sorted by code point, equivalently, by UTF-8 bytes. * The NodeProperties of files,
 * directories, and symlinks must be sorted in lexicographical order by property name. A `Directory`
 * that obeys the restrictions is said to be in canonical form. As an example, the following could
 * be used for a file named `bar` and a directory named `foo` with an executable file named `baz`
 * (hashes shortened for readability): ```json // (Directory proto) { files: [ { name: "bar",
 * digest: { hash: "4a73bc9d03...", size: 65534 }, node_properties: [ { "name": "MTime", "value":
 * "2017-01-15T01:30:15.01Z" } ] } ], directories: [ { name: "foo", digest: { hash: "4cf2eda940...",
 * size: 43 } } ] } // (Directory proto with hash "4cf2eda940..." and size 43) { files: [ { name:
 * "baz", digest: { hash: "b2c941073e...", size: 1294, }, is_executable: true } ] } ```
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
public final class BuildBazelRemoteExecutionV2Directory extends com.google.api.client.json.GenericJson {

  /**
   * The subdirectories in the directory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BuildBazelRemoteExecutionV2DirectoryNode> directories;

  /**
   * The files in the directory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BuildBazelRemoteExecutionV2FileNode> files;

  /**
   * The node properties of the Directory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BuildBazelRemoteExecutionV2NodeProperty> nodeProperties;

  /**
   * The symlinks in the directory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BuildBazelRemoteExecutionV2SymlinkNode> symlinks;

  /**
   * The subdirectories in the directory.
   * @return value or {@code null} for none
   */
  public java.util.List<BuildBazelRemoteExecutionV2DirectoryNode> getDirectories() {
    return directories;
  }

  /**
   * The subdirectories in the directory.
   * @param directories directories or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2Directory setDirectories(java.util.List<BuildBazelRemoteExecutionV2DirectoryNode> directories) {
    this.directories = directories;
    return this;
  }

  /**
   * The files in the directory.
   * @return value or {@code null} for none
   */
  public java.util.List<BuildBazelRemoteExecutionV2FileNode> getFiles() {
    return files;
  }

  /**
   * The files in the directory.
   * @param files files or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2Directory setFiles(java.util.List<BuildBazelRemoteExecutionV2FileNode> files) {
    this.files = files;
    return this;
  }

  /**
   * The node properties of the Directory.
   * @return value or {@code null} for none
   */
  public java.util.List<BuildBazelRemoteExecutionV2NodeProperty> getNodeProperties() {
    return nodeProperties;
  }

  /**
   * The node properties of the Directory.
   * @param nodeProperties nodeProperties or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2Directory setNodeProperties(java.util.List<BuildBazelRemoteExecutionV2NodeProperty> nodeProperties) {
    this.nodeProperties = nodeProperties;
    return this;
  }

  /**
   * The symlinks in the directory.
   * @return value or {@code null} for none
   */
  public java.util.List<BuildBazelRemoteExecutionV2SymlinkNode> getSymlinks() {
    return symlinks;
  }

  /**
   * The symlinks in the directory.
   * @param symlinks symlinks or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2Directory setSymlinks(java.util.List<BuildBazelRemoteExecutionV2SymlinkNode> symlinks) {
    this.symlinks = symlinks;
    return this;
  }

  @Override
  public BuildBazelRemoteExecutionV2Directory set(String fieldName, Object value) {
    return (BuildBazelRemoteExecutionV2Directory) super.set(fieldName, value);
  }

  @Override
  public BuildBazelRemoteExecutionV2Directory clone() {
    return (BuildBazelRemoteExecutionV2Directory) super.clone();
  }

}
