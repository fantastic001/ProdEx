<script>


import WidgetConversationMulti from "../widgets/Conversation/WidgetConversationMulti.vue"


import MessageService from "../widgets/Message/service"
import WidgetMessageSingle from "../widgets/Message/WidgetMessageSingle.vue"
import WidgetMessageSingleEdit from "../widgets/Message/WidgetMessageSingleEdit.vue"
import WidgetMessageMulti from "../widgets/Message/WidgetMessageMulti.vue"
import WidgetMessageNew from "../widgets/Message/WidgetMessageNew.vue"


export default {
    name: "MessageDetail",
    props: ["message"],
    data: function () {
            return {
		data: {}
	    };
	}
    },
    mounted: function () 
    {
    	MessageService.get(message).then(response => this.data = response.data)
    }
    components: {
        
        "WidgetConversationMulti": WidgetConversationMulti,
        
        "WidgetMessageSingle": WidgetMessageSingle,
        "WidgetMessageNew": WidgetMessageNew,
        "WidgetMessageSingleEdit": WidgetMessageSingleEdit,
        "WidgetMessageMulti": WidgetMessageMulti
    }
}
</script>>

<template>
    <div class="Message-detail"> 
        <WidgetMessageSingle :message="message" />

        
        <WidgetConversationMulti :filter="x => x.message == message"/>
        
        
    </div>

</template>

<style scoped> 



</style>