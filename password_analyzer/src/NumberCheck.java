public class NumberCheck implements passwordRule{
    @Override
    public boolean checkPassword(String password) {
        for(char c : password.toCharArray() ) {
            if(Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
