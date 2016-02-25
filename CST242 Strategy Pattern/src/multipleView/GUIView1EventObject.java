package multipleView;

import java.util.EventObject;

public class GUIView1EventObject extends EventObject {
	
	private String name;
	private String id;

	public GUIView1EventObject(Object source, String name, String id) {
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
