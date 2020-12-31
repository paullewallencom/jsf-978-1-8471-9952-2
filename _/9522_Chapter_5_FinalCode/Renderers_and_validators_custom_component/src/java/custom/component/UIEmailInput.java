package custom.component;

import javax.faces.component.UIInput;

public class UIEmailInput extends UIInput {

  public UIEmailInput() {
    super();
    EmailValidator emailValidator=new EmailValidator();
    addValidator(emailValidator);
  }
  
  @Override
  public String getFamily() {
    return "EMAIL_FAMILY";
  }

}
