import java.util.HashSet;
import java.util.Set;

public class TileSequences {
    private static Set<String> set = new HashSet<>();

    public static int numTilePossibilities(String tiles) {
        boolean[] used = new boolean[tiles.length()];
        backtrack(tiles, new StringBuilder(), used);
        return set.size();
    }

    private static void backtrack(String tiles, StringBuilder sb, boolean[] used) {
        if (sb.length() > 0) {
            set.add(sb.toString());
        }

        for (int i = 0; i < tiles.length(); i++) {
            if (used[i]) continue;
            used[i] = true;
            sb.append(tiles.charAt(i));
            backtrack(tiles, sb, used);
            sb.deleteCharAt(sb.length() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        String tiles = "AAB";
        System.out.println("Number of possible sequences: " + numTilePossibilities(tiles));
    }
}
