FROM adoptopenjdk/openjdk11-openj9:jre-11.0.8_10_openj9-0.21.0-alpine

ADD target/lib /app/lib
ADD target/my-quark-us-1.0.0-SNAPSHOT-runner.jar /app/lib/
COPY bin/start.sh /app/

EXPOSE 8080

WORKDIR /app
RUN sed -i 's/\r$//' /app/start.sh  && \  
        chmod +x /app/start.sh
ENTRYPOINT [ "sh","/app/start.sh" ]
