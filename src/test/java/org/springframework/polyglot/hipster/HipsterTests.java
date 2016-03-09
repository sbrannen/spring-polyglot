/*
 * Copyright 2002-2016 the original author or authors.
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

package org.springframework.polyglot.hipster;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.polyglot.hipster.HipsterTests.Konfig;
import org.springframework.polyglot.hipster.test.context.Konfigz;
import org.springframework.polyglot.hipster.test.context.junit4.SpringFoo;

/**
 * Hipster integration tests.
 *
 * @author Sam Brannen
 * @since 1.0
 */
@RunWith(SpringFoo.class)
@Konfigz(klassez = Konfig.class, listenToYoParents = false, whoDat = "Not I said the fly")
public class HipsterTests {

	@Autowired
	String message;


	@Test
	public void checkItOut() {
		assertEquals("Keepin' it real!", message);
	}


	@Configuration
	static class Konfig {

		@Bean
		String message() {
			return "Keepin' it real!";
		}
	}

}
