package eu.ase.ro;

public class Utils {

	 static int function(int vector[], int k) {
		 int i = vector[0];
		 int j=0;
		 
		 for(k=1;k<vector.length;k++) {
			 if(i==vector[k]) {
				 j++;
			 }else {
				 if(i>vector[k]) {
					 i=vector[k];
					 j++;
				 }
			 }
		 }
		 return j;
	 }
}
