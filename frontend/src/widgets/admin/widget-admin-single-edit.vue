<script>
import AdminService from "./service";

export default {
    name: "WidgetAdminSingleEdit",
    props: ["id"],
    data: function () {
        return AdminService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-admin-single-edit"> 
        
    </div>

</template>

<style scoped> 



</style>