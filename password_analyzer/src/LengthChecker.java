public class LengthChecker implements passwordRule{
    @Override
    public boolean checkPassword(String password) {
        return password.length() >= 6;
    }
}
