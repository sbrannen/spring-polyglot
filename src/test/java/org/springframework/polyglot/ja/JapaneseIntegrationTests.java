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
