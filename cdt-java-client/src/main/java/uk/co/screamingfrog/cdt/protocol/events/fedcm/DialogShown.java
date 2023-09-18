package uk.co.screamingfrog.cdt.protocol.events.fedcm;

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
import uk.co.screamingfrog.cdt.protocol.support.annotations.Optional;
import uk.co.screamingfrog.cdt.protocol.types.fedcm.Account;
import uk.co.screamingfrog.cdt.protocol.types.fedcm.DialogType;

public class DialogShown {

  private String dialogId;

  private DialogType dialogType;

  private List<Account> accounts;

  private String title;

  @Optional private String subtitle;

  public String getDialogId() {
    return dialogId;
  }

  public void setDialogId(String dialogId) {
    this.dialogId = dialogId;
  }

  public DialogType getDialogType() {
    return dialogType;
  }

  public void setDialogType(DialogType dialogType) {
    this.dialogType = dialogType;
  }

  public List<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }

  /** These exist primarily so that the caller can verify the RP context was used appropriately. */
  public String getTitle() {
    return title;
  }

  /** These exist primarily so that the caller can verify the RP context was used appropriately. */
  public void setTitle(String title) {
    this.title = title;
  }

  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }
}
