import javafx.scene.control.RadioButton;

import java.applet.Applet;
import java.awt.*;

/*<applet code="Cities" width=300 height=300>
</applet>*/
public class P1Q1 extends Applet {
    Checkbox cb1,cb2,cb3,cb4,cb5;
    public void init(){
        cb1 = new Checkbox("Are you boy ");
        add(cb1);
        cb2 = new Checkbox("Are you boy ");
        add(cb2);
        cb3 = new Checkbox("Are you boy ");
        add(cb3);
        CheckboxGroup cbg = new CheckboxGroup();
        cb4 = new Checkbox("Are you boy ",cbg,false);
        add(cb4);
        cb5 = new Checkbox("Are you boy ",cbg,false);
        add(cb5);

    }
}
