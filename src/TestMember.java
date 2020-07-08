public class TestMember {

    public static void main(String[] args) {

        GymManager gymManager = new MyGymManager(100);
        boolean exit = false ;
        while (!exit)
        {
            exit = ((MyGymManager) gymManager).playMenu() ;
        }

    }
}
