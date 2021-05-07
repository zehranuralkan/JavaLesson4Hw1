
public class CustomerManager {
    private CostumerDal customerDal;
    public CustomerManager(CostumerDal customerdal){
        this.customerDal=customerDal;
    }
 public void add(){
     //iş kodları yazılır.
     customerDal.add();
 }  
}
