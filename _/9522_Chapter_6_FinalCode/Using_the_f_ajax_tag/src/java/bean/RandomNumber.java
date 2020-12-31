package bean;

import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "random")
@SessionScoped
public class RandomNumber {

    private Integer random = 0;
    Random generator = new Random(19580427);

    public Integer getRandom() {

        random = generator.nextInt();
        return random;
    }
}
