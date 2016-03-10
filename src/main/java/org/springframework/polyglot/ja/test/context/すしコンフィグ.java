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
