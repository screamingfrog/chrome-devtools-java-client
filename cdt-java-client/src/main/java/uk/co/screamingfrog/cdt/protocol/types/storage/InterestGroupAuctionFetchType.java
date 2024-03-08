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

/** Enum of network fetches auctions can do. */
public enum InterestGroupAuctionFetchType {
  @JsonProperty("bidderJs")
  BIDDER_JS,
  @JsonProperty("bidderWasm")
  BIDDER_WASM,
  @JsonProperty("sellerJs")
  SELLER_JS,
  @JsonProperty("bidderTrustedSignals")
  BIDDER_TRUSTED_SIGNALS,
  @JsonProperty("sellerTrustedSignals")
  SELLER_TRUSTED_SIGNALS
}
