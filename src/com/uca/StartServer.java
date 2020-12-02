package com.uca;


import com.uca.security.doLogin;

public class StartServer {

    public static void main(String[] args) {

        String a = doLogin.createToken("Artheriom", "9c4a64d5-22ba-49bc-94e2-12e9d8475413", "contact@artheriom.fr");
        System.out.println(a);

        System.out.println(doLogin.introspect(a));
    }
}