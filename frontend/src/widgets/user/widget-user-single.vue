<script>
import UserService from "./service";

export default {
    name: "WidgetUserSingle",
    props: ["user"],
    data: function () {
        return {
            data: {}
        }
    },
    mounted: function () 
    {
        UserService.get(this.user).then(response => this.data = response.data);
    }
}
</script>

<template>
    <div class="widget-user-single"> 
        <p>{{ data.firstname }} {{ data.lastname }}</p>
        <p>{{ data.email}} </p>
    </div>

</template>

<style scoped> 



</style>
