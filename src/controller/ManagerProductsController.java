package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import dao.ProductDao;
import view.FormUpdateProduct;
import view.ManagerProductsView;

public class ManagerProductsController {
	private ManagerProductsView view;
	FormUpdateProduct fupView;
	
	public ManagerProductsController(ManagerProductsView view) {
		this.view = view;
		fupView = new FormUpdateProduct(view);
		fupView.setLocationRelativeTo(null);
		view.addBtnDonHangListener(new BtnDonHangListener());
		view.addBtnSanPhamListener(new BtnSanPhamListener());
		view.addBtnNhapKhoListener(new BtnNhapKhoListener());
		view.addBtnTonKhoListener(new BtnTonKhoListener());
		view.addBtnPhieuThuListener(new BtnPhieuThuListener());
		view.addBtnPhieuChiListener(new BtnPhieuChiListener());
		view.addBtnLoiNhuanListener(new BtnLoiNhuanListener());
		view.addBtnDoanhThuListener(new BtnDoanhThuListener());
		view.addBtnSearchMaSPListener(new BtnSearchMaSPListene());
		view.addBtnSearchTGListener(new BtnSearchTGListener());
		view.addBtnThemListener(new BtnThemListener());
		view.addBtnTaoMoiListener(new BtnTaoMoiListener());
		view.addBtnSuaListener(new BtnSuaListener());
		view.addWindowListener(new ViewWindowListener());
		view.addBtnXoaListener(new BtnXoaListener());
		view.addTableProductsMouseListener(new TableProductsMouseListener());
	}
	
	class BtnDonHangListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class BtnSanPhamListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class BtnNhapKhoListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class BtnTonKhoListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class BtnPhieuThuListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class BtnPhieuChiListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class BtnLoiNhuanListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class BtnDoanhThuListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class BtnSearchMaSPListene implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			view.searchWithMaSP();
		}
		
	}
	
	class BtnSearchTGListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			view.searchWithGiaBan();
			
		}
		
	}
	
	class BtnThemListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			fupView.onNew = true;
			fupView.setVisible(true);
		}
		
	}
	
	class BtnTaoMoiListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			view.fillTable();
		}
		
	}
	
	class BtnSuaListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(view.checkSelectedTable()) {
				fupView.onNew = false;
				fupView.setVisible(true);
				fupView.fillForm();
			}
		}
		
	}
	
	class BtnXoaListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			view.deleteSP();
			view.fillTable();
		}
		
	}
	
	
	class TableProductsMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class ViewWindowListener implements WindowListener {

		@Override
		public void windowOpened(WindowEvent e) {
			view.fillTable();
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
