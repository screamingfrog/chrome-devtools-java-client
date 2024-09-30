package uk.co.screamingfrog.cdt.protocol.types.storage;

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

import java.util.List;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Experimental;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Optional;

@Experimental
public class AttributionReportingAggregatableDebugReportingConfig {

  @Optional private Double budget;

  private String keyPiece;

  private List<AttributionReportingAggregatableDebugReportingData> debugData;

  @Optional private String aggregationCoordinatorOrigin;

  /**
   * number instead of integer because not all uint32 can be represented by int, only present for
   * source registrations
   */
  public Double getBudget() {
    return budget;
  }

  /**
   * number instead of integer because not all uint32 can be represented by int, only present for
   * source registrations
   */
  public void setBudget(Double budget) {
    this.budget = budget;
  }

  public String getKeyPiece() {
    return keyPiece;
  }

  public void setKeyPiece(String keyPiece) {
    this.keyPiece = keyPiece;
  }

  public List<AttributionReportingAggregatableDebugReportingData> getDebugData() {
    return debugData;
  }

  public void setDebugData(List<AttributionReportingAggregatableDebugReportingData> debugData) {
    this.debugData = debugData;
  }

  public String getAggregationCoordinatorOrigin() {
    return aggregationCoordinatorOrigin;
  }

  public void setAggregationCoordinatorOrigin(String aggregationCoordinatorOrigin) {
    this.aggregationCoordinatorOrigin = aggregationCoordinatorOrigin;
  }
}
