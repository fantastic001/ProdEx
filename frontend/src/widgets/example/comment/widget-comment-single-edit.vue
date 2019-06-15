<script>
import CommentService from "./service";

export default {
    name: "WidgetCommentSingleEdit",
    props: ["comment"],
    data: function () {
        return CommentService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-comment-single-edit"> 
        
    </div>

</template>

<style scoped> 



</style>