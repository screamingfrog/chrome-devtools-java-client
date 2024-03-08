package uk.co.screamingfrog.cdt.protocol.types.cachestorage;

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
import uk.co.screamingfrog.cdt.protocol.types.storage.StorageBucket;

/** Cache identifier. */
public class Cache {

  private String cacheId;

  private String securityOrigin;

  private String storageKey;

  @Optional private StorageBucket storageBucket;

  private String cacheName;

  /** An opaque unique id of the cache. */
  public String getCacheId() {
    return cacheId;
  }

  /** An opaque unique id of the cache. */
  public void setCacheId(String cacheId) {
    this.cacheId = cacheId;
  }

  /** Security origin of the cache. */
  public String getSecurityOrigin() {
    return securityOrigin;
  }

  /** Security origin of the cache. */
  public void setSecurityOrigin(String securityOrigin) {
    this.securityOrigin = securityOrigin;
  }

  /** Storage key of the cache. */
  public String getStorageKey() {
    return storageKey;
  }

  /** Storage key of the cache. */
  public void setStorageKey(String storageKey) {
    this.storageKey = storageKey;
  }

  /** Storage bucket of the cache. */
  public StorageBucket getStorageBucket() {
    return storageBucket;
  }

  /** Storage bucket of the cache. */
  public void setStorageBucket(StorageBucket storageBucket) {
    this.storageBucket = storageBucket;
  }

  /** The name of the cache. */
  public String getCacheName() {
    return cacheName;
  }

  /** The name of the cache. */
  public void setCacheName(String cacheName) {
    this.cacheName = cacheName;
  }
}
