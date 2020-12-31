package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@ManagedBean(name = "bean")
@SessionScoped
public class Bean {

    /** Creates a new instance of Bean */
    public Bean() {
    }
    private String email;
    private Integer age;

    @Range(min = 18, max = 90)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @NotEmpty
    @Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
