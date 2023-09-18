package uk.co.screamingfrog.cdt.protocol.events.preload;

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

import uk.co.screamingfrog.cdt.protocol.types.preload.RuleSet;

/** Upsert. Currently, it is only emitted when a rule set added. */
public class RuleSetUpdated {

  private RuleSet ruleSet;

  public RuleSet getRuleSet() {
    return ruleSet;
  }

  public void setRuleSet(RuleSet ruleSet) {
    this.ruleSet = ruleSet;
  }
}
