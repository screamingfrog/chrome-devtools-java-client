package uk.co.screamingfrog.cdt.protocol.events.tracing;

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
import uk.co.screamingfrog.cdt.protocol.support.annotations.Experimental;

/**
 * Contains a bucket of collected trace events. When tracing is stopped collected events will be
 * sent as a sequence of dataCollected events followed by tracingComplete event.
 */
@Experimental
public class DataCollected {

  private List<Object> value;

  public List<Object> getValue() {
    return value;
  }

  public void setValue(List<Object> value) {
    this.value = value;
  }
}
