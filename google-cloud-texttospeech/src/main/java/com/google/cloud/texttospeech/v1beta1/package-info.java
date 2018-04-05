/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A client to Cloud Text-to-Speech API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>================== TextToSpeechClient ==================
 *
 * <p>Service Description: Service that implements Google Cloud Text-to-Speech API.
 *
 * <p>Sample for TextToSpeechClient:
 *
 * <pre>
 * <code>
 * try (TextToSpeechClient textToSpeechClient = TextToSpeechClient.create()) {
 *   String languageCode = "";
 *   ListVoicesResponse response = textToSpeechClient.listVoices(languageCode);
 * }
 * </code>
 * </pre>
 */
package com.google.cloud.texttospeech.v1beta1;
