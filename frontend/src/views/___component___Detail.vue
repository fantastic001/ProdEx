<script>

{% for dependency in dependencies %}
import {{dependency | capitalize}}Service from "../widgets/{{ dependency }}/service"
import Widget{{ dependency | capitalize }}Single from "../widgets/{{  dependency }}/widget-{{ dependency }}-single.vue"
{% endfor %}

import {{name | capitalize}}Service from "../widgets/{{ name }}/service"
import Widget{{ name | capitalize }}Single from "../widgets/{{  name }}/widget-{{ name }}-single.vue"
import Widget{{ name | capitalize }}New from "../widgets/{{  name }}/widget-{{ name }}-new.vue"
import Widget{{ name | capitalize }}SingleEdit from "../widgets/{{  name }}/widget-{{ name }}-single-edit.vue"
import Widget{{ name | capitalize }}Multi from "../widgets/{{  name }}/widget-{{ name }}-multi.vue"


export default {
    name: "{{ name | capitalize }}Detail",
    props: ["id"],
    data: function () {
        var {{ name }} = {{ name | capitalize}}Service.get(this.id);
        return {
            {% for dependency in dependencies %}
            {{ dependency }}s: {{ dependency | capitalize }}Service.list().filter({{ dependency}} => {{ dependency }}.{{ name }} == {{ name}}.id),
            {% endfor %}
            {{ name }}: {{ name }}
        }
    },
    components: {
        {% for dependency in dependencies%}
        "Widget{{ dependency | capitalize }}Single": Widget{{ dependency | capitalize}}Single,
        {% endfor %}
        "Widget{{ name | capitalize }}Single": Widget{{ name | capitalize}}Single,
        "Widget{{ name | capitalize }}New": Widget{{ name | capitalize}}New,
        "Widget{{ name | capitalize }}SingleEdit": Widget{{ name | capitalize}}SingleEdit,
        "Widget{{ name | capitalize }}Multi": Widget{{ name | capitalize}}Multi
       
    }
}
</script>>

<template>
    <div class="{{ name }}-detail"> 
        <Widget{{ name | capitalize }}Single v-bind:id="{{ name }}.id" />

        {% for dependency in dependencies%}
        <Widget{{ dependency | capitalize}}Single v-for="(item, index) in {{dependency}}s" :key="item.id" v-bind:id="item" />
        
        {% endfor %}
    </div>

</template>

<style scoped> 



</style>