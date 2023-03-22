package uk.co.screamingfrog.cdt.protocol.types.storage;

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

/** Details for an origin's shared storage. */
public class SharedStorageMetadata {

  private Double creationTime;

  private Integer length;

  private Double remainingBudget;

  public Double getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Double creationTime) {
    this.creationTime = creationTime;
  }

  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public Double getRemainingBudget() {
    return remainingBudget;
  }

  public void setRemainingBudget(Double remainingBudget) {
    this.remainingBudget = remainingBudget;
  }
}
