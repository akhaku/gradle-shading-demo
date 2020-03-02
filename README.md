# Gradle shading demo

This is a simple gradle project that demonstrates how to use the gradle plugin com.github.johnrengelman.shadow to shade jars and work around Java classpath issues.

In this example we create a library `my-library` which uses a shaded version of `org.apache.curator:curator-recipes:2.12.0`.
