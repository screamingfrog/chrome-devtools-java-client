package uk.co.screamingfrog.cdt.protocol.events.webauthn;

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

import uk.co.screamingfrog.cdt.protocol.types.webauthn.Credential;

/** Triggered when a credential is used in a webauthn assertion. */
public class CredentialAsserted {

  private String authenticatorId;

  private Credential credential;

  public String getAuthenticatorId() {
    return authenticatorId;
  }

  public void setAuthenticatorId(String authenticatorId) {
    this.authenticatorId = authenticatorId;
  }

  public Credential getCredential() {
    return credential;
  }

  public void setCredential(Credential credential) {
    this.credential = credential;
  }
}
