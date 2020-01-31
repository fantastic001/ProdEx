<script>
import ItemService from "./service";

export default {
    name: "WidgetItemNew",
    data: function () {
        return {
            data: {
		name: "",
		description: "",
		seller: localStorage.getItem("seller_id"),
		city: null,
		category: null,
		active: true,
		"image": null,
		"price": 0,
		"likes": 0,
		"dislikes": 0,
		"dueDate": null,
		"creationDate": null,
		"shipped": false,


	    }
        };
    },
    methods: {
	submit: function() {
		ItemService.create(this.data).then(response => {
			this.$router.push("/items/" + response.data.id);
		});
	}
    }
}
</script>

<template>
<div class="widget-item-new"> 

<input type="text" class="form-control" v-model="data.name" placeholder="Item name" />
<input type="text" class="form-control" v-model="data.description" placeholder="Item description" />
<input type="number" class="form-control" v-model="data.price" placeholder="Price" />
<input type="date" class="form-control" v-model="data.dueDate" placeholder="Item due date" />
<button class="btn btn-primary" @click="submit">Create</button>


</div>

</template>

<style scoped> 



</style>
