package ru.geekbrains.lesson1.sample;

import ru.geekbrains.lesson1.regular.Decorator;
import ru.geekbrains.lesson1.regular.OtherClass;

/**
 * javac -sourcepath ./java  -d out java/ru/geekbrains/lesson1/sample/Main.java
 *
 * java -classpath ./out ru.geekbrains.lesson1.sample.Main
 *
 * Создание документации
 * javadoc -d docs -sourcepath ./java -cp ./out -subpackages ru
 *
 * docker buildx build --output type=local,dest=. .
 */

/** DockerFile
 *
 * FROM bellsoft/liberica-openjdk-alpine
 * COPY ./java ./src
 * RUN mkdir ./out
 * RUN javac -sourcepath ./src  -d out src/ru/geekbrains/lesson1/sample/Main.java
 * CMD java -classpath ./out ru.geekbrains.lesson1.sample.Main
 */

/**
 * FROM bellsoft/liberica-openjdk-alpine as BuildProject
 * WORKDIR /app
 * COPY ./java ./src
 * RUN mkdir ./out
 * RUN javac -sourcepath ./src -d out src/ru/geekbrains/lesson1/sample/Main.java
 *
 * FROM scratch as OutputFiles
 * COPY --from=BuildProject /app/out /bin
 */

public class Main {
    public static void main(String[] args) {
        int result = OtherClass.add(2, 3);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(2, 3);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(2, 3);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(2, 3);
        System.out.println(Decorator.decorate(result));
    }
}
