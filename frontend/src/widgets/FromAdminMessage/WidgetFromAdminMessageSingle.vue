<script>
import FromAdminMessageService from "./service";
import WidgetAdminSingle from "../Admin/WidgetAdminSingle.vue";
import WidgetUserSingle from "../User/WidgetUserSingle.vue";

export default {
    name: "WidgetFromAdminMessageSingle",
    props: ["fromadminmessage"],
    data: function () {
        return {
            data: {}
        }
    },
    mounted: function () 
    {
        FromAdminMessageService.get(this.fromadminmessage).then(response => this.data = response.data);
    },
    components: {
    	"WidgetAdminSingle": WidgetAdminSingle,
	"WidgetUserSingle": WidgetUserSingle
    }
}
</script>

<template>
    <div class="widget-fromadminmessage-single"> 
	<div class="message-sender"><WidgetAdminSingle admin="this.admin" /></div> 
	<div class="message-to"><WidgetUserSingle user="this.user" /></div> 
	<div class="message-title">{{ data.title }}</div>
	<div class="message-body">{{ data.body }}</div>

    </div>

</template>

<style scoped> 



</style>
