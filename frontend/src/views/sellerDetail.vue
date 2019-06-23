<script>


import UserService from "../widgets/user/service"
import WidgetUserSingle from "../widgets/user/widget-user-single.vue"

import ItemService from "../widgets/item/service"
import WidgetItemSingle from "../widgets/item/widget-item-single.vue"

import BuyersellerlikeService from "../widgets/buyerSellerLike/service"
import WidgetBuyersellerlikeSingle from "../widgets/buyerSellerLike/widget-buyerSellerLike-single.vue"

import ToadminmessageService from "../widgets/toAdminMessage/service"
import WidgetToadminmessageSingle from "../widgets/toAdminMessage/widget-toAdminMessage-single.vue"

import SellerreportService from "../widgets/sellerReport/service"
import WidgetSellerreportSingle from "../widgets/sellerReport/widget-sellerReport-single.vue"

import OrderService from "../widgets/order/service"
import WidgetOrderSingle from "../widgets/order/widget-order-single.vue"


import SellerService from "../widgets/seller/service"
import WidgetSellerSingle from "../widgets/seller/widget-seller-single.vue"
import WidgetSellerNew from "../widgets/seller/widget-seller-new.vue"
import WidgetSellerSingleEdit from "../widgets/seller/widget-seller-single-edit.vue"
import WidgetSellerMulti from "../widgets/seller/widget-seller-multi.vue"


export default {
    name: "SellerDetail",
    props: ["id"],
    data: function () {
        var seller = SellerService.get(this.id);
        var data = {
            
            users: UserService.list().filter(user => user.id == seller.user),
            
            items: ItemService.list().filter(item => item.seller == seller.id),
            
            buyerSellerLikes: BuyersellerlikeService.list().filter(buyerSellerLike => buyerSellerLike.seller == seller.id),
            
            toAdminMessages: ToadminmessageService.list().filter(toAdminMessage => toAdminMessage.seller == seller.id),
            
            sellerReports: SellerreportService.list().filter(sellerReport => sellerReport.seller == seller.id),
            
            seller: seller
        }
	data.orders = OrderService.list().filter(order => data.items.filter(item => item.id == order.item).length > 0)
	return data;
    },
    components: {
        
        "WidgetUserSingle": WidgetUserSingle,
        
        "WidgetItemSingle": WidgetItemSingle,
        
        "WidgetBuyersellerlikeSingle": WidgetBuyersellerlikeSingle,
        
        "WidgetToadminmessageSingle": WidgetToadminmessageSingle,
        
        "WidgetSellerreportSingle": WidgetSellerreportSingle,

        "WidgetOrderSingle": WidgetOrderSingle,
        
        "WidgetSellerSingle": WidgetSellerSingle,
        "WidgetSellerNew": WidgetSellerNew,
        "WidgetSellerSingleEdit": WidgetSellerSingleEdit,
        "WidgetSellerMulti": WidgetSellerMulti
       
    }
}
</script>>

<template>
    <div class="seller-detail"> 
        <WidgetSellerSingle v-bind:id="seller.id" />

        <div class="user-list">
        	<WidgetUserSingle v-for="(item, index) in users" :key="item.id" v-bind:id="item" />
	</div>
        
        
        <div class="item-list">
        <WidgetItemSingle v-for="(item, index) in items" :key="item.id" v-bind:id="item" />
	</div>
        
        
        <div class="buyer-seller-like-list">
        <WidgetBuyersellerlikeSingle v-for="(item, index) in buyerSellerLikes" :key="item.id" v-bind:id="item" />
	</div>
        
        
        <div class="to-admin-message-list">
        <WidgetToadminmessageSingle v-for="(item, index) in toAdminMessages" :key="item.id" v-bind:id="item" />
	</div>
        
        
        <div class="seller-report-list">
        <WidgetSellerreportSingle v-for="(item, index) in sellerReports" :key="item.id" v-bind:id="item" />
	</div>
        
        <div class="order-list">
	<p>Shipped orders</p>
	<WidgetOrderSingle v-for="(item, index) in orders" :key="item.id" v-bind:id="item" v-if="item.status == 'SHIPPED'"/>
	</div>
        
        
    </div>

</template>

<style scoped> 



</style>
