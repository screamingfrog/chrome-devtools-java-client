package uk.co.screamingfrog.cdt.protocol.events.network;

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

import java.util.Map;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Experimental;

/**
 * Fired when 103 Early Hints headers is received in addition to the common response. Not every
 * responseReceived event will have an responseReceivedEarlyHints fired. Only one
 * responseReceivedEarlyHints may be fired for eached responseReceived event.
 */
@Experimental
public class ResponseReceivedEarlyHints {

  private String requestId;

  private Map<String, Object> headers;

  /** Request identifier. Used to match this information to another responseReceived event. */
  public String getRequestId() {
    return requestId;
  }

  /** Request identifier. Used to match this information to another responseReceived event. */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /** Raw response headers as they were received over the wire. */
  public Map<String, Object> getHeaders() {
    return headers;
  }

  /** Raw response headers as they were received over the wire. */
  public void setHeaders(Map<String, Object> headers) {
    this.headers = headers;
  }
}
