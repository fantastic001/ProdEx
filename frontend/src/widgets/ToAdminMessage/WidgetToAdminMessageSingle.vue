<script>
import ToAdminMessageService from "./service";
import WidgetSellerSingle from "../Seller/WidgetSellerSingle.vue";
export default {
    name: "WidgetToAdminMessageSingle",
    props: ["toadminmessage"],
    data: function () {
        return {
            data: {}
        }
    },
    mounted: function () 
    {
        ToAdminMessageService.get(this.toadminmessage).then(response => this.data = response.data);
    },
    component: 
    {
        "WidgetSellerSingle": WidgetSellerSingle
    }
}
</script>

<template>
    <div class="widget-toadminmessage-single"> 
    <WidgetSellerSingle :seller="this.seller" />
    <h1>{{ data.title }}</h1>
    <div class="message-body">{{ data.body }}</div>
    </div>

</template>

<style scoped> 



</style>
