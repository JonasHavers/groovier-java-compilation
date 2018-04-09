# Groovier Java Compilation

This project demonstrates how you can configure your **Gradle project** in order to be able to use **Java sources from Groovy** and **Groovy sources from Java**.

The default behaviour when applying the Gradle Groovy plugin with the default Gradle SourceSets is that you can access Java from Groovy, but not vice versa.

To use the default configuration to provoke a compile error, proceed as follows:
1. Comment out lines 8 - 13 in `build.gradle`
2. Run `./gradlew test`

You should see an execution error similar to this:
```
Executing task 'test'...

[...]/groovier-java-compilation/src/main/java/de/jonashavers/groovierjavacompilation/JavaExtendingGroovy.java:3: error: cannot find symbol
class JavaExtendingGroovy extends PlainGroovy {
                                  ^
  symbol: class PlainGroovy
1 error
:compileJava FAILED
FAILURE: Build failed with an exception.
* What went wrong:
Execution failed for task ':compileJava'.
> Compilation failed; see the compiler error output for details.
* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.
* Get more help at https://help.gradle.org
BUILD FAILED in 0s
1 actionable task: 1 executed
Compilation failed; see the compiler error output for details.
```

Another solution to the problem is to move all your Java sources next to the Groovy sources in the `src/main/groovy` directory.
