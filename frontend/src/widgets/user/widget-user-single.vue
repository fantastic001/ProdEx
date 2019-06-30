<script>
import UserService from "./service";

export default {
    name: "WidgetUserSingle",
    props: ["user"],
    data: function () {
        return {
            user: null
        }
    },
    mounted: function () 
    {
        UserService.get(this.user).then(response => this.user = response);
    }
}
</script>>

<template>
    <div class="widget-user-single"> 
        <p>{{ firstname }} {{ lastname }}</p>
        <p>{{ email}} </p>
    </div>

</template>

<style scoped> 



</style>