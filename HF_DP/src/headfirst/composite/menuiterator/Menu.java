package headfirst.composite.menuiterator;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Menu extends MenuComponent {
 
	ArrayList menuComponents = new ArrayList();
	String name;
	String description;
  
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
 
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
 
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
 
	public MenuComponent getChild(int i) {
		return (MenuComponent)menuComponents.get(i);
	}
	
	public List<MenuComponent> getMenuComponent(){
		return menuComponents;
	}
	
	public String getName() {
		return name;
	}
 
	public String getDescription() {
		return description;
	}

  
	@Override
	public String toString() {
		return "Menu [menuComponents=" + menuComponents + ", name=" + name + ", description=" + description + "]";
	}

	public Iterator createIterator() {
		return new CompositeIterator(menuComponents.iterator());
	}
 
 
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
  
		Iterator iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = 
				(MenuComponent)iterator.next();
			menuComponent.print();
		}
	}
}
