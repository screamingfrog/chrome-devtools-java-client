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

import java.util.List;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Optional;

/** The full details of an interest group. */
public class InterestGroupDetails {

  private String ownerOrigin;

  private String name;

  private Double expirationTime;

  private String joiningOrigin;

  @Optional private String biddingLogicURL;

  @Optional private String biddingWasmHelperURL;

  @Optional private String updateURL;

  @Optional private String trustedBiddingSignalsURL;

  private List<String> trustedBiddingSignalsKeys;

  @Optional private String userBiddingSignals;

  private List<InterestGroupAd> ads;

  private List<InterestGroupAd> adComponents;

  public String getOwnerOrigin() {
    return ownerOrigin;
  }

  public void setOwnerOrigin(String ownerOrigin) {
    this.ownerOrigin = ownerOrigin;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(Double expirationTime) {
    this.expirationTime = expirationTime;
  }

  public String getJoiningOrigin() {
    return joiningOrigin;
  }

  public void setJoiningOrigin(String joiningOrigin) {
    this.joiningOrigin = joiningOrigin;
  }

  public String getBiddingLogicURL() {
    return biddingLogicURL;
  }

  public void setBiddingLogicURL(String biddingLogicURL) {
    this.biddingLogicURL = biddingLogicURL;
  }

  public String getBiddingWasmHelperURL() {
    return biddingWasmHelperURL;
  }

  public void setBiddingWasmHelperURL(String biddingWasmHelperURL) {
    this.biddingWasmHelperURL = biddingWasmHelperURL;
  }

  public String getUpdateURL() {
    return updateURL;
  }

  public void setUpdateURL(String updateURL) {
    this.updateURL = updateURL;
  }

  public String getTrustedBiddingSignalsURL() {
    return trustedBiddingSignalsURL;
  }

  public void setTrustedBiddingSignalsURL(String trustedBiddingSignalsURL) {
    this.trustedBiddingSignalsURL = trustedBiddingSignalsURL;
  }

  public List<String> getTrustedBiddingSignalsKeys() {
    return trustedBiddingSignalsKeys;
  }

  public void setTrustedBiddingSignalsKeys(List<String> trustedBiddingSignalsKeys) {
    this.trustedBiddingSignalsKeys = trustedBiddingSignalsKeys;
  }

  public String getUserBiddingSignals() {
    return userBiddingSignals;
  }

  public void setUserBiddingSignals(String userBiddingSignals) {
    this.userBiddingSignals = userBiddingSignals;
  }

  public List<InterestGroupAd> getAds() {
    return ads;
  }

  public void setAds(List<InterestGroupAd> ads) {
    this.ads = ads;
  }

  public List<InterestGroupAd> getAdComponents() {
    return adComponents;
  }

  public void setAdComponents(List<InterestGroupAd> adComponents) {
    this.adComponents = adComponents;
  }
}
