<script>


import WidgetUserMulti from "../widgets/User/WidgetUserMulti.vue"

import WidgetFromAdminMessageMulti from "../widgets/FromAdminMessage/WidgetFromAdminMessageMulti.vue"

import WidgetToAdminMessageMulti from "../widgets/ToAdminMessage/WidgetToAdminMessageMulti.vue"


import AdminService from "../widgets/Admin/service"
import WidgetAdminSingle from "../widgets/Admin/WidgetAdminSingle.vue"
import WidgetAdminSingleEdit from "../widgets/Admin/WidgetAdminSingleEdit.vue"
import WidgetAdminMulti from "../widgets/Admin/WidgetAdminMulti.vue"
import WidgetAdminNew from "../widgets/Admin/WidgetAdminNew.vue"


export default {
    name: "AdminDetail",
    props: ["admin"],
    data: function () {
            return {
		data: {}
	    };
	},
    mounted: function () 
    {
    	AdminService.get(this.admin).then(response => this.data = response.data)
    },
    components: {
        
        "WidgetUserMulti": WidgetUserMulti,
        
        "WidgetFromAdminMessageMulti": WidgetFromAdminMessageMulti,
        
        "WidgetToAdminMessageMulti": WidgetToAdminMessageMulti,
        
        "WidgetAdminSingle": WidgetAdminSingle,
        "WidgetAdminNew": WidgetAdminNew,
        "WidgetAdminSingleEdit": WidgetAdminSingleEdit,
        "WidgetAdminMulti": WidgetAdminMulti
    }
}
</script>>

<template>
    <div class="Admin-detail"> 
        <WidgetAdminSingle :admin="this.admin" />

        
        <WidgetUserMulti :filter="x => x.id == this.data.id"/>
        
        
        <WidgetFromAdminMessageMulti :filter="x => x.admin == this.admin"/>
        
        
        <WidgetToAdminMessageMulti :filter="x => x.admin == this.admin"/>
        
        
    </div>

</template>

<style scoped> 



</style>
