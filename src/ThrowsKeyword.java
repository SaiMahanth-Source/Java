class Empty{
    public static void show(Waiver waiver) throws NullPointerException{
        if (waiver.getStatus() == Status.NULL){
            throw new NullPointerException();
        }
        else{
            Waiver.display(waiver);
        }
    }
}

public class ThrowsKeyword {
    public static void main(String[] args){

        Waiver w1 = new Waiver("000001", "Community Service", Status.NOTSTARTED);
        Waiver w2 = new Waiver("000002", "Community Service", Status.NULL);

        Waiver[] waivers = new Waiver[2];
        waivers[0] = w1;
        waivers[1] = w2;

        for (Waiver waiver : waivers) {
            try{
                Empty.show(waiver);
            }
            catch(NullPointerException ne){
                System.out.println("Status for the waiver cannot be null ");
            }
            System.out.println("-----------------------------------");
        }
    }
}
