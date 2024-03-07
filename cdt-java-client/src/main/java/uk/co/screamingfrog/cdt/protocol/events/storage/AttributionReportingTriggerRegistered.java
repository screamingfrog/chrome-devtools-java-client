package uk.co.screamingfrog.cdt.protocol.events.storage;

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
import uk.co.screamingfrog.cdt.protocol.types.storage.AttributionReportingAggregatableResult;
import uk.co.screamingfrog.cdt.protocol.types.storage.AttributionReportingEventLevelResult;
import uk.co.screamingfrog.cdt.protocol.types.storage.AttributionReportingTriggerRegistration;

@Experimental
public class AttributionReportingTriggerRegistered {

  private AttributionReportingTriggerRegistration registration;

  private AttributionReportingEventLevelResult eventLevel;

  private AttributionReportingAggregatableResult aggregatable;

  public AttributionReportingTriggerRegistration getRegistration() {
    return registration;
  }

  public void setRegistration(AttributionReportingTriggerRegistration registration) {
    this.registration = registration;
  }

  public AttributionReportingEventLevelResult getEventLevel() {
    return eventLevel;
  }

  public void setEventLevel(AttributionReportingEventLevelResult eventLevel) {
    this.eventLevel = eventLevel;
  }

  public AttributionReportingAggregatableResult getAggregatable() {
    return aggregatable;
  }

  public void setAggregatable(AttributionReportingAggregatableResult aggregatable) {
    this.aggregatable = aggregatable;
  }
}
