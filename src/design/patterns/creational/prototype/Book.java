package design.patterns.creational.prototype;
/** Concrete Prototypes to clone * */
public class Book extends Product {
    private int numberOfPages;

    public int getNumberOfPages(){
        return numberOfPages;
    }
    public void setNumberOfPages(int pages){
        numberOfPages = pages;
    }
}
