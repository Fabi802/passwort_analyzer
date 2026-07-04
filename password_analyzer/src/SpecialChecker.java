public class SpecialChecker implements  passwordRule{
    @Override
    public boolean checkPassword(String password) {
        for(char c : password.toCharArray() ) {
            if(!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
