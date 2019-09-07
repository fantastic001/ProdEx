<script>
import CommentService from "./service";
import UserService from "../User/service"
export default {
    name: "WidgetCommentSingle",
    props: ["comment"],
    data: function () {
        return {
            data: {},
	    author: {}
        }
    },
    mounted: function () 
    {
        CommentService.get(this.comment).then(response => {
		this.data = response.data;
		UserService.get(this.data.user).then(response => this.author = response.data)
	});
    }
}
</script>

<template>
    <div class="widget-comment-single"> 
    <div class="comment-author">{{ author.firstname }} {{ author.lastname }}</div>
    <div class="comment-body"> 
	<p>{{ data.body }}</p>
    </div>
    </div>

</template>

<style scoped> 



</style>
