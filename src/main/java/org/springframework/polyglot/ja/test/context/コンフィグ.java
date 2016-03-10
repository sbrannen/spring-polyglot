package org.springframework.polyglot.ja.test.context;

import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 日本語版 {@link Configuration} アノテーション
 *
 * @author Tadaya Tsuyukubo
 * @since 1.0
 */
@Configuration
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface コンフィグ {
}
