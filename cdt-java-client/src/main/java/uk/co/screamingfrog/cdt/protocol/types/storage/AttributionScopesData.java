package uk.co.screamingfrog.cdt.protocol.types.storage;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 - 2025 Kenan Klisura
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

import java.util.List;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Experimental;

@Experimental
public class AttributionScopesData {

  private List<String> values;

  private Double limit;

  private Double maxEventStates;

  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  /** number instead of integer because not all uint32 can be represented by int */
  public Double getLimit() {
    return limit;
  }

  /** number instead of integer because not all uint32 can be represented by int */
  public void setLimit(Double limit) {
    this.limit = limit;
  }

  public Double getMaxEventStates() {
    return maxEventStates;
  }

  public void setMaxEventStates(Double maxEventStates) {
    this.maxEventStates = maxEventStates;
  }
}
