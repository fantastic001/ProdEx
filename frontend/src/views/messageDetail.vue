<script>


import ConversationService from "../widgets/conversation/service"
import WidgetConversationSingle from "../widgets/conversation/widget-conversation-single.vue"


import MessageService from "../widgets/message/service"
import WidgetMessageSingle from "../widgets/message/widget-message-single.vue"
import WidgetMessageNew from "../widgets/message/widget-message-new.vue"
import WidgetMessageSingleEdit from "../widgets/message/widget-message-single-edit.vue"
import WidgetMessageMulti from "../widgets/message/widget-message-multi.vue"


export default {
    name: "MessageDetail",
    props: ["id"],
    data: function () {
        var message = MessageService.get(this.id);
        return {
            
            conversations: ConversationService.list().filter(conversation => conversation.message == message.id),
            
            message: message
        }
    },
    components: {
        
        "WidgetConversationSingle": WidgetConversationSingle,
        
        "WidgetMessageSingle": WidgetMessageSingle,
        "WidgetMessageNew": WidgetMessageNew,
        "WidgetMessageSingleEdit": WidgetMessageSingleEdit,
        "WidgetMessageMulti": WidgetMessageMulti
       
    }
}
</script>>

<template>
    <div class="message-detail"> 
        <WidgetMessageSingle v-bind:id="message.id" />

        
        <WidgetConversationSingle v-for="(item, index) in conversations" :key="item.id" v-bind:id="item" />
        
        
    </div>

</template>

<style scoped> 



</style>