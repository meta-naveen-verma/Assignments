import static org.junit.Assert.*;
import org.junit.Test;
public class HcfLcmTest {
	@Test
	public void hcfTest() {
		 HcfLcm hcfLcm=new HcfLcm();
		 int num1[] = {10,20,15,13,15,22,30,26,28,14};
	     int num2[] = {20,15,66,13,9,84,57,98,14,10}; 
	     int ansHcf[]={10,5,3,13,3,2,3,2,14,2};
	     int ansLcm[]={};
	     for(int i=0;i<10;i++){
	    	 assertEquals(ansHcf[i],hcfLcm.hcf(num1[i], num2[i]));
	     }
	     
	     
	}
	@Test
	public void lcmTest() {
		 HcfLcm hcfLcm=new HcfLcm();
		 int num1[] = {10,20,15,13,15,22,30,26,28,14};
	     int num2[] = {20,15,66,13,9,84,57,98,14,10}; 
	     int ansLcm[]={20,60,330,13,45,924,570,1274,28,70};
	     for(int i=0;i<10;i++){
	    	 assertEquals(ansLcm[i],hcfLcm.lcm(num1[i], num2[i]));
	     }  
	}

}
