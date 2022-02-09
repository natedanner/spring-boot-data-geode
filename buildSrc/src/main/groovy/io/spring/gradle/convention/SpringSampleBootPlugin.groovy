/*
 * Copyright 2022-present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package io.spring.gradle.convention

import org.gradle.api.Project

/**
 * @author Rob Winch
 * @author John Blum
 */
class SpringSampleBootPlugin extends SpringSamplePlugin {

    @Override
    void applyAdditionalPlugins(Project project) {

        super.applyAdditionalPlugins(project);

        project.getPluginManager().apply("org.springframework.boot");

        project.repositories {
            maven { url 'https://repo.spring.io/snapshot' }
            maven { url 'https://repo.spring.io/milestone' }
        }
    }
}