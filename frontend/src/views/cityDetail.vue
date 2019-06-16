<script>


import UserService from "../widgets/user/service"
import WidgetUserSingle from "../widgets/user/widget-user-single.vue"

import ItemService from "../widgets/item/service"
import WidgetItemSingle from "../widgets/item/widget-item-single.vue"


import CityService from "../widgets/city/service"
import WidgetCitySingle from "../widgets/city/widget-city-single.vue"
import WidgetCityNew from "../widgets/city/widget-city-new.vue"
import WidgetCitySingleEdit from "../widgets/city/widget-city-single-edit.vue"
import WidgetCityMulti from "../widgets/city/widget-city-multi.vue"


export default {
    name: "CityDetail",
    props: ["id"],
    data: function () {
        var city = CityService.get(this.id);
        return {
            
            users: UserService.list().filter(user => user.city == city.id),
            
            items: ItemService.list().filter(item => item.city == city.id),
            
            city: city
        }
    },
    components: {
        
        "WidgetUserSingle": WidgetUserSingle,
        
        "WidgetItemSingle": WidgetItemSingle,
        
        "WidgetCitySingle": WidgetCitySingle,
        "WidgetCityNew": WidgetCityNew,
        "WidgetCitySingleEdit": WidgetCitySingleEdit,
        "WidgetCityMulti": WidgetCityMulti
       
    }
}
</script>>

<template>
    <div class="city-detail"> 
        <WidgetCitySingle v-bind:id="city.id" />

        
        <WidgetUserSingle v-for="(item, index) in users" :key="item.id" v-bind:id="item" />
        
        
        <WidgetItemSingle v-for="(item, index) in items" :key="item.id" v-bind:id="item" />
        
        
    </div>

</template>

<style scoped> 



</style>