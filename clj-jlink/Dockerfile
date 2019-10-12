FROM sunng/alpine-jlink-base:latest

ADD target/jlink /opt/jlink
ENTRYPOINT /opt/jlink/bin/clj-jlink
