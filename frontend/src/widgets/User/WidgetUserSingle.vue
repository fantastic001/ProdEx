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
    <p>Username: {{ username }}</p>
    <p>Name: {{ firstname }} {{ lastname }}</p>
    <p>E-Mail: {{ email }}</p>
    </div>

</template>

<style scoped> 


.widget-user-single {
	padding: 10px; 
	background-color: #cceeee; 
	margin: 10px;
	color: blue;
	border: solid;
	border-width: 4px;
	border-color: blue;
}

</style>
