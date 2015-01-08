package PAT1015;

import java.util.Scanner;

/**
 * Created by xiny on 2015/1/8.
 */
class Students{
    int number =-1;
    int dScore;
    int cScore;
    Students next = null;

    public Students insert(Students aStudent) {
        if (this.number==-1) {
            return aStudent;
        } else {
            Students thisStudent, lastStudent = null;
            for (thisStudent = this; thisStudent != null; lastStudent = thisStudent, thisStudent = thisStudent.next) {
                if (thisStudent.cScore + thisStudent.dScore == aStudent.cScore + aStudent.dScore) {
                    if (thisStudent.dScore == aStudent.dScore) {
                        if (aStudent.number < thisStudent.number) {
                            if (lastStudent == null) {
                                aStudent.next = thisStudent;
                                return aStudent;
                            } else {
                                lastStudent.next = aStudent;
                                aStudent.next = thisStudent;
                                return this;
                            }
                        }
                    } else if (aStudent.dScore > thisStudent.dScore) {
                        if (lastStudent == null) {
                            aStudent.next = thisStudent;
                            return aStudent;
                        } else {
                            lastStudent.next = aStudent;
                            aStudent.next = thisStudent;
                            return this;
                        }
                    }
                } else if (aStudent.cScore + aStudent.dScore > thisStudent.cScore + thisStudent.dScore) {
                    if (lastStudent == null) {
                        aStudent.next = thisStudent;
                        return aStudent;
                    } else {
                        lastStudent.next = aStudent;
                        aStudent.next = thisStudent;
                        return this;
                    }
                }
            }
            lastStudent.next = aStudent;
            return this;
        }
    }
}
public class PAT1015 {
    static int numStudents = 0;
    public static void main(String[] args){
        int num;
        int lLine;
        int hLine;
        Students DCQJ = new Students();
        Students DSC = new Students();
        Students DCJW = new Students();
        Students QT = new Students();
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        lLine = in.nextInt();
        hLine = in.nextInt();
        for(int i=0;i<num;i++){
            Students aStudent = new Students();
            aStudent.number = in.nextInt();
            aStudent.dScore = in.nextInt();
            aStudent.cScore = in.nextInt();
            aStudent.next = null;
            if(aStudent.dScore<lLine||aStudent.cScore<lLine) {
                continue;
            }
            else if(aStudent.cScore>=hLine&&aStudent.dScore>=hLine){
                DCQJ = DCQJ.insert(aStudent);
                numStudents++;
            }
            else if(aStudent.dScore>=hLine&&aStudent.cScore<hLine){
                DSC = DSC.insert(aStudent);
                numStudents++;
            }
            else if(aStudent.dScore<hLine&&aStudent.cScore<hLine&&aStudent.dScore>=aStudent.cScore){
                DCJW = DCJW.insert(aStudent);
                numStudents++;
            }
            else{
                QT = QT.insert(aStudent);
                numStudents++;
            }
        }
        System.out.println(numStudents);
        for(Students i=DCQJ;i!=null;i=i.next)
            System.out.println(i.number+" "+i.dScore+" "+i.cScore);
        for(Students i=DSC;i!=null;i=i.next)
            System.out.println(i.number+" "+i.dScore+" "+i.cScore);
        for(Students i=DCJW;i!=null;i=i.next)
            System.out.println(i.number+" "+i.dScore+" "+i.cScore);
        for(Students i=QT;i!=null;i=i.next)
            System.out.println(i.number+" "+i.dScore+" "+i.cScore);
    }

}
