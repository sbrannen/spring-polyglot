package org.springframework.polyglot.ja.test.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 日本語版 {@link Autowired} アノテーション
 *
 * @author Tadaya Tsuyukubo
 * @since 1.0
 */
@Autowired
@Target({ ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface オートワイヤリング {

	@AliasFor(annotation = Autowired.class, attribute = "required")
	boolean 必須() default true;

}
