#!/bin/sh
rm -rf example
mkdir example

cd example

for i in order user buyer admin seller city item category orderReview buyerFavoriteItem comment message conversation fromAdminMessage toAdminMessage itemReport sellerReport; do
	templater ../src/views/___component___Detail.vue example/${i}Detail.vue $i.json
done
