package Assignment_2;

class book {
	int bookid;
	String bookname;
	double price;

	public  book(int bid, String bk, double p) {
		this.bookid = bid;
		this.bookname = bk;
		this.price = p;

	}

	public void setbookid(int bookid) {
		this.bookid = bookid;
	}

	public int getbookid() {
		return bookid;
	}

	public void bookname() {
		this.bookname = bookname;

	}

	public void setbookname(String bookname) {
		this.bookname = bookname;
	}

	public String getbookname() {
		return bookname;
	}

	public void price() {
		this.price = price;

	}

	public void setprice(double price) {
		this.price = price;
	}

	public double getprice() {
		return price;

	}

}

public class Q_2 {

	public static void main(String[] args) {
		book B = new book();
		B.setbookid(122);
		B.getbookid();
		B.setbookname("csw");
		B.getbookname();
		B.setprice(500);
		B.getprice();

	}

}
