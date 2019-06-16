<script>


import ItemService from "../widgets/item/service"
import WidgetItemSingle from "../widgets/item/widget-item-single.vue"


import CategoryService from "../widgets/category/service"
import WidgetCategorySingle from "../widgets/category/widget-category-single.vue"
import WidgetCategoryNew from "../widgets/category/widget-category-new.vue"
import WidgetCategorySingleEdit from "../widgets/category/widget-category-single-edit.vue"
import WidgetCategoryMulti from "../widgets/category/widget-category-multi.vue"


export default {
    name: "CategoryDetail",
    props: ["id"],
    data: function () {
        var category = CategoryService.get(this.id);
        return {
            
            items: ItemService.list().filter(item => item.category == category.id),
            
            category: category
        }
    },
    components: {
        
        "WidgetItemSingle": WidgetItemSingle,
        
        "WidgetCategorySingle": WidgetCategorySingle,
        "WidgetCategoryNew": WidgetCategoryNew,
        "WidgetCategorySingleEdit": WidgetCategorySingleEdit,
        "WidgetCategoryMulti": WidgetCategoryMulti
       
    }
}
</script>>

<template>
    <div class="category-detail"> 
        <WidgetCategorySingle v-bind:id="category.id" />

        
        <WidgetItemSingle v-for="(item, index) in items" :key="item.id" v-bind:id="item" />
        
        
    </div>

</template>

<style scoped> 



</style>