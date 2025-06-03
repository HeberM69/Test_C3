public int countWords(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') { // Bug: i-1 puede ser negativo
            count++;
        }
    }
    return count + 1;
}
