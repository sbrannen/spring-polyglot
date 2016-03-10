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

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.AliasFor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextLoader;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 日本語版 {@link ContextConfiguration} アノテーション
 *
 * @author Tadaya Tsuyukubo
 * @since 1.0
 */
@ContextConfiguration
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface コンテキストコンフィグ {

	@AliasFor(annotation = ContextConfiguration.class, attribute = "locations")
	String[] value() default {};

	@AliasFor(annotation = ContextConfiguration.class, attribute = "value")
	String[] リソースロケーション() default {};

	@AliasFor(annotation = ContextConfiguration.class, attribute = "classes")
	Class<?>[] コンフィグクラス() default {};

	@AliasFor(annotation = ContextConfiguration.class, attribute = "initializers")
	Class<? extends ApplicationContextInitializer<? extends ConfigurableApplicationContext>>[] イニシャライザ() default {};

	@AliasFor(annotation = ContextConfiguration.class, attribute = "inheritLocations")
	boolean リソースロケーションを継承する() default true;

	@AliasFor(annotation = ContextConfiguration.class, attribute = "inheritInitializers")
	boolean イニシャライザを継承する() default true;

	@AliasFor(annotation = ContextConfiguration.class, attribute = "loader")
	Class<? extends ContextLoader> コンテキストローダー() default ContextLoader.class;

	@AliasFor(annotation = ContextConfiguration.class, attribute = "name")
	String 名前() default "";


}
