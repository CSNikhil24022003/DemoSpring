package anudip.org;
public class User {
public int id;
public String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
void userdisplay() {
System.out.println("Hello " + id+ "," +name);
}
}