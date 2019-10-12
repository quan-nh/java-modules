FROM frolvlad/alpine-glibc

RUN apk add --no-cache libstdc++

ADD target/jlink /opt/jlink
ENTRYPOINT /opt/jlink/bin/clj-jlink
