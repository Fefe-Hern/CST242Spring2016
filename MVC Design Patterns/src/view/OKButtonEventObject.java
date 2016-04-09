package view;

import java.util.EventObject;

public class OKButtonEventObject extends EventObject {

	private String name;
	private String id;
	
	public OKButtonEventObject(Object source) {
		super(source);
	}

	public OKButtonEventObject(Object source, String name, String id) {
		super(source);
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
}
