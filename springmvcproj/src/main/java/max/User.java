package max;

import org.springframework.stereotype.Component;

@Component
public class User {
String uid;
String pass;
public String getUid() {
	return uid;
}
public void setUid(String uid) {
	this.uid = uid;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}

}
