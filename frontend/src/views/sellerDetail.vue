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
        return {
            
            users: UserService.list().filter(user => user.id == seller.user),
            
            items: ItemService.list().filter(item => item.seller == seller.id),
            
            buyerSellerLikes: BuyersellerlikeService.list().filter(buyerSellerLike => buyerSellerLike.seller == seller.id),
            
            toAdminMessages: ToadminmessageService.list().filter(toAdminMessage => toAdminMessage.seller == seller.id),
            
            sellerReports: SellerreportService.list().filter(sellerReport => sellerReport.seller == seller.id),
            
            seller: seller
        }
    },
    components: {
        
        "WidgetUserSingle": WidgetUserSingle,
        
        "WidgetItemSingle": WidgetItemSingle,
        
        "WidgetBuyersellerlikeSingle": WidgetBuyersellerlikeSingle,
        
        "WidgetToadminmessageSingle": WidgetToadminmessageSingle,
        
        "WidgetSellerreportSingle": WidgetSellerreportSingle,
        
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

        
        <WidgetUserSingle v-for="(item, index) in users" :key="item.id" v-bind:id="item" />
        
        
        <WidgetItemSingle v-for="(item, index) in items" :key="item.id" v-bind:id="item" />
        
        
        <WidgetBuyersellerlikeSingle v-for="(item, index) in buyerSellerLikes" :key="item.id" v-bind:id="item" />
        
        
        <WidgetToadminmessageSingle v-for="(item, index) in toAdminMessages" :key="item.id" v-bind:id="item" />
        
        
        <WidgetSellerreportSingle v-for="(item, index) in sellerReports" :key="item.id" v-bind:id="item" />
        
        
    </div>

</template>

<style scoped> 



</style>