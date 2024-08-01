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
import uk.co.screamingfrog.cdt.protocol.support.annotations.Optional;
import uk.co.screamingfrog.cdt.protocol.support.annotations.ParamName;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Returns;
import uk.co.screamingfrog.cdt.protocol.types.pwa.OsAppState;

/** This domain allows interacting with the browser to control PWAs. */
@Experimental
public interface PWA {

  /**
   * Returns the following OS state for the given manifest id.
   *
   * @param manifestId The id from the webapp's manifest file, commonly it's the url of the site
   *     installing the webapp. See https://web.dev/learn/pwa/web-app-manifest.
   */
  OsAppState getOsAppState(@ParamName("manifestId") String manifestId);

  /**
   * Installs the given manifest identity, optionally using the given install_url or IWA bundle
   * location.
   *
   * <p>TODO(crbug.com/337872319) Support IWA to meet the following specific requirement.
   * IWA-specific install description: If the manifest_id is isolated-app://,
   * install_url_or_bundle_url is required, and can be either an http(s) URL or file:// URL pointing
   * to a signed web bundle (.swbn). The .swbn file's signing key must correspond to manifest_id. If
   * Chrome is not in IWA dev mode, the installation will fail, regardless of the state of the
   * allowlist.
   *
   * @param manifestId
   */
  void install(@ParamName("manifestId") String manifestId);

  /**
   * Installs the given manifest identity, optionally using the given install_url or IWA bundle
   * location.
   *
   * <p>TODO(crbug.com/337872319) Support IWA to meet the following specific requirement.
   * IWA-specific install description: If the manifest_id is isolated-app://,
   * install_url_or_bundle_url is required, and can be either an http(s) URL or file:// URL pointing
   * to a signed web bundle (.swbn). The .swbn file's signing key must correspond to manifest_id. If
   * Chrome is not in IWA dev mode, the installation will fail, regardless of the state of the
   * allowlist.
   *
   * @param manifestId
   * @param installUrlOrBundleUrl The location of the app or bundle overriding the one derived from
   *     the manifestId.
   */
  void install(
      @ParamName("manifestId") String manifestId,
      @Optional @ParamName("installUrlOrBundleUrl") String installUrlOrBundleUrl);

  /**
   * Uninstals the given manifest_id and closes any opened app windows.
   *
   * @param manifestId
   */
  void uninstall(@ParamName("manifestId") String manifestId);

  /**
   * Launches the installed web app, or an url in the same web app instead of the default start url
   * if it is provided. Returns a tab / web contents based Target.TargetID which can be used to
   * attach to via Target.attachToTarget or similar APIs.
   *
   * @param manifestId
   */
  @Returns("targetId")
  String launch(@ParamName("manifestId") String manifestId);

  /**
   * Launches the installed web app, or an url in the same web app instead of the default start url
   * if it is provided. Returns a tab / web contents based Target.TargetID which can be used to
   * attach to via Target.attachToTarget or similar APIs.
   *
   * @param manifestId
   * @param url
   */
  @Returns("targetId")
  String launch(@ParamName("manifestId") String manifestId, @Optional @ParamName("url") String url);
}
