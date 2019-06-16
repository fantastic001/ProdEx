<script>


import UserService from "../widgets/user/service"
import WidgetUserSingle from "../widgets/user/widget-user-single.vue"

import OrderService from "../widgets/order/service"
import WidgetOrderSingle from "../widgets/order/widget-order-single.vue"

import OrderreviewService from "../widgets/orderReview/service"
import WidgetOrderreviewSingle from "../widgets/orderReview/widget-orderReview-single.vue"

import BuyerfavoriteitemService from "../widgets/buyerFavoriteItem/service"
import WidgetBuyerfavoriteitemSingle from "../widgets/buyerFavoriteItem/widget-buyerFavoriteItem-single.vue"

import BuyersellerlikeService from "../widgets/buyerSellerLike/service"
import WidgetBuyersellerlikeSingle from "../widgets/buyerSellerLike/widget-buyerSellerLike-single.vue"

import MessageService from "../widgets/message/service"
import WidgetMessageSingle from "../widgets/message/widget-message-single.vue"

import ItemreportService from "../widgets/itemReport/service"
import WidgetItemreportSingle from "../widgets/itemReport/widget-itemReport-single.vue"

import SellerreportService from "../widgets/sellerReport/service"
import WidgetSellerreportSingle from "../widgets/sellerReport/widget-sellerReport-single.vue"


import BuyerService from "../widgets/buyer/service"
import WidgetBuyerSingle from "../widgets/buyer/widget-buyer-single.vue"
import WidgetBuyerNew from "../widgets/buyer/widget-buyer-new.vue"
import WidgetBuyerSingleEdit from "../widgets/buyer/widget-buyer-single-edit.vue"
import WidgetBuyerMulti from "../widgets/buyer/widget-buyer-multi.vue"


export default {
    name: "BuyerDetail",
    props: ["id"],
    data: function () {
        var buyer = BuyerService.get(this.id);
        return {
            
            users: UserService.list().filter(user => user.buyer == buyer.id),
            
            orders: OrderService.list().filter(order => order.buyer == buyer.id),
            
            orderReviews: OrderreviewService.list().filter(orderReview => orderReview.buyer == buyer.id),
            
            buyerFavoriteItems: BuyerfavoriteitemService.list().filter(buyerFavoriteItem => buyerFavoriteItem.buyer == buyer.id),
            
            buyerSellerLikes: BuyersellerlikeService.list().filter(buyerSellerLike => buyerSellerLike.buyer == buyer.id),
            
            messages: MessageService.list().filter(message => message.buyer == buyer.id),
            
            itemReports: ItemreportService.list().filter(itemReport => itemReport.buyer == buyer.id),
            
            sellerReports: SellerreportService.list().filter(sellerReport => sellerReport.buyer == buyer.id),
            
            buyer: buyer
        }
    },
    components: {
        
        "WidgetUserSingle": WidgetUserSingle,
        
        "WidgetOrderSingle": WidgetOrderSingle,
        
        "WidgetOrderreviewSingle": WidgetOrderreviewSingle,
        
        "WidgetBuyerfavoriteitemSingle": WidgetBuyerfavoriteitemSingle,
        
        "WidgetBuyersellerlikeSingle": WidgetBuyersellerlikeSingle,
        
        "WidgetMessageSingle": WidgetMessageSingle,
        
        "WidgetItemreportSingle": WidgetItemreportSingle,
        
        "WidgetSellerreportSingle": WidgetSellerreportSingle,
        
        "WidgetBuyerSingle": WidgetBuyerSingle,
        "WidgetBuyerNew": WidgetBuyerNew,
        "WidgetBuyerSingleEdit": WidgetBuyerSingleEdit,
        "WidgetBuyerMulti": WidgetBuyerMulti
       
    }
}
</script>>

<template>
    <div class="buyer-detail"> 
        <WidgetBuyerSingle v-bind:id="buyer.id" />

        
        <WidgetUserSingle v-for="(item, index) in users" :key="item.id" v-bind:id="item" />
        
        
        <WidgetOrderSingle v-for="(item, index) in orders" :key="item.id" v-bind:id="item" />
        
        
        <WidgetOrderreviewSingle v-for="(item, index) in orderReviews" :key="item.id" v-bind:id="item" />
        
        
        <WidgetBuyerfavoriteitemSingle v-for="(item, index) in buyerFavoriteItems" :key="item.id" v-bind:id="item" />
        
        
        <WidgetBuyersellerlikeSingle v-for="(item, index) in buyerSellerLikes" :key="item.id" v-bind:id="item" />
        
        
        <WidgetMessageSingle v-for="(item, index) in messages" :key="item.id" v-bind:id="item" />
        
        
        <WidgetItemreportSingle v-for="(item, index) in itemReports" :key="item.id" v-bind:id="item" />
        
        
        <WidgetSellerreportSingle v-for="(item, index) in sellerReports" :key="item.id" v-bind:id="item" />
        
        
    </div>

</template>

<style scoped> 



</style>