public class AtmMain {
    public static void main(String[] args) {
        Atm a = new Atm();
        a.setpin(1234);
        a.setname("Darshana");
        a.setslipcount(1);

        Atm a2 = new Atm();
        a2.setpin(14);
        a2.setname("Darshan");
        a2.setslipcount(2);

        System.out.println(a.getpin());
        System.out.println(a.getname());
        System.out.println(a.getslipcount());

        System.out.println(a2.getpin());
        System.out.println(a2.getname());
        System.out.println(a2.getslipcount());

    }

}
