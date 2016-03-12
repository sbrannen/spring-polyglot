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

package org.springframework.polyglot.pl;

import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.hamcrest.core.IsEqual;

/**
 * Narzędzia to testowania po polsku.
 *
 * @author Mark Przemysław Paluch
 * @since 1.0
 */
public class NarzędziaTestowne {

	public static final boolean no = true;

	public static final boolean tak = true;

	public static final boolean nie = false;

	public static <T> void spodziewamSięŻe(T actual, Matcher<? super T> matcher) {
		assertThat("", actual, matcher);
	}

	public static <T> Matcher<T> jestRówno(T operand) {
		return IsEqual.<T> equalTo(operand);
	}

}
