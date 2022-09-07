package uk.co.screamingfrog.cdt.protocol.commands;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 - 2022 Kenan Klisura
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

import uk.co.screamingfrog.cdt.protocol.events.tethering.Accepted;
import uk.co.screamingfrog.cdt.protocol.support.annotations.EventName;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Experimental;
import uk.co.screamingfrog.cdt.protocol.support.annotations.ParamName;
import uk.co.screamingfrog.cdt.protocol.support.types.EventHandler;
import uk.co.screamingfrog.cdt.protocol.support.types.EventListener;

/** The Tethering domain defines methods and events for browser port binding. */
@Experimental
public interface Tethering {

  /**
   * Request browser port binding.
   *
   * @param port Port number to bind.
   */
  void bind(@ParamName("port") Integer port);

  /**
   * Request browser port unbinding.
   *
   * @param port Port number to unbind.
   */
  void unbind(@ParamName("port") Integer port);

  /** Informs that port was successfully bound and got a specified connection id. */
  @EventName("accepted")
  EventListener onAccepted(EventHandler<Accepted> eventListener);
}
