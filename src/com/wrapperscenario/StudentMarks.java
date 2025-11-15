package com.wrapperscenario;
class StudentMarks {

    public Integer parseMark(String s) {
        if (s == null || s.equals("null")) return null;
        try { return Integer.valueOf(s); }
        catch (Exception e) { return null; }
    }

    public Integer parseMark(Object o) {
        if (o == null) return null;
        if (o instanceof Integer) return (Integer) o;
        if (o instanceof String) return parseMark((String) o);
        return null;
    }

    public double averageMarks(Object[] inputs) {
        int sum = 0;
        int count = 0;
        for (Object o : inputs) {
            Integer val = parseMark(o);
            if (val != null) {
                sum += val;
                count++;
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }

    public static void main(String[] args) {
        StudentMarks sm = new StudentMarks();
        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc", null};
        double avg = sm.averageMarks(inputs);
        System.out.println("Average Marks = " + avg);
    }
}
