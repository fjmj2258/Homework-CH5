import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Sample5_9
{
	public static void main(String[] args)
	{
		if(args.length !=1)
		{
			System.out.println("請指定正瘸的檔案名稱");
			System.exit(1);
		}
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			String str;
			while((str = br.readLine())!=null)
			{
				System.out.println(str);
			}
			br.close();
		}
		
		catch(IOException e)
		{
			System.out.println("輸出入脞物");
		}
	}
}