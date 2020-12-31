dojo.require("dijit.form.ValidationTextBox");
dojo.require("dijit.form.Textarea");
dojo.require("dojo.parser");

var TYPE_MAP = {
	text	 : 'dijit.form.ValidationTextBox',
	textarea : 'dijit.form.Textarea'
};

dojo.addOnLoad(init);

function init(){		
	//get all JSF component wrappers
	var jsfContainerList = dojo.query("[jsf2dojo='true']");
	
	for(var i = 0 ; i < jsfContainerList.length; i++){
		var jsfWidget = _getJsfWidget(jsfContainerList[i]);//get JSF component node				
		if(!jsfWidget) continue;		
			
		if('input' == jsfWidget.tagName.toLowerCase() && 'text' == jsfWidget.type.toLowerCase()){ // input 
			jsfWidget.setAttribute('dojoType', TYPE_MAP[jsfWidget.type.toLowerCase()]);
			jsfWidget.setAttribute('promptMessage',"Please Enter your information");
			jsfWidget.setAttribute('required',"true");				
			
		}else{
			jsfWidget.setAttribute('dojoType', TYPE_MAP[jsfWidget.tagName.toLowerCase()]);
		}

		dojo.parser.parse(jsfContainerList[i]);//parse wrapper node
	  }
}

  function _getJsfWidget(node){
	var childNodes = node.childNodes;
	for(var i = 0; i < childNodes.length; i++){
		if(1 == childNodes[i].nodeType){
			return childNodes[i];
		}
	}			
	return null;		
  }