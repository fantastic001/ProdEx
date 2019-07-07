<script>


import WidgetSellerMulti from "../widgets/Seller/WidgetSellerMulti.vue"

import WidgetOrderMulti from "../widgets/Order/WidgetOrderMulti.vue"

import WidgetBuyerFavoriteItemMulti from "../widgets/BuyerFavoriteItem/WidgetBuyerFavoriteItemMulti.vue"

import WidgetCommentMulti from "../widgets/Comment/WidgetCommentMulti.vue"

import WidgetItemReportMulti from "../widgets/ItemReport/WidgetItemReportMulti.vue"


import ItemService from "../widgets/Item/service"
import WidgetItemSingle from "../widgets/Item/WidgetItemSingle.vue"
import WidgetItemSingleEdit from "../widgets/Item/WidgetItemSingleEdit.vue"
import WidgetItemMulti from "../widgets/Item/WidgetItemMulti.vue"
import WidgetItemNew from "../widgets/Item/WidgetItemNew.vue"


export default {
    name: "ItemDetail",
    props: ["item"],
    data: function () {
            return {
		data: {}
	    };
	}
    },
    mounted: function () 
    {
    	ItemService.get(item).then(response => this.data = response.data)
    }
    components: {
        
        "WidgetSellerMulti": WidgetSellerMulti,
        
        "WidgetOrderMulti": WidgetOrderMulti,
        
        "WidgetBuyerFavoriteItemMulti": WidgetBuyerFavoriteItemMulti,
        
        "WidgetCommentMulti": WidgetCommentMulti,
        
        "WidgetItemReportMulti": WidgetItemReportMulti,
        
        "WidgetItemSingle": WidgetItemSingle,
        "WidgetItemNew": WidgetItemNew,
        "WidgetItemSingleEdit": WidgetItemSingleEdit,
        "WidgetItemMulti": WidgetItemMulti
    }
}
</script>>

<template>
    <div class="Item-detail"> 
        <WidgetItemSingle :item="item" />

        
        <WidgetSellerMulti :filter="x => x.item == item"/>
        
        
        <WidgetOrderMulti :filter="x => x.item == item"/>
        
        
        <WidgetBuyerFavoriteItemMulti :filter="x => x.item == item"/>
        
        
        <WidgetCommentMulti :filter="x => x.item == item"/>
        
        
        <WidgetItemReportMulti :filter="x => x.item == item"/>
        
        
    </div>

</template>

<style scoped> 



</style>