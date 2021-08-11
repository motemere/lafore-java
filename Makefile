.DEFAULT_GOAL := build-run

clean:
	./gradlew clean

build: clean
	./gradlew build

lint:
	./gradlew checkstyleMain checkstyleTest

test:
	./gradlew test

run:
	./gradlew run

build-run: build run
