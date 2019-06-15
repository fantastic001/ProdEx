<script>
import UserService from "./service";

export default {
    name: "WidgetUserSingleEdit",
    props: ["user"],
    data: function () {
        return UserService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-user-single-edit"> 
        
    </div>

</template>

<style scoped> 



</style>