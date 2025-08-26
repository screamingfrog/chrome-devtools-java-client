package uk.co.screamingfrog.cdt.protocol.types.audits;

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

import uk.co.screamingfrog.cdt.protocol.support.annotations.Optional;

/** This issue warns about uses of APIs that may be considered misuse to re-identify users. */
public class UserReidentificationIssueDetails {

  private UserReidentificationIssueType type;

  @Optional private AffectedRequest request;

  public UserReidentificationIssueType getType() {
    return type;
  }

  public void setType(UserReidentificationIssueType type) {
    this.type = type;
  }

  /** Applies to BlockedFrameNavigation and BlockedSubresource issue types. */
  public AffectedRequest getRequest() {
    return request;
  }

  /** Applies to BlockedFrameNavigation and BlockedSubresource issue types. */
  public void setRequest(AffectedRequest request) {
    this.request = request;
  }
}
