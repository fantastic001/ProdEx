#!/bin/sh

FRONTEND_DIR="$(readlink -f "$1")"

cd $FRONTEND_DIR

npm run-script build

docker run -it --rm \
	--name prodex_frontend \
	--link api.prodex \
	--volume "$FRONTEND_DIR/dist":/usr/share/nginx/html/frontend/dist \
	--volume "$FRONTEND_DIR/index.html":/usr/share/nginx/html/frontend/index.html \
	--volume "$FRONTEND_DIR/nginx/":/etc/nginx/ \
	--publish 301:80 \
	nginx
