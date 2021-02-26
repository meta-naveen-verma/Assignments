/**
 * @author Naveen Verma
 *
 */

import java.util.*;

public class FCFS {

	private static final int AT = 0,BT = 1;
	private int processes[][],completionTime[],waitingTime[],turnArountTime[],numOfProcess;
	
	public FCFS(int[][] ps) {
		processes = ps;
		numOfProcess = processes.length;
		completionTime = new int[numOfProcess];
		waitingTime = new int[numOfProcess];
		turnArountTime = new int[numOfProcess];
		
		// calculation part
        completionTime();
		turnAroundTime();
		waitingTime();
	}
	
	private void completionTime(){
		completionTime[0] = processes[0][BT];
		for (int i = 1; i < processes.length; i++) {
			int processStartTime = processes[i][AT] > completionTime[i-1] ? processes[i][AT] : completionTime[i-1];
			completionTime[i] = processStartTime + processes[i][BT];
		}
	}
	
	private void turnAroundTime(){
		for (int i = 0; i < processes.length; i++) {
			turnArountTime[i] = completionTime[i] - processes[i][AT];
		}
	}
	
	private void waitingTime(){
		for (int i = 0; i < processes.length; i++) {
			waitingTime[i] = turnArountTime[i] - processes[i][BT];
		}
	}

	public float avgWaitTime(){
		float sum = 0;
		for(int wt: waitingTime){
			sum+=wt;
		}
		return sum/numOfProcess;
	}

	public int maxWaitTime(){
		int[] arr= waitingTime.clone();
		Arrays.sort(arr);
		return arr[waitingTime.length-1];
	}
	
	public int[] getCompletionTime(){
		return completionTime;
	}

	public int[] getTurnAroundTime(){
		return turnArountTime;
	}

	public int[] getWaitingTime(){
		return waitingTime;
	}
}