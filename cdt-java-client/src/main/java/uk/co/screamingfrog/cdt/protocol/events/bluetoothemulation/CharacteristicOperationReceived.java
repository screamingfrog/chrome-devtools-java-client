package uk.co.screamingfrog.cdt.protocol.events.bluetoothemulation;

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
import uk.co.screamingfrog.cdt.protocol.types.bluetoothemulation.CharacteristicOperationType;
import uk.co.screamingfrog.cdt.protocol.types.bluetoothemulation.CharacteristicWriteType;

/**
 * Event for when a characteristic operation of |type| to the characteristic respresented by
 * |characteristicId| happened. |data| and |writeType| is expected to exist when |type| is write.
 */
public class CharacteristicOperationReceived {

  private String characteristicId;

  private CharacteristicOperationType type;

  @Optional private String data;

  @Optional private CharacteristicWriteType writeType;

  public String getCharacteristicId() {
    return characteristicId;
  }

  public void setCharacteristicId(String characteristicId) {
    this.characteristicId = characteristicId;
  }

  public CharacteristicOperationType getType() {
    return type;
  }

  public void setType(CharacteristicOperationType type) {
    this.type = type;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public CharacteristicWriteType getWriteType() {
    return writeType;
  }

  public void setWriteType(CharacteristicWriteType writeType) {
    this.writeType = writeType;
  }
}
