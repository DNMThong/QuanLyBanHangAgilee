package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;

import controller.ManagerProductsController;
import dao.ProductDao;
import entity.Product;

import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;

public class ManagerProductsView extends JFrame {

	private JPanel contentPane;
	private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnPhieuThu;
    private javax.swing.JButton btnPhieuChi;
    private javax.swing.JButton btnDoanhThu;
    private javax.swing.JButton btnTaoMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnLoiNhuan;
    private javax.swing.JButton btnSearchMaSP;
    private javax.swing.JButton btnSearchTG;
    private javax.swing.JButton btnDonHang;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JButton btnNhapKho;
    private javax.swing.JButton btnTonKho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProducts;
    private javax.swing.JTextField tfSearch;
    private DefaultTableModel tableModel;
   
    private ManagerProductsController mpc;
    private ProductDao pd = new ProductDao("QuanLyBanHangAgile","sa", "songlong");
    private JButton btnXoa;
	
	public ManagerProductsView() {
		init();
		mpc = new ManagerProductsController(this);
	}
	
	public void init() {
		FlatIntelliJLaf.setup();
		buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnDonHang = new javax.swing.JButton();
        btnDonHang.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnSanPham = new javax.swing.JButton();
        btnSanPham.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnNhapKho = new javax.swing.JButton();
        btnNhapKho.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnTonKho = new javax.swing.JButton();
        btnTonKho.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnPhieuThu = new javax.swing.JButton();
        btnPhieuThu.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnPhieuChi = new javax.swing.JButton();
        btnPhieuChi.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnLoiNhuan = new javax.swing.JButton();
        btnLoiNhuan.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnDoanhThu = new javax.swing.JButton();
        btnDoanhThu.setFont(new Font("Segoe UI", Font.BOLD, 14));
        jPanel3 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        tfSearch = new javax.swing.JTextField("Enter your search...");
        tfSearch.setForeground(Color.GRAY);
		tfSearch.addFocusListener(new FocusListener() {
		    @Override
		    public void focusGained(FocusEvent e) {
		        if (tfSearch.getText().equals("Enter your search...")) {
		        	tfSearch.setText("");
		        	tfSearch.setForeground(Color.BLACK);
		        }
		    }
		    @Override
		    public void focusLost(FocusEvent e) {
		        if (tfSearch.getText().isEmpty()) {
		        	tfSearch.setForeground(Color.GRAY);
		        	tfSearch.setText("Enter your search...");
		        }
		    }
		});
        btnSearchMaSP = new javax.swing.JButton();
        btnSearchTG = new javax.swing.JButton();
        btnSearchTG.setFont(new Font("Segoe UI", Font.BOLD, 14));
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProducts = new javax.swing.JTable(){
            public Class getColumnClass(int column) {
                return (column == 1) ? Icon.class : Object.class;
              }
            };;

       setDefaultCloseOperation(EXIT_ON_CLOSE);
//       setSize(500, 300);
      // setLocationRelativeTo(null);
       
        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TManagement");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(233, 248, 219));

        jPanel7.setBackground(new java.awt.Color(51, 153, 255));

        jLabel4.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Quản lí bán hàng");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7Layout.setHorizontalGroup(
        	jPanel7Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jLabel4, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
        	jPanel7Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );
        jPanel7.setLayout(jPanel7Layout);

        jPanel8.setBackground(new java.awt.Color(51, 153, 255));

        jLabel5.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Quản lí kho hàng");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8Layout.setHorizontalGroup(
        	jPanel8Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jLabel5, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
        	jPanel8Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jLabel5, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );
        jPanel8.setLayout(jPanel8Layout);

        jPanel9.setBackground(new java.awt.Color(51, 153, 255));

        jLabel6.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Quản lí thu chi");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9Layout.setHorizontalGroup(
        	jPanel9Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jLabel6, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
        	jPanel9Layout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jLabel6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );
        jPanel9.setLayout(jPanel9Layout);

        jPanel10.setBackground(new java.awt.Color(51, 153, 255));

        jLabel7.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Báo cáo KQKD");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10Layout.setHorizontalGroup(
        	jPanel10Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
        	jPanel10Layout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jLabel7, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );
        jPanel10.setLayout(jPanel10Layout);

        btnDonHang.setBackground(new java.awt.Color(51, 153, 255));
        btnDonHang.setForeground(new java.awt.Color(255, 255, 255));
//        jButton6.setIcon(new ImageIcon("icons/order.png")); // NOI18N
        btnDonHang.setText("Đơn hàng");
        buttonGroup1.add(btnDonHang);
       

        btnSanPham.setBackground(new java.awt.Color(51, 153, 255));
        btnSanPham.setForeground(new java.awt.Color(255, 255, 255));
//        jButton7.setIcon(new ImageIcon("icons/product.png")); // NOI18N
        btnSanPham.setText("Sản phẩm");
        buttonGroup1.add(btnSanPham);

        btnNhapKho.setBackground(new java.awt.Color(51, 153, 255));
        btnNhapKho.setForeground(new java.awt.Color(255, 255, 255));
//        jButton8.setIcon(new ImageIcon("icons/warehouse.png")); // NOI18N
        btnNhapKho.setText("Nhập kho");
        buttonGroup1.add(btnNhapKho);

        btnTonKho.setBackground(new java.awt.Color(51, 153, 255));
        btnTonKho.setForeground(new java.awt.Color(255, 255, 255));
//        jButton9.setIcon(new ImageIcon("icons/inventory.png")); // NOI18N
        btnTonKho.setText("Tồn kho");
        buttonGroup1.add(btnTonKho);

        btnPhieuThu.setBackground(new java.awt.Color(51, 153, 255));
        btnPhieuThu.setForeground(new java.awt.Color(255, 255, 255));
//        jButton10.setIcon(new ImageIcon("icons/receipt.png")); // NOI18N
        btnPhieuThu.setText("Phiếu thu");
        buttonGroup1.add(btnPhieuThu);

        btnPhieuChi.setBackground(new java.awt.Color(51, 153, 255));
        btnPhieuChi.setForeground(new java.awt.Color(255, 255, 255));
//        jButton11.setIcon(new ImageIcon("icons/payment.png")); // NOI18N
        btnPhieuChi.setText("Phiếu chi");
        buttonGroup1.add(btnPhieuChi);

        btnLoiNhuan.setBackground(new java.awt.Color(51, 153, 255));
        btnLoiNhuan.setForeground(new java.awt.Color(255, 255, 255));
//        jButton12.setIcon(new ImageIcon("icons/profit.png")); // NOI18N
        btnLoiNhuan.setText("Lợi nhuận");
        buttonGroup1.add(btnLoiNhuan);

        btnDoanhThu.setBackground(new java.awt.Color(51, 153, 255));
        btnDoanhThu.setForeground(new java.awt.Color(255, 255, 255));
//        jButton13.setIcon(new ImageIcon("icons/sales.png")); // NOI18N
        btnDoanhThu.setText("Doanh thu");
        buttonGroup1.add(btnDoanhThu);
        
        JButton btnPos = new JButton();
       
        btnPos.setText("POS");
        btnPos.setForeground(Color.WHITE);
        btnPos.setFont(new Font("Segoe UI", Font.BOLD, 24));
        btnPos.setBackground(new Color(255, 51, 51));
        
        JLabel lblNewLabel = new JLabel("Điểm bán hàng");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setForeground(new Color(255, 51, 51));
        lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        		.addComponent(jPanel8, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        		.addComponent(jPanel9, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        		.addComponent(jPanel10, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(btnDonHang, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(btnSanPham, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(btnLoiNhuan, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(btnDoanhThu, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(btnPhieuThu, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(btnPhieuChi, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(btnNhapKho, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(btnTonKho, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
        			.addContainerGap())
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(34)
        			.addComponent(btnPos, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(btnPos, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblNewLabel)
        			.addGap(18)
        			.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnSanPham, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnDonHang, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(14)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnNhapKho, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnTonKho, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnPhieuThu, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnPhieuChi, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
        			.addGap(8)
        			.addComponent(jPanel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnLoiNhuan, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnDoanhThu, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnThem.setBackground(new java.awt.Color(255, 51, 51));
        btnThem.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        jPanel3.add(btnThem);

        btnSua.setBackground(new java.awt.Color(255, 51, 51));
        btnSua.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        jPanel3.add(btnSua);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tfSearch.setForeground(new java.awt.Color(204, 204, 204));
        tfSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
       

        btnSearchMaSP.setBackground(new java.awt.Color(255, 51, 51));
        btnSearchMaSP.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        btnSearchMaSP.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchMaSP.setText("Tìm mã SP");

        btnSearchTG.setBackground(new java.awt.Color(0, 153, 255));
        btnSearchTG.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchTG.setText("Tầm giá");
        btnTaoMoi = new javax.swing.JButton();
        btnTaoMoi.setBackground(new java.awt.Color(255, 51, 51));
        btnTaoMoi.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        btnTaoMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnTaoMoi.setText("Tạo mới");
        

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4Layout.setHorizontalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(tfSearch, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(btnSearchMaSP, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(btnSearchTG, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
        			.addComponent(btnTaoMoi)
        			.addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tfSearch, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        				.addComponent(btnSearchMaSP)
        				.addComponent(btnTaoMoi)
        				.addComponent(btnSearchTG))
        			.addContainerGap())
        );
        jPanel4.setLayout(jPanel4Layout);

        tfSearch.getAccessibleContext().setAccessibleName("df");

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sản phẩm");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );
 
        tableModel = new DefaultTableModel(new Object [][] {},  new String [] {
                "Mã sản phẩm", "Hình ảnh", "Tên sản phẩm", "Số lượng", "Giá nhập", "Giá bán", "Đơn vị"
            });
        tableProducts.setModel(tableModel);
        tableProducts.setToolTipText("");
        tableProducts.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableProducts.setRowHeight(60);
        tableProducts.setRowSelectionAllowed(true);
        jScrollPane1.setViewportView(tableProducts);
        tableProducts.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1073, Short.MAX_VALUE)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        				.addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        				.addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        				.addComponent(jPanel3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE))
        				.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addContainerGap())
        );
        
        btnXoa = new JButton();
        btnXoa.setText("Xóa");
        btnXoa.setForeground(Color.WHITE);
        btnXoa.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnXoa.setBackground(new Color(255, 51, 51));
        jPanel3.add(btnXoa);
        getContentPane().setLayout(layout);
        
        addIconBtn(btnDonHang,"assets\\icons\\shopping-bag.png");
        addIconBtn(btnSanPham,"assets\\icons\\product.png");
        addIconBtn(btnNhapKho,"assets\\icons\\warehouse.png");
        addIconBtn(btnTonKho,"assets\\icons\\box.png");
        addIconBtn(btnPhieuThu,"assets\\icons\\receipt.png");
        addIconBtn(btnPhieuChi,"assets\\icons\\bill.png");
        addIconBtn(btnLoiNhuan,"assets\\icons\\bars.png");
        addIconBtn(btnDoanhThu,"assets\\icons\\sales.png");
        
        btnSearchMaSP.setIcon(new ImageIcon("assets\\icons\\search-interface-symbol.png"));
        btnSearchTG.setIcon(new ImageIcon("assets\\icons\\price-tag.png"));
        btnTaoMoi.setIcon(new ImageIcon("assets\\icons\\add-file.png"));
        btnThem.setIcon(new ImageIcon("assets\\icons\\add.png"));
        btnSua.setIcon(new ImageIcon("assets\\icons\\settings.png"));
        btnXoa.setIcon(new ImageIcon("assets\\icons\\delete.png"));
       

      pack();
	}
	
	public void addIconBtn(JButton btn,String pathIcon) {
		btn.setIcon(new ImageIcon(pathIcon));
		btn.setVerticalTextPosition(SwingConstants.BOTTOM);
	        // Centered Text
		btn.setHorizontalTextPosition(SwingConstants.CENTER);
	}
	
	public void clearTable() {
		tableModel.setRowCount(0);
	}
	
	public void fillTable() {
		pd.readData();
		clearTable();
		pd.getProducts().forEach(p -> {
			ImageIcon img = new ImageIcon(
					new ImageIcon(p.getImg())
					.getImage()
					.getScaledInstance(50, 55, Image.SCALE_DEFAULT));
			img.setDescription(p.getImg());
			tableModel.addRow(new Object[] {
				p.getMaSP(),
				img,
				p.getTenSP(),
				p.getSoLuong(),
				p.getGiaNhap(),
				p.getGiaBan(),
				p.getDonVi()
			});
			
		});
	}
	
	public int getIndexSelectTable() {
		
		return tableProducts.getSelectedRow();
	}
	
	public Product getProductSelected() {
		int row = getIndexSelectTable();
		return new Product(
				tableModel.getValueAt(row, 0)+"",
				tableModel.getValueAt(row, 2)+"",
				(int) tableModel.getValueAt(row, 3),
				(int) tableModel.getValueAt(row, 4),
				(int) tableModel.getValueAt(row, 5),
				tableModel.getValueAt(row, 6)+"",
				((ImageIcon) tableModel.getValueAt(row, 1)).getDescription()
			);
	}
	
	public void fillTable(List<Product> products) {
		clearTable();
		products.forEach(p -> {
			tableModel.addRow(new Object[] {
				p.getMaSP(),
				"",
				p.getMaSP(),
				p.getSoLuong(),
				p.getGiaNhap(),
				p.getGiaBan(),
				p.getDonVi()
			});
			
		});
	}
	
	public void searchWithMaSP() {
		String search = tfSearch.getText().trim();
		Product p = pd.sreachMaSP(search);
		clearTable();
		if(p!=null) {
			tableModel.addRow(new Object[] {
					p.getMaSP(),
					"",
					p.getMaSP(),
					p.getSoLuong(),
					p.getGiaNhap(),
					p.getGiaBan(),
					p.getDonVi()
				});
		}
	}
	
	public void searchWithGiaBan() {
		String[] aboutPrice = tfSearch.getText().trim().split(" ");
		List<Product> products;
		try {
			if(aboutPrice.length == 1) {
				int n = Integer.valueOf(aboutPrice[0]);
				products = pd.searchWithGiaBan(n, n);
			}else {
				int n1 = Integer.valueOf(aboutPrice[0]);
				int n2 = Integer.valueOf(aboutPrice[1]);
				int max = Math.max(n1, n2);
				int min = Math.min(n1, n2);
				products = pd.searchWithGiaBan(min, max);
			}
			fillTable(products);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(contentPane, "Nhập đúng định dạng (min max) hoặc (max min)");
		}
	}
	
	public void deleteSP() {
		int row = tableProducts.getSelectedRow();
		if(row < 0) {
			JOptionPane.showMessageDialog(contentPane, "Vui lòng chọn dòng cần xóa");
		}else {
			int lc = JOptionPane.showConfirmDialog(
					contentPane,
					"Bạn có chắc muốn xóa sản phẩm này!!!",
					"Xác nhận xóa sản phẩm"
					,JOptionPane.YES_NO_OPTION);
			if(lc == JOptionPane.YES_OPTION) {
				if(pd.deleteProduct(tableModel.getValueAt(row, 0)+"")) {
					JOptionPane.showMessageDialog(contentPane, "Xóa sản phẩm thành công");
				}else {
					JOptionPane.showMessageDialog(contentPane, "Xóa sản phẩm thất bại");
				}
			}
		}
	}
	
	public boolean checkSelectedTable() {
		if(getIndexSelectTable()<0) {
			JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm cần update");
			return false;
		}
		return true;
	}
	
	
	public void addBtnDonHangListener(ActionListener al) {
		btnDonHang.addActionListener(al);
	}
	
	public void addBtnSanPhamListener(ActionListener al) {
		btnSanPham.addActionListener(al);
	}
	
	public void addBtnNhapKhoListener(ActionListener al) {
		btnNhapKho.addActionListener(al);
	}
	
	public void addBtnTonKhoListener(ActionListener al) {
		btnTonKho.addActionListener(al);
	}
	
	public void addBtnPhieuThuListener(ActionListener al) {
		btnPhieuThu.addActionListener(al);
	}
	
	public void addBtnPhieuChiListener(ActionListener al) {
		btnPhieuChi.addActionListener(al);
	}
	
	public void addBtnLoiNhuanListener(ActionListener al) {
		btnLoiNhuan.addActionListener(al);
	}
	
	public void addBtnDoanhThuListener(ActionListener al) {
		btnDoanhThu.addActionListener(al);
	}
	
	public void addBtnSearchMaSPListener(ActionListener al) {
		btnSearchMaSP.addActionListener(al);
	}
	
	public void addBtnSearchTGListener(ActionListener al) {
		btnSearchTG.addActionListener(al);
	}
	
	public void addBtnThemListener(ActionListener al) {
		btnThem.addActionListener(al);
	}
	
	public void addBtnTaoMoiListener(ActionListener al) {
		btnTaoMoi.addActionListener(al);
	}
	
	public void addBtnSuaListener(ActionListener al) {
		btnSua.addActionListener(al);
	}
	
	public void addBtnXoaListener(ActionListener al) {
		btnXoa.addActionListener(al);
	}
	
	public void addTableProductsMouseListener(MouseListener ml) {
		tableProducts.addMouseListener(ml);
	}
	
	public void addViewWindowListener(WindowListener wl) {
		this.addWindowListener(wl);
	}
	
	
}
