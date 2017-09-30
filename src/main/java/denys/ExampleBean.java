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

//    @PostConstruct
//    private void initialize(){
//        name = "Hello? Den!";
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendAction(){
       name = "";
    }
}
