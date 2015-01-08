package PAT1015;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by xiny on 2015/1/8.
 */
class Students{
    int number;
    int dScore;
    int cScore;
}
public class PAT1015 {
    static Students[] DCQJ = new Students[100000];
    static Students[] DSC = new Students[100000];
    static Students[] DCJW = new Students[100000];
    static Students[] QT = new Students[100000];
    static int numDCQJ =0;
    static int numDSC =0;
    static int numDCJW =0;
    static int numQT =0;
    static int numStudents =0;
    public static void main(String[] args){
        int num;
        int lLine;
        int hLine;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        lLine = in.nextInt();
        hLine = in.nextInt();
        for(int i=0;i<num;i++){
            Students aStudent = new Students();
            aStudent.number = in.nextInt();
            aStudent.dScore = in.nextInt();
            aStudent.cScore = in.nextInt();
            if(aStudent.dScore<lLine||aStudent.cScore<lLine){
                continue;
            }
            else if(aStudent.cScore>=hLine&&aStudent.dScore>=hLine){
                DCQJ[numDCQJ] = aStudent;
                numDCQJ++;
                numStudents++;
            }
            else if(aStudent.dScore>=hLine&&aStudent.cScore<hLine){
                DSC[numDSC] = aStudent;
                numDSC++;
                numStudents++;
            }
            else if(aStudent.dScore<hLine&&aStudent.cScore<hLine&&aStudent.dScore>=aStudent.cScore){
                DCJW[numDCJW] = aStudent;
                numDCJW++;
                numStudents++;
            }
            else{
                QT[numQT] = aStudent;
                numQT++;
                numStudents++;
            }
        }
        sort();
        System.out.println(numStudents);
        for(int i=0;i<numDCQJ;i++)
            System.out.println(DCQJ[i].number+" "+DCQJ[i].dScore+" "+DCQJ[i].cScore);
        for(int i=0;i<numDSC;i++)
            System.out.println(DSC[i].number+" "+DSC[i].dScore+" "+DSC[i].cScore);
        for(int i=0;i<numDCJW;i++)
            System.out.println(DCJW[i].number+" "+DCJW[i].dScore+" "+DCJW[i].cScore);
        for(int i=0;i<numQT;i++)
            System.out.println(QT[i].number+" "+QT[i].dScore+" "+QT[i].cScore);
    }

    public static void sort(){
        for(int i=0;i<numDCQJ-1;i++) {
            for (int j = 0; j < numDCQJ - 1 - i; j++) {
                if (DCQJ[j].cScore + DCQJ[j].dScore == DCQJ[j + 1].cScore + DCQJ[j + 1].dScore) {
                    if (DCQJ[j].dScore == DCQJ[j + 1].dScore) {
                        if (DCQJ[j].number > DCQJ[j + 1].number) {
                            Students aStudent;
                            aStudent = DCQJ[j];
                            DCQJ[j] = DCQJ[j + 1];
                            DCQJ[j + 1] = aStudent;
                        }
                    } else if (DCQJ[j].dScore < DCQJ[j + 1].dScore) {
                        Students aStudent;
                        aStudent = DCQJ[j];
                        DCQJ[j] = DCQJ[j + 1];
                        DCQJ[j + 1] = aStudent;
                    }
                } else if (DCQJ[j].cScore + DCQJ[j].dScore < DCQJ[j + 1].cScore + DCQJ[j + 1].dScore) {
                    Students aStudent;
                    aStudent = DCQJ[j];
                    DCQJ[j] = DCQJ[j + 1];
                    DCQJ[j + 1] = aStudent;
                }
            }
        }
        for(int i=0;i<numDSC-1;i++) {
            for (int j = 0; j < numDSC - 1 - i; j++) {
                if (DSC[j].cScore + DSC[j].dScore == DSC[j + 1].cScore + DSC[j + 1].dScore) {
                    if (DSC[j].dScore == DSC[j + 1].dScore) {
                        if (DSC[j].number > DSC[j + 1].number) {
                            Students aStudent;
                            aStudent = DSC[j];
                            DSC[j] = DSC[j + 1];
                            DSC[j + 1] = aStudent;
                        }
                    } else if (DSC[j].dScore < DSC[j + 1].dScore) {
                        Students aStudent;
                        aStudent = DSC[j];
                        DSC[j] = DSC[j + 1];
                        DSC[j + 1] = aStudent;
                    }
                } else if (DSC[j].cScore + DSC[j].dScore < DSC[j + 1].cScore + DSC[j + 1].dScore) {
                    Students aStudent;
                    aStudent = DSC[j];
                    DSC[j] = DSC[j + 1];
                    DSC[j + 1] = aStudent;
                }
            }
        }
        for(int i=0;i<numDCJW-1;i++) {
            for (int j = 0; j < numDCJW - 1 - i; j++) {
                if (DCJW[j].cScore + DCJW[j].dScore == DCJW[j + 1].cScore + DCJW[j + 1].dScore) {
                    if (DCJW[j].dScore == DCJW[j + 1].dScore) {
                        if (DCJW[j].number > DCJW[j + 1].number) {
                            Students aStudent;
                            aStudent = DCJW[j];
                            DCJW[j] = DCJW[j + 1];
                            DCJW[j + 1] = aStudent;
                        }
                    } else if (DCJW[j].dScore < DCJW[j + 1].dScore) {
                        Students aStudent;
                        aStudent = DCJW[j];
                        DCJW[j] = DCJW[j + 1];
                        DCJW[j + 1] = aStudent;
                    }
                } else if (DCJW[j].cScore + DCJW[j].dScore < DCJW[j + 1].cScore + DCJW[j + 1].dScore) {
                    Students aStudent;
                    aStudent = DCJW[j];
                    DCJW[j] = DCJW[j + 1];
                    DCJW[j + 1] = aStudent;
                }
            }
        }

        for(int i=0;i<numQT-1;i++) {
            for (int j = 0; j < numQT - 1 - i; j++) {
                if (QT[j].cScore + QT[j].dScore == QT[j + 1].cScore + QT[j + 1].dScore) {
                    if (QT[j].dScore == QT[j + 1].dScore) {
                        if (QT[j].number > QT[j + 1].number) {
                            Students aStudent;
                            aStudent = QT[j];
                            QT[j] = QT[j + 1];
                            QT[j + 1] = aStudent;
                        }
                    } else if (QT[j].dScore < QT[j + 1].dScore) {
                        Students aStudent;
                        aStudent = QT[j];
                        QT[j] = QT[j + 1];
                        QT[j + 1] = aStudent;
                    }
                } else if (QT[j].cScore + QT[j].dScore < QT[j + 1].cScore + QT[j + 1].dScore) {
                    Students aStudent;
                    aStudent = QT[j];
                    QT[j] = QT[j + 1];
                    QT[j + 1] = aStudent;
                }
            }
        }
    }
}
