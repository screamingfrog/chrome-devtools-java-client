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

import uk.co.screamingfrog.cdt.protocol.events.preload.PrefetchStatusUpdated;
import uk.co.screamingfrog.cdt.protocol.events.preload.PreloadEnabledStateUpdated;
import uk.co.screamingfrog.cdt.protocol.events.preload.PreloadingAttemptSourcesUpdated;
import uk.co.screamingfrog.cdt.protocol.events.preload.PrerenderAttemptCompleted;
import uk.co.screamingfrog.cdt.protocol.events.preload.PrerenderStatusUpdated;
import uk.co.screamingfrog.cdt.protocol.events.preload.RuleSetRemoved;
import uk.co.screamingfrog.cdt.protocol.events.preload.RuleSetUpdated;
import uk.co.screamingfrog.cdt.protocol.support.annotations.EventName;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Experimental;
import uk.co.screamingfrog.cdt.protocol.support.types.EventHandler;
import uk.co.screamingfrog.cdt.protocol.support.types.EventListener;

@Experimental
public interface Preload {

  void enable();

  void disable();

  /** Upsert. Currently, it is only emitted when a rule set added. */
  @EventName("ruleSetUpdated")
  EventListener onRuleSetUpdated(EventHandler<RuleSetUpdated> eventListener);

  @EventName("ruleSetRemoved")
  EventListener onRuleSetRemoved(EventHandler<RuleSetRemoved> eventListener);

  /** Fired when a prerender attempt is completed. */
  @EventName("prerenderAttemptCompleted")
  EventListener onPrerenderAttemptCompleted(EventHandler<PrerenderAttemptCompleted> eventListener);

  /** Fired when a preload enabled state is updated. */
  @EventName("preloadEnabledStateUpdated")
  EventListener onPreloadEnabledStateUpdated(
      EventHandler<PreloadEnabledStateUpdated> eventListener);

  /** Fired when a prefetch attempt is updated. */
  @EventName("prefetchStatusUpdated")
  EventListener onPrefetchStatusUpdated(EventHandler<PrefetchStatusUpdated> eventListener);

  /** Fired when a prerender attempt is updated. */
  @EventName("prerenderStatusUpdated")
  EventListener onPrerenderStatusUpdated(EventHandler<PrerenderStatusUpdated> eventListener);

  /** Send a list of sources for all preloading attempts in a document. */
  @EventName("preloadingAttemptSourcesUpdated")
  EventListener onPreloadingAttemptSourcesUpdated(
      EventHandler<PreloadingAttemptSourcesUpdated> eventListener);
}
