/*
 * Copyright 2021 The Android Open Source Project
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
package com.example.androiddevchallenge

class Data {

    companion object {
        var curr: PuppyModel? = null
    }

    fun populateData(): ArrayList<PuppyModel> {
        val puppies = arrayListOf<PuppyModel>()
        puppies.add(PuppyModel("Raj", "Brown Dog", "Brown", 4))
        puppies.add(PuppyModel("Amit", "Black Dog", "Black", 2))
        puppies.add(PuppyModel("Luke", "Lucky Dog", "Grey", 5))
        puppies.add(PuppyModel("Fluke", "Black Dog", "Black", 2))
        puppies.add(PuppyModel("Milky", "Grey Dog", "Grey", 2))
        puppies.add(PuppyModel("Snowy", "White Dog", "White", 6))

        return puppies
    }
}
