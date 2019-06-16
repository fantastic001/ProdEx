<script>



import CommentService from "../widgets/comment/service"
import WidgetCommentSingle from "../widgets/comment/widget-comment-single.vue"
import WidgetCommentNew from "../widgets/comment/widget-comment-new.vue"
import WidgetCommentSingleEdit from "../widgets/comment/widget-comment-single-edit.vue"
import WidgetCommentMulti from "../widgets/comment/widget-comment-multi.vue"


export default {
    name: "CommentDetail",
    props: ["id"],
    data: function () {
        var comment = CommentService.get(this.id);
        return {
            
            comment: comment
        }
    },
    components: {
        
        "WidgetCommentSingle": WidgetCommentSingle,
        "WidgetCommentNew": WidgetCommentNew,
        "WidgetCommentSingleEdit": WidgetCommentSingleEdit,
        "WidgetCommentMulti": WidgetCommentMulti
       
    }
}
</script>>

<template>
    <div class="comment-detail"> 
        <WidgetCommentSingle v-bind:id="comment.id" />

        
    </div>

</template>

<style scoped> 



</style>