<script>
import CategoryService from "./service";

export default {
    name: "WidgetCategorySingleEdit",
    props: ["category"],
    data: function () {
        return CategoryService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-category-single-edit"> 
        
    </div>

</template>

<style scoped> 



</style>