package uk.co.screamingfrog.cdt.protocol.types.runtime;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 - 2024 Kenan Klisura
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.Map;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Optional;

/** Represents options for serialization. Overrides `generatePreview` and `returnByValue`. */
public class SerializationOptions {

  private SerializationOptionsSerialization serialization;

  @Optional private Integer maxDepth;

  @Optional private Map<String, Object> additionalParameters;

  public SerializationOptionsSerialization getSerialization() {
    return serialization;
  }

  public void setSerialization(SerializationOptionsSerialization serialization) {
    this.serialization = serialization;
  }

  /**
   * Deep serialization depth. Default is full depth. Respected only in `deep` serialization mode.
   */
  public Integer getMaxDepth() {
    return maxDepth;
  }

  /**
   * Deep serialization depth. Default is full depth. Respected only in `deep` serialization mode.
   */
  public void setMaxDepth(Integer maxDepth) {
    this.maxDepth = maxDepth;
  }

  /**
   * Embedder-specific parameters. For example if connected to V8 in Chrome these control DOM
   * serialization via `maxNodeDepth: integer` and `includeShadowTree: "none" | "open" | "all"`.
   * Values can be only of type string or integer.
   */
  public Map<String, Object> getAdditionalParameters() {
    return additionalParameters;
  }

  /**
   * Embedder-specific parameters. For example if connected to V8 in Chrome these control DOM
   * serialization via `maxNodeDepth: integer` and `includeShadowTree: "none" | "open" | "all"`.
   * Values can be only of type string or integer.
   */
  public void setAdditionalParameters(Map<String, Object> additionalParameters) {
    this.additionalParameters = additionalParameters;
  }
}
