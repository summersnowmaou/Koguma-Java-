package wc;
import java.io.*;
import java.util.*;
// 工具类
public class WorldCupUtil {
   private static List<WorldCup> list=new ArrayList<WorldCup>();
   static{
	  File f=new File("c:"+File.separator+"message.txt");
	  FileReader fr=null;
	  BufferedReader br=null;
	  try {
		 fr=new FileReader(f);
		 br=new BufferedReader(fr);
		 br.readLine();   // 指针下移，空过第一行
		 String line="";
		 while((line=br.readLine())!=null){
			 String[] array=line.split("\\|");   // 拆分当前行字符串
			 WorldCup wc=new WorldCup(array[0],array[1],array[2]);   // 将拆分好的数据封装到WorldCup对象中
			 list.add(wc);   // 添加到集合中
		 }
	  } catch (Exception e) {
		e.printStackTrace();
	 }finally{
		 try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
   }
   
   // 通过年份信息
   public static WorldCup findInfoByYear(String year){
	   for(WorldCup wc:list){
		   if(wc.getYear().equals(year)){
			   return wc;
		   }
	   }
	   return null;
   }
   
   // 通过举办地查询信息
   public static List<WorldCup> findInfoByAddress(String address){
	   List<WorldCup> resultList=new ArrayList<WorldCup>();
	   for(WorldCup wc:list){
		   if(wc.getAddress().equals(address)){
			   resultList.add(wc);   // 将符合查询条件的对象加入到resultList中
		   }
	   }
	   return resultList;
   }
   
   // 通过冠军国查询信息
   public static List<WorldCup> findInfoByWinner(String winner){
	   List<WorldCup> resultList=new ArrayList<WorldCup>();
	   for(WorldCup wc:list){
		   if(wc.getWinner().equals(winner)){
			   resultList.add(wc);   // 将符合查询条件的对象加入到resultList中
		   }
	   }
	   return resultList;
   }
}
