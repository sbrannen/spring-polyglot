package org.springframework.polyglot.ja.test.context;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 日本語版 {@link Bean} アノテーション
 *
 * @author Tadaya Tsuyukubo
 * @since 1.0
 */
@Bean
@Target({ ElementType.METHOD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface ビーン {

	@AliasFor(annotation = Bean.class, attribute = "name")
	String[] 名前() default {};

	@AliasFor(annotation = Bean.class, attribute = "autowire")
	Autowire オートワイヤリング() default Autowire.NO;

	@AliasFor(annotation = Bean.class, attribute = "initMethod")
	String 初期化メソッド() default "";

	@AliasFor(annotation = Bean.class, attribute = "destroyMethod")
	String 終了処理メソッド() default AbstractBeanDefinition.INFER_METHOD;

}
