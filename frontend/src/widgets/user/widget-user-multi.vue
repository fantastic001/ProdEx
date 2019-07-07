<script>
import UserService from "./service";
import WidgetUserSingle from "./widget-user-single.vue"


export default {
    name: "WidgetUserMulti",
    props: {
        filter: {
            type: Function,
            default: (x => true)
        }
    },
    data: function () {
        return {
            items: []
        }
    },
    mounted: function () 
    {
        UserService.list().then(response => this.data = response);
    },
    components: {
    	"WidgetUserSingle": WidgetUserSingle
    }
}
</script>

<template>
    <div class="widget-user-multi"> 
      <WidgetUserSingle
        v-if="filter(item)"
      	v-for="item in items"
      	v-bind:id="item"
      	v-bind:key="item.id"/>
    </div>

</template>

<style scoped> 



</style>