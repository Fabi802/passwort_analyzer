import java.util.List;

public class PasswordStrength{
    public boolean[] checkPassword(String password){
        List<passwordRule> rules = List.of(
                new UppercaseChecker(),
                new LengthChecker(),
                new LowercaseChecker(),
                new NumberCheck(),
                new SpecialChecker(),
                new CommonPasswordChecker(),
                new RepeatedCharacterChecker()
        );

        boolean[] booleanArray = new boolean[rules.size()];
        int i = 0;
        for (passwordRule r : rules) {
            booleanArray[i++] = r.checkPassword(password);
        }
        return booleanArray;
    }

    public int percent(String password){
        boolean[] booleanArray = checkPassword(password);
        int passed = 0;
        for (boolean b : booleanArray) {
            if(b){
                passed++;
            }
        }
        return (passed*100)/booleanArray.length;
    }

    public String evaluate(String password){
        int percent = percent(password);
        String evaluation;
        if(percent == 100) evaluation = "perfect";
        else if(percent < 40) evaluation = "bad";
        else if(percent < 70) evaluation = "medium";
        else if(percent < 100) evaluation = "good";
        else evaluation = "no password";
        return "The password is " + evaluation;
    }
}
