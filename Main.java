/**
 * @author Naveen Verma
 *
 */
public class Main {
	public static void main(String[] args) {
		int p[][] = {{0,10},{3,20},{10,10},{50,5}};
		FCFS fcfs = new FCFS(p);
		int ct[] = fcfs.getCompletionTime();
		int tat[] = fcfs.getTurnAroundTime();
		int wt[] = fcfs.getWaitingTime();
		
		//print all values
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|\tS.No\t|\tAT\t|\tBT\t|\tCT\t|\tTAT\t|\tWT\t|");
		System.out.println("-------------------------------------------------------------------------------------------------");
		for (int i = 0; i < p.length; i++) {
			System.out.println("|\t"+Integer.toString(i+1)+"\t|\t"
					+ p[i][0]+"\t|\t"
					+ p[i][1]+"\t|\t"
					+ ct[i]+"\t|\t"
					+ tat[i]+"\t|\t"
					+ wt[i]+"\t|");
		}
		System.out.println("-------------------------------------------------------------------------------------------------\n\n");
		System.out.println("Average waiting time: "+ fcfs.avgWaitTime());
		System.out.println("Max waiting time: "+ fcfs.maxWaitTime());
	}

}