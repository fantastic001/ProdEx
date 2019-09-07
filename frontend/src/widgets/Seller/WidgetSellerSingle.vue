<script>
import SellerService from "./service";
import WidgetUserSingle from "../User/WidgetUserSingle.vue";

export default {
    name: "WidgetSellerSingle",
    props: ["seller"],
    data: function () {
        return {
            data: {}
        }
    },
    mounted: function () 
    {
        SellerService.get(this.seller).then(response => this.data = response.data);
    },
    components: {
        "WidgetUserSingle": WidgetUserSingle
    }
}
</script>

<template>
    <div class="widget-seller-single">
    <WidgetUserSingle :user="this.user" />
    </div>

</template>

<style scoped> 



</style>
