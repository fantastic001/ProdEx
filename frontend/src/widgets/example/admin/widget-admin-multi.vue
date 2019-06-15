<script>
import AdminService from "./service";
import WidgetAdminSingle from "./widget-admin-single.vue"


export default {
    name: "WidgetAdminMulti",
    data: function () {
        return {items: AdminService.list()};
    },
    components: {
    	"WidgetAdminSingle": WidgetAdminSingle
    }
}
</script>>

<template>
    <div class="widget-admin-multi"> 
      <WidgetAdminSingle
      	v-for="item in items"
      	v-bind:admin="item"
      	v-bind:key="item.id"/>
    </div>

</template>

<style scoped> 



</style>