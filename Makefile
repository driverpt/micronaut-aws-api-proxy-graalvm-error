GRADLE_CMD=./gradlew

.FULL: clean build test package deploy
.PHONY: clean build test
.RUN_LOCAL: clean build test local

clean:
	$(GRADLE_CMD) clean

test:
	$(GRADLE_CMD) test

build:
	$(GRADLE_CMD) buildNativeLambda


build: test build
