
public class Main {
      public static void main(String[] args) {
        CustomerManager customer=new CustomerManager(new MySqlCustomerDal());
//      customer.customerDal=new OracleCustomerDal();
        customer.add();
       }
  
}
