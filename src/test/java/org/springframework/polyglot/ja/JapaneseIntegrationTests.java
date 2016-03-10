package org.springframework.polyglot.ja;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.polyglot.ja.JapaneseIntegrationTests.ロケールテストコンフィグ;
import org.springframework.polyglot.ja.test.context.junit4.スプリングJUnit4テストランナー;
import org.springframework.polyglot.ja.test.context.オートワイヤリング;
import org.springframework.polyglot.ja.test.context.コンテキストコンフィグ;
import org.springframework.polyglot.ja.test.context.コンフィグ;
import org.springframework.polyglot.ja.test.context.ビーン;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.Assert.assertEquals;

/**
 * 日本語版 Springテスト
 *
 * @author Tadaya Tsuyukubo
 * @since 1.0
 */
@RunWith(スプリングJUnit4テストランナー.class)
@コンテキストコンフィグ(
		コンフィグクラス = ロケールテストコンフィグ.class,
		イニシャライザ = {},
		イニシャライザを継承する = false,
		リソースロケーションを継承する = false,
		コンテキストローダー = AnnotationConfigContextLoader.class,
		名前 = "日本語のテスト"
)
public class JapaneseIntegrationTests {

	@オートワイヤリング(必須 = true)
	String ほげ;

	@Test
	public void てすと() {
		assertEquals("ほげほげ", ほげ);
	}

	@コンフィグ
	static class ロケールテストコンフィグ {
		@ビーン String ほげ() {
			return "ほげほげ";
		}
	}
}
