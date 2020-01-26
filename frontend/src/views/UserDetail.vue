<script>


import WidgetConversationMulti from "../widgets/Conversation/WidgetConversationMulti.vue"

import WidgetFromAdminMessageMulti from "../widgets/FromAdminMessage/WidgetFromAdminMessageMulti.vue"


import UserService from "../widgets/User/service"

import AdminDetail from "./AdminDetail.vue";
import BuyerDetail from "./BuyerDetail.vue";
import SellerDetail from "./SellerDetail.vue";


export default {
    name: "UserDetail",
    props: ["id"],
    data: function () {
            return {
		data: {},
		type: "",
		foreign_key: 0
	    };
	},
    mounted: function () 
    {
    	UserService.type(this.id).then(response => {
		this.type = response.data.message;
		this.foreign_key = response.data.code;
	})
    },
    methods: {
        itemDelete: function (event) 
        {
            UserService.delete(this.user).then(response => 
            {
                if (response.status < 400) 
                {
                    alert("User item is deleted");
                }
            })
        }
    },
    components: {
        AdminDetail,
	BuyerDetail,
	SellerDetail
    }
}
</script>

<template>
    <div class="User-detail"> 
        <button v-on:click="itemDelete">Delete</button>

	<BuyerDetail v-if="this.type == 'BUYER'" :buyer="this.foreign_key" />
	<AdminDetail v-if="this.type == 'ADMIN'" :admin="this.foreign_key" />
	<SellerDetail v-if="this.type == 'SELLER'" :seller="this.foreign_key" />
        
        <WidgetConversationMulti :filter="x => x.user == this.user"/>
        
        
        <WidgetFromAdminMessageMulti :filter="x => x.user == this.user"/>
        
        
    </div>

</template>

<style scoped> 



</style>
