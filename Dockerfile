FROM java:8

VOLUME /tmp

COPY ./target/weather-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

EXPOSE 8080

RUN sh -c 'touch weather-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","weather-0.0.1-SNAPSHOT.jar"]