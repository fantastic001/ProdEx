<script>
import CategoryService from "./service";
import WidgetCategorySingle from "./widget-category-single.vue"


export default {
    name: "WidgetCategoryMulti",
    data: function () {
        return {items: CategoryService.list()};
    },
    components: {
    	"WidgetCategorySingle": WidgetCategorySingle
    }
}
</script>>

<template>
    <div class="widget-category-multi"> 
      <WidgetCategorySingle
      	v-for="item in items"
      	v-bind:category="item"
      	v-bind:key="item.id"/>
    </div>

</template>

<style scoped> 



</style>