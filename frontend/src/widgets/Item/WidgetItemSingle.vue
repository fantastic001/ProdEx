<script>
import ItemService from "./service";
import OrderService from "../Order/service";

export default {
    name: "WidgetItemSingle",
    props: ["item"],
    data: function () {
        return {
            data: {},
	    status: 1,
	    ordered: false
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
	},
	orderItem: function() 
	{
		OrderService.create({
			item: this.item,
			buyer: null,
			status: null
		}).then(response => {
			this.ordered = (response.data != null)
        		ItemService.getStatus(this.item).then(response => this.status = response.data.code);
		});
	},
	updateStatus: function() 
	{
		ItemService.updateStatus(this.item).then(response => {
        		ItemService.getStatus(this.item).then(response => this.status = response.data.code);
		});

	}
    }
}
</script>

<template>
    <div class="widget-item-single"> 
    <span class="badge badge-pill badge-info">Item: {{this.item}} </span>

    <div class="card" style="width: 18rem;">
      <img class="card-img-top" alt="Item image" :src="data.image" />
      <div class="card-body">
        <h5 class="card-title">{{data.name }}</h5>
        <p class="card-text item-description">{{ data.description }}</p>
      </div>

    
     <ul class="list-group list-group-flush">
        <li class="list-group-item">Price: {{ data.price}}</li>
        <li class="list-group-item">Due date: {{ data.dueDate}}</li>
        <li class="list-group-item">Created: {{ data.creationDate}}</li>
     </ul>


    <div class="card-body">
      <button class="btn btn-danger" @click="deleteItem" v-if="this.status == 0 || this.status == -1">Delete</button>
      <button class="btn btn-primary" @click="orderItem" v-if="this.status == -1">Order</button>
      <button class="btn btn-primary" @click="updateStatus" v-if="this.status == 0">Ship</button>
      <button class="btn btn-primary" @click="updateStatus" v-if="this.status == 1">Confirm shipped</button>
    </div>
    </div>
    </div>

</template>

<style scoped> 



</style>
