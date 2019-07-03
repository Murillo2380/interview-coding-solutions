import java.util.stream.IntStream;

public class Solution {

    private static class DummyContentReader {

        private int headerPosition = 0;
        private static String DUMMY_CONTENT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit";

        public String read7() {
            int len = DUMMY_CONTENT.length();

            if (headerPosition >= len)
                return "";

            String s = DUMMY_CONTENT.substring(headerPosition, Math.min(headerPosition + 7, len));
            headerPosition += 7;
            return s;
        }

    }

    public static String readN(int n) {

        StringBuilder sb = new StringBuilder();
        DummyContentReader dummyReader = new DummyContentReader();
        int readCount = 0;

        while (readCount + 7 < n) {
            readCount += 7;
            sb.append(dummyReader.read7());
        }

        if (readCount < n) {
            String s = dummyReader.read7();
            sb.append(s.substring(0, n - readCount));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        IntStream.range(0, 15).mapToObj(Solution::readN).forEach(System.out::println);
    }

}