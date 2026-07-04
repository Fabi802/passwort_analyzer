public class LowercaseChecker implements passwordRule {
    @Override
    public boolean checkPassword(String password) {
        for(char c : password.toCharArray() ) {
            if(Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }
}
