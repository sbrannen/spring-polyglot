# Welcome to _Spring Polyglot_!

This repository is a collection of "just for fun" _composed annotations_
for use with the [Spring Framework][].

The goal of this project is to demonstrate the power of _composed annotations_
and the use of `@AliasFor` for overriding attributes in meta-annotations by
_translating_ common Spring annotations into different languages. In this
context, the term _polyglot_ therefore refers to spoken languages, not
programming languages.

And who knows...? Perhaps some of these translated annotations will someday
make it into the Spring Framework.

# An Example for Germans

For example, the following is what an integration test in Spring could look
like when `@ContextConfiguration` is translated into German. Yes, this
test actually runs: see [DeutscheIntegrationsTests][] for details.

```java
@RunWith(SpringJUnit4IntegrationsTestUnterstützung.class)
// Wir müssen nicht alle Attributen auflisten, aber... sicher ist sicher!
@KontextKonfiguration(
	KonfigurationsKlassen = { TestKonfiguration.class },
	XmlDateienOderGroovySkripten = { /* keine */ },
	RessourcenErben = false,
	Initialisierungsprogramme = { /* keine */ },
	InitialisierungsprogrammeErben = false,
	Ladeprogramm = AnnotationConfigContextLoader.class,
	Name = "In diesem Fall spielt der Name keine Rolle."
)
public final class DeutscheIntegrationsTests {

	@Autowired
	private String Nachricht;

	@Test
	public void nachrichtPruefen() {
		esWirdErwartetDass(Nachricht, istGleich("Alles in Ordnung"));
	}

}
```

# An Example for Hipsters

Yes, this test actually runs: see [HipsterTests][] for details.

```java
@RunWith(SpringFoo.class)
@Konfigz(klassez = Konfig.class, listenToYoParents = false, whoDat = "Not I said the fly")
public class HipsterTests {

	@Autowired
	String message;

	@Test
	public void checkItOut() {
		assertEquals("Keepin' it real!", message);
	}

}
```

# Languages Represented

The following languages currently have one or more translated annotations
that have been submitted to this project.

- Hipster: see [HipsterTests][]
- German: see [DeutscheIntegrationsTests][]

# Contributing

Feel free to contribute your own translated annotations by submitting
[pull requests][] to this repository.

## Contributor License Agreement

Although the `spring-polyglot` project is currently just for demonstration purposes,
there is a slight chance that annotations from this project will eventually be
incorporated into official Spring projects. In order to have your pull requests
accepted, we therefore ask that you sign the [Contributor License Agreement][] and
document that you have done so in the commit message or comments of your pull request.

## License
The Spring Polyglot project is released under version 2.0 of the [Apache License][].

# See Also

- [Spring Annotation Programming Model][]: official wiki page from the Spring team
- [Spring Composed][]: a collection of "serious" _composed annotations_
for use with the [Spring Framework][]

# Building from Source

Spring Polyglot uses a [Gradle][]-based build system. In the instructions
below, `./gradlew` is invoked from the root of the project and serves as
a cross-platform, self-contained bootstrap mechanism for the build.

## Prerequisites

- [Git][]
- [JDK 8][JDK8] update 60 or later
- [Spring Framework][] 4.2.1 or later

Annotations in the `spring-polyglot` project rely on `@AliasFor` which
was introduced in Spring Framework 4.2 and therefore require at least Spring
Framework 4.2.1 to work properly. 

Be sure that your `JAVA_HOME` environment variable points to the `jdk1.8.0` folder
extracted from the JDK download.

## Compile and Test

Build all JARs, distribution ZIP files, and docs:

`./gradlew build`

## Install `spring-polyglot` in local Maven repository

`./gradlew install`


[Apache License]: http://www.apache.org/licenses/LICENSE-2.0
[Gradle]: http://gradle.org
[Git]: http://help.github.com/set-up-git-redirect
[JDK8]: http://www.oracle.com/technetwork/java/javase/downloads
[Spring Framework]: http://projects.spring.io/spring-framework/
[Spring Annotation Programming Model]: https://github.com/spring-projects/spring-framework/wiki/Spring-Annotation-Programming-Model
[Spring Composed]: https://github.com/sbrannen/spring-composed
[pull requests]: http://help.github.com/send-pull-requests
[Contributor License Agreement]: https://github.com/spring-projects/spring-framework/blob/master/CONTRIBUTING.md#sign-the-contributor-license-agreement
[HipsterTests]: https://github.com/sbrannen/spring-polyglot/blob/master/src/test/java/org/springframework/polyglot/hipster/HipsterTests.java
[DeutscheIntegrationsTests]: https://github.com/sbrannen/spring-polyglot/blob/master/src/test/java/org/springframework/polyglot/de/DeutscheIntegrationsTests.java


