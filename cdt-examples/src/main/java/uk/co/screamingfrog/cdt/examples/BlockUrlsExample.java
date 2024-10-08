package uk.co.screamingfrog.cdt.examples;

/*-
 * #%L
 * cdt-examples
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

import java.util.Arrays;
import uk.co.screamingfrog.cdt.launch.ChromeLauncher;
import uk.co.screamingfrog.cdt.protocol.commands.Network;
import uk.co.screamingfrog.cdt.protocol.commands.Page;
import uk.co.screamingfrog.cdt.services.ChromeDevToolsService;
import uk.co.screamingfrog.cdt.services.ChromeService;
import uk.co.screamingfrog.cdt.services.types.ChromeTab;

/**
 * Blocks specific urls from fetching. In this case png and css.
 *
 * @author Kenan Klisura
 */
public class BlockUrlsExample {
  public static void main(String[] args) {
    // Create chrome launcher.
    final ChromeLauncher launcher = new ChromeLauncher();

    // Launch chrome either as headless (true) or regular (false).
    final ChromeService chromeService = launcher.launch(false);

    // Create empty tab ie about:blank.
    final ChromeTab tab = chromeService.createTab();

    // Get DevTools service to this tab
    final ChromeDevToolsService devToolsService = chromeService.createDevToolsService(tab);

    // Get individual commands
    final Page page = devToolsService.getPage();
    final Network network = devToolsService.getNetwork();

    network.setBlockedURLs(Arrays.asList("*.png", "*.css"));
    page.onLoadEventFired(event -> devToolsService.close());

    network.enable();

    // Enable page events.
    page.enable();

    // Navigate to github.com.
    page.navigate("http://github.com");

    devToolsService.waitUntilClosed();
  }

  public static boolean isBlocked(String url) {
    return url.endsWith(".png") || url.endsWith(".css");
  }
}
