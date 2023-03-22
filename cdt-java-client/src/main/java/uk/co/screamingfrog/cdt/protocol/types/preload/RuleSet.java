package uk.co.screamingfrog.cdt.protocol.types.preload;

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

/** Corresponds to SpeculationRuleSet */
public class RuleSet {

  private String id;

  private String loaderId;

  private String sourceText;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /** Identifies a document which the rule set is associated with. */
  public String getLoaderId() {
    return loaderId;
  }

  /** Identifies a document which the rule set is associated with. */
  public void setLoaderId(String loaderId) {
    this.loaderId = loaderId;
  }

  /**
   * Source text of JSON representing the rule set. If it comes from <script> tag, it is the
   * textContent of the node. Note that it is a JSON for valid case.
   *
   * <p>See also: - https://wicg.github.io/nav-speculation/speculation-rules.html -
   * https://github.com/WICG/nav-speculation/blob/main/triggers.md
   */
  public String getSourceText() {
    return sourceText;
  }

  /**
   * Source text of JSON representing the rule set. If it comes from <script> tag, it is the
   * textContent of the node. Note that it is a JSON for valid case.
   *
   * <p>See also: - https://wicg.github.io/nav-speculation/speculation-rules.html -
   * https://github.com/WICG/nav-speculation/blob/main/triggers.md
   */
  public void setSourceText(String sourceText) {
    this.sourceText = sourceText;
  }
}
