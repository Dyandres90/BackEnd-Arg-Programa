FROM openjdk:8
MAINTAINER Freddy Marroquin freddyandresmarroquin@gmail.com
COPY target/fam-0.0.1-SNAPSHOT.jar fam-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/fam-0.0.1-SNAPSHOT.jar"]