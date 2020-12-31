/**
 * License Agreement.
 *
 * Ajax4jsf 1.1 - Natural Ajax for Java Server Faces (JSF)
 *
 * Copyright (C) 2007 Exadel, Inc.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1 as published by the Free Software Foundation.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301  USA
 */

package jsf.custom.component.renderkit.html;


// 
// Imports
//
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import org.ajax4jsf.renderkit.ComponentsVariableResolver;
import org.ajax4jsf.renderkit.ComponentVariables;
//
//
//


import jsf.custom.component.renderkit.PhoneNumberComponentRendererBase;



/**
 * Renderer for component class jsf.custom.component.renderkit.html.PhoneNumberComponentRenderer
 */
public class PhoneNumberComponentRenderer extends PhoneNumberComponentRendererBase {

	public PhoneNumberComponentRenderer () {
		super();
	}

	// 
	// Declarations
	//
	// 
	// 
	//

	private String convertToString(Object obj ) {
		return ( obj == null ? "" : obj.toString() );
	}
	private String convertToString(boolean b ) {
		return String.valueOf(b);
	}
	private String convertToString(int b ) {
		return b!=Integer.MIN_VALUE?String.valueOf(b):"";
	}
	private String convertToString(long b ) {
		return b!=Long.MIN_VALUE?String.valueOf(b):"";
	}
	
	/**
	 * Get base component class, targetted for this renderer. Used for check arguments in decode/encode.
	 * @return
	 */
	protected Class getComponentClass() {
		return jsf.custom.component.component.UIPhoneNumberComponent.class;
	}


	public void doEncodeEnd(ResponseWriter writer, FacesContext context, jsf.custom.component.component.UIPhoneNumberComponent component, ComponentVariables variables) throws IOException {
	  java.lang.String clientId = component.getClientId(context);
variables.setVariable("icon", getResource( "/jsf/custom/component/renderkit/html/images/phone.gif" ).getUri(context, component) );

writer.startElement("div", component);
			getUtils().writeAttribute(writer, "id", clientId );
			//
// pass thru attributes
//
getUtils().encodeAttributesFromArray(context,component,new String[] {
    "align" ,
	    "dir" ,
	    "lang" ,
	    "onclick" ,
	    "ondblclick" ,
	    "onkeydown" ,
	    "onkeypress" ,
	    "onkeyup" ,
	    "onmousedown" ,
	    "onmousemove" ,
	    "onmouseout" ,
	    "onmouseover" ,
	    "onmouseup" ,
	    "style" ,
	    "title" ,
	    "xml:lang" });
//
//
//

writer.startElement("input", component);
			getUtils().writeAttribute(writer, "id", clientId );
						getUtils().writeAttribute(writer, "name", clientId );
						getUtils().writeAttribute(writer, "type", "text" );
						getUtils().writeAttribute(writer, "value", getValueAsString(context,component) );
			
writer.endElement("input");

			if(component.getFacet("icon")!=null && component.getFacet("icon").isRendered()) {
		
UIComponent indexChildren_1 = component.getFacet("icon");
if (null != indexChildren_1 && indexChildren_1 .isRendered()) {
	renderChild(context, indexChildren_1);
}


			
			}else{
			
		
writer.startElement("img", component);
			getUtils().writeAttribute(writer, "src", variables.getVariable("icon") );
			
writer.endElement("img");

			
			}
			
		
writer.endElement("div");

	}		
	
	public void doEncodeEnd(ResponseWriter writer, FacesContext context, UIComponent component) throws IOException {
		ComponentVariables variables = ComponentsVariableResolver.getVariables(this, component);
		doEncodeEnd(writer, context, (jsf.custom.component.component.UIPhoneNumberComponent)component, variables );

		ComponentsVariableResolver.removeVariables(this, component);
	}		
	

}
