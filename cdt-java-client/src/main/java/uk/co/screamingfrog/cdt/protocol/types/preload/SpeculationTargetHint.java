package uk.co.screamingfrog.cdt.protocol.types.preload;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 - 2023 Kenan Klisura
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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Corresponds to mojom::SpeculationTargetHint. See
 * https://github.com/WICG/nav-speculation/blob/main/triggers.md#window-name-targeting-hints
 */
public enum SpeculationTargetHint {
  @JsonProperty("Blank")
  BLANK,
  @JsonProperty("Self")
  SELF
}
