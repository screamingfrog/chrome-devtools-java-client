package uk.co.screamingfrog.cdt.protocol.types.page;

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
import uk.co.screamingfrog.cdt.protocol.support.annotations.Optional;

/**
 * Encapsulates the script ancestry and the root script filterlist rule that caused the frame to be
 * labelled as an ad. Only created when `ancestryChain` is not empty.
 */
@Experimental
public class AdScriptAncestry {

  private List<AdScriptId> ancestryChain;

  @Optional private String rootScriptFilterlistRule;

  /**
   * A chain of `AdScriptId`s representing the ancestry of an ad script that led to the creation of
   * a frame. The chain is ordered from the script itself (lower level) up to its root ancestor that
   * was flagged by filterlist.
   */
  public List<AdScriptId> getAncestryChain() {
    return ancestryChain;
  }

  /**
   * A chain of `AdScriptId`s representing the ancestry of an ad script that led to the creation of
   * a frame. The chain is ordered from the script itself (lower level) up to its root ancestor that
   * was flagged by filterlist.
   */
  public void setAncestryChain(List<AdScriptId> ancestryChain) {
    this.ancestryChain = ancestryChain;
  }

  /**
   * The filterlist rule that caused the root (last) script in `ancestryChain` to be ad-tagged. Only
   * populated if the rule is available.
   */
  public String getRootScriptFilterlistRule() {
    return rootScriptFilterlistRule;
  }

  /**
   * The filterlist rule that caused the root (last) script in `ancestryChain` to be ad-tagged. Only
   * populated if the rule is available.
   */
  public void setRootScriptFilterlistRule(String rootScriptFilterlistRule) {
    this.rootScriptFilterlistRule = rootScriptFilterlistRule;
  }
}
