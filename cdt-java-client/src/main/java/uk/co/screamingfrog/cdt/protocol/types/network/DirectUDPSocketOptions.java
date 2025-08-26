package uk.co.screamingfrog.cdt.protocol.types.network;

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

import uk.co.screamingfrog.cdt.protocol.support.annotations.Experimental;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Optional;

@Experimental
public class DirectUDPSocketOptions {

  @Optional private String remoteAddr;

  @Optional private Integer remotePort;

  @Optional private String localAddr;

  @Optional private Integer localPort;

  @Optional private DirectSocketDnsQueryType dnsQueryType;

  @Optional private Double sendBufferSize;

  @Optional private Double receiveBufferSize;

  public String getRemoteAddr() {
    return remoteAddr;
  }

  public void setRemoteAddr(String remoteAddr) {
    this.remoteAddr = remoteAddr;
  }

  /** Unsigned int 16. */
  public Integer getRemotePort() {
    return remotePort;
  }

  /** Unsigned int 16. */
  public void setRemotePort(Integer remotePort) {
    this.remotePort = remotePort;
  }

  public String getLocalAddr() {
    return localAddr;
  }

  public void setLocalAddr(String localAddr) {
    this.localAddr = localAddr;
  }

  /** Unsigned int 16. */
  public Integer getLocalPort() {
    return localPort;
  }

  /** Unsigned int 16. */
  public void setLocalPort(Integer localPort) {
    this.localPort = localPort;
  }

  public DirectSocketDnsQueryType getDnsQueryType() {
    return dnsQueryType;
  }

  public void setDnsQueryType(DirectSocketDnsQueryType dnsQueryType) {
    this.dnsQueryType = dnsQueryType;
  }

  /** Expected to be unsigned integer. */
  public Double getSendBufferSize() {
    return sendBufferSize;
  }

  /** Expected to be unsigned integer. */
  public void setSendBufferSize(Double sendBufferSize) {
    this.sendBufferSize = sendBufferSize;
  }

  /** Expected to be unsigned integer. */
  public Double getReceiveBufferSize() {
    return receiveBufferSize;
  }

  /** Expected to be unsigned integer. */
  public void setReceiveBufferSize(Double receiveBufferSize) {
    this.receiveBufferSize = receiveBufferSize;
  }
}
