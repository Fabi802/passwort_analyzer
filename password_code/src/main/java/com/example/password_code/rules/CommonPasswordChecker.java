package com.example.password_code.rules;

import java.util.Set;

public class CommonPasswordChecker implements passwordRule {
    Set<String> passwordSet = Set.of(
            "123456", "password", "123456789", "12345678", "12345", "111111", "123123",
            "qwerty", "abc123", "password1", "1234567", "1234", "qwerty123", "iloveyou",
            "admin", "welcome", "monkey", "login", "dragon", "letmein", "football", "baseball", "master", "sunshine", "ashley", "bailey", "shadow", "superman",
            "michael", "jesus", "ninja", "mustang", "password123", "hello", "freedom", "whatever", "qazwsx",
            "trustno1", "starwars", "123qwe", "654321", "000000", "1q2w3e4r", "zaq12wsx", "passw0rd", "charlie", "donald", "pokemon", "secret", "princess", "welcome1", "lovely", "flower", "hottie",
            "cheese", "computer", "michelle", "jessica", "pepper", "jordan", "harley", "buster", "soccer", "killer",
            "george", "summer", "tigger", "cookie", "maggie", "ginger", "corvette", "batman", "internet",
            "michelle1", "test123", "asdfgh", "zxcvbnm", "987654321", "7777777", "888888",
            "999999", "112233", "159753", "147258369", "121212", "qwertyuiop", "1qaz2wsx", "696969", "987654", "hunter", "thomas", "jennifer", "andrew", "martin", "daniel",
            "matrix", "monkey123", "liverpool", "arsenal", "chelsea", "spiderman", "christian"
    );

    @Override
    public boolean checkPassword(String password) {
        return !passwordSet.contains(password.toLowerCase());
    }
}
