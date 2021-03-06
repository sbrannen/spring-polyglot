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

package org.springframework.polyglot.de;

import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.hamcrest.core.IsEqual;

/**
 * Werkzeuge für deutsche Integrations-Tests.
 *
 * @author Sam Brannen
 * @since 1.0
 */
public final class TestWerkzeuge {

	public static final boolean jawohl = true;

	public static final boolean wahr = true;

	public static final boolean falsch = false;


	public static <T> void esWirdErwartetDass(T actual, Matcher<? super T> matcher) {
		assertThat("", actual, matcher);
	}

	public static <T> Matcher<T> istGleich(T operand) {
		return IsEqual.<T> equalTo(operand);
	}

}
