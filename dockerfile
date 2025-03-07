FROM openjdk:11-jre-slim
# try out alpine/debian

COPY build/libs/sandbox_bap_protocol-*.*.*-SNAPSHOT.jar /usr/local/lib/sandbox_bap_protocol.jar
COPY build/resources/main/application.yml /usr/local/lib/application.yml

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /usr/local/lib/sandbox_bap_protocol.jar --spring.config.location=file:///usr/local/lib/application.yml"]
