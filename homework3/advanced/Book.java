package homework3.advanced;

public class Book {

	private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName() {
        String output = "";
        for (int i = 0; i < authors.length; i++) {
            if (i == authors.length - 1) {
                output += authors[i].getName();
            } else {
                output += authors[i].getName() + ", ";
            }
        }
        return output;
    }

	@Override
	public String toString() {
		String output = "Book[" + "nam=" + name + ", author{";
		for (int i = 0; i < authors.length; i++) {
            if (i == authors.length - 1) {
                output += authors[i] + "}";
            } else {
                output += authors[i] + ", ";
            }
        }
		output = output + ", price=" + price + ", qty=" + qty + "]";
		return output;
	}
}
