package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.FormUpdateProduct;
import view.ManagerProductsView;

public class FormUpdateProductsController {
	
private FormUpdateProduct view;
	
	public FormUpdateProductsController(FormUpdateProduct view) {
		this.view = view;
		view.addBtnOkListener(new BtnOkListener());
		view.addBtnClearListener(new BtnClearListener());
		view.addBtnCancelListener(new BtnCancelListener());
	}
	
	class BtnOkListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(view.onNew) {
				view.addProduct();
			}else {
				view.updateProduct();
			}
		}
		
	}
	
	class BtnClearListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			view.clearForm();
		}
		
	}
	
	class BtnCancelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			view.clearForm();
			view.setVisible(false);
		}
		
	}
}
