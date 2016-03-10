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

package org.springframework.polyglot.ja.test.context;

import org.springframework.core.annotation.AliasFor;
import org.springframework.test.context.ContextConfiguration;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 寿司好きのための{@link ContextConfiguration @ContextConfiguration}.
 *
 * @author Tadaya Tsuyukubo
 * @since 1.0
 */
@ContextConfiguration
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface すしコンフィグ {

	@AliasFor(annotation = ContextConfiguration.class, attribute = "classes")
	Class<?>[] 新鮮なネタ() default {};

	@AliasFor(annotation = ContextConfiguration.class, attribute = "locations")
	String[] 古いネタ() default {};

	@AliasFor(annotation = ContextConfiguration.class, attribute = "inheritInitializers")
	boolean さび抜き() default true;

	@AliasFor(annotation = ContextConfiguration.class, attribute = "inheritLocations")
	boolean おまかせ() default true;

	@AliasFor(annotation = ContextConfiguration.class, attribute = "name")
	String 今日のオススメ() default "";

}
