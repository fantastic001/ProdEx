<script>



import ConversationService from "../widgets/Conversation/service"
import WidgetConversationSingle from "../widgets/Conversation/WidgetConversationSingle.vue"
import WidgetConversationSingleEdit from "../widgets/Conversation/WidgetConversationSingleEdit.vue"
import WidgetConversationMulti from "../widgets/Conversation/WidgetConversationMulti.vue"
import WidgetConversationNew from "../widgets/Conversation/WidgetConversationNew.vue"


export default {
    name: "ConversationDetail",
    props: ["conversation"],
    data: function () {
            return {
		data: {}
	    };
	}
    },
    mounted: function () 
    {
    	ConversationService.get(conversation).then(response => this.data = response.data)
    }
    components: {
        
        "WidgetConversationSingle": WidgetConversationSingle,
        "WidgetConversationNew": WidgetConversationNew,
        "WidgetConversationSingleEdit": WidgetConversationSingleEdit,
        "WidgetConversationMulti": WidgetConversationMulti
    }
}
</script>>

<template>
    <div class="Conversation-detail"> 
        <WidgetConversationSingle :conversation="conversation" />

        
    </div>

</template>

<style scoped> 



</style>