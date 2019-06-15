<script>
import CommentService from "./service";
import WidgetCommentSingle from "./widget-comment-single.vue"


export default {
    name: "WidgetCommentMulti",
    data: function () {
        return {items: CommentService.list()};
    },
    components: {
    	"WidgetCommentSingle": WidgetCommentSingle
    }
}
</script>>

<template>
    <div class="widget-comment-multi"> 
      <WidgetCommentSingle
      	v-for="item in items"
      	v-bind:id="item"
      	v-bind:key="item.id"/>
    </div>

</template>

<style scoped> 



</style>