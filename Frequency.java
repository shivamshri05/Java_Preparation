
public class Frequency {

	public static void main(String[] args) {
		String str= "core Java ";
		int freq[]=new int[str.length()];
		char string[]=str.toCharArray();
		for(int i=0;i<str.length();i++){
			  freq[i]=1;
			  for(int j=i+1;j<str.length();j++){
				  if(string[i]==string[j]){
					  freq[i]++;
					  string[j]='0';
				  }
			  }
			
			
		}
		System.out.println("=======");
		for(int k=0;k<freq.length;k++){
			if(string[k]!=' ' && string[k]!='0'){
				System.out.println(string[k]+"-"+freq[k]);
			}
			
		}

	}

}
