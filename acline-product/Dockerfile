# FROM openjdk:8-jdk-alpine
FROM  reg.docker.zenlayer.net/baseimages/openjdk:8-jdk-alpine

# 解决OpenJdk EasyExcel 字体问题
RUN apk --update add curl bash ttf-dejavu && \
      rm -rf /var/cache/apk/*

LABEL maintainer="18861664946@163.com" version="${project.version}" description="aaron project product"

ARG JAR_FILE

ADD application/target/${JAR_FILE} app.jar
ADD htdocs htdocs
ADD docker/docker-entrypoint.sh docker-entrypoint.sh

RUN chmod +x docker-entrypoint.sh

ENTRYPOINT ["sh", "docker-entrypoint.sh"]
