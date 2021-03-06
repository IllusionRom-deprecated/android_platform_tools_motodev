/*
* Copyright (C) 2012 The Android Open Source Project
*
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
*/
package com.motorola.studio.android.emulator.core.model;

/**
 * DESCRIPTION:
 * Defines the method that every Android Emulator view should have
 * for self-updating
 *
 * RESPONSIBILITY:
 * Define the method that allows the Android Emulator views to self
 * update
 *
 * COLABORATORS:
 * None. 
 *
 * USAGE:
 * Call the interface method for view refreshing.
 */
public interface IEmulatorView
{
    void refreshView();
}
