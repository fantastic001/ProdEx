<script>
import {{ component | capitalize }}Service from "./service";

export default {
    name: "Widget{{ component | capitalize}}SingleEdit",
    props: ["{{component}}"],
    data: function () {
        return {{component | capitalize}}Service.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-{{component}}-single-edit"> 
        
    </div>

</template>

<style scoped> 



</style>
