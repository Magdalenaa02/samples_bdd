package pl.sda.powitania;

public class Powitania {
        public String getHelloMessage(String jezyk) {
            String powitanie;

            if (jezyk.equals("pl")) {
                powitanie = "Witaj Świecie!";
            } else if (jezyk.equals("en")) {
                powitanie = "Hello world!";
            } else if (jezyk.equals("cs")) {
                powitanie = "cos";
            } else {
                powitanie = "Język nieznany!";
            }

            return powitanie;
    }
}
