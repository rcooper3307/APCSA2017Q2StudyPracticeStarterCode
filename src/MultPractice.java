/**
 * Created by Teacher on 4/1/2019.
 */
public class MultPractice implements StudyPractice
{
    private int f;
    private int s;
    public MultPractice(int firstInt, int secInt)
    {
        f = firstInt;
        s = secInt;

    }
    public String getProblem()
    {
        String problem = f + " TIMES " + s;
        return problem;
    }
    public void nextProblem()
    {
        s++;
    }
}
