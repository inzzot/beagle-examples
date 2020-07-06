/*
 * Copyright 2020 ZUP IT SERVICOS EM TECNOLOGIA E INOVACAO SA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package br.com.beaglesampleandroid

import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.setup.DesignSystem

// This class is used by the RenderEngine in order to define the styles configured at the application.
// It must extend DesignSystem.
// These are the styles the AppDesignSystem implements: image, textStyle, inputTextStyle, buttonStyle, toolbarStyle and tabViewStyle

@BeagleComponent
class AppDesignSystem: DesignSystem() {
    override fun textStyle(id: String): Int? {
        return when (id) {
            "Title.Text.Orange" -> R.style.Title_Text_Orange
            "Description.Text.Orange" -> R.style.Description_Text_Orange
            else -> R.style.Design_System_Text_Default
        }
    }
}