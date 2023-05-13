/*
 * Copyright 2017-present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package example.app.crm.config.testcontainers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Unit Tests for {@link VmwHarborProxyImageNameSubstitutor}.
 *
 * @author John Blum
 * @see org.junit.Test
 * @see example.app.crm.config.testcontainers.VmwHarborProxyImageNameSubstitutor
 * @since 1.7.6
 */
public class VmwHarborProxyImageNameSubstitutorUnitTests {

	@Test
	public void toUnqualifiedDockerImageNameFromQualifiedName() {

		VmwHarborProxyImageNameSubstitutor imageNameSubstitutor = new VmwHarborProxyImageNameSubstitutor();

		String qualifiedDockerImageName = String.format(VmwHarborProxyImageNameSubstitutor
			.TESTCONTAINERS_HUB_IMAGE_NAME_TEMPLATE, "testcontainers/ryuk:0.4.0");

		assertThat(imageNameSubstitutor.toUnqualifiedDockerImageName(qualifiedDockerImageName))
			.isEqualTo("testcontainers/ryuk:0.4.0");
	}

	@Test
	public void toUnqualifiedDockerImageNameFromUnqualifiedName() {

		VmwHarborProxyImageNameSubstitutor imageNameSubstitutor = new VmwHarborProxyImageNameSubstitutor();

		assertThat(imageNameSubstitutor.toUnqualifiedDockerImageName("testcontainers/ryuk:0.4.0"))
			.isEqualTo("testcontainers/ryuk:0.4.0");
	}
}
