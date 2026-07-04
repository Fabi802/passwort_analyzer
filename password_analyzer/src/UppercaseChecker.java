public class UppercaseChecker implements passwordRule {
    @Override
    public boolean checkPassword(String password) {
        for(char c : password.toCharArray() ) {
            if(Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
}
