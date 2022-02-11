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

package org.springframework.polyglot.pl.context.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.AliasFor;

/**
 * Polska wersia dla {@link Bean @Bean}.
 *
 * @author Mark Przemysław Paluch
 * @since 1.0
 */
@Bean
@Target({ ElementType.METHOD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Ziarno {

	@AliasFor(annotation = Bean.class, attribute = "name")
	String[] nazwa() default {};

	@AliasFor(annotation = Bean.class, attribute = "autowire")
	Autowire automatycznieZakablowane() default Autowire.NO;

	@AliasFor(annotation = Bean.class, attribute = "initMethod")
	String metodaInicjująca() default "";

	@AliasFor(annotation = Bean.class, attribute = "destroyMethod")
	String metodaNiszcząca() default AbstractBeanDefinition.INFER_METHOD;

}
