package uk.co.screamingfrog.cdt.protocol.types.page;

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

import uk.co.screamingfrog.cdt.protocol.support.annotations.Experimental;

/** Identifies the bottom-most script which caused the frame to be labelled as an ad. */
@Experimental
public class AdScriptId {

  private String scriptId;

  private String debuggerId;

  /** Script Id of the bottom-most script which caused the frame to be labelled as an ad. */
  public String getScriptId() {
    return scriptId;
  }

  /** Script Id of the bottom-most script which caused the frame to be labelled as an ad. */
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  /** Id of adScriptId's debugger. */
  public String getDebuggerId() {
    return debuggerId;
  }

  /** Id of adScriptId's debugger. */
  public void setDebuggerId(String debuggerId) {
    this.debuggerId = debuggerId;
  }
}
