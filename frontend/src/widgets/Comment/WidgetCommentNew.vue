<script>
import CommentService from "./service";

export default {
    name: "WidgetCommentNew",
    props: ["item"],
    data: function () {
        return {
            data: {}
        };
    },
    methods: {
    	create: function() 
	{
		CommentService.create(this.data).then(response => this.data = {user: 0, item: this.item, body: ""});
	}
    }
}
</script>

<template>
    <div class="widget-comment-new"> 
        <div class="input-group mb-3">
  		<input v-model="data.body" type="text" class="form-control" placeholder="Write a comment..." />
  		<div class="input-group-append">
    		<button @click="create" class="btn btn-outline-secondary" type="button">Send</button>
  	</div>
    </div>

    </div>

</template>

<style scoped> 



</style>
