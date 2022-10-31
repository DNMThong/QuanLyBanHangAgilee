package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Product;
import utils.JDBCUtil;

public class ProductDao {
	private List<Product> products = new ArrayList<Product>();
	private JDBCUtil db = null;
	
	
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public JDBCUtil getDb() {
		return db;
	}

	public void setDb(JDBCUtil db) {
		this.db = db;
	}

	public ProductDao(String table,String user,String password) {
		db = new JDBCUtil(table, user, password);
		readData();
	}
	
	public void add(Product product) {
		products.add(product);
	}
	
	public void remove(int index) {
		products.remove(index);
	}
	
	public void remove(String maSP) {
		int len = products.size();
		for(int i=0;i<len;i++) {
			if(products.get(i).getMaSP().equals(maSP)) {
				remove(i);
				break;
			}
		}
	}
	
	public void readData() {
		try {
			products.clear();
			db.connectDB();
			ResultSet rs = db.getQuery("select maSP,tenSP,soLuong,giaNhap,giaBan,donVi,img from SANPHAM");
			while(rs.next()) {
				String maSP = rs.getString(1);
				String tenSP = rs.getString(2);
				int soLuong = rs.getInt(3);
				int giaNhap = rs.getInt(4);
				int giaBan = rs.getInt(5);
				String donVi = rs.getString(6);
				String img = rs.getString(7);
				Product p = new Product(maSP, tenSP, soLuong, giaNhap, giaBan, donVi, img);
				products.add(p);
			}
			db.closeConnection();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeDB() {
		db.closeConnection();
	}

	public Product sreachMaSP(String maSP) {
		for(Product p : products) {
			if(p.getMaSP().equalsIgnoreCase(maSP)) {
				return p;
			}
		}
		return null;
	}
	
	public boolean writeProductDB(Product p) {
		int i = -1;
		try {
			db.connectDB();
			Connection con = db.getConnect();
			String query = "insert into SanPham values (?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, p.getMaSP());
			ps.setInt(2, p.getSoLuong());
			ps.setString(3, p.getTenSP());
			ps.setString(4, p.getDonVi());
			ps.setString(5, "Việt Nam");
			ps.setInt(6, p.getGiaNhap());
			ps.setInt(7, p.getGiaBan());
			ps.setString(8, p.getImg());
			i = ps.executeUpdate();
			db.closeConnection();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return i==1;
	}
	
	public boolean deleteProduct(String maSP) {
		boolean isSuccess = false;
		try {
			db.connectDB();
			String query = "delete SanPham where MASP like '" + maSP +"'";
			Connection con = db.getConnect();
			Statement st = con.createStatement();
			isSuccess = st.executeUpdate(query) > 0;
			db.closeConnection();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}
	
	public boolean updateProduct(Product p) {
		boolean isSuccess = false;
		try {
			db.connectDB();
			String query = "update SanPham set soLuong = ?,tenSP = ?,donVi=?,nuocSX = ?,giaNhap = ?,giaBan = ? where maSP = ?";
			Connection con = db.getConnect();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(7, p.getMaSP());
			ps.setInt(1, p.getSoLuong());
			ps.setString(2, p.getTenSP());
			ps.setString(3, p.getDonVi());
			ps.setString(4, "Việt Nam");
			ps.setInt(5, p.getGiaNhap());
			ps.setInt(6, p.getGiaBan());
			isSuccess = ps.executeUpdate() >= 0;
			db.closeConnection();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}
	
	public List<Product> searchWithGiaBan(int min,int max) {
		List<Product> l = new ArrayList<Product>();
		for(Product p : products) {
			int price = p.getGiaBan();
			if(price>=min&&price<=max) {
				l.add(p);
			}
		}
		return l;
	}
}
