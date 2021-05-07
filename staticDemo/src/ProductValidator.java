
public class ProductValidator {
    //ana class static olamaz.
    static{
        System.out.println("statik yapıcı blok çalıştı");
    }
    public ProductValidator(){
        System.out.println("yapıcı çalıştı");
    }
    public static boolean isValid(Product product)
    {
        if(product.price>0 && product.name.isEmpty()){
            return true;
        }
        else{
            return false;
        }
       
    }
     public void bisey(){
            
        }
     public static class BaskaBirClass{
         public static void sil(){
             
         }
         //inner class
     }
}
