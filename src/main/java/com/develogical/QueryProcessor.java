package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("imperial")) {
            return "Imperial College is a university in London";
        }

        if (query.toLowerCase().contains("your name")) {
            return "vitamin C";
        }

        if (query.toLowerCase().contains("what is")) {
            if (query.toLowerCase().contains("plus")) {
                String queryWords[] = query.split(" ");
                int answer = 0;
                if (queryWords[1].equals("what") && queryWords[2].equals("is") && queryWords.length == 6) {
                    answer = Integer.parseInt(queryWords[3]) + Integer.parseInt(queryWords[5]);
                }
                return String.valueOf(answer);

            }
            if (query.toLowerCase().contains("multiplied by")) {
                String queryWords[] = query.split(" ");
                int answer = 0;
                if (queryWords[1].equals("what") && queryWords[2].equals("is") && queryWords.length == 7) {
                    answer = Integer.parseInt(queryWords[3]) * Integer.parseInt(queryWords[6]);
                }
                return String.valueOf(answer);

            }
        }
//        if (query.toLowerCase().contains("plus")) {
//            String queryWords[] = query.split(" ");
//            int answer = 0;
//            if (queryWords[1].equals("what") && queryWords[2].equals("is") && queryWords.length == 6) {
//                answer = Integer.parseInt(queryWords[3]) + Integer.parseInt(queryWords[5]);
//            }
//            return String.valueOf(answer);
//
//        }

//        if (query.toLowerCase().contains("largest")) {
//            String queryWords[] = query.split(" ");
//            int max = Integer.MIN_VALUE;
//            if (queryWords[8].equals("largest:")) {
//                for (int i = 9; i < queryWords.length; i++) {
//                    max = Math.max(max, Integer.parseInt(queryWords[i]));
//                }
//            }
//            return String.valueOf(max);
//        }

        return "";
    }
}
