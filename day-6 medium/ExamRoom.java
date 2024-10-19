import java.util.TreeSet;

public class ExamRoom {
    private TreeSet<Integer> students;
    private int n;

    public ExamRoom(int n) {
        this.n = n;
        students = new TreeSet<>();
    }

    public int seat() {
        int seat = 0;
        if (!students.isEmpty()) {
            int maxDist = students.first();
            Integer prev = null;
            for (int s : students) {
                if (prev != null) {
                    int dist = (s - prev) / 2;
                    if (dist > maxDist) {
                        maxDist = dist;
                        seat = prev + dist;
                    }
                }
                prev = s;
            }
            if (n - 1 - students.last() > maxDist) {
                seat = n - 1;
            }
        }
        students.add(seat);
        return seat;
    }

    public void leave(int p) {
        students.remove(p);
    }

    public static void main(String[] args) {
        ExamRoom room = new ExamRoom(10);
        System.out.println(room.seat());
        System.out.println(room.seat());
        System.out.println(room.seat());
        System.out.println(room.seat());
        room.leave(4);
        System.out.println(room.seat());
    }
}
