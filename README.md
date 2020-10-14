# Jacoco Demo

> [Comparison of code coverage tools](https://confluence.atlassian.com/clover/comparison-of-code-coverage-tools-681706101.html)

### Reference Documentation
* [Definitive Guide to the JaCoCo Gradle Plugin](https://reflectoring.io/jacoco/)
* [The JaCoCo Plugin](https://docs.gradle.org/current/userguide/jacoco_plugin.html)
* [How to setup JaCoCo code coverage with Maven & Gradle](https://medium.com/@rhamedy/how-to-setup-jacoco-code-coverage-with-maven-gradle-76e0b2fca9fb)


#### Java code coverage tools
There are different code coverage tools for different languages,
and I am going to focus on Java. The most famous code coverages tools are
* [JaCoCo](https://www.jacoco.org/jacoco/index.html)
* [Cobertura](https://cobertura.github.io/cobertura/)
* [Open Clover](https://openclover.org/)
* [JCov](https://wiki.openjdk.java.net/display/CodeTools/jcov)


#### Execution Build with minimum coverage 90% -  Build Failed
``` log
Execution failed for task ':jacocoTestCoverageVerification'.
> Rule violated for bundle coverage: methods covered ratio is 0.8, but expected minimum is 0.9

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.
```