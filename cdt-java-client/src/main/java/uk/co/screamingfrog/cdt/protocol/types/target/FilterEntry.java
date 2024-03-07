package uk.co.screamingfrog.cdt.protocol.types.target;

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
import uk.co.screamingfrog.cdt.protocol.support.annotations.Optional;

/** A filter used by target query/discovery/auto-attach operations. */
@Experimental
public class FilterEntry {

  @Optional private Boolean exclude;

  @Optional private String type;

  /** If set, causes exclusion of matching targets from the list. */
  public Boolean getExclude() {
    return exclude;
  }

  /** If set, causes exclusion of matching targets from the list. */
  public void setExclude(Boolean exclude) {
    this.exclude = exclude;
  }

  /** If not present, matches any type. */
  public String getType() {
    return type;
  }

  /** If not present, matches any type. */
  public void setType(String type) {
    this.type = type;
  }
}
