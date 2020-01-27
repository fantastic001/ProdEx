<script>


import WidgetUserMulti from "../widgets/User/WidgetUserMulti.vue"

import WidgetFromAdminMessageMulti from "../widgets/FromAdminMessage/WidgetFromAdminMessageMulti.vue"

import WidgetToAdminMessageMulti from "../widgets/ToAdminMessage/WidgetToAdminMessageMulti.vue"


import AdminService from "../widgets/Admin/service"
import WidgetAdminSingle from "../widgets/Admin/WidgetAdminSingle.vue"
import WidgetAdminSingleEdit from "../widgets/Admin/WidgetAdminSingleEdit.vue"
import WidgetAdminMulti from "../widgets/Admin/WidgetAdminMulti.vue"
import WidgetItemMulti from "../widgets/Item/WidgetItemMulti.vue";


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
    	filter: function(item) {
		console.log("filtering item: ");
		console.log(item);
		return true;
	}
    },
    components: {
    	WidgetItemMulti
        
    }
}
</script>

<template>
<div>
<WidgetItemMulti :filter="this.filter" ref="items"/>
</div>
</template>

<style scoped> 



</style>
