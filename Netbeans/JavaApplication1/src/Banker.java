class Currency{
    String ID;
    int coin;
    int note;
    
    void Deposit(String a, int b, int c){
        ID = a;
        coin = b;
        note = c;
    }
    void result(){
        System.out.println("You deposited,\nnote: " + note + "\ncoin: " + coin + "\ndeposit ID: " + ID);
    }
}

class Banker{
    public static void main(String[] args){
        Currency C1 = new Currency();
        Currency C2 = new Currency();
        C1.Deposit("001",50,60);
        C2.Deposit("003",30,90);
        C1.result();
        C2.result();
        
    }
}