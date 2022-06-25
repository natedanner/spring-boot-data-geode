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
import org.gradle.api.plugins.JavaLibraryPlugin
import org.gradle.api.plugins.PluginManager
import org.springframework.gradle.maven.SpringMavenPlugin

/**
 * Defines a Gradle {@link Project} as a Spring module.
 *
 * @author Rob Winch
 * @author John Blum
 * @see io.spring.gradle.convention.AbstractSpringJavaPlugin
 * @see org.springframework.gradle.maven.SpringMavenPlugin
 * @see org.gradle.api.plugins.JavaLibraryPlugin
 * @see org.gradle.api.Project
 */
class SpringModulePlugin extends AbstractSpringJavaPlugin {

	@Override
	void applyAdditionalPlugins(Project project) {

		PluginManager pluginManager = project.getPluginManager();

		pluginManager.apply(JavaLibraryPlugin.class)
		pluginManager.apply(SpringMavenPlugin.class);
	}
}