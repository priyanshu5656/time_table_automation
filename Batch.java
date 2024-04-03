import java.util.*; 

public class Batch extends Timetable {
    static Random rand = new Random(); 
    static ArrayList<Integer> list = new ArrayList<Integer>();

    boolean add(Course x, Professor y) {
        int i, j, k, m, n;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 9; j++) {
                if (y.Table[i][j] == null && this.Table[i][j] == null && !isCourseScheduledOnDay(x, i)) {
                    list.add(i * 10 + j);
                    break;
                }
            }
        }
        if (list.size() >= x.getCredits()) {
            for (i = 0; i < x.getCredits(); i++) {
                k = rand.nextInt(list.size());
                n = list.get(k) % 10;
                m = list.get(k) / 10;
                this.Table[m][n] = x.getName() + "(" + y.getName() + ")";
                y.Table[m][n] = this.getName() + "(" + x.getName() + ")";
                list.remove(k);
            }
            list.clear();
            return true;
        }
        list.clear();
        return false;
    }

    // Method to check if a course is already scheduled on a given day
    private boolean isCourseScheduledOnDay(Course course, int day) {
        for (int j = 0; j < 9; j++) {
            if (this.Table[day][j] != null && this.Table[day][j].contains(course.getName())) {
                return true;
            }
        }
        return false;
    }
}
