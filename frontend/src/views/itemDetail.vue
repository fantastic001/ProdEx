<script>


import SellerService from "../widgets/seller/service"
import WidgetSellerSingle from "../widgets/seller/widget-seller-single.vue"

import OrderService from "../widgets/order/service"
import WidgetOrderSingle from "../widgets/order/widget-order-single.vue"

import BuyerfavoriteitemService from "../widgets/buyerFavoriteItem/service"
import WidgetBuyerfavoriteitemSingle from "../widgets/buyerFavoriteItem/widget-buyerFavoriteItem-single.vue"

import CommentService from "../widgets/comment/service"
import WidgetCommentSingle from "../widgets/comment/widget-comment-single.vue"

import ItemreportService from "../widgets/itemReport/service"
import WidgetItemreportSingle from "../widgets/itemReport/widget-itemReport-single.vue"


import ItemService from "../widgets/item/service"
import WidgetItemSingle from "../widgets/item/widget-item-single.vue"
import WidgetItemNew from "../widgets/item/widget-item-new.vue"
import WidgetItemSingleEdit from "../widgets/item/widget-item-single-edit.vue"
import WidgetItemMulti from "../widgets/item/widget-item-multi.vue"


export default {
    name: "ItemDetail",
    props: ["id"],
    data: function () {
        var item = ItemService.get(this.id);
        return {
            
            sellers: SellerService.list().filter(seller => seller.item == item.id),
            
            orders: OrderService.list().filter(order => order.item == item.id),
            
            buyerFavoriteItems: BuyerfavoriteitemService.list().filter(buyerFavoriteItem => buyerFavoriteItem.item == item.id),
            
            comments: CommentService.list().filter(comment => comment.item == item.id),
            
            itemReports: ItemreportService.list().filter(itemReport => itemReport.item == item.id),
            
            item: item
        }
    },
    components: {
        
        "WidgetSellerSingle": WidgetSellerSingle,
        
        "WidgetOrderSingle": WidgetOrderSingle,
        
        "WidgetBuyerfavoriteitemSingle": WidgetBuyerfavoriteitemSingle,
        
        "WidgetCommentSingle": WidgetCommentSingle,
        
        "WidgetItemreportSingle": WidgetItemreportSingle,
        
        "WidgetItemSingle": WidgetItemSingle,
        "WidgetItemNew": WidgetItemNew,
        "WidgetItemSingleEdit": WidgetItemSingleEdit,
        "WidgetItemMulti": WidgetItemMulti
       
    }
}
</script>>

<template>
    <div class="item-detail"> 
        <WidgetItemSingle v-bind:id="item.id" />

        
        <WidgetSellerSingle v-for="(item, index) in sellers" :key="item.id" v-bind:id="item" />
        
        
        <WidgetOrderSingle v-for="(item, index) in orders" :key="item.id" v-bind:id="item" />
        
        
        <WidgetBuyerfavoriteitemSingle v-for="(item, index) in buyerFavoriteItems" :key="item.id" v-bind:id="item" />
        
        
        <WidgetCommentSingle v-for="(item, index) in comments" :key="item.id" v-bind:id="item" />
        
        
        <WidgetItemreportSingle v-for="(item, index) in itemReports" :key="item.id" v-bind:id="item" />
        
        
    </div>

</template>

<style scoped> 



</style>