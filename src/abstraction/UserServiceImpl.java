package abstraction;

public class UserServiceImpl implements UserService,CommonService{

    @Override
    public void addUser() {
        System.out.println("Added Success");
    }

    @Override
    public void deleteUser() {
        System.out.println("Deleted Success");
    }

    @Override
    public void print() {
        System.out.println("------Printing--------");
    }
}
