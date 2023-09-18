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

import uk.co.screamingfrog.cdt.protocol.events.deviceaccess.DeviceRequestPrompted;
import uk.co.screamingfrog.cdt.protocol.support.annotations.EventName;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Experimental;
import uk.co.screamingfrog.cdt.protocol.support.annotations.ParamName;
import uk.co.screamingfrog.cdt.protocol.support.types.EventHandler;
import uk.co.screamingfrog.cdt.protocol.support.types.EventListener;

@Experimental
public interface DeviceAccess {

  /** Enable events in this domain. */
  void enable();

  /** Disable events in this domain. */
  void disable();

  /**
   * Select a device in response to a DeviceAccess.deviceRequestPrompted event.
   *
   * @param id
   * @param deviceId
   */
  void selectPrompt(@ParamName("id") String id, @ParamName("deviceId") String deviceId);

  /**
   * Cancel a prompt in response to a DeviceAccess.deviceRequestPrompted event.
   *
   * @param id
   */
  void cancelPrompt(@ParamName("id") String id);

  /**
   * A device request opened a user prompt to select a device. Respond with the selectPrompt or
   * cancelPrompt command.
   */
  @EventName("deviceRequestPrompted")
  EventListener onDeviceRequestPrompted(EventHandler<DeviceRequestPrompted> eventListener);
}
