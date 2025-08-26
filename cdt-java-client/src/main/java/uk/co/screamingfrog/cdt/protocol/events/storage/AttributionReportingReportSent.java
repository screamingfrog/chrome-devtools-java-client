package uk.co.screamingfrog.cdt.protocol.events.storage;

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

import java.util.Map;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Experimental;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Optional;
import uk.co.screamingfrog.cdt.protocol.types.storage.AttributionReportingReportResult;

@Experimental
public class AttributionReportingReportSent {

  private String url;

  private Map<String, Object> body;

  private AttributionReportingReportResult result;

  @Optional private Integer netError;

  @Optional private String netErrorName;

  @Optional private Integer httpStatusCode;

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Map<String, Object> getBody() {
    return body;
  }

  public void setBody(Map<String, Object> body) {
    this.body = body;
  }

  public AttributionReportingReportResult getResult() {
    return result;
  }

  public void setResult(AttributionReportingReportResult result) {
    this.result = result;
  }

  /** If result is `sent`, populated with net/HTTP status. */
  public Integer getNetError() {
    return netError;
  }

  /** If result is `sent`, populated with net/HTTP status. */
  public void setNetError(Integer netError) {
    this.netError = netError;
  }

  public String getNetErrorName() {
    return netErrorName;
  }

  public void setNetErrorName(String netErrorName) {
    this.netErrorName = netErrorName;
  }

  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }
}
