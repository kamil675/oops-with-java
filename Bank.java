public abstract class Bank {
     abstract void readData();
     abstract void writeData();
     void method(){
        
     }
    
    }
class Admin extends Bank{
    void readData(){

    }
    void writeData(){

    }
}
class Marketing extends Bank{

    @Override
    void readData() {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    void writeData() {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
} 
