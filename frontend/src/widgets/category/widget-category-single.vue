<script>
import CategoryService from "./service";

export default {
    name: "WidgetCategorySingle",
    props: ["category"],
    data: function () {
        return CategoryService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-category-single"> 
        
    </div>

</template>

<style scoped> 



</style>