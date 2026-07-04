public class RepeatedCharacterChecker implements passwordRule {
    @Override
    public boolean checkPassword(String password) {
        int count = 1;
        for(int i = 1; i < password.length(); i++) {
            if(password.charAt(i) == password.charAt(i-1)) {
                count++;
                if(count == 3) {
                    return false;
                }
            } else {
                count = 1;
            }
        }
        return true;
    }
}
