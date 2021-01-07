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
 * Carries information about a Compute Engine VM resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VirtualMachine extends com.google.api.client.json.GenericJson {

  /**
   * The list of accelerators to attach to the VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Accelerator> accelerators;

  static {
    // hack to force ProGuard to consider Accelerator used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Accelerator.class);
  }

  /**
   * The size of the boot disk, in GB. The boot disk must be large enough to accommodate all of the
   * Docker images from each action in the pipeline at the same time. If not specified, a small but
   * reasonable default value is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer bootDiskSizeGb;

  /**
   * The host operating system image to use. Currently, only Container-Optimized OS images can be
   * used. The default value is `projects/cos-cloud/global/images/family/cos-stable`, which selects
   * the latest stable release of Container-Optimized OS. This option is provided to allow testing
   * against the beta release of the operating system to ensure that the new version does not
   * interact negatively with production pipelines. To test a pipeline against the beta release of
   * Container-Optimized OS, use the value `projects/cos-cloud/global/images/family/cos-beta`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bootImage;

  /**
   * The CPU platform to request. An instance based on a newer platform can be allocated, but never
   * one with fewer capabilities. The value of this parameter must be a valid Compute Engine CPU
   * platform name (such as "Intel Skylake"). This parameter is only useful for carefully optimized
   * work loads where the CPU platform has a significant impact. For more information about the
   * effect of this parameter, see https://cloud.google.com/compute/docs/instances/specify-min-cpu-
   * platform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cpuPlatform;

  /**
   * The list of disks to create and attach to the VM. Specify either the `volumes[]` field or the
   * `disks[]` field, but not both.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Disk> disks;

  static {
    // hack to force ProGuard to consider Disk used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Disk.class);
  }

  /**
   * The Compute Engine Disk Images to use as a Docker cache. The disks will be mounted into the
   * Docker folder in a way that the images present in the cache will not need to be pulled. The
   * digests of the cached images must match those of the tags used or the latest version will still
   * be pulled. The root directory of the ext4 image must contain `image` and `overlay2` directories
   * copied from the Docker directory of a VM where the desired Docker images have already been
   * pulled. Only a single image is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> dockerCacheImages;

  /**
   * Whether Stackdriver monitoring should be enabled on the VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableStackdriverMonitoring;

  /**
   * Optional set of labels to apply to the VM and any attached disk resources. These labels must
   * adhere to the [name and value restrictions](https://cloud.google.com/compute/docs/labeling-
   * resources) on VM labels imposed by Compute Engine. Labels keys with the prefix 'google-' are
   * reserved for use by Google. Labels applied at creation time to the VM. Applied on a best-effort
   * basis to attached disk resources shortly after VM creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. The machine type of the virtual machine to create. Must be the short name of a
   * standard machine type (such as "n1-standard-1") or a custom machine type (such as
   * "custom-1-4096", where "1" indicates the number of vCPUs and "4096" indicates the memory in
   * MB). See [Creating an instance with a custom machine
   * type](https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-
   * type#create) for more specifications on creating a custom machine type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineType;

  /**
   * The VM network configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Network network;

  /**
   * The NVIDIA driver version to use when attaching an NVIDIA GPU accelerator. The version
   * specified here must be compatible with the GPU libraries contained in the container being
   * executed, and must be one of the drivers hosted in the `nvidia-drivers-us-public` bucket on
   * Google Cloud Storage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nvidiaDriverVersion;

  /**
   * If true, allocate a preemptible VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean preemptible;

  /**
   * The service account to install on the VM. This account does not need any permissions other than
   * those required by the pipeline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServiceAccount serviceAccount;

  /**
   * The list of disks and other storage to create or attach to the VM. Specify either the
   * `volumes[]` field or the `disks[]` field, but not both.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Volume> volumes;

  /**
   * The list of accelerators to attach to the VM.
   * @return value or {@code null} for none
   */
  public java.util.List<Accelerator> getAccelerators() {
    return accelerators;
  }

  /**
   * The list of accelerators to attach to the VM.
   * @param accelerators accelerators or {@code null} for none
   */
  public VirtualMachine setAccelerators(java.util.List<Accelerator> accelerators) {
    this.accelerators = accelerators;
    return this;
  }

  /**
   * The size of the boot disk, in GB. The boot disk must be large enough to accommodate all of the
   * Docker images from each action in the pipeline at the same time. If not specified, a small but
   * reasonable default value is used.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBootDiskSizeGb() {
    return bootDiskSizeGb;
  }

  /**
   * The size of the boot disk, in GB. The boot disk must be large enough to accommodate all of the
   * Docker images from each action in the pipeline at the same time. If not specified, a small but
   * reasonable default value is used.
   * @param bootDiskSizeGb bootDiskSizeGb or {@code null} for none
   */
  public VirtualMachine setBootDiskSizeGb(java.lang.Integer bootDiskSizeGb) {
    this.bootDiskSizeGb = bootDiskSizeGb;
    return this;
  }

  /**
   * The host operating system image to use. Currently, only Container-Optimized OS images can be
   * used. The default value is `projects/cos-cloud/global/images/family/cos-stable`, which selects
   * the latest stable release of Container-Optimized OS. This option is provided to allow testing
   * against the beta release of the operating system to ensure that the new version does not
   * interact negatively with production pipelines. To test a pipeline against the beta release of
   * Container-Optimized OS, use the value `projects/cos-cloud/global/images/family/cos-beta`.
   * @return value or {@code null} for none
   */
  public java.lang.String getBootImage() {
    return bootImage;
  }

  /**
   * The host operating system image to use. Currently, only Container-Optimized OS images can be
   * used. The default value is `projects/cos-cloud/global/images/family/cos-stable`, which selects
   * the latest stable release of Container-Optimized OS. This option is provided to allow testing
   * against the beta release of the operating system to ensure that the new version does not
   * interact negatively with production pipelines. To test a pipeline against the beta release of
   * Container-Optimized OS, use the value `projects/cos-cloud/global/images/family/cos-beta`.
   * @param bootImage bootImage or {@code null} for none
   */
  public VirtualMachine setBootImage(java.lang.String bootImage) {
    this.bootImage = bootImage;
    return this;
  }

  /**
   * The CPU platform to request. An instance based on a newer platform can be allocated, but never
   * one with fewer capabilities. The value of this parameter must be a valid Compute Engine CPU
   * platform name (such as "Intel Skylake"). This parameter is only useful for carefully optimized
   * work loads where the CPU platform has a significant impact. For more information about the
   * effect of this parameter, see https://cloud.google.com/compute/docs/instances/specify-min-cpu-
   * platform.
   * @return value or {@code null} for none
   */
  public java.lang.String getCpuPlatform() {
    return cpuPlatform;
  }

  /**
   * The CPU platform to request. An instance based on a newer platform can be allocated, but never
   * one with fewer capabilities. The value of this parameter must be a valid Compute Engine CPU
   * platform name (such as "Intel Skylake"). This parameter is only useful for carefully optimized
   * work loads where the CPU platform has a significant impact. For more information about the
   * effect of this parameter, see https://cloud.google.com/compute/docs/instances/specify-min-cpu-
   * platform.
   * @param cpuPlatform cpuPlatform or {@code null} for none
   */
  public VirtualMachine setCpuPlatform(java.lang.String cpuPlatform) {
    this.cpuPlatform = cpuPlatform;
    return this;
  }

  /**
   * The list of disks to create and attach to the VM. Specify either the `volumes[]` field or the
   * `disks[]` field, but not both.
   * @return value or {@code null} for none
   */
  public java.util.List<Disk> getDisks() {
    return disks;
  }

  /**
   * The list of disks to create and attach to the VM. Specify either the `volumes[]` field or the
   * `disks[]` field, but not both.
   * @param disks disks or {@code null} for none
   */
  public VirtualMachine setDisks(java.util.List<Disk> disks) {
    this.disks = disks;
    return this;
  }

  /**
   * The Compute Engine Disk Images to use as a Docker cache. The disks will be mounted into the
   * Docker folder in a way that the images present in the cache will not need to be pulled. The
   * digests of the cached images must match those of the tags used or the latest version will still
   * be pulled. The root directory of the ext4 image must contain `image` and `overlay2` directories
   * copied from the Docker directory of a VM where the desired Docker images have already been
   * pulled. Only a single image is supported.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDockerCacheImages() {
    return dockerCacheImages;
  }

  /**
   * The Compute Engine Disk Images to use as a Docker cache. The disks will be mounted into the
   * Docker folder in a way that the images present in the cache will not need to be pulled. The
   * digests of the cached images must match those of the tags used or the latest version will still
   * be pulled. The root directory of the ext4 image must contain `image` and `overlay2` directories
   * copied from the Docker directory of a VM where the desired Docker images have already been
   * pulled. Only a single image is supported.
   * @param dockerCacheImages dockerCacheImages or {@code null} for none
   */
  public VirtualMachine setDockerCacheImages(java.util.List<java.lang.String> dockerCacheImages) {
    this.dockerCacheImages = dockerCacheImages;
    return this;
  }

  /**
   * Whether Stackdriver monitoring should be enabled on the VM.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableStackdriverMonitoring() {
    return enableStackdriverMonitoring;
  }

  /**
   * Whether Stackdriver monitoring should be enabled on the VM.
   * @param enableStackdriverMonitoring enableStackdriverMonitoring or {@code null} for none
   */
  public VirtualMachine setEnableStackdriverMonitoring(java.lang.Boolean enableStackdriverMonitoring) {
    this.enableStackdriverMonitoring = enableStackdriverMonitoring;
    return this;
  }

  /**
   * Optional set of labels to apply to the VM and any attached disk resources. These labels must
   * adhere to the [name and value restrictions](https://cloud.google.com/compute/docs/labeling-
   * resources) on VM labels imposed by Compute Engine. Labels keys with the prefix 'google-' are
   * reserved for use by Google. Labels applied at creation time to the VM. Applied on a best-effort
   * basis to attached disk resources shortly after VM creation.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional set of labels to apply to the VM and any attached disk resources. These labels must
   * adhere to the [name and value restrictions](https://cloud.google.com/compute/docs/labeling-
   * resources) on VM labels imposed by Compute Engine. Labels keys with the prefix 'google-' are
   * reserved for use by Google. Labels applied at creation time to the VM. Applied on a best-effort
   * basis to attached disk resources shortly after VM creation.
   * @param labels labels or {@code null} for none
   */
  public VirtualMachine setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. The machine type of the virtual machine to create. Must be the short name of a
   * standard machine type (such as "n1-standard-1") or a custom machine type (such as
   * "custom-1-4096", where "1" indicates the number of vCPUs and "4096" indicates the memory in
   * MB). See [Creating an instance with a custom machine
   * type](https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-
   * type#create) for more specifications on creating a custom machine type.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineType() {
    return machineType;
  }

  /**
   * Required. The machine type of the virtual machine to create. Must be the short name of a
   * standard machine type (such as "n1-standard-1") or a custom machine type (such as
   * "custom-1-4096", where "1" indicates the number of vCPUs and "4096" indicates the memory in
   * MB). See [Creating an instance with a custom machine
   * type](https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-
   * type#create) for more specifications on creating a custom machine type.
   * @param machineType machineType or {@code null} for none
   */
  public VirtualMachine setMachineType(java.lang.String machineType) {
    this.machineType = machineType;
    return this;
  }

  /**
   * The VM network configuration.
   * @return value or {@code null} for none
   */
  public Network getNetwork() {
    return network;
  }

  /**
   * The VM network configuration.
   * @param network network or {@code null} for none
   */
  public VirtualMachine setNetwork(Network network) {
    this.network = network;
    return this;
  }

  /**
   * The NVIDIA driver version to use when attaching an NVIDIA GPU accelerator. The version
   * specified here must be compatible with the GPU libraries contained in the container being
   * executed, and must be one of the drivers hosted in the `nvidia-drivers-us-public` bucket on
   * Google Cloud Storage.
   * @return value or {@code null} for none
   */
  public java.lang.String getNvidiaDriverVersion() {
    return nvidiaDriverVersion;
  }

  /**
   * The NVIDIA driver version to use when attaching an NVIDIA GPU accelerator. The version
   * specified here must be compatible with the GPU libraries contained in the container being
   * executed, and must be one of the drivers hosted in the `nvidia-drivers-us-public` bucket on
   * Google Cloud Storage.
   * @param nvidiaDriverVersion nvidiaDriverVersion or {@code null} for none
   */
  public VirtualMachine setNvidiaDriverVersion(java.lang.String nvidiaDriverVersion) {
    this.nvidiaDriverVersion = nvidiaDriverVersion;
    return this;
  }

  /**
   * If true, allocate a preemptible VM.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPreemptible() {
    return preemptible;
  }

  /**
   * If true, allocate a preemptible VM.
   * @param preemptible preemptible or {@code null} for none
   */
  public VirtualMachine setPreemptible(java.lang.Boolean preemptible) {
    this.preemptible = preemptible;
    return this;
  }

  /**
   * The service account to install on the VM. This account does not need any permissions other than
   * those required by the pipeline.
   * @return value or {@code null} for none
   */
  public ServiceAccount getServiceAccount() {
    return serviceAccount;
  }

  /**
   * The service account to install on the VM. This account does not need any permissions other than
   * those required by the pipeline.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public VirtualMachine setServiceAccount(ServiceAccount serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * The list of disks and other storage to create or attach to the VM. Specify either the
   * `volumes[]` field or the `disks[]` field, but not both.
   * @return value or {@code null} for none
   */
  public java.util.List<Volume> getVolumes() {
    return volumes;
  }

  /**
   * The list of disks and other storage to create or attach to the VM. Specify either the
   * `volumes[]` field or the `disks[]` field, but not both.
   * @param volumes volumes or {@code null} for none
   */
  public VirtualMachine setVolumes(java.util.List<Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  @Override
  public VirtualMachine set(String fieldName, Object value) {
    return (VirtualMachine) super.set(fieldName, value);
  }

  @Override
  public VirtualMachine clone() {
    return (VirtualMachine) super.clone();
  }

}
