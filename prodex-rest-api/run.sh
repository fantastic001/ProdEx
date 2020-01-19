#!/bin/sh


if [ $1 == "" ];then 
	echo "Usage: $0 backend_path"
	echo "backend_path - path to root where backend is located"
fi

BACKEND_DIR="$(readlink -f $1)"
SOURCE_DIR="$BACKEND_DIR/src/main/java"
RESOURCES_DIR="$BACKEND_DIR/src/main/resources"
TEST_DIR="$BACKEND_DIR/src/test"

docker run \
	-it --rm \
	--name prodex_api_build \
	-v "$BACKEND_DIR/":/usr/src/mymaven/ \
	-w /usr/src/mymaven \
	maven mvn clean install


docker run \
	--hostname api.prodex \
	-it --rm \
	--publish 5544:8080 \
	-v "$BACKEND_DIR/target/prodex-rest-api.war":/usr/local/tomcat/webapps/prodex-rest-api.war \
	--name prodex_api \
	-v "$BACKEND_DIR/":/usr/src/mymaven/ \
	-w /usr/src/mymaven \
	--publish 9000:8080 \
	tomcat:8-jdk11-adoptopenjdk-hotspot
