using System;
using System.Net.Sockets; 
using System.IO; 

class Client {

   public static void Main(string[] args) {
      String a,b;
      StreamWriter write;
      TcpClient tcp;
      NetworkStream nets;
      StreamReader read;
      try{     
	 tcp = new TcpClient("localhost",4444); 
	 Console.WriteLine("Conectando con el servidor");
	 nets = tcp.GetStream();
	 write = new StreamWriter(nets); 
	 read = new StreamReader(nets); 
      }catch(Exception e){
         Console.WriteLine(e);
      } 
      Console.WriteLine("Insert number: ");
      a = Console.ReadLine();
      write.WriteLine(a);
      Console.WriteLine("Insert a greater number: ");
      b = Console.ReadLine();
      write.WriteLine(b);			
      write.Flush();
      Console.WriteLine(read.ReadLine()); 
   }
}
