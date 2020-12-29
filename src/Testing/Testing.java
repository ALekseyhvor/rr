import java.awt.*;  
import javax.swing.*;
import java.awt.event.*;
import org.junit.*;
import static org.junit.Assert.*;

public class Testing {
	Registr reg = new Registr();
	
	@Test
	public void testingButton() {
	reg.button.doClick();
	assertTrue("Проверка", reg.checkStatus);
	if(reg.checkStatus){
		if(reg.log.getText().trim().length() == 0 && reg.pass.getText().trim().length() == 0) {
			reg.pass.setText("");
			reg.log.setText("");
		}else {
			reg.setUpGui2();
			reg.pass.setText("");
			reg.log.setText("");
		}
		}
	}
}
