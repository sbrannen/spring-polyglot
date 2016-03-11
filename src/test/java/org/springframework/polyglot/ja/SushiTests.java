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
import org.springframework.polyglot.ja.beans.factory.annotation.オートワイヤリング;
import org.springframework.polyglot.ja.context.annotation.コンフィグ;
import org.springframework.polyglot.ja.context.annotation.ビーン;
import org.springframework.polyglot.ja.test.context.junit4.スプリングJUnit4テストランナー;
import org.springframework.polyglot.ja.test.context.すしコンフィグ;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.springframework.polyglot.ja.SushiTests.SushiConfig;

/**
 * Do you like Sushi?
 *
 * @author Tadaya Tsuyukubo
 * @since 1.0
 */
@RunWith(スプリングJUnit4テストランナー.class)
@すしコンフィグ(新鮮なネタ = SushiConfig.class, さび抜き = false, おまかせ = true, 今日のオススメ = "まぐろがうまいよ！")
public class SushiTests {

	@オートワイヤリング
	List<Sushi> 今日のネタ;

	@オートワイヤリング
	Sushi maguro;

	@Test
	public void 回る寿司() {
		assertTrue(maguro.price < 400);
	}

	@Test
	public void おあいそ() {
		long total = 0;
		for (Sushi sushi : 今日のネタ) {
			total += sushi.price;
		}
		assertEquals("合計", 800, total);
	}

	@コンフィグ
	static class SushiConfig {

		@ビーン
		Sushi maguro() {
			return new Sushi("まぐろ", 300);
		}

		@ビーン
		Sushi hamachi() {
			return new Sushi("はまち", 200);
		}

		@ビーン
		Sushi salmon() {
			return new Sushi("サーモン", 200);
		}

		@ビーン
		Sushi tamago() {
			return new Sushi("玉子", 100);
		}

	}

	static class Sushi {
		String name;
		int price;

		public Sushi(String name, int price) {
			this.name = name;
			this.price = price;
		}
	}

}
