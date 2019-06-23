#!/bin/sh
rm -rf example
mkdir example

for i in Order User Buyer Admin Seller City Item Category OrderReview BuyerFavoriteItem Comment Message Conversation FromAdminMessage ToAdminMessage ItemReport SellerReport BuyerSellerLike; do
	templater ___component___Storage.java example/${i}Storage.java $i.json
done
