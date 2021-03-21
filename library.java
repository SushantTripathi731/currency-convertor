import java.util.*;

class Library{
    String[] books;
    int number_of_books=0;
    Library(){
        this.books=new String[100];
        this.number_of_books=0;
    }
    void addBooks(String book){
        this.books[number_of_books]="";
        number_of_books++;
        System.out.println(book+"has been added !");
    }
    void showavailablebooks()
    {
        System.out.println("available books are:");
        for(String book:this.books)
        {
            if(book==null){
            continue;}
            System.out.println("*"+book);
        }

    }
    void issuebooks(String books){
        for(int i=0;i<this.books.length;i++)
        {
            if(this.books[i].equals("book")){
                System.out.println("the books has been issueed!!");
                this.books[i]=null;
            }
        }

    }
    void returnbooks(String book){
        addBooks(book);
        }
}

class LibraryMain {

    public static void main(String[] args) {
    Library l = new Library();
    System.out.println(l);
     l.addBooks("Geeta");
     l.addBooks("kuraan");
     l.addBooks("bible");
     l.addBooks("glimpse of fire");
     l.addBooks("ironman");
     l.addBooks("ramayan");
     l.addBooks("mahabharat");
     l.addBooks("veds");
     l.addBooks("sunderkand");
     l.addBooks("chalisa");
     l.showavailablebooks();  
     l.issuebooks("Geeta"); 
     l.returnbooks("Geeta");
    }
    
}