package uk.co.screamingfrog.cdt.protocol.types.storage;

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

import com.fasterxml.jackson.annotation.JsonProperty;

/** Enum of interest group access types. */
public enum InterestGroupAccessType {
  @JsonProperty("join")
  JOIN,
  @JsonProperty("leave")
  LEAVE,
  @JsonProperty("update")
  UPDATE,
  @JsonProperty("loaded")
  LOADED,
  @JsonProperty("bid")
  BID,
  @JsonProperty("win")
  WIN,
  @JsonProperty("additionalBid")
  ADDITIONAL_BID,
  @JsonProperty("additionalBidWin")
  ADDITIONAL_BID_WIN,
  @JsonProperty("topLevelBid")
  TOP_LEVEL_BID,
  @JsonProperty("topLevelAdditionalBid")
  TOP_LEVEL_ADDITIONAL_BID,
  @JsonProperty("clear")
  CLEAR
}
