package practice;

class Bank_Service {

   private Bank AccountOn;
   private Bank AccountTw;
  
   
    public void setBankDetails() {
         AccountOn=new Bank();   
        AccountOn.setAccountNu(1001);
        AccountOn.setName("Abhiyansh"); 
        AccountOn.setBalance(5000);

         AccountTw=new Bank();   
        AccountTw.setAccountNu(1002);
        AccountTw.setName("john"); 
        AccountTw.setBalance(2000);
   
    }
    public void setBankDetails(int acc,int op,double amn) {
           if(acc==1001){ 
                if(op==1){
                    AccountOn.setBalance(AccountOn.getBalance()+amn);
                }
                else {
                    AccountOn.setBalance(AccountOn.getBalance()-amn);
                }
           }
           else{
                if(op==1){
                    AccountTw.setBalance(AccountTw.getBalance()+amn);
                }
                else {
                    AccountTw.setBalance(AccountTw.getBalance()-amn);
                }
           }
         
   
    }
    
    public void displayBank() {
        System.out.println(AccountOn.toString());
        System.out.println(AccountTw.toString());
    }
    public void displayBank(int accNum){
            if(accNum==1001){
                System.out.println(AccountOn.toString());
            }
            else{
                System.out.println(AccountTw.toString());
            }
        
        
        

     
    }
   





    
    
    
    
}