package uk.co.screamingfrog.cdt.protocol.types.css;

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
import uk.co.screamingfrog.cdt.protocol.support.annotations.Optional;

/** CSS function conditional block representation. */
public class CSSFunctionConditionNode {

  @Optional private CSSMedia media;

  @Optional private CSSContainerQuery containerQueries;

  @Optional private CSSSupports supports;

  private List<CSSFunctionNode> children;

  private String conditionText;

  /** Media query for this conditional block. Only one type of condition should be set. */
  public CSSMedia getMedia() {
    return media;
  }

  /** Media query for this conditional block. Only one type of condition should be set. */
  public void setMedia(CSSMedia media) {
    this.media = media;
  }

  /** Container query for this conditional block. Only one type of condition should be set. */
  public CSSContainerQuery getContainerQueries() {
    return containerQueries;
  }

  /** Container query for this conditional block. Only one type of condition should be set. */
  public void setContainerQueries(CSSContainerQuery containerQueries) {
    this.containerQueries = containerQueries;
  }

  /**
   * @supports CSS at-rule condition. Only one type of condition should be set.
   */
  public CSSSupports getSupports() {
    return supports;
  }

  /**
   * @supports CSS at-rule condition. Only one type of condition should be set.
   */
  public void setSupports(CSSSupports supports) {
    this.supports = supports;
  }

  /** Block body. */
  public List<CSSFunctionNode> getChildren() {
    return children;
  }

  /** Block body. */
  public void setChildren(List<CSSFunctionNode> children) {
    this.children = children;
  }

  /** The condition text. */
  public String getConditionText() {
    return conditionText;
  }

  /** The condition text. */
  public void setConditionText(String conditionText) {
    this.conditionText = conditionText;
  }
}
