package com.stefan.prodex.data;

import java.util.Date;

public class {{ component }} {
	
	{% for field, type in fields.items() %}
	private {% if type not in ["int", "float", "double", "boolean", "String", "Date"]%}int{%else%}{{ type }}{%endif%} {{ field}}; 
	{% endfor %}
	public {{ component }}() 
	{
	}
	public {{ component }}({% for field, type in fields.items() %}{% if type not in ["int", "float", "double", "boolean", "String", "Date"]%}int{%else%}{{ type }}{%endif%} _{{ field }}{% if not loop.last %}, {% endif %}{% endfor %}) {
		super();
		{% for field, type in fields.items() %} 
		this.{{ field }} = _{{ field }};
		{% endfor %}
	}
	
	{% for field, type in fields.items() %} 
	public {% if type not in ["int", "float", "double", "boolean", "String", "Date"]%}int{%else%}{{ type }}{%endif%} get{{field[0].capitalize() + field[1:] }}() 
	{
		return this.{{ field }};
	}

	public void set{{field[0].capitalize() + field[1:] }}({% if type not in ["int", "float", "double", "boolean", "String", "Date"]%}int{%else%}{{ type }}{%endif%} newValue) 
	{
		this.{{ field}} = newValue;
	}
	{% endfor %}
}
