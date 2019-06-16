<script>


import ConversationService from "../widgets/conversation/service"
import WidgetConversationSingle from "../widgets/conversation/widget-conversation-single.vue"

import FromadminmessageService from "../widgets/fromAdminMessage/service"
import WidgetFromadminmessageSingle from "../widgets/fromAdminMessage/widget-fromAdminMessage-single.vue"


import UserService from "../widgets/user/service"
import WidgetUserSingle from "../widgets/user/widget-user-single.vue"
import WidgetUserNew from "../widgets/user/widget-user-new.vue"
import WidgetUserSingleEdit from "../widgets/user/widget-user-single-edit.vue"
import WidgetUserMulti from "../widgets/user/widget-user-multi.vue"


export default {
    name: "UserDetail",
    props: ["id"],
    data: function () {
        var user = UserService.get(this.id);
        return {
            
            conversations: ConversationService.list().filter(conversation => conversation.user == user.id),
            
            fromAdminMessages: FromadminmessageService.list().filter(fromAdminMessage => fromAdminMessage.user == user.id),
            
            user: user
        }
    },
    components: {
        
        "WidgetConversationSingle": WidgetConversationSingle,
        
        "WidgetFromadminmessageSingle": WidgetFromadminmessageSingle,
        
        "WidgetUserSingle": WidgetUserSingle,
        "WidgetUserNew": WidgetUserNew,
        "WidgetUserSingleEdit": WidgetUserSingleEdit,
        "WidgetUserMulti": WidgetUserMulti
       
    }
}
</script>>

<template>
    <div class="user-detail"> 
        <WidgetUserSingle v-bind:id="user.id" />

        
        <WidgetConversationSingle v-for="(item, index) in conversations" :key="item.id" v-bind:id="item" />
        
        
        <WidgetFromadminmessageSingle v-for="(item, index) in fromAdminMessages" :key="item.id" v-bind:id="item" />
        
        
    </div>

</template>

<style scoped> 



</style>