package denys;


import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;



@Named(value = "firstBean")
//@RequestScoped
@SessionScoped
//@ApplicationScoped
public class ExampleBean implements Serializable{
    private  String name;
    private String firstname;
    private String name001;
//    @PostConstruct
//    private void initialize(){
//        name = "Hello? Den!";
//    }

    public String getName() {
        return name;
    }
    @Lock(LockType.WRITE)
    public void setName(String name) {
        this.name = name;
    }

    public String getName001() {
        return name001;
    }

    public void setName001(String name001) {
        this.name001 = name001;
    }

    public void sendAction(){
       name001 = getName();
       name = "";
    }
}
