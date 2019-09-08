<script>
import ItemService from "./service";

export default {
    name: "WidgetItemSingle",
    props: ["item"],
    data: function () {
        return {
            data: {},
	    status: 1
        }
    },
    mounted: function () 
    {
        ItemService.get(this.item).then(response => this.data = response.data);
        ItemService.getStatus(this.item).then(response => this.status = response.data.code);
    },
    methods: 
    {
    	deleteItem: function() 
	{
		ItemService.delete(this.item).then(response => this.data = {});
	}
    }
}
</script>

<template>
    <div class="widget-item-single"> 
    Item (id={{ data.id }}):

    <h2>{{data.name }}</h2>
    <div class="item-description">{{ data.description }}</div>
    <div class="item-image"><img :src="data.image"></div>
    <div class="details">
        <p>Price: {{ data.price}}</p>
        <p>Due date: {{ data.dueDate}}</p>
        <p>Creation date: {{ data.creationDate}}</p>
    </div>
    <button @click="deleteItem" v-if="this.status == 0">Delete</button>
    </div>

</template>

<style scoped> 



</style>
