package Constructors;

public class Document 
{

		private String fileName;
		private String fileType;
		private double fileSize;
		private String fileID;
		
		public Document(String name,String type,double size)
		{
			if(ValidationClass.name(name) && ValidationClass.type(type) && ValidationClass.size(size))
			{
				this.fileName=name;
				this.fileType=type;
				this.fileSize=size;
				
				//calling generateFileId method
				this.fileID=generateFileId();
			}
			else
			{
				System.err.println("invalid data");
			}
		}
		
		public String generateFileId()
		{
			//Take 1st 3 chars of file name
		String s=this.fileName.substring(0, 3);
		
			//take 1st 3 ASCII values of filename
		int sum=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			sum=sum+(int)ch;	
		}
		
		//Concat char and ascii values
		this.fileID=this.fileName.substring(0,3)+sum;
		return fileID;
		}
		
		public void display()
		{
			System.out.println("The file name is: "+this.fileName);
			System.out.println("The file type is: "+this.fileType);
			System.out.println("The file size is: "+this.fileSize);
			System.out.println("The file ID is: "+this.fileID);
		}
		
	}