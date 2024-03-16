package module1.hr;

class MyRegex {

        private String A = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
        private String B = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
        private String C = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
        private String D = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";

        String pattern = A+"."+B+"."+C+"."+D;
}