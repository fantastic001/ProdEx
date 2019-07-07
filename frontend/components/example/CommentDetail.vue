<script>



import CommentService from "../widgets/Comment/service"
import WidgetCommentSingle from "../widgets/Comment/WidgetCommentSingle.vue"
import WidgetCommentSingleEdit from "../widgets/Comment/WidgetCommentSingleEdit.vue"
import WidgetCommentMulti from "../widgets/Comment/WidgetCommentMulti.vue"
import WidgetCommentNew from "../widgets/Comment/WidgetCommentNew.vue"


export default {
    name: "CommentDetail",
    props: ["comment"],
    data: function () {
            return {
		data: {}
	    };
	}
    },
    mounted: function () 
    {
    	CommentService.get(comment).then(response => this.data = response.data)
    }
    components: {
        
        "WidgetCommentSingle": WidgetCommentSingle,
        "WidgetCommentNew": WidgetCommentNew,
        "WidgetCommentSingleEdit": WidgetCommentSingleEdit,
        "WidgetCommentMulti": WidgetCommentMulti
    }
}
</script>>

<template>
    <div class="Comment-detail"> 
        <WidgetCommentSingle :comment="comment" />

        
    </div>

</template>

<style scoped> 



</style>