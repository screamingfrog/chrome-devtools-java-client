package uk.co.screamingfrog.cdt.protocol.events.page;

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
import uk.co.screamingfrog.cdt.protocol.support.annotations.Optional;
import uk.co.screamingfrog.cdt.protocol.types.page.AdScriptId;
import uk.co.screamingfrog.cdt.protocol.types.runtime.StackTrace;

/** Fired when frame has been attached to its parent. */
public class FrameAttached {

  private String frameId;

  private String parentFrameId;

  @Optional private StackTrace stack;

  @Experimental @Optional private AdScriptId adScriptId;

  /** Id of the frame that has been attached. */
  public String getFrameId() {
    return frameId;
  }

  /** Id of the frame that has been attached. */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  /** Parent frame identifier. */
  public String getParentFrameId() {
    return parentFrameId;
  }

  /** Parent frame identifier. */
  public void setParentFrameId(String parentFrameId) {
    this.parentFrameId = parentFrameId;
  }

  /** JavaScript stack trace of when frame was attached, only set if frame initiated from script. */
  public StackTrace getStack() {
    return stack;
  }

  /** JavaScript stack trace of when frame was attached, only set if frame initiated from script. */
  public void setStack(StackTrace stack) {
    this.stack = stack;
  }

  /**
   * Identifies the bottom-most script which caused the frame to be labelled as an ad. Only sent if
   * frame is labelled as an ad and id is available.
   */
  public AdScriptId getAdScriptId() {
    return adScriptId;
  }

  /**
   * Identifies the bottom-most script which caused the frame to be labelled as an ad. Only sent if
   * frame is labelled as an ad and id is available.
   */
  public void setAdScriptId(AdScriptId adScriptId) {
    this.adScriptId = adScriptId;
  }
}
