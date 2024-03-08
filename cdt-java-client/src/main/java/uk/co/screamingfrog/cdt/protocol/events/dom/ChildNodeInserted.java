package uk.co.screamingfrog.cdt.protocol.events.dom;

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

import uk.co.screamingfrog.cdt.protocol.types.dom.Node;

/** Mirrors `DOMNodeInserted` event. */
public class ChildNodeInserted {

  private Integer parentNodeId;

  private Integer previousNodeId;

  private Node node;

  /** Id of the node that has changed. */
  public Integer getParentNodeId() {
    return parentNodeId;
  }

  /** Id of the node that has changed. */
  public void setParentNodeId(Integer parentNodeId) {
    this.parentNodeId = parentNodeId;
  }

  /** Id of the previous sibling. */
  public Integer getPreviousNodeId() {
    return previousNodeId;
  }

  /** Id of the previous sibling. */
  public void setPreviousNodeId(Integer previousNodeId) {
    this.previousNodeId = previousNodeId;
  }

  /** Inserted node data. */
  public Node getNode() {
    return node;
  }

  /** Inserted node data. */
  public void setNode(Node node) {
    this.node = node;
  }
}
