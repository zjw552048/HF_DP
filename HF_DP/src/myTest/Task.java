package myTest;

public class Task {
	private String id;
	private String name;
	private String roleInCharge;

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

	public String getRoleInCharge() {
		return roleInCharge;
	}

	public void setRoleInCharge(String roleInCharge) {
		this.roleInCharge = roleInCharge;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", roleInCharge=" + roleInCharge + "]";
	}

}
