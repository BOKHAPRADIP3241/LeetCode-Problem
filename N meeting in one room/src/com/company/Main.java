package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static com.company.Main.Meeting.maxMeetings;

public class Main {
class meeting {
    int start;
    int end;
    int pos;

    meeting(int start, int end, int pos) {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }

}

static class meetingComparator implements Comparator<meeting> {

    @Override
    public int compare(meeting o1, meeting o2) {
        if (o1.end < o2.end) {
            return -1;
        }
        else if (o1.end > o2.end) {
            return 1;
        }
        else if (o1.pos < o2.pos) {
            return -1;
        }
        return 1;
    }
}
 static class Meeting {
     static int maxMeetings(int[] start, int[] end, int n) {
        ArrayList<meeting> meet = new ArrayList<>();
        for(int i = 0; i < start.length; i++) {
            meetingComparator mc = new meetingComparator();
            Collections.sort(meet, mc);
            ArrayList<Integer> answer = new ArrayList<>();
            answer.add(meet.get(0).pos);
            int limit = meet.get(0).end;

            for (i = 1; i < start.length; i++) {
                if (meet.get(i).start > limit) {
                    limit = meet.get(i).end;
                    answer.add(meet.get(i).pos);
                }
            }

            for (i = 0; i < answer.size(); i++){
                System.out.println(answer.get(i) + " ");
            }
        }
        return n;
    }
}

    public static void main(String[] args) {
	// write your code here
        int[] start = {1,0,3,8,5,8};
        int[] end = {2,6,4,9,7,9};
        int n = start.length;
       ArrayList<Integer> ans = new ArrayList<>();
        ans.add(maxMeetings(start, end, n));



    }
}
