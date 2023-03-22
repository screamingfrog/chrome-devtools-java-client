package uk.co.screamingfrog.cdt.protocol.commands;

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
import uk.co.screamingfrog.cdt.protocol.events.input.DragIntercepted;
import uk.co.screamingfrog.cdt.protocol.support.annotations.EventName;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Experimental;
import uk.co.screamingfrog.cdt.protocol.support.annotations.Optional;
import uk.co.screamingfrog.cdt.protocol.support.annotations.ParamName;
import uk.co.screamingfrog.cdt.protocol.support.types.EventHandler;
import uk.co.screamingfrog.cdt.protocol.support.types.EventListener;
import uk.co.screamingfrog.cdt.protocol.types.input.DispatchDragEventType;
import uk.co.screamingfrog.cdt.protocol.types.input.DispatchKeyEventType;
import uk.co.screamingfrog.cdt.protocol.types.input.DispatchMouseEventPointerType;
import uk.co.screamingfrog.cdt.protocol.types.input.DispatchMouseEventType;
import uk.co.screamingfrog.cdt.protocol.types.input.DispatchTouchEventType;
import uk.co.screamingfrog.cdt.protocol.types.input.DragData;
import uk.co.screamingfrog.cdt.protocol.types.input.EmulateTouchFromMouseEventType;
import uk.co.screamingfrog.cdt.protocol.types.input.GestureSourceType;
import uk.co.screamingfrog.cdt.protocol.types.input.MouseButton;
import uk.co.screamingfrog.cdt.protocol.types.input.TouchPoint;

public interface Input {

  /**
   * Dispatches a drag event into the page.
   *
   * @param type Type of the drag event.
   * @param x X coordinate of the event relative to the main frame's viewport in CSS pixels.
   * @param y Y coordinate of the event relative to the main frame's viewport in CSS pixels. 0
   *     refers to the top of the viewport and Y increases as it proceeds towards the bottom of the
   *     viewport.
   * @param data
   */
  @Experimental
  void dispatchDragEvent(
      @ParamName("type") DispatchDragEventType type,
      @ParamName("x") Double x,
      @ParamName("y") Double y,
      @ParamName("data") DragData data);

  /**
   * Dispatches a drag event into the page.
   *
   * @param type Type of the drag event.
   * @param x X coordinate of the event relative to the main frame's viewport in CSS pixels.
   * @param y Y coordinate of the event relative to the main frame's viewport in CSS pixels. 0
   *     refers to the top of the viewport and Y increases as it proceeds towards the bottom of the
   *     viewport.
   * @param data
   * @param modifiers Bit field representing pressed modifier keys. Alt=1, Ctrl=2, Meta/Command=4,
   *     Shift=8 (default: 0).
   */
  @Experimental
  void dispatchDragEvent(
      @ParamName("type") DispatchDragEventType type,
      @ParamName("x") Double x,
      @ParamName("y") Double y,
      @ParamName("data") DragData data,
      @Optional @ParamName("modifiers") Integer modifiers);

  /**
   * Dispatches a key event to the page.
   *
   * @param type Type of the key event.
   */
  void dispatchKeyEvent(@ParamName("type") DispatchKeyEventType type);

  /**
   * Dispatches a key event to the page.
   *
   * @param type Type of the key event.
   * @param modifiers Bit field representing pressed modifier keys. Alt=1, Ctrl=2, Meta/Command=4,
   *     Shift=8 (default: 0).
   * @param timestamp Time at which the event occurred.
   * @param text Text as generated by processing a virtual key code with a keyboard layout. Not
   *     needed for for `keyUp` and `rawKeyDown` events (default: "")
   * @param unmodifiedText Text that would have been generated by the keyboard if no modifiers were
   *     pressed (except for shift). Useful for shortcut (accelerator) key handling (default: "").
   * @param keyIdentifier Unique key identifier (e.g., 'U+0041') (default: "").
   * @param code Unique DOM defined string value for each physical key (e.g., 'KeyA') (default: "").
   * @param key Unique DOM defined string value describing the meaning of the key in the context of
   *     active modifiers, keyboard layout, etc (e.g., 'AltGr') (default: "").
   * @param windowsVirtualKeyCode Windows virtual key code (default: 0).
   * @param nativeVirtualKeyCode Native virtual key code (default: 0).
   * @param autoRepeat Whether the event was generated from auto repeat (default: false).
   * @param isKeypad Whether the event was generated from the keypad (default: false).
   * @param isSystemKey Whether the event was a system key event (default: false).
   * @param location Whether the event was from the left or right side of the keyboard. 1=Left,
   *     2=Right (default: 0).
   * @param commands Editing commands to send with the key event (e.g., 'selectAll') (default: []).
   *     These are related to but not equal the command names used in `document.execCommand` and
   *     NSStandardKeyBindingResponding. See
   *     https://source.chromium.org/chromium/chromium/src/+/main:third_party/blink/renderer/core/editing/commands/editor_command_names.h
   *     for valid command names.
   */
  void dispatchKeyEvent(
      @ParamName("type") DispatchKeyEventType type,
      @Optional @ParamName("modifiers") Integer modifiers,
      @Optional @ParamName("timestamp") Double timestamp,
      @Optional @ParamName("text") String text,
      @Optional @ParamName("unmodifiedText") String unmodifiedText,
      @Optional @ParamName("keyIdentifier") String keyIdentifier,
      @Optional @ParamName("code") String code,
      @Optional @ParamName("key") String key,
      @Optional @ParamName("windowsVirtualKeyCode") Integer windowsVirtualKeyCode,
      @Optional @ParamName("nativeVirtualKeyCode") Integer nativeVirtualKeyCode,
      @Optional @ParamName("autoRepeat") Boolean autoRepeat,
      @Optional @ParamName("isKeypad") Boolean isKeypad,
      @Optional @ParamName("isSystemKey") Boolean isSystemKey,
      @Optional @ParamName("location") Integer location,
      @Experimental @Optional @ParamName("commands") List<String> commands);

  /**
   * This method emulates inserting text that doesn't come from a key press, for example an emoji
   * keyboard or an IME.
   *
   * @param text The text to insert.
   */
  @Experimental
  void insertText(@ParamName("text") String text);

  /**
   * This method sets the current candidate text for ime. Use imeCommitComposition to commit the
   * final text. Use imeSetComposition with empty string as text to cancel composition.
   *
   * @param text The text to insert
   * @param selectionStart selection start
   * @param selectionEnd selection end
   */
  @Experimental
  void imeSetComposition(
      @ParamName("text") String text,
      @ParamName("selectionStart") Integer selectionStart,
      @ParamName("selectionEnd") Integer selectionEnd);

  /**
   * This method sets the current candidate text for ime. Use imeCommitComposition to commit the
   * final text. Use imeSetComposition with empty string as text to cancel composition.
   *
   * @param text The text to insert
   * @param selectionStart selection start
   * @param selectionEnd selection end
   * @param replacementStart replacement start
   * @param replacementEnd replacement end
   */
  @Experimental
  void imeSetComposition(
      @ParamName("text") String text,
      @ParamName("selectionStart") Integer selectionStart,
      @ParamName("selectionEnd") Integer selectionEnd,
      @Optional @ParamName("replacementStart") Integer replacementStart,
      @Optional @ParamName("replacementEnd") Integer replacementEnd);

  /**
   * Dispatches a mouse event to the page.
   *
   * @param type Type of the mouse event.
   * @param x X coordinate of the event relative to the main frame's viewport in CSS pixels.
   * @param y Y coordinate of the event relative to the main frame's viewport in CSS pixels. 0
   *     refers to the top of the viewport and Y increases as it proceeds towards the bottom of the
   *     viewport.
   */
  void dispatchMouseEvent(
      @ParamName("type") DispatchMouseEventType type,
      @ParamName("x") Double x,
      @ParamName("y") Double y);

  /**
   * Dispatches a mouse event to the page.
   *
   * @param type Type of the mouse event.
   * @param x X coordinate of the event relative to the main frame's viewport in CSS pixels.
   * @param y Y coordinate of the event relative to the main frame's viewport in CSS pixels. 0
   *     refers to the top of the viewport and Y increases as it proceeds towards the bottom of the
   *     viewport.
   * @param modifiers Bit field representing pressed modifier keys. Alt=1, Ctrl=2, Meta/Command=4,
   *     Shift=8 (default: 0).
   * @param timestamp Time at which the event occurred.
   * @param button Mouse button (default: "none").
   * @param buttons A number indicating which buttons are pressed on the mouse when a mouse event is
   *     triggered. Left=1, Right=2, Middle=4, Back=8, Forward=16, None=0.
   * @param clickCount Number of times the mouse button was clicked (default: 0).
   * @param force The normalized pressure, which has a range of [0,1] (default: 0).
   * @param tangentialPressure The normalized tangential pressure, which has a range of [-1,1]
   *     (default: 0).
   * @param tiltX The plane angle between the Y-Z plane and the plane containing both the stylus
   *     axis and the Y axis, in degrees of the range [-90,90], a positive tiltX is to the right
   *     (default: 0).
   * @param tiltY The plane angle between the X-Z plane and the plane containing both the stylus
   *     axis and the X axis, in degrees of the range [-90,90], a positive tiltY is towards the user
   *     (default: 0).
   * @param twist The clockwise rotation of a pen stylus around its own major axis, in degrees in
   *     the range [0,359] (default: 0).
   * @param deltaX X delta in CSS pixels for mouse wheel event (default: 0).
   * @param deltaY Y delta in CSS pixels for mouse wheel event (default: 0).
   * @param pointerType Pointer type (default: "mouse").
   */
  void dispatchMouseEvent(
      @ParamName("type") DispatchMouseEventType type,
      @ParamName("x") Double x,
      @ParamName("y") Double y,
      @Optional @ParamName("modifiers") Integer modifiers,
      @Optional @ParamName("timestamp") Double timestamp,
      @Optional @ParamName("button") MouseButton button,
      @Optional @ParamName("buttons") Integer buttons,
      @Optional @ParamName("clickCount") Integer clickCount,
      @Experimental @Optional @ParamName("force") Double force,
      @Experimental @Optional @ParamName("tangentialPressure") Double tangentialPressure,
      @Experimental @Optional @ParamName("tiltX") Integer tiltX,
      @Experimental @Optional @ParamName("tiltY") Integer tiltY,
      @Experimental @Optional @ParamName("twist") Integer twist,
      @Optional @ParamName("deltaX") Double deltaX,
      @Optional @ParamName("deltaY") Double deltaY,
      @Optional @ParamName("pointerType") DispatchMouseEventPointerType pointerType);

  /**
   * Dispatches a touch event to the page.
   *
   * @param type Type of the touch event. TouchEnd and TouchCancel must not contain any touch
   *     points, while TouchStart and TouchMove must contains at least one.
   * @param touchPoints Active touch points on the touch device. One event per any changed point
   *     (compared to previous touch event in a sequence) is generated, emulating
   *     pressing/moving/releasing points one by one.
   */
  void dispatchTouchEvent(
      @ParamName("type") DispatchTouchEventType type,
      @ParamName("touchPoints") List<TouchPoint> touchPoints);

  /**
   * Dispatches a touch event to the page.
   *
   * @param type Type of the touch event. TouchEnd and TouchCancel must not contain any touch
   *     points, while TouchStart and TouchMove must contains at least one.
   * @param touchPoints Active touch points on the touch device. One event per any changed point
   *     (compared to previous touch event in a sequence) is generated, emulating
   *     pressing/moving/releasing points one by one.
   * @param modifiers Bit field representing pressed modifier keys. Alt=1, Ctrl=2, Meta/Command=4,
   *     Shift=8 (default: 0).
   * @param timestamp Time at which the event occurred.
   */
  void dispatchTouchEvent(
      @ParamName("type") DispatchTouchEventType type,
      @ParamName("touchPoints") List<TouchPoint> touchPoints,
      @Optional @ParamName("modifiers") Integer modifiers,
      @Optional @ParamName("timestamp") Double timestamp);

  /**
   * Emulates touch event from the mouse event parameters.
   *
   * @param type Type of the mouse event.
   * @param x X coordinate of the mouse pointer in DIP.
   * @param y Y coordinate of the mouse pointer in DIP.
   * @param button Mouse button. Only "none", "left", "right" are supported.
   */
  @Experimental
  void emulateTouchFromMouseEvent(
      @ParamName("type") EmulateTouchFromMouseEventType type,
      @ParamName("x") Integer x,
      @ParamName("y") Integer y,
      @ParamName("button") MouseButton button);

  /**
   * Emulates touch event from the mouse event parameters.
   *
   * @param type Type of the mouse event.
   * @param x X coordinate of the mouse pointer in DIP.
   * @param y Y coordinate of the mouse pointer in DIP.
   * @param button Mouse button. Only "none", "left", "right" are supported.
   * @param timestamp Time at which the event occurred (default: current time).
   * @param deltaX X delta in DIP for mouse wheel event (default: 0).
   * @param deltaY Y delta in DIP for mouse wheel event (default: 0).
   * @param modifiers Bit field representing pressed modifier keys. Alt=1, Ctrl=2, Meta/Command=4,
   *     Shift=8 (default: 0).
   * @param clickCount Number of times the mouse button was clicked (default: 0).
   */
  @Experimental
  void emulateTouchFromMouseEvent(
      @ParamName("type") EmulateTouchFromMouseEventType type,
      @ParamName("x") Integer x,
      @ParamName("y") Integer y,
      @ParamName("button") MouseButton button,
      @Optional @ParamName("timestamp") Double timestamp,
      @Optional @ParamName("deltaX") Double deltaX,
      @Optional @ParamName("deltaY") Double deltaY,
      @Optional @ParamName("modifiers") Integer modifiers,
      @Optional @ParamName("clickCount") Integer clickCount);

  /**
   * Ignores input events (useful while auditing page).
   *
   * @param ignore Ignores input events processing when set to true.
   */
  void setIgnoreInputEvents(@ParamName("ignore") Boolean ignore);

  /**
   * Prevents default drag and drop behavior and instead emits `Input.dragIntercepted` events. Drag
   * and drop behavior can be directly controlled via `Input.dispatchDragEvent`.
   *
   * @param enabled
   */
  @Experimental
  void setInterceptDrags(@ParamName("enabled") Boolean enabled);

  /**
   * Synthesizes a pinch gesture over a time period by issuing appropriate touch events.
   *
   * @param x X coordinate of the start of the gesture in CSS pixels.
   * @param y Y coordinate of the start of the gesture in CSS pixels.
   * @param scaleFactor Relative scale factor after zooming (>1.0 zooms in, <1.0 zooms out).
   */
  @Experimental
  void synthesizePinchGesture(
      @ParamName("x") Double x,
      @ParamName("y") Double y,
      @ParamName("scaleFactor") Double scaleFactor);

  /**
   * Synthesizes a pinch gesture over a time period by issuing appropriate touch events.
   *
   * @param x X coordinate of the start of the gesture in CSS pixels.
   * @param y Y coordinate of the start of the gesture in CSS pixels.
   * @param scaleFactor Relative scale factor after zooming (>1.0 zooms in, <1.0 zooms out).
   * @param relativeSpeed Relative pointer speed in pixels per second (default: 800).
   * @param gestureSourceType Which type of input events to be generated (default: 'default', which
   *     queries the platform for the preferred input type).
   */
  @Experimental
  void synthesizePinchGesture(
      @ParamName("x") Double x,
      @ParamName("y") Double y,
      @ParamName("scaleFactor") Double scaleFactor,
      @Optional @ParamName("relativeSpeed") Integer relativeSpeed,
      @Optional @ParamName("gestureSourceType") GestureSourceType gestureSourceType);

  /**
   * Synthesizes a scroll gesture over a time period by issuing appropriate touch events.
   *
   * @param x X coordinate of the start of the gesture in CSS pixels.
   * @param y Y coordinate of the start of the gesture in CSS pixels.
   */
  @Experimental
  void synthesizeScrollGesture(@ParamName("x") Double x, @ParamName("y") Double y);

  /**
   * Synthesizes a scroll gesture over a time period by issuing appropriate touch events.
   *
   * @param x X coordinate of the start of the gesture in CSS pixels.
   * @param y Y coordinate of the start of the gesture in CSS pixels.
   * @param xDistance The distance to scroll along the X axis (positive to scroll left).
   * @param yDistance The distance to scroll along the Y axis (positive to scroll up).
   * @param xOverscroll The number of additional pixels to scroll back along the X axis, in addition
   *     to the given distance.
   * @param yOverscroll The number of additional pixels to scroll back along the Y axis, in addition
   *     to the given distance.
   * @param preventFling Prevent fling (default: true).
   * @param speed Swipe speed in pixels per second (default: 800).
   * @param gestureSourceType Which type of input events to be generated (default: 'default', which
   *     queries the platform for the preferred input type).
   * @param repeatCount The number of times to repeat the gesture (default: 0).
   * @param repeatDelayMs The number of milliseconds delay between each repeat. (default: 250).
   * @param interactionMarkerName The name of the interaction markers to generate, if not empty
   *     (default: "").
   */
  @Experimental
  void synthesizeScrollGesture(
      @ParamName("x") Double x,
      @ParamName("y") Double y,
      @Optional @ParamName("xDistance") Double xDistance,
      @Optional @ParamName("yDistance") Double yDistance,
      @Optional @ParamName("xOverscroll") Double xOverscroll,
      @Optional @ParamName("yOverscroll") Double yOverscroll,
      @Optional @ParamName("preventFling") Boolean preventFling,
      @Optional @ParamName("speed") Integer speed,
      @Optional @ParamName("gestureSourceType") GestureSourceType gestureSourceType,
      @Optional @ParamName("repeatCount") Integer repeatCount,
      @Optional @ParamName("repeatDelayMs") Integer repeatDelayMs,
      @Optional @ParamName("interactionMarkerName") String interactionMarkerName);

  /**
   * Synthesizes a tap gesture over a time period by issuing appropriate touch events.
   *
   * @param x X coordinate of the start of the gesture in CSS pixels.
   * @param y Y coordinate of the start of the gesture in CSS pixels.
   */
  @Experimental
  void synthesizeTapGesture(@ParamName("x") Double x, @ParamName("y") Double y);

  /**
   * Synthesizes a tap gesture over a time period by issuing appropriate touch events.
   *
   * @param x X coordinate of the start of the gesture in CSS pixels.
   * @param y Y coordinate of the start of the gesture in CSS pixels.
   * @param duration Duration between touchdown and touchup events in ms (default: 50).
   * @param tapCount Number of times to perform the tap (e.g. 2 for double tap, default: 1).
   * @param gestureSourceType Which type of input events to be generated (default: 'default', which
   *     queries the platform for the preferred input type).
   */
  @Experimental
  void synthesizeTapGesture(
      @ParamName("x") Double x,
      @ParamName("y") Double y,
      @Optional @ParamName("duration") Integer duration,
      @Optional @ParamName("tapCount") Integer tapCount,
      @Optional @ParamName("gestureSourceType") GestureSourceType gestureSourceType);

  /**
   * Emitted only when `Input.setInterceptDrags` is enabled. Use this data with
   * `Input.dispatchDragEvent` to restore normal drag and drop behavior.
   */
  @EventName("dragIntercepted")
  @Experimental
  EventListener onDragIntercepted(EventHandler<DragIntercepted> eventListener);
}
