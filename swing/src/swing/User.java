
package swing;
import javax.swing.JOptionPane;
public class User {

	public static void main(String[] args) {
		String fn = JOptionPane.showInputDialog("enter 1st number:");
		String sn = JOptionPane.showInputDialog("2nd number:");
		
		int a = Integer.parseInt(fn);
		int b = Integer.parseInt(sn);
		String su = fn + sn;
		int sum = a + b;
		
		JOptionPane.showMessageDialog(null, su+" "+" "+ sum, "addintion", JOptionPane.DEFAULT_OPTION);
		JOptionPane.showConfirmDialog(null, "do you want to quit??");

	}

}
