<script>



import FromAdminMessageService from "../widgets/FromAdminMessage/service"
import WidgetFromAdminMessageSingle from "../widgets/FromAdminMessage/WidgetFromAdminMessageSingle.vue"
import WidgetFromAdminMessageSingleEdit from "../widgets/FromAdminMessage/WidgetFromAdminMessageSingleEdit.vue"
import WidgetFromAdminMessageMulti from "../widgets/FromAdminMessage/WidgetFromAdminMessageMulti.vue"
import WidgetFromAdminMessageNew from "../widgets/FromAdminMessage/WidgetFromAdminMessageNew.vue"


export default {
    name: "FromAdminMessageDetail",
    props: ["fromadminmessage"],
    data: function () {
            return {
		data: {}
	    };
	}
    },
    mounted: function () 
    {
    	FromAdminMessageService.get(fromadminmessage).then(response => this.data = response.data)
    }
    components: {
        
        "WidgetFromAdminMessageSingle": WidgetFromAdminMessageSingle,
        "WidgetFromAdminMessageNew": WidgetFromAdminMessageNew,
        "WidgetFromAdminMessageSingleEdit": WidgetFromAdminMessageSingleEdit,
        "WidgetFromAdminMessageMulti": WidgetFromAdminMessageMulti
    }
}
</script>>

<template>
    <div class="FromAdminMessage-detail"> 
        <WidgetFromAdminMessageSingle :fromadminmessage="fromadminmessage" />

        
    </div>

</template>

<style scoped> 



</style>