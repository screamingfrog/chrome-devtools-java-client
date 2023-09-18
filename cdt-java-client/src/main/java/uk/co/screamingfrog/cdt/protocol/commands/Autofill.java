package uk.co.screamingfrog.cdt.protocol.commands;

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
import uk.co.screamingfrog.cdt.protocol.events.autofill.AddressFormFilled;
import uk.co.screamingfrog.cdt.protocol.support.annotations.EventName;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Experimental;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Optional;
import uk.co.screamingfrog.cdt.protocol.support.annotations.ParamName;
import uk.co.screamingfrog.cdt.protocol.support.types.EventHandler;
import uk.co.screamingfrog.cdt.protocol.support.types.EventListener;
import uk.co.screamingfrog.cdt.protocol.types.autofill.Address;
import uk.co.screamingfrog.cdt.protocol.types.autofill.CreditCard;

/** Defines commands and events for Autofill. */
@Experimental
public interface Autofill {

  /**
   * Trigger autofill on a form identified by the fieldId. If the field and related form cannot be
   * autofilled, returns an error.
   *
   * @param fieldId Identifies a field that serves as an anchor for autofill.
   * @param card Credit card information to fill out the form. Credit card data is not saved.
   */
  void trigger(@ParamName("fieldId") Integer fieldId, @ParamName("card") CreditCard card);

  /**
   * Trigger autofill on a form identified by the fieldId. If the field and related form cannot be
   * autofilled, returns an error.
   *
   * @param fieldId Identifies a field that serves as an anchor for autofill.
   * @param frameId Identifies the frame that field belongs to.
   * @param card Credit card information to fill out the form. Credit card data is not saved.
   */
  void trigger(
      @ParamName("fieldId") Integer fieldId,
      @Optional @ParamName("frameId") String frameId,
      @ParamName("card") CreditCard card);

  /**
   * Set addresses so that developers can verify their forms implementation.
   *
   * @param addresses
   */
  void setAddresses(@ParamName("addresses") List<Address> addresses);

  /** Disables autofill domain notifications. */
  void disable();

  /** Enables autofill domain notifications. */
  void enable();

  /** Emitted when an address form is filled. */
  @EventName("addressFormFilled")
  EventListener onAddressFormFilled(EventHandler<AddressFormFilled> eventListener);
}
