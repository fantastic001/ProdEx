<script>
import LoginService from "./service";

export default {
    name: "WidgetLoginNew",
    data: function () {
        return {
            data: {
	    	userName: null,
		password: null,
	    },
	    success: false
        };
    },
    methods: {
    	submit: function() 
	{
		LoginService.login(this.data).then(response => {
			if (response.data.code == 0) this.success = true;
			else success = false;

		});
	}
    }
}
</script>

<template>
    <div class="widget-login-new"> 
        <div v-if="success">Login succeded</div>
	<div v-if="!success"> 
		<p>
		<label>Username</label>
		<input type="text" v-model="data.userName" />
		</p>
		
		<p>
		<label>Password</label>
		<input type="text" v-model="data.password" />
		</p>
		

		<p><button v-on:click="submit">Submit</button></p>
	</div>
    </div>

</template>

<style scoped> 

</style>
