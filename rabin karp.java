public static List<Integer> rabinKarp(String text, String pattern) {
    int n = text.length();
    int m = pattern.length();
    int patternHash = pattern.hashCode();
    List<Integer> matches = new ArrayList<>();

    for (int i = 0; i <= n - m; i++) {
        String substring = text.substring(i, i + m);
        if (substring.hashCode() == patternHash && substring.equals(pattern)) {
            matches.add(i);
        }
    }

    return matches;
}