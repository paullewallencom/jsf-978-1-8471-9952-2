package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@ManagedBean(name = "userBean")
@RequestScoped
public class userBean {

    @NotEmpty(message = "The name cannot be empty!", groups = beans.usersIdsGroup.class)
    @Size(min = 5, max = 20, message = "You must provide a name between 5 and 20 characters!", groups = beans.usersIdsGroup.class)
    private String name;

    @Digits(integer = 2, fraction = 0, message = "You must provide a valid age!", groups = beans.usersIdsGroup.class)
    @Range(min = 18, max = 99, message = "You must be over 18 years old!", groups = beans.usersIdsGroup.class)
    private int age;

    @NotEmpty(message = "The email cannot be empty!", groups = beans.usersIdsGroup.class)
    //instead of @Pattern you can use @Email
    @Pattern(regexp = "[a-zA-Z0-9_]*[@]{1}[a-zA-Z0-9_]*[.]{1}[a-zA-Z]{2,3}", message = "You must provide at least an well-formed e-mail address!", groups = beans.usersIdsGroup.class)
    private String email;

    @NotEmpty(message = "The ID cannot be empty!", groups = beans.usersCredentialsGroup.class)
    @Size(min = 5, max = 20, message = "You must provide an ID between 5 and 20 characters!", groups = beans.usersCredentialsGroup.class)
    private String nickname;

    @NotEmpty(message = "The password cannot be empty!", groups = beans.usersCredentialsGroup.class)
    @Size(min = 5, max = 20, message = "You must provide a password between 5 and 20 characters!", groups = beans.usersCredentialsGroup.class)
    private String password;

    /** Creates a new instance of userBean */
    public userBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
