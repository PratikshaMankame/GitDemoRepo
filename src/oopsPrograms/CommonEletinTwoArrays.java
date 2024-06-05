package oopsPrograms;

public class CommonEletinTwoArrays 
{
	public static void main(String[] args) {

		int arr1[]= {10,20,30};
		int arr2[]= {1,5,20};

		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
					System.out.println("Common element - "+arr1[i]);
			}
		}
	}
}