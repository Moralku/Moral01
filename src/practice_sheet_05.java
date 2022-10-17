
class Liabrary{
    String[] books;
    int totalbooks ;
     Liabrary(){
        this.books = new String[100];
         this.totalbooks = 0;
    }
    void addbooks(String books){
         this.books[totalbooks] = books;
         totalbooks++;
        System.out.println("this books has been added");
    }
   void showavaiablebooks(){
       System.out.println("avaiable books are");
       for (String books : this.books)
       if(books == null)
       continue;
       {

           System.out.println("*");
       }
   }
   void issuedbooks(String books){
         for(int i = 0; i<this.books.length; i++){
             if(this.books[i].equals(books)){
                 System.out.println("this books has been issued");
                 this.books[i] = null;

             }
             System.out.println("*"  + books);
         }

    }
   void returnbooks(String books){
         addbooks(books);
       System.out.println("this shows return books");

    }
}


public class practice_sheet_05 {
    public static void main(String[] args) {

        // you have to implement a liberary
        // methods ; issue books, return books, show avaiable books
        // Properties ; aray to store the avaiablebooks
        // Array to store the issued books
        // array to store the return books
        Liabrary libro = new Liabrary();
        libro.addbooks("Think and grow rich");
        libro.addbooks("ignited minds");
        libro.addbooks("the theory of everthing");
        libro.showavaiablebooks();
        libro.issuedbooks("ignited minds");
        libro.returnbooks("ignited minds");
    }
}
