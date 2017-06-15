package com.prasad.hackerearth.walmart;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * People are crazy about WWE in ‘xyz’ state. There’s a long queue in front of ticket counter. Here are the queue considerations.
 *
 * There can be max 2 incoming queues merging at a junction point
 * Only one outgoing queue from any junction point
 * There can be multiple junction points & the queues move uni-directionally
 * There will be only one final ticket counter point where all the queues lead to
 * There are multiple entry points exist for the fans to reach the counter
 * “WWE fans” who are entering in to the ticketing premises to book the tickets don’t have any idea of Optimal Path & time required to reach the ticket counter. So there is a need to design a system that can suggest the fans what is the “Optimal Path” and its “Expected Time for reaching the counter”

 The expected time of reaching the counter from a queue depends on the number of people in that queue plus the number of people in the other queues.
 Time taken to cross the ticket counter and receive the ticket is 1 time unit
 Assume that there is a policeman standing on each junction point whose job is to open the junction gate to send people from in-queue(s) to out-queue. If there are multiple in-queues for a junction, the policeman will send fans from each queue one by one alternatively
 For example, if there are 2 in-queues containing 3 fans each, person from queue1 will be sent first followed by person from queue2 followed by next person from queue1 and so on. It’s an alternate pick between the incoming queues
 For the given problem, the input will consist of:

 No of Junctions: entries/exits where you can get on or off a particular queue.(<=200)
 No of Queues: Total number of queues(<=200)
 "start_junction" "end_junction" #people(on the queue b/w start & end junction) . Note: this is also the max number of people that can stand in this queue
 The travel time for each queue is held proportional to #people in that queue
 Given the current snapshot of number of people on each queue, Calculate the minimum time for a person to reach the ticket counter who is just about to enter any queue. Also, output the path that he should take to reach the counter in minimum time in the worst case(at each junction point, the policeman starts choosing people from the in-queue other than the one we are calculating the minimum time for).

 Note : If multiple optimal paths are possible, print each of the path in a separate line sorted wrt to the first node
 *
 * Input

 The first line contains the number of junctions 'n'(<200).

 The second line contains the number of queues 'e'(<200).

 The next 'e' lines contains three values: the start junction, the end junction and the number of people on this queue(This is also the max. number of people that can stand in this queue)

 Output
 Optimal Time

 Path(s)
 Sample Input(Plaintext Link)
 7
 6
 1 5 9
 2 5 5
 3 6 1
 4 6 3
 5 7 7
 6 7 4
 *
 *
 *
 Sample Output(Plaintext Link)
 15
 3 -> 6 -> 7
 *
 *
 Ticket counter point: 7
 Entry points: 1, 2, 3, 4
 Time required for a person who is just entering the queue from entry point 3:

 1 person from queue(3,6) + 2 people from queue(4,6) + 4 people from queue(6,7) + 7 people from queue(5,7) + 1 person from queue(1,5) will go before this person.
 So optimal time = 15 & the path is 3 -> 6 -> 7
 Note: queue(a, b) means queue-line between a and b junction points
 *
 */


public class TicketCounter {
    public static void main(String[] args) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\ticket_counter.txt"));

        String line = br.readLine();
        int nJunctions = Integer.parseInt(line);
        System.out.println("No of Junctions   :: " + nJunctions);

        String line2 = br.readLine();
        int nQueues = Integer.parseInt(line2);
        System.out.println("No of Queues   :: " + nQueues);

    }
}
