autoscale: true
build-lists: true
slidenumbers: true
theme: Next, 4

# Gradle Isn't Just a
# Bad Word
# 🤬

^
https://360andev.com/session/gradle-isnt-just-a-bad-word/

---

# Gradle Project Structure

## Wrapper

└─── gradle
│   └── wrapper
│       └── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
└── gradlew.bat

       │ File: gradle/wrapper/gradle-wrapper.properties
───────┼──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
   1   │ #Sat Jul 17 18:48:29 MDT 2021
   2   │ distributionBase=GRADLE_USER_HOME
   3   │ distributionUrl=https\://services.gradle.org/distributions/gradle-6.7.1-bin.zip
   4   │ distributionPath=wrapper/dists
   5   │ zipStorePath=wrapper/dists
   6   │ zipStoreBase=GRADLE_USER_HOME

## Project Hierarchy

Root project 'CompositeProject' (:)
+--- Project ':app'
\--- Project ':module'

.
├── app
│   └── build.gradle
├── build.gradle
├── gradle.properties
├── local.properties
├── module
│   └── build.gradle
└── settings.gradle

## Files

- build.gradle
- settings.gradle
- gradle.properties

## Input

- build.gradle
- gradle.properties
- ~/.gradle/gradle.properties
- -Pproperty=value

## Output

- console
- log levels
- stacktrace
- build scans

---

# Tasks

- tasks
- tasks --all

## Creating Tasks

- doLast

## dependsOn
## Dry Run

--dry-run
-m

---

# Plugins
## Buildscript
## Plugins Block
## Maven Coordinates vs Plugin ID

---

# Dependencies
## Implementation, Api and Compile

---

# Composite Projects
