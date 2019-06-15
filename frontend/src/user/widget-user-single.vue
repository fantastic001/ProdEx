<script>
import UserService from "./service";

export default {
    name: "WidgetUserSingle",
    props: ["id"],
    data: function () {
        return UserService.get(this.id);
    },
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