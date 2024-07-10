package uk.co.screamingfrog.cdt.protocol.commands;

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

import uk.co.screamingfrog.cdt.protocol.support.annotations.Experimental;
import uk.co.screamingfrog.cdt.protocol.support.annotations.ParamName;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Returns;

/**
 * Defines commands and events for browser extensions. Available if the client is connected using
 * the --remote-debugging-pipe flag and the --enable-unsafe-extension-debugging flag is set.
 */
@Experimental
public interface Extensions {

  /**
   * Installs an unpacked extension from the filesystem similar to --load-extension CLI flags.
   * Returns extension ID once the extension has been installed.
   *
   * @param path Absolute file path.
   */
  @Returns("id")
  String loadUnpacked(@ParamName("path") String path);
}
