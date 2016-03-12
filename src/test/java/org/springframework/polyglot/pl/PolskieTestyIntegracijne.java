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

package org.springframework.polyglot.pl;

import static org.springframework.polyglot.pl.NarzędziaTestowne.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.polyglot.pl.PolskieTestyIntegracijne.KonfiguracjiaLokalna;
import org.springframework.polyglot.pl.beans.factory.annotation.AutomatycznieZakablowanie;
import org.springframework.polyglot.pl.context.annotation.Konfiguracja;
import org.springframework.polyglot.pl.context.annotation.Kurwa;
import org.springframework.polyglot.pl.context.annotation.Ziarno;
import org.springframework.polyglot.pl.test.context.KonfiguracjaKontekstowa;
import org.springframework.polyglot.pl.test.context.junit4.WspomaganieTestoweSpringJUnit4;
import org.springframework.test.context.support.AnnotationConfigContextLoader;


/**
 * Polskie testy integracyjne.
 *
 * @author Mark Przemysław Paluch
 * @since 1.0
 */
@RunWith(WspomaganieTestoweSpringJUnit4.class)
@KonfiguracjaKontekstowa(
    klasyKonfiguracyjne = KonfiguracjiaLokalna.class,
	plikiXmlLubScenariuszGroovy = { /* Nie ma */ },
	dziedziczyćPołożenia = nie,
	dziedziczyćInicjatorów = no,
	ładowarka = AnnotationConfigContextLoader.class
)
@Kurwa
public class PolskieTestyIntegracijne {

	@AutomatycznieZakablowanie(potrzebne = no)
	private String wieść;

	@Test
	public void sprawdźWieść() {
		spodziewamSięŻe(wieść, jestRówno("Spoko"));
	}

	@Konfiguracja
	static class KonfiguracjiaLokalna {

		@Ziarno
		String wieść() {
			return "Spoko";
		}
	}

}
