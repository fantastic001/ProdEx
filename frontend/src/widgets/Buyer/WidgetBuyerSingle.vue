<script>
import BuyerService from "./service";
import UserService from "../User/service";
export default {
    name: "WidgetBuyerSingle",
    props: ["buyer"],
    data: function () {
        return {
            data: {}
        }
    },
    mounted: function () 
    {
        BuyerService.get(this.buyer).then(response => {
		this.data = response.data;
		UserService.get(this.data.user).then(response => this.data = response.data)
	});
    }
}
</script>

<template>
    <div class="widget-buyer-single"> 
    {{ data.firstname }} {{ data.lastname }} 
    <div class="details"> 
    	<ul>
		<li>{{ data.phone }}</li>
		<li>{{ data.email }}</li>
		<li>Joined on {{ data.registrationDate }}</li>
	</ul>
    </div>
    </div>

</template>

<style scoped> 



</style>
