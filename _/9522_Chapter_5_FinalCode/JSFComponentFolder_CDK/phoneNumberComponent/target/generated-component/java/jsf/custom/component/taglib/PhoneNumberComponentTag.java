/**
 * GENERATED FILE - DO NOT EDIT
 *
 */
package jsf.custom.component.taglib;

import javax.faces.component.UIComponent ;
import javax.faces.convert.Converter ;
import java.lang.Object ;
import java.lang.String ;
import org.ajax4jsf.webapp.taglib.HtmlComponentTagBase ;
import javax.faces.el.MethodBinding ;

import javax.el.ELException;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.el.MethodExpression;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;
import javax.el.ValueExpression;
import org.richfaces.webapp.taglib.MethodBindingMethodExpressionAdaptor;
import org.richfaces.webapp.taglib.ValueBindingValueExpressionAdaptor;
import jsf.custom.component.component.html.HtmlPhoneNumberComponent;

public class PhoneNumberComponentTag extends org.ajax4jsf.webapp.taglib.HtmlComponentTagBase {

		// Fields
		 		 	  			  		  	  
		/*
		 * converter
		 * converter
		 */
		private ValueExpression _converter;
		/**
		 * converter
		 * Setter for converter
		 * @param converter - new value
		 */
		 public void setConverter( ValueExpression  __converter ){
			this._converter = __converter;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * converterMessage
		 * converterMessage
		 */
		private ValueExpression _converterMessage;
		/**
		 * converterMessage
		 * Setter for converterMessage
		 * @param converterMessage - new value
		 */
		 public void setConverterMessage( ValueExpression  __converterMessage ){
			this._converterMessage = __converterMessage;
	     }
	  
	 	 		 		 		 	  			  		  	  
		/*
		 * immediate
		 * immediate
		 */
		private ValueExpression _immediate;
		/**
		 * immediate
		 * Setter for immediate
		 * @param immediate - new value
		 */
		 public void setImmediate( ValueExpression  __immediate ){
			this._immediate = __immediate;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * localValueSet
		 * localValueSet
		 */
		private ValueExpression _localValueSet;
		/**
		 * localValueSet
		 * Setter for localValueSet
		 * @param localValueSet - new value
		 */
		 public void setLocalValueSet( ValueExpression  __localValueSet ){
			this._localValueSet = __localValueSet;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * name
		 * Component name
		 */
		private ValueExpression _name;
		/**
		 * Component name
		 * Setter for name
		 * @param name - new value
		 */
		 public void setName( ValueExpression  __name ){
			this._name = __name;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * required
		 * required
		 */
		private ValueExpression _required;
		/**
		 * required
		 * Setter for required
		 * @param required - new value
		 */
		 public void setRequired( ValueExpression  __required ){
			this._required = __required;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * requiredMessage
		 * requiredMessage
		 */
		private ValueExpression _requiredMessage;
		/**
		 * requiredMessage
		 * Setter for requiredMessage
		 * @param requiredMessage - new value
		 */
		 public void setRequiredMessage( ValueExpression  __requiredMessage ){
			this._requiredMessage = __requiredMessage;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * valid
		 * valid
		 */
		private ValueExpression _valid;
		/**
		 * valid
		 * Setter for valid
		 * @param valid - new value
		 */
		 public void setValid( ValueExpression  __valid ){
			this._valid = __valid;
	     }
	  
	 	 		 	  	  	  
		/*
		 * validator
		 * validator
		 */
		private MethodExpression _validator;
		/**
		 * validator
		 * Setter for validator
		 * @param validator - new value
		 */
		 public void setValidator( MethodExpression  __validator ){
			this._validator = __validator;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * validatorMessage
		 * validatorMessage
		 */
		private ValueExpression _validatorMessage;
		/**
		 * validatorMessage
		 * Setter for validatorMessage
		 * @param validatorMessage - new value
		 */
		 public void setValidatorMessage( ValueExpression  __validatorMessage ){
			this._validatorMessage = __validatorMessage;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * value
		 * Component value
		 */
		private ValueExpression _value;
		/**
		 * Component value
		 * Setter for value
		 * @param value - new value
		 */
		 public void setValue( ValueExpression  __value ){
			this._value = __value;
	     }
	  
	 	 		 	  	  	  
		/*
		 * valueChangeListener
		 * valueChangeListener
		 */
		private MethodExpression _valueChangeListener;
		/**
		 * valueChangeListener
		 * Setter for valueChangeListener
		 * @param valueChangeListener - new value
		 */
		 public void setValueChangeListener( MethodExpression  __valueChangeListener ){
			this._valueChangeListener = __valueChangeListener;
	     }
	  
	 	 		 	
	
    public void release()
    {
        // TODO Auto-generated method stub
        super.release();
        		 		 		    this._converter = null;
	 		 		    this._converterMessage = null;
	 		 		 		 		    this._immediate = null;
	 		 		 		    this._localValueSet = null;
	 		 		    this._name = null;
	 		 		 		    this._required = null;
	 		 		    this._requiredMessage = null;
	 		 		 		    this._valid = null;
	 		 		    this._validator = null;
	 		 		    this._validatorMessage = null;
	 		 		 		    this._value = null;
	 		 		    this._valueChangeListener = null;
	 		 		}
	
    /* (non-Javadoc)
     * @see org.ajax4jsf.components.taglib.html.HtmlCommandButtonTagBase#setProperties(javax.faces.component.UIComponent)
     */
    protected void setProperties(UIComponent component)
    {
        // TODO Auto-generated method stub
        super.setProperties(component);
		HtmlPhoneNumberComponent comp = (HtmlPhoneNumberComponent) component;
  		 			setConverterProperty(comp, this._converter);
		   		 			 
						if (this._converterMessage != null) {
				if (this._converterMessage.isLiteralText()) {
					try {
												
						java.lang.String __converterMessage = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._converterMessage.getExpressionString(), 
											java.lang.String.class);
					
												comp.setConverterMessage(__converterMessage);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("converterMessage", this._converterMessage);
				}
			}
					     		 			 
						if (this._immediate != null) {
				if (this._immediate.isLiteralText()) {
					try {
												
						Boolean __immediate = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._immediate.getExpressionString(), 
											Boolean.class);
					
												comp.setImmediate(__immediate.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("immediate", this._immediate);
				}
			}
					    		 			 
						if (this._localValueSet != null) {
				if (this._localValueSet.isLiteralText()) {
					try {
												
						Boolean __localValueSet = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._localValueSet.getExpressionString(), 
											Boolean.class);
					
												comp.setLocalValueSet(__localValueSet.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("localValueSet", this._localValueSet);
				}
			}
					   		 			 
						if (this._name != null) {
				if (this._name.isLiteralText()) {
					try {
												
						java.lang.String __name = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._name.getExpressionString(), 
											java.lang.String.class);
					
												comp.setName(__name);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("name", this._name);
				}
			}
					    		 			 
						if (this._required != null) {
				if (this._required.isLiteralText()) {
					try {
												
						Boolean __required = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._required.getExpressionString(), 
											Boolean.class);
					
												comp.setRequired(__required.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("required", this._required);
				}
			}
					   		 			 
						if (this._requiredMessage != null) {
				if (this._requiredMessage.isLiteralText()) {
					try {
												
						java.lang.String __requiredMessage = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._requiredMessage.getExpressionString(), 
											java.lang.String.class);
					
												comp.setRequiredMessage(__requiredMessage);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("requiredMessage", this._requiredMessage);
				}
			}
					    		 			 
						if (this._valid != null) {
				if (this._valid.isLiteralText()) {
					try {
												
						Boolean __valid = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._valid.getExpressionString(), 
											Boolean.class);
					
												comp.setValid(__valid.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("valid", this._valid);
				}
			}
					   		 			setValidatorProperty(comp, this._validator);
		   		 			 
						if (this._validatorMessage != null) {
				if (this._validatorMessage.isLiteralText()) {
					try {
												
						java.lang.String __validatorMessage = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._validatorMessage.getExpressionString(), 
											java.lang.String.class);
					
												comp.setValidatorMessage(__validatorMessage);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("validatorMessage", this._validatorMessage);
				}
			}
					    		 			 
						if (this._value != null) {
				if (this._value.isLiteralText()) {
					try {
												
						java.lang.Object __value = (java.lang.Object) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._value.getExpressionString(), 
											java.lang.Object.class);
					
												comp.setValue(__value);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("value", this._value);
				}
			}
					   		 			setValueChangeListenerProperty(comp, this._valueChangeListener);
		      }
	
	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getComponentType()
	 */
	public String getComponentType() {
		// TODO Auto-generated method stub
		return "jsf.custom.component.PhoneNumberComponent";
	}

	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getRendererType()
	 */
	public String getRendererType() {
				return "jsf.custom.component.PhoneNumberComponentRenderer";
			}

}
