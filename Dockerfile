FROM amazoncorretto:11-alpine-jdk
MAINTAINER FAM
COPY target/fam-0.0.1-SNAPSHOT.jar fam-app.jar
ENTRYPOINT ["java","-jar","/fam-app.jar"]
