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

        if (query.toLowerCase().contains("plus")) {
            String queryWords[] = query.split(" ");
            int answer = 0;
            if (queryWords[0].equals("what") && queryWords[1].equals("is") && queryWords.length == 5) {
                answer = Integer.parseInt(queryWords[2]) + Integer.parseInt(queryWords[4]);
            }
            return String.valueOf(answer);

        }

        return "";
    }
}
