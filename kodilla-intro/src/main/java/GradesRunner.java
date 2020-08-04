public class GradesRunner {
    public static void main(String[] args) {
        Grades assesment = new Grades();


        assesment.add(5);
        assesment.add(2);
        assesment.add(6);
        assesment.add(5);
        assesment.add(4);
        assesment.add(6);
        assesment.add(6);
        assesment.add(6);
        assesment.add(6);
        assesment.add(6);
        int lastGrade = assesment.getLastGrade();
        double Average = assesment.getAverage();

        System.out.println(lastGrade);
        System.out.println(Average);
    }
}

