package bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class NamesBean {

	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSuggestedNames(String nume)
	{
	List<String> list = new ArrayList<String>();
	
	list.add("Alyn");
	list.add("Andrey");
	list.add("Mike");
	list.add("Tom");
	list.add("Susana");
		
	List<String> selectedNames = new ArrayList<String>();
	
	Iterator<String> iterator = list.iterator();
	
	while (iterator.hasNext())
	   {
	   String currentName = (String)iterator.next();
	   if((currentName.toLowerCase()).startsWith(name.toLowerCase()))
	    {selectedNames.add(currentName);}
	   }
	
	return selectedNames;
	}
   }
