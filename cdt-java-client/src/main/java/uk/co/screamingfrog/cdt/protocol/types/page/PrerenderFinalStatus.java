package uk.co.screamingfrog.cdt.protocol.types.page;

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

import com.fasterxml.jackson.annotation.JsonProperty;

/** List of FinalStatus reasons for Prerender2. */
public enum PrerenderFinalStatus {
  @JsonProperty("Activated")
  ACTIVATED,
  @JsonProperty("Destroyed")
  DESTROYED,
  @JsonProperty("LowEndDevice")
  LOW_END_DEVICE,
  @JsonProperty("CrossOriginRedirect")
  CROSS_ORIGIN_REDIRECT,
  @JsonProperty("CrossOriginNavigation")
  CROSS_ORIGIN_NAVIGATION,
  @JsonProperty("InvalidSchemeRedirect")
  INVALID_SCHEME_REDIRECT,
  @JsonProperty("InvalidSchemeNavigation")
  INVALID_SCHEME_NAVIGATION,
  @JsonProperty("InProgressNavigation")
  IN_PROGRESS_NAVIGATION,
  @JsonProperty("NavigationRequestBlockedByCsp")
  NAVIGATION_REQUEST_BLOCKED_BY_CSP,
  @JsonProperty("MainFrameNavigation")
  MAIN_FRAME_NAVIGATION,
  @JsonProperty("MojoBinderPolicy")
  MOJO_BINDER_POLICY,
  @JsonProperty("RendererProcessCrashed")
  RENDERER_PROCESS_CRASHED,
  @JsonProperty("RendererProcessKilled")
  RENDERER_PROCESS_KILLED,
  @JsonProperty("Download")
  DOWNLOAD,
  @JsonProperty("TriggerDestroyed")
  TRIGGER_DESTROYED,
  @JsonProperty("NavigationNotCommitted")
  NAVIGATION_NOT_COMMITTED,
  @JsonProperty("NavigationBadHttpStatus")
  NAVIGATION_BAD_HTTP_STATUS,
  @JsonProperty("ClientCertRequested")
  CLIENT_CERT_REQUESTED,
  @JsonProperty("NavigationRequestNetworkError")
  NAVIGATION_REQUEST_NETWORK_ERROR,
  @JsonProperty("MaxNumOfRunningPrerendersExceeded")
  MAX_NUM_OF_RUNNING_PRERENDERS_EXCEEDED,
  @JsonProperty("CancelAllHostsForTesting")
  CANCEL_ALL_HOSTS_FOR_TESTING,
  @JsonProperty("DidFailLoad")
  DID_FAIL_LOAD,
  @JsonProperty("Stop")
  STOP,
  @JsonProperty("SslCertificateError")
  SSL_CERTIFICATE_ERROR,
  @JsonProperty("LoginAuthRequested")
  LOGIN_AUTH_REQUESTED,
  @JsonProperty("UaChangeRequiresReload")
  UA_CHANGE_REQUIRES_RELOAD,
  @JsonProperty("BlockedByClient")
  BLOCKED_BY_CLIENT,
  @JsonProperty("AudioOutputDeviceRequested")
  AUDIO_OUTPUT_DEVICE_REQUESTED,
  @JsonProperty("MixedContent")
  MIXED_CONTENT,
  @JsonProperty("TriggerBackgrounded")
  TRIGGER_BACKGROUNDED,
  @JsonProperty("EmbedderTriggeredAndSameOriginRedirected")
  EMBEDDER_TRIGGERED_AND_SAME_ORIGIN_REDIRECTED,
  @JsonProperty("EmbedderTriggeredAndCrossOriginRedirected")
  EMBEDDER_TRIGGERED_AND_CROSS_ORIGIN_REDIRECTED,
  @JsonProperty("MemoryLimitExceeded")
  MEMORY_LIMIT_EXCEEDED,
  @JsonProperty("FailToGetMemoryUsage")
  FAIL_TO_GET_MEMORY_USAGE,
  @JsonProperty("DataSaverEnabled")
  DATA_SAVER_ENABLED,
  @JsonProperty("HasEffectiveUrl")
  HAS_EFFECTIVE_URL
}
