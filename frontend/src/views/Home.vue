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
    name: "Home",
    data: function () {
            return {
		data: {},
		role: ""
	    };
	},
    mounted: function () 
    {
    	this.role = localStorage.getItem("role");
    },
    methods: {
    },
    components: {
        
    }
}
</script>

<template>
<div>
<p>This is home for role {{ role }}</p>
</div>
</template>

<style scoped> 



</style>
