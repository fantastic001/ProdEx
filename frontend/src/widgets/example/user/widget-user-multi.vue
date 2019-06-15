<script>
import UserService from "./service";
import WidgetUserSingle from "./widget-user-single.vue"


export default {
    name: "WidgetUserMulti",
    data: function () {
        return {items: UserService.list()};
    },
    components: {
    	"WidgetUserSingle": WidgetUserSingle
    }
}
</script>>

<template>
    <div class="widget-user-multi"> 
      <WidgetUserSingle
      	v-for="item in items"
      	v-bind:id="item"
      	v-bind:key="item.id"/>
    </div>

</template>

<style scoped> 



</style>