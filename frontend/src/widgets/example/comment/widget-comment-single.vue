<script>
import CommentService from "./service";

export default {
    name: "WidgetCommentSingle",
    props: ["id"],
    data: function () {
        return CommentService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-comment-single"> 
        
    </div>

</template>

<style scoped> 



</style>