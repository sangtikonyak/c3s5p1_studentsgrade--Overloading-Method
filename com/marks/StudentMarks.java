package com.marks;

public class StudentMarks {

    public StudentMarks() {
    }

    public int calculateMarks(int math, int physics, int chemistry, int biology)
    {
        int res;
        res=math+physics+chemistry+biology;
        return res;
    }
    public int calculateMarks(int biology,int physics,int chemistry)
    {
        int res;
        res=biology+physics+chemistry;
        return res;
    }
    public int calculateMarks(int finance,int accounting)
    {
        int res;
        res=finance+accounting;
        return res;
    }
}
