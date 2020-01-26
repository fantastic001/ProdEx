<script>


import WidgetSellerMulti from "../widgets/Seller/WidgetSellerMulti.vue"

import WidgetOrderMulti from "../widgets/Order/WidgetOrderMulti.vue"

import WidgetBuyerFavoriteItemMulti from "../widgets/BuyerFavoriteItem/WidgetBuyerFavoriteItemMulti.vue"

import WidgetCommentMulti from "../widgets/Comment/WidgetCommentMulti.vue"
import WidgetCommentNew from "../widgets/Comment/WidgetCommentNew.vue"

import WidgetItemReportMulti from "../widgets/ItemReport/WidgetItemReportMulti.vue"


import ItemService from "../widgets/Item/service"
import WidgetItemSingle from "../widgets/Item/WidgetItemSingle.vue"
import WidgetItemSingleEdit from "../widgets/Item/WidgetItemSingleEdit.vue"
import WidgetItemMulti from "../widgets/Item/WidgetItemMulti.vue"
import WidgetItemNew from "../widgets/Item/WidgetItemNew.vue"


export default {
    name: "ItemDetail",
    props: ["id"],
    data: function () {
            return {
		data: {}
	    };
	},
    mounted: function () 
    {
    	ItemService.get(this.id).then(response => this.data = response.data)
    },
    methods: {
        itemDelete: function (event) 
        {
            ItemService.delete($route.params.id).then(response => 
            {
                if (response.status < 400) 
                {
                    alert("Item item is deleted");
                }
            })
        },
	reloadComments: function () {
		this.$refs.comments.reload();
	}
    },
    components: {
        
        "WidgetSellerMulti": WidgetSellerMulti,
        
        "WidgetOrderMulti": WidgetOrderMulti,
        
        "WidgetBuyerFavoriteItemMulti": WidgetBuyerFavoriteItemMulti,
        
        "WidgetCommentMulti": WidgetCommentMulti,
        "WidgetCommentNew": WidgetCommentNew,
        
        "WidgetItemReportMulti": WidgetItemReportMulti,
        
        "WidgetItemSingle": WidgetItemSingle,
        "WidgetItemNew": WidgetItemNew,
        "WidgetItemSingleEdit": WidgetItemSingleEdit,
        "WidgetItemMulti": WidgetItemMulti
    }
}
</script>

<template>
    <div class="Item-detail"> 
        <button v-on:click="itemDelete">Delete</button>
	<p>Item ID: {{this.id}}</p>
        <WidgetItemSingle :item="$route.params.id" />

        
        <WidgetSellerMulti :filter="x => x.item == this.id"/>
        
        
        <WidgetOrderMulti :filter="x => x.item == this.id"/>
        
        
        <WidgetBuyerFavoriteItemMulti :filter="x => x.item == this.id"/>
        
        
        <WidgetCommentMulti ref="comments" :filter="x => x.item == this.id"/>
	<WidgetCommentNew @submit="reloadComments" :item="this.id" />
        
        
        <WidgetItemReportMulti :filter="x => x.item == this.id"/>
        
        
    </div>

</template>

<style scoped> 



</style>
