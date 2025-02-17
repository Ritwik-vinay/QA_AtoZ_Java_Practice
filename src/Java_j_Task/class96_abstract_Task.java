package Java_j_Task;

public class class96_abstract_Task {
    public static void main(String[] args) {
        book mybook = new printmyBook("Harry potter", "J. K Rowling", 120);

    }

}

class printmyBook extends book {
    printmyBook(String name, String author, int price) {
        this.getdetails(name, author, price);

    }

    @Override
    void getdetails(String name_c, String Author_c, int price_c) {


        System.out.println(name_c + "," + Author_c + "," + price_c);
    }
}

abstract class book {


    abstract void getdetails(String name_c, String Author_c, int price_c);
}
