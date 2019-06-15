<script>
import {{ component | capitalize }}Service from "./service";
import Widget{{ component | capitalize}}Single from "./widget-{{component}}-single.vue"


export default {
    name: "Widget{{ component | capitalize}}Multi",
    data: function () {
        return {items: {{component | capitalize}}Service.list()};
    },
    components: {
    	"Widget{{component | capitalize}}Single": Widget{{component | capitalize}}Single
    }
}
</script>>

<template>
    <div class="widget-{{component}}-multi"> 
      <Widget{{component | capitalize }}Single
      	v-for="item in items"
      	v-bind:{{ component }}="item"
      	v-bind:key="item.id"/>
    </div>

</template>

<style scoped> 



</style>
