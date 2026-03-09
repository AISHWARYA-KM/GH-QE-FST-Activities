abstract class Book{
    String Title;

    abstract void  setTitle( String Title);

    String getTitle(){
        return Title;
    }

}
 class MyBook extends Book{
    public void  setTitle(String title){
            Title=title;
    } 

 }


public class Act3 {
    public static void main(String[] args){
    Book newNovel= new MyBook();
    newNovel.setTitle("Science");

    System.out.println("The title is:" +newNovel.getTitle());
    }
    
}
