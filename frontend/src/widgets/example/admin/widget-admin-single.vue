<script>
import AdminService from "./service";

export default {
    name: "WidgetAdminSingle",
    props: ["admin"],
    data: function () {
        return AdminService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-admin-single"> 
        
    </div>

</template>

<style scoped> 



</style>