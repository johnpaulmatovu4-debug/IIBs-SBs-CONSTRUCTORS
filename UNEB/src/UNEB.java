public class UNEB {
    static int examyear;
    static int fee;
    static {
        System.out.println("---Static block---");
        examyear = 2025;
        fee = 50000;
    }
    String name;
    String status;
    String centre;
    {
        System.out.println("---Instance block---");
        centre = "Kampala Centre";
    }
    public UNEB(String name){
        System.out.println("---Constructor---");
        this.name = name;
        status = "Registered";
    }
    public void showdetails(){
        System.out.println("Name: " +name);
        System.out.println("Exam year: " +examyear);
        System.out.println("Fee: UGX " +fee);
        System.out.println("Status: " +status);
        System.out.println("Centre: " +centre);
        System.out.println("----------------");
    }
}
