package myTest;

public abstract class Component {
	private String id;
	private String name;
	private Task task;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	@Override
	public String toString() {
		return "Component [id=" + id + ", name=" + name + ", task=" + task + "]";
	}

	
	
}
