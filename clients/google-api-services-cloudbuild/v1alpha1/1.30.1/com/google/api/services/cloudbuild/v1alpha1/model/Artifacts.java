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

package com.google.api.services.cloudbuild.v1alpha1.model;

/**
 * Artifacts produced by a build that should be uploaded upon successful completion of all build
 * steps.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Artifacts extends com.google.api.client.json.GenericJson {

  /**
   * A list of images to be pushed upon the successful completion of all build steps. The images
   * will be pushed using the builder service account's credentials. The digests of the pushed
   * images will be stored in the Build resource's results field. If any of the images fail to be
   * pushed, the build is marked FAILURE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> images;

  /**
   * A list of objects to be uploaded to Cloud Storage upon successful completion of all build
   * steps. Files in the workspace matching specified paths globs will be uploaded to the specified
   * Cloud Storage location using the builder service account's credentials. The location and
   * generation of the uploaded objects will be stored in the Build resource's results field. If any
   * objects fail to be pushed, the build is marked FAILURE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ArtifactObjects objects;

  /**
   * A list of images to be pushed upon the successful completion of all build steps. The images
   * will be pushed using the builder service account's credentials. The digests of the pushed
   * images will be stored in the Build resource's results field. If any of the images fail to be
   * pushed, the build is marked FAILURE.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getImages() {
    return images;
  }

  /**
   * A list of images to be pushed upon the successful completion of all build steps. The images
   * will be pushed using the builder service account's credentials. The digests of the pushed
   * images will be stored in the Build resource's results field. If any of the images fail to be
   * pushed, the build is marked FAILURE.
   * @param images images or {@code null} for none
   */
  public Artifacts setImages(java.util.List<java.lang.String> images) {
    this.images = images;
    return this;
  }

  /**
   * A list of objects to be uploaded to Cloud Storage upon successful completion of all build
   * steps. Files in the workspace matching specified paths globs will be uploaded to the specified
   * Cloud Storage location using the builder service account's credentials. The location and
   * generation of the uploaded objects will be stored in the Build resource's results field. If any
   * objects fail to be pushed, the build is marked FAILURE.
   * @return value or {@code null} for none
   */
  public ArtifactObjects getObjects() {
    return objects;
  }

  /**
   * A list of objects to be uploaded to Cloud Storage upon successful completion of all build
   * steps. Files in the workspace matching specified paths globs will be uploaded to the specified
   * Cloud Storage location using the builder service account's credentials. The location and
   * generation of the uploaded objects will be stored in the Build resource's results field. If any
   * objects fail to be pushed, the build is marked FAILURE.
   * @param objects objects or {@code null} for none
   */
  public Artifacts setObjects(ArtifactObjects objects) {
    this.objects = objects;
    return this;
  }

  @Override
  public Artifacts set(String fieldName, Object value) {
    return (Artifacts) super.set(fieldName, value);
  }

  @Override
  public Artifacts clone() {
    return (Artifacts) super.clone();
  }

}
