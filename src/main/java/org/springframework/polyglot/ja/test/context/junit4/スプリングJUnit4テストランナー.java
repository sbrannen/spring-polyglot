package org.springframework.polyglot.ja.test.context.junit4;

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 日本語版 {@link SpringJUnit4ClassRunner}.
 *
 * @author Tadaya Tsuyukubo
 * @since 1.0
 */
public class スプリングJUnit4テストランナー extends SpringJUnit4ClassRunner {

	public スプリングJUnit4テストランナー(Class<?> clazz) throws InitializationError {
		super(clazz);
	}

}
