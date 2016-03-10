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
