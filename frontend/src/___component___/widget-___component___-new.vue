<script>
import {{ component | capitalize }}Service from "./service";

export default {
    name: "Widget{{ component | capitalize}}New",
    data: function () {
        return {};
    },
}
</script>>

<template>
    <div class="widget-{{component}}-new"> 
        
    </div>

</template>

<style scoped> 



</style>
