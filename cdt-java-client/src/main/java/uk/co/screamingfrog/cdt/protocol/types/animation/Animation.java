package uk.co.screamingfrog.cdt.protocol.types.animation;

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

/** Animation instance. */
public class Animation {

  private String id;

  private String name;

  private Boolean pausedState;

  private String playState;

  private Double playbackRate;

  private Double startTime;

  private Double currentTime;

  private AnimationType type;

  @Optional private AnimationEffect source;

  @Optional private String cssId;

  @Optional private ViewOrScrollTimeline viewOrScrollTimeline;

  /** `Animation`'s id. */
  public String getId() {
    return id;
  }

  /** `Animation`'s id. */
  public void setId(String id) {
    this.id = id;
  }

  /** `Animation`'s name. */
  public String getName() {
    return name;
  }

  /** `Animation`'s name. */
  public void setName(String name) {
    this.name = name;
  }

  /** `Animation`'s internal paused state. */
  public Boolean getPausedState() {
    return pausedState;
  }

  /** `Animation`'s internal paused state. */
  public void setPausedState(Boolean pausedState) {
    this.pausedState = pausedState;
  }

  /** `Animation`'s play state. */
  public String getPlayState() {
    return playState;
  }

  /** `Animation`'s play state. */
  public void setPlayState(String playState) {
    this.playState = playState;
  }

  /** `Animation`'s playback rate. */
  public Double getPlaybackRate() {
    return playbackRate;
  }

  /** `Animation`'s playback rate. */
  public void setPlaybackRate(Double playbackRate) {
    this.playbackRate = playbackRate;
  }

  /**
   * `Animation`'s start time. Milliseconds for time based animations and percentage [0 - 100] for
   * scroll driven animations (i.e. when viewOrScrollTimeline exists).
   */
  public Double getStartTime() {
    return startTime;
  }

  /**
   * `Animation`'s start time. Milliseconds for time based animations and percentage [0 - 100] for
   * scroll driven animations (i.e. when viewOrScrollTimeline exists).
   */
  public void setStartTime(Double startTime) {
    this.startTime = startTime;
  }

  /** `Animation`'s current time. */
  public Double getCurrentTime() {
    return currentTime;
  }

  /** `Animation`'s current time. */
  public void setCurrentTime(Double currentTime) {
    this.currentTime = currentTime;
  }

  /** Animation type of `Animation`. */
  public AnimationType getType() {
    return type;
  }

  /** Animation type of `Animation`. */
  public void setType(AnimationType type) {
    this.type = type;
  }

  /** `Animation`'s source animation node. */
  public AnimationEffect getSource() {
    return source;
  }

  /** `Animation`'s source animation node. */
  public void setSource(AnimationEffect source) {
    this.source = source;
  }

  /**
   * A unique ID for `Animation` representing the sources that triggered this CSS
   * animation/transition.
   */
  public String getCssId() {
    return cssId;
  }

  /**
   * A unique ID for `Animation` representing the sources that triggered this CSS
   * animation/transition.
   */
  public void setCssId(String cssId) {
    this.cssId = cssId;
  }

  /** View or scroll timeline */
  public ViewOrScrollTimeline getViewOrScrollTimeline() {
    return viewOrScrollTimeline;
  }

  /** View or scroll timeline */
  public void setViewOrScrollTimeline(ViewOrScrollTimeline viewOrScrollTimeline) {
    this.viewOrScrollTimeline = viewOrScrollTimeline;
  }
}
