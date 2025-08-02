import java.util.ArrayList;

public class Frequent3 {
    public ArrayList<Integer> beautifulArrayDivideConquer(int n) {
    ArrayList<Integer> res = new ArrayList<>();
    divideConquer(1, 1, res, n);
    return res;
}

private void divideConquer(int start, int increment, ArrayList<Integer> res, int n) {
    if (start > n) return;

    if (start + increment > n) {
        res.add(start);
        return;
    }

    // recursively divide
    divideConquer(start, 2 * increment, res, n);
    divideConquer(start + increment, 2 * increment, res, n);
}

}
