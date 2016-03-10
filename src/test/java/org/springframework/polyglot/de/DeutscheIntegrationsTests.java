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

package org.springframework.polyglot.de;

import static org.springframework.polyglot.de.TestWerkzeuge.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.polyglot.de.DeutscheIntegrationsTests.LokaleTestKonfiguration;
import org.springframework.polyglot.de.beans.factory.annotation.AutomatischVerdrahtet;
import org.springframework.polyglot.de.context.annotation.Bohne;
import org.springframework.polyglot.de.context.annotation.Konfiguration;
import org.springframework.polyglot.de.test.context.KontextKonfiguration;
import org.springframework.polyglot.de.test.context.junit4.SpringJUnit4IntegrationsTestUnterstützung;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * Deutsche Integrations-Tests.
 *
 * @author Sam Brannen
 * @since 1.0
 */
@RunWith(SpringJUnit4IntegrationsTestUnterstützung.class)
// Wir müssen nicht alle Attributen auflisten, aber... sicher ist sicher!
@KontextKonfiguration(
	KonfigurationsKlassen = { LokaleTestKonfiguration.class },
	XmlDateienOderGroovySkripten = { /* keine */ },
	RessourcenErben = falsch,
	Initialisierungsprogramme = { /* keine */ },
	InitialisierungsprogrammeErben = falsch,
	Ladeprogramm = AnnotationConfigContextLoader.class,
	Name = "In diesem Fall spielt der Name keine Rolle."
)
public final class DeutscheIntegrationsTests {

	@AutomatischVerdrahtet(erforderlich = jawohl)
	private String Nachricht;


	@Test
	public void nachrichtPrüfen() {
		esWirdErwartetDass(Nachricht, istGleich("Alles in Ordnung"));
	}


	@Konfiguration
	static class LokaleTestKonfiguration {

		@Bohne
		String Nachricht() {
			return "Alles in Ordnung";
		}
	}

}
