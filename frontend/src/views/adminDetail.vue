<script>


import UserService from "../widgets/user/service"
import WidgetUserSingle from "../widgets/user/widget-user-single.vue"

import FromadminmessageService from "../widgets/fromAdminMessage/service"
import WidgetFromadminmessageSingle from "../widgets/fromAdminMessage/widget-fromAdminMessage-single.vue"

import ToadminmessageService from "../widgets/toAdminMessage/service"
import WidgetToadminmessageSingle from "../widgets/toAdminMessage/widget-toAdminMessage-single.vue"


import AdminService from "../widgets/admin/service"
import WidgetAdminSingle from "../widgets/admin/widget-admin-single.vue"
import WidgetAdminNew from "../widgets/admin/widget-admin-new.vue"
import WidgetAdminSingleEdit from "../widgets/admin/widget-admin-single-edit.vue"
import WidgetAdminMulti from "../widgets/admin/widget-admin-multi.vue"


export default {
    name: "AdminDetail",
    props: ["id"],
    data: function () {
        var admin = AdminService.get(this.id);
        return {
            
            users: UserService.list().filter(user => user.admin == admin.id),
            
            fromAdminMessages: FromadminmessageService.list().filter(fromAdminMessage => fromAdminMessage.admin == admin.id),
            
            toAdminMessages: ToadminmessageService.list().filter(toAdminMessage => toAdminMessage.admin == admin.id),
            
            admin: admin
        }
    },
    components: {
        
        "WidgetUserSingle": WidgetUserSingle,
        
        "WidgetFromadminmessageSingle": WidgetFromadminmessageSingle,
        
        "WidgetToadminmessageSingle": WidgetToadminmessageSingle,
        
        "WidgetAdminSingle": WidgetAdminSingle,
        "WidgetAdminNew": WidgetAdminNew,
        "WidgetAdminSingleEdit": WidgetAdminSingleEdit,
        "WidgetAdminMulti": WidgetAdminMulti
       
    }
}
</script>>

<template>
    <div class="admin-detail"> 
        <WidgetAdminSingle v-bind:id="admin.id" />

        
        <WidgetUserSingle v-for="(item, index) in users" :key="item.id" v-bind:id="item" />
        
        
        <WidgetFromadminmessageSingle v-for="(item, index) in fromAdminMessages" :key="item.id" v-bind:id="item" />
        
        
        <WidgetToadminmessageSingle v-for="(item, index) in toAdminMessages" :key="item.id" v-bind:id="item" />
        
        
    </div>

</template>

<style scoped> 



</style>