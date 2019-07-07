<script>


import WidgetUserMulti from "../widgets/User/WidgetUserMulti.vue"

import WidgetItemMulti from "../widgets/Item/WidgetItemMulti.vue"


import CityService from "../widgets/City/service"
import WidgetCitySingle from "../widgets/City/WidgetCitySingle.vue"
import WidgetCitySingleEdit from "../widgets/City/WidgetCitySingleEdit.vue"
import WidgetCityMulti from "../widgets/City/WidgetCityMulti.vue"
import WidgetCityNew from "../widgets/City/WidgetCityNew.vue"


export default {
    name: "CityDetail",
    props: ["city"],
    data: function () {
            return {
		data: {}
	    };
	}
    },
    mounted: function () 
    {
    	CityService.get(city).then(response => this.data = response.data)
    }
    components: {
        
        "WidgetUserMulti": WidgetUserMulti,
        
        "WidgetItemMulti": WidgetItemMulti,
        
        "WidgetCitySingle": WidgetCitySingle,
        "WidgetCityNew": WidgetCityNew,
        "WidgetCitySingleEdit": WidgetCitySingleEdit,
        "WidgetCityMulti": WidgetCityMulti
    }
}
</script>>

<template>
    <div class="City-detail"> 
        <WidgetCitySingle :city="city" />

        
        <WidgetUserMulti :filter="x => x.city == city"/>
        
        
        <WidgetItemMulti :filter="x => x.city == city"/>
        
        
    </div>

</template>

<style scoped> 



</style>