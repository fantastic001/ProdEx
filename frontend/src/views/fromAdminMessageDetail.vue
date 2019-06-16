<script>



import FromadminmessageService from "../widgets/fromAdminMessage/service"
import WidgetFromadminmessageSingle from "../widgets/fromAdminMessage/widget-fromAdminMessage-single.vue"
import WidgetFromadminmessageNew from "../widgets/fromAdminMessage/widget-fromAdminMessage-new.vue"
import WidgetFromadminmessageSingleEdit from "../widgets/fromAdminMessage/widget-fromAdminMessage-single-edit.vue"
import WidgetFromadminmessageMulti from "../widgets/fromAdminMessage/widget-fromAdminMessage-multi.vue"


export default {
    name: "FromadminmessageDetail",
    props: ["id"],
    data: function () {
        var fromAdminMessage = FromadminmessageService.get(this.id);
        return {
            
            fromAdminMessage: fromAdminMessage
        }
    },
    components: {
        
        "WidgetFromadminmessageSingle": WidgetFromadminmessageSingle,
        "WidgetFromadminmessageNew": WidgetFromadminmessageNew,
        "WidgetFromadminmessageSingleEdit": WidgetFromadminmessageSingleEdit,
        "WidgetFromadminmessageMulti": WidgetFromadminmessageMulti
       
    }
}
</script>>

<template>
    <div class="fromAdminMessage-detail"> 
        <WidgetFromadminmessageSingle v-bind:id="fromAdminMessage.id" />

        
    </div>

</template>

<style scoped> 



</style>