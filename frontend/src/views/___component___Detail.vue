<script>

{% for dependency in dependencies %}

import {{dependency | capitalize}}Service from "../widgets/{{ dependency }}/service"
import Widget{{ dependency | capitalize }}Single from "../widgets/{{  dependency }}/widget-{{ dependency }}-single.vue"

{% endfor %}

import {{component | capitalize}}Service from "../widgets/{{ component }}/service"
import Widget{{ component | capitalize }}Single from "../widgets/{{  component }}/widget-{{ component }}-single.vue"
import Widget{{ component | capitalize }}New from "../widgets/{{  component }}/widget-{{ component }}-new.vue"
import Widget{{ component | capitalize }}SingleEdit from "../widgets/{{  component }}/widget-{{ component }}-single-edit.vue"
import Widget{{ component | capitalize }}Multi from "../widgets/{{  component }}/widget-{{ component }}-multi.vue"


export default {
    name: "{{ component | capitalize }}Detail",
    props: ["id"],
    data: function () {
        var {{ component }} = {{ component | capitalize}}Service.get(this.id);
        return {
            {% for dependency in dependencies %}
            {{ dependency }}s: {{ dependency | capitalize }}Service.list().filter({{ dependency}} => {{ dependency }}.{{ component }} == {{ component}}.id),
            {% endfor %}
            {{ component }}: {{ component }}
        }
    },
    components: {
        {% for dependency in dependencies%}
        "Widget{{ dependency | capitalize }}Single": Widget{{ dependency | capitalize}}Single,
        {% endfor %}
        "Widget{{ component | capitalize }}Single": Widget{{ component | capitalize}}Single,
        "Widget{{ component | capitalize }}New": Widget{{ component | capitalize}}New,
        "Widget{{ component | capitalize }}SingleEdit": Widget{{ component | capitalize}}SingleEdit,
        "Widget{{ component | capitalize }}Multi": Widget{{ component | capitalize}}Multi
       
    }
}
</script>>

<template>
    <div class="{{ component }}-detail"> 
        <WidgetBuyerSingle v-bind:id="{{ component }}.id" />
        {% for dependency in dependencies%}
        <Widget{{ dependency | capitalize}}Single v-for="(item, index) in {{dependency}}s" :key="item.id" v-bind:id="item" />
        {% endfor %}
    </div>

</template>

<style scoped> 



</style>