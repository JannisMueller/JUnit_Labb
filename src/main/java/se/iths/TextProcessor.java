package se.iths;

    public class TextProcessor {

        public String stringToUppercase(String message) {
           return message.toUpperCase();
        }

       public String stringToLowercase(String message) {
            return message.toLowerCase();
        }

        public String stringReverse(String message){
            StringBuilder sb = new StringBuilder();
            for(int i = message.length() - 1; i >= 0; i--) {
              sb.append(message.charAt(i));
            }
            return sb.toString();
        }

    }
