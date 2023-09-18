package uk.co.screamingfrog.cdt.protocol.events.autofill;

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

import java.util.List;
import uk.co.screamingfrog.cdt.protocol.types.autofill.AddressUI;
import uk.co.screamingfrog.cdt.protocol.types.autofill.FilledField;

/** Emitted when an address form is filled. */
public class AddressFormFilled {

  private List<FilledField> filledFields;

  private AddressUI addressUi;

  /** Information about the fields that were filled */
  public List<FilledField> getFilledFields() {
    return filledFields;
  }

  /** Information about the fields that were filled */
  public void setFilledFields(List<FilledField> filledFields) {
    this.filledFields = filledFields;
  }

  /**
   * An UI representation of the address used to fill the form. Consists of a 2D array where each
   * child represents an address/profile line.
   */
  public AddressUI getAddressUi() {
    return addressUi;
  }

  /**
   * An UI representation of the address used to fill the form. Consists of a 2D array where each
   * child represents an address/profile line.
   */
  public void setAddressUi(AddressUI addressUi) {
    this.addressUi = addressUi;
  }
}
