<script>


import WidgetConversationMulti from "../widgets/Conversation/WidgetConversationMulti.vue"

import WidgetFromAdminMessageMulti from "../widgets/FromAdminMessage/WidgetFromAdminMessageMulti.vue"


import UserService from "../widgets/User/service"
import WidgetUserSingle from "../widgets/User/WidgetUserSingle.vue"
import WidgetUserSingleEdit from "../widgets/User/WidgetUserSingleEdit.vue"
import WidgetUserMulti from "../widgets/User/WidgetUserMulti.vue"
import WidgetUserNew from "../widgets/User/WidgetUserNew.vue"


export default {
    name: "UserDetail",
    props: ["user"],
    data: function () {
            return {
		data: {}
	    };
	}
    },
    mounted: function () 
    {
    	UserService.get(user).then(response => this.data = response.data)
    }
    components: {
        
        "WidgetConversationMulti": WidgetConversationMulti,
        
        "WidgetFromAdminMessageMulti": WidgetFromAdminMessageMulti,
        
        "WidgetUserSingle": WidgetUserSingle,
        "WidgetUserNew": WidgetUserNew,
        "WidgetUserSingleEdit": WidgetUserSingleEdit,
        "WidgetUserMulti": WidgetUserMulti
    }
}
</script>>

<template>
    <div class="User-detail"> 
        <WidgetUserSingle :user="user" />

        
        <WidgetConversationMulti :filter="x => x.user == user"/>
        
        
        <WidgetFromAdminMessageMulti :filter="x => x.user == user"/>
        
        
    </div>

</template>

<style scoped> 



</style>