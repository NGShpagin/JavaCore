FROM bellsoft/liberica-openjdk-alpine
COPY ./java ./src
RUN mkdir ./mydir
RUN javac -sourcepath ./src -d mydir src/ru/geekbrains/lesson1/sample/Main.java
CMD java -classpath ./mydir ru.geekbrains.lesson1.sample.Main
