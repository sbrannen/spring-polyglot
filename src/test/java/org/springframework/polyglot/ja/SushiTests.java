package org.springframework.polyglot.ja;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.polyglot.ja.test.context.すしコンフィグ;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
@RunWith(SpringJUnit4ClassRunner.class)
@すしコンフィグ(新鮮なネタ = SushiConfig.class, さび抜き = false, おまかせ = true, 今日のオススメ = "まぐろがうまいよ！")
public class SushiTests {

	@Autowired
	List<Sushi> 今日のネタ;

	@Autowired
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

	@Configuration
	static class SushiConfig {

		@Bean
		Sushi maguro() {
			return new Sushi("まぐろ", 300);
		}

		@Bean
		Sushi hamachi() {
			return new Sushi("はまち", 200);
		}

		@Bean
		Sushi salmon() {
			return new Sushi("サーモン", 200);
		}

		@Bean
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
