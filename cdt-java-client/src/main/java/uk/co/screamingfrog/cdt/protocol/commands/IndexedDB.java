package uk.co.screamingfrog.cdt.protocol.commands;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 - 2022 Kenan Klisura
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
import uk.co.screamingfrog.cdt.protocol.support.annotations.Optional;
import uk.co.screamingfrog.cdt.protocol.support.annotations.ParamName;
import uk.co.screamingfrog.cdt.protocol.support.annotations.ReturnTypeParameter;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Returns;
import uk.co.screamingfrog.cdt.protocol.types.indexeddb.DatabaseWithObjectStores;
import uk.co.screamingfrog.cdt.protocol.types.indexeddb.KeyRange;
import uk.co.screamingfrog.cdt.protocol.types.indexeddb.Metadata;
import uk.co.screamingfrog.cdt.protocol.types.indexeddb.RequestData;

@Experimental
public interface IndexedDB {

  /**
   * Clears all entries from an object store.
   *
   * @param databaseName Database name.
   * @param objectStoreName Object store name.
   */
  void clearObjectStore(
      @ParamName("databaseName") String databaseName,
      @ParamName("objectStoreName") String objectStoreName);

  /**
   * Clears all entries from an object store.
   *
   * @param securityOrigin At least and at most one of securityOrigin, storageKey must be specified.
   *     Security origin.
   * @param storageKey Storage key.
   * @param databaseName Database name.
   * @param objectStoreName Object store name.
   */
  void clearObjectStore(
      @Optional @ParamName("securityOrigin") String securityOrigin,
      @Optional @ParamName("storageKey") String storageKey,
      @ParamName("databaseName") String databaseName,
      @ParamName("objectStoreName") String objectStoreName);

  /**
   * Deletes a database.
   *
   * @param databaseName Database name.
   */
  void deleteDatabase(@ParamName("databaseName") String databaseName);

  /**
   * Deletes a database.
   *
   * @param securityOrigin At least and at most one of securityOrigin, storageKey must be specified.
   *     Security origin.
   * @param storageKey Storage key.
   * @param databaseName Database name.
   */
  void deleteDatabase(
      @Optional @ParamName("securityOrigin") String securityOrigin,
      @Optional @ParamName("storageKey") String storageKey,
      @ParamName("databaseName") String databaseName);

  /**
   * Delete a range of entries from an object store
   *
   * @param databaseName
   * @param objectStoreName
   * @param keyRange Range of entry keys to delete
   */
  void deleteObjectStoreEntries(
      @ParamName("databaseName") String databaseName,
      @ParamName("objectStoreName") String objectStoreName,
      @ParamName("keyRange") KeyRange keyRange);

  /**
   * Delete a range of entries from an object store
   *
   * @param securityOrigin At least and at most one of securityOrigin, storageKey must be specified.
   *     Security origin.
   * @param storageKey Storage key.
   * @param databaseName
   * @param objectStoreName
   * @param keyRange Range of entry keys to delete
   */
  void deleteObjectStoreEntries(
      @Optional @ParamName("securityOrigin") String securityOrigin,
      @Optional @ParamName("storageKey") String storageKey,
      @ParamName("databaseName") String databaseName,
      @ParamName("objectStoreName") String objectStoreName,
      @ParamName("keyRange") KeyRange keyRange);

  /** Disables events from backend. */
  void disable();

  /** Enables events from backend. */
  void enable();

  /**
   * Requests data from object store or index.
   *
   * @param databaseName Database name.
   * @param objectStoreName Object store name.
   * @param indexName Index name, empty string for object store data requests.
   * @param skipCount Number of records to skip.
   * @param pageSize Number of records to fetch.
   */
  RequestData requestData(
      @ParamName("databaseName") String databaseName,
      @ParamName("objectStoreName") String objectStoreName,
      @ParamName("indexName") String indexName,
      @ParamName("skipCount") Integer skipCount,
      @ParamName("pageSize") Integer pageSize);

  /**
   * Requests data from object store or index.
   *
   * @param securityOrigin At least and at most one of securityOrigin, storageKey must be specified.
   *     Security origin.
   * @param storageKey Storage key.
   * @param databaseName Database name.
   * @param objectStoreName Object store name.
   * @param indexName Index name, empty string for object store data requests.
   * @param skipCount Number of records to skip.
   * @param pageSize Number of records to fetch.
   * @param keyRange Key range.
   */
  RequestData requestData(
      @Optional @ParamName("securityOrigin") String securityOrigin,
      @Optional @ParamName("storageKey") String storageKey,
      @ParamName("databaseName") String databaseName,
      @ParamName("objectStoreName") String objectStoreName,
      @ParamName("indexName") String indexName,
      @ParamName("skipCount") Integer skipCount,
      @ParamName("pageSize") Integer pageSize,
      @Optional @ParamName("keyRange") KeyRange keyRange);

  /**
   * Gets metadata of an object store
   *
   * @param databaseName Database name.
   * @param objectStoreName Object store name.
   */
  Metadata getMetadata(
      @ParamName("databaseName") String databaseName,
      @ParamName("objectStoreName") String objectStoreName);

  /**
   * Gets metadata of an object store
   *
   * @param securityOrigin At least and at most one of securityOrigin, storageKey must be specified.
   *     Security origin.
   * @param storageKey Storage key.
   * @param databaseName Database name.
   * @param objectStoreName Object store name.
   */
  Metadata getMetadata(
      @Optional @ParamName("securityOrigin") String securityOrigin,
      @Optional @ParamName("storageKey") String storageKey,
      @ParamName("databaseName") String databaseName,
      @ParamName("objectStoreName") String objectStoreName);

  /**
   * Requests database with given name in given frame.
   *
   * @param databaseName Database name.
   */
  @Returns("databaseWithObjectStores")
  DatabaseWithObjectStores requestDatabase(@ParamName("databaseName") String databaseName);

  /**
   * Requests database with given name in given frame.
   *
   * @param securityOrigin At least and at most one of securityOrigin, storageKey must be specified.
   *     Security origin.
   * @param storageKey Storage key.
   * @param databaseName Database name.
   */
  @Returns("databaseWithObjectStores")
  DatabaseWithObjectStores requestDatabase(
      @Optional @ParamName("securityOrigin") String securityOrigin,
      @Optional @ParamName("storageKey") String storageKey,
      @ParamName("databaseName") String databaseName);

  /** Requests database names for given security origin. */
  @Returns("databaseNames")
  @ReturnTypeParameter(String.class)
  List<String> requestDatabaseNames();

  /**
   * Requests database names for given security origin.
   *
   * @param securityOrigin At least and at most one of securityOrigin, storageKey must be specified.
   *     Security origin.
   * @param storageKey Storage key.
   */
  @Returns("databaseNames")
  @ReturnTypeParameter(String.class)
  List<String> requestDatabaseNames(
      @Optional @ParamName("securityOrigin") String securityOrigin,
      @Optional @ParamName("storageKey") String storageKey);
}
