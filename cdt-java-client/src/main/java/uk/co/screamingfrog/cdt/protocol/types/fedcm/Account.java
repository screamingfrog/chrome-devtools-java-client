package uk.co.screamingfrog.cdt.protocol.types.fedcm;

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

import uk.co.screamingfrog.cdt.protocol.support.annotations.Optional;

/** Corresponds to IdentityRequestAccount */
public class Account {

  private String accountId;

  private String email;

  private String name;

  private String givenName;

  private String pictureUrl;

  private String idpConfigUrl;

  private String idpLoginUrl;

  private LoginState loginState;

  @Optional private String termsOfServiceUrl;

  @Optional private String privacyPolicyUrl;

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public String getPictureUrl() {
    return pictureUrl;
  }

  public void setPictureUrl(String pictureUrl) {
    this.pictureUrl = pictureUrl;
  }

  public String getIdpConfigUrl() {
    return idpConfigUrl;
  }

  public void setIdpConfigUrl(String idpConfigUrl) {
    this.idpConfigUrl = idpConfigUrl;
  }

  public String getIdpLoginUrl() {
    return idpLoginUrl;
  }

  public void setIdpLoginUrl(String idpLoginUrl) {
    this.idpLoginUrl = idpLoginUrl;
  }

  public LoginState getLoginState() {
    return loginState;
  }

  public void setLoginState(LoginState loginState) {
    this.loginState = loginState;
  }

  /** These two are only set if the loginState is signUp */
  public String getTermsOfServiceUrl() {
    return termsOfServiceUrl;
  }

  /** These two are only set if the loginState is signUp */
  public void setTermsOfServiceUrl(String termsOfServiceUrl) {
    this.termsOfServiceUrl = termsOfServiceUrl;
  }

  public String getPrivacyPolicyUrl() {
    return privacyPolicyUrl;
  }

  public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
  }
}
