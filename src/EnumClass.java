enum Status{
    NOTSTARTED, SUBMITTED, APPROVED, DENIED, NULL;
}
class Waiver{
    public static final String type = "Waiver";
    private String SerialNumber;
    private String  Name;
    private Status Status;
    public Waiver(String SerialNumber, String Name, Status Status){
        this.SerialNumber = SerialNumber;
        this.Name = Name;
        this.Status = Status;
    }
    public String getSerialNumber() {
        return SerialNumber;
    }
    public String getName() {
        return Name;
    }

    public Status getStatus() {
        return Status;
    }

    public void setStatus(Status status) {
        Status = status;
    }

    public static void display(Waiver waiver) {
        System.out.println("Type : " + Waiver.type);
        System.out.println("Serial Number : " + waiver.getSerialNumber());
        System.out.println("Name : " + waiver.getName());
        System.out.println("Status : " + waiver.Status);
    }
}

public class EnumClass {
    public static void main(String[] args) {

        Waiver w1 = new Waiver("000001", "Community Service", Status.NOTSTARTED);
        Waiver w2 = new Waiver("000044", "Underuse ", Status.SUBMITTED);
        Waiver w3 = new Waiver("003014", "Community Service", Status.APPROVED);
        Waiver w4 = new Waiver("007962", "Underuse ", Status.DENIED);
        Waiver w5 = new Waiver("000002", "Community Service", Status.NULL);

        Waiver[] waivers = new Waiver[5];
        waivers[0] = w1;
        waivers[1] = w2;
        waivers[2] = w3;
        waivers[3] = w4;
        waivers[4] = w5;

        for (Waiver waiver : waivers) {
            waiver.display(waiver);
            System.out.println("-----------------------------------");
        }
    }
}
