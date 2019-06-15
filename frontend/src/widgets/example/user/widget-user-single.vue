<script>
import UserService from "./service";

export default {
    name: "WidgetUserSingle",
    props: ["user"],
    data: function () {
        return UserService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-user-single"> 
        
    </div>

</template>

<style scoped> 



</style>