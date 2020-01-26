<script>


import WidgetUserMulti from "../widgets/User/WidgetUserMulti.vue"

export default {
    name: "UserList",
    data: function () {
            return {
		data: {},
	    };
	},
    mounted: function () 
    {
    },
    methods: {
    },
    components: {
        WidgetUserMulti,
    }
}
</script>

<template>
    <div class="user-list"> 
        <WidgetUserMulti />
    </div>

</template>

<style scoped> 



</style>
