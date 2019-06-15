<script>
import ConversationService from "./service";
import WidgetConversationSingle from "./widget-conversation-single.vue"


export default {
    name: "WidgetConversationMulti",
    data: function () {
        return {items: ConversationService.list()};
    },
    components: {
    	"WidgetConversationSingle": WidgetConversationSingle
    }
}
</script>>

<template>
    <div class="widget-conversation-multi"> 
      <WidgetConversationSingle
      	v-for="item in items"
      	v-bind:id="item"
      	v-bind:key="item.id"/>
    </div>

</template>

<style scoped> 



</style>