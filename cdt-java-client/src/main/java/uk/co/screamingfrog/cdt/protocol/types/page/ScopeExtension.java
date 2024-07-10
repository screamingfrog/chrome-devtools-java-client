package uk.co.screamingfrog.cdt.protocol.types.page;

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

import uk.co.screamingfrog.cdt.protocol.support.annotations.Experimental;

@Experimental
public class ScopeExtension {

  private String origin;

  private Boolean hasOriginWildcard;

  /**
   * Instead of using tuple, this field always returns the serialized string for easy understanding
   * and comparison.
   */
  public String getOrigin() {
    return origin;
  }

  /**
   * Instead of using tuple, this field always returns the serialized string for easy understanding
   * and comparison.
   */
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public Boolean getHasOriginWildcard() {
    return hasOriginWildcard;
  }

  public void setHasOriginWildcard(Boolean hasOriginWildcard) {
    this.hasOriginWildcard = hasOriginWildcard;
  }
}
