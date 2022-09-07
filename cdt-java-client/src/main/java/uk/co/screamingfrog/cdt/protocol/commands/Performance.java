package uk.co.screamingfrog.cdt.protocol.commands;

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

import java.util.List;
import uk.co.screamingfrog.cdt.protocol.events.performance.Metrics;
import uk.co.screamingfrog.cdt.protocol.support.annotations.EventName;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Experimental;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Optional;
import uk.co.screamingfrog.cdt.protocol.support.annotations.ParamName;
import uk.co.screamingfrog.cdt.protocol.support.annotations.ReturnTypeParameter;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Returns;
import uk.co.screamingfrog.cdt.protocol.support.types.EventHandler;
import uk.co.screamingfrog.cdt.protocol.support.types.EventListener;
import uk.co.screamingfrog.cdt.protocol.types.performance.EnableTimeDomain;
import uk.co.screamingfrog.cdt.protocol.types.performance.Metric;
import uk.co.screamingfrog.cdt.protocol.types.performance.SetTimeDomainTimeDomain;

public interface Performance {

  /** Disable collecting and reporting metrics. */
  void disable();

  /** Enable collecting and reporting metrics. */
  void enable();

  /**
   * Enable collecting and reporting metrics.
   *
   * @param timeDomain Time domain to use for collecting and reporting duration metrics.
   */
  void enable(@Optional @ParamName("timeDomain") EnableTimeDomain timeDomain);

  /**
   * Sets time domain to use for collecting and reporting duration metrics. Note that this must be
   * called before enabling metrics collection. Calling this method while metrics collection is
   * enabled returns an error.
   *
   * @param timeDomain Time domain
   */
  @Deprecated
  @Experimental
  void setTimeDomain(@ParamName("timeDomain") SetTimeDomainTimeDomain timeDomain);

  /** Retrieve current values of run-time metrics. */
  @Returns("metrics")
  @ReturnTypeParameter(Metric.class)
  List<Metric> getMetrics();

  /** Current values of the metrics. */
  @EventName("metrics")
  EventListener onMetrics(EventHandler<Metrics> eventListener);
}
