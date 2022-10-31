import java.awt.EventQueue;

import view.ManagerProductsView;

public class App {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerProductsView frame = new ManagerProductsView();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
//Hello
				}
			}
		});
	}
}
