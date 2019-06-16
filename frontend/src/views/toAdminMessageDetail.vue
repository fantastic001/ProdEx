<script>



import ToadminmessageService from "../widgets/toAdminMessage/service"
import WidgetToadminmessageSingle from "../widgets/toAdminMessage/widget-toAdminMessage-single.vue"
import WidgetToadminmessageNew from "../widgets/toAdminMessage/widget-toAdminMessage-new.vue"
import WidgetToadminmessageSingleEdit from "../widgets/toAdminMessage/widget-toAdminMessage-single-edit.vue"
import WidgetToadminmessageMulti from "../widgets/toAdminMessage/widget-toAdminMessage-multi.vue"


export default {
    name: "ToadminmessageDetail",
    props: ["id"],
    data: function () {
        var toAdminMessage = ToadminmessageService.get(this.id);
        return {
            
            toAdminMessage: toAdminMessage
        }
    },
    components: {
        
        "WidgetToadminmessageSingle": WidgetToadminmessageSingle,
        "WidgetToadminmessageNew": WidgetToadminmessageNew,
        "WidgetToadminmessageSingleEdit": WidgetToadminmessageSingleEdit,
        "WidgetToadminmessageMulti": WidgetToadminmessageMulti
       
    }
}
</script>>

<template>
    <div class="toAdminMessage-detail"> 
        <WidgetToadminmessageSingle v-bind:id="toAdminMessage.id" />

        
    </div>

</template>

<style scoped> 



</style>