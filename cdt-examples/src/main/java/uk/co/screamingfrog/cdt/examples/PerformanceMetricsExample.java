package uk.co.screamingfrog.cdt.examples;

/*-
 * #%L
 * cdt-examples
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
import uk.co.screamingfrog.cdt.launch.ChromeLauncher;
import uk.co.screamingfrog.cdt.protocol.commands.Network;
import uk.co.screamingfrog.cdt.protocol.commands.Page;
import uk.co.screamingfrog.cdt.protocol.commands.Performance;
import uk.co.screamingfrog.cdt.protocol.types.performance.Metric;
import uk.co.screamingfrog.cdt.services.ChromeDevToolsService;
import uk.co.screamingfrog.cdt.services.ChromeService;
import uk.co.screamingfrog.cdt.services.types.ChromeTab;

/**
 * Metric example
 *
 * @author Kenan Klisura
 */
public class PerformanceMetricsExample {
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
    final Performance performance = devToolsService.getPerformance();

    performance.enable();
    network.onLoadingFinished(
        event -> {
          // Close the tab and close the browser when loading finishes.
          List<Metric> metrics = performance.getMetrics();
          try {
            for (Metric metric : metrics) {
              System.out.println(metric.getName() + ": " + metric.getValue());
            }
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
          chromeService.closeTab(tab);
          launcher.close();
        });

    // Enable network events.
    network.enable();

    // Navigate to github.com.
    page.navigate("https://www.github.com");

    devToolsService.waitUntilClosed();
  }
}
