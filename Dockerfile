FROM java:8-jdk
MAINTAINER Freddy Marroquin freddyandresmarroquin@gmail.com
COPY target/fam-0.0.1-SNAPSHOT.jar fam-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/fam-0.0.1-SNAPSHOT.jar"]