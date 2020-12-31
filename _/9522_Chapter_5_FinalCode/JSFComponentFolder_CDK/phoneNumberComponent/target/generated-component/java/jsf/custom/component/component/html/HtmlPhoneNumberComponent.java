package jsf.custom.component.component.html;

import javax.el.ELException;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import jsf.custom.component.component.UIPhoneNumberComponent;

public class HtmlPhoneNumberComponent extends UIPhoneNumberComponent{

final public static  String COMPONENT_FAMILY = "jsf.custom.component.PhoneNumberComponent";

final public static  String COMPONENT_TYPE = "jsf.custom.component.PhoneNumberComponent";

/*
* Component name
*/
private  String _name = null;

/*
* Component title
*/
private  String _title = null;


public HtmlPhoneNumberComponent(){
setRendererType("jsf.custom.component.PhoneNumberComponentRenderer");
}

public String getName(){
	if (this._name != null) {
		return this._name;
	}
	ValueExpression ve = getValueExpression("name");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setName(String _name){
this._name = _name;
}

public String getTitle(){
	if (this._title != null) {
		return this._title;
	}
	ValueExpression ve = getValueExpression("title");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return "Phone number";
	

}

public void setTitle(String _title){
this._title = _title;
}

public String getFamily(){
return COMPONENT_FAMILY;
}

@Override
public Object saveState(FacesContext context){
Object [] state = new Object[3];
state[0] = super.saveState(context);
state[1] = _name;
state[2] = _title;
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);
	_name = (String)states[1];;
		_title = (String)states[2];;
	
}

}
