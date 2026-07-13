class Solution {
    public int countStudents(int[] students, int[] sandwiches) {     
        List<Integer> studentList = new ArrayList<>();
        for (int s : students) {
            studentList.add(s);
        }
        int sandwichIndex = 0;
        int rotations = 0;

        while (!studentList.isEmpty() && rotations < studentList.size()) {           
            int frontStudent = studentList.get(0);
            int currentSandwich = sandwiches[sandwichIndex];
            if (frontStudent == currentSandwich) {
                studentList.remove(0);
                sandwichIndex++;
                rotations = 0;
            } else {
                studentList.remove(0);
                studentList.add(frontStudent);
                rotations++;
            }
        }
        return studentList.size();
    }
}