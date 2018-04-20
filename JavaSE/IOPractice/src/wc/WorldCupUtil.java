package wc;
import java.io.*;
import java.util.*;
// ������
public class WorldCupUtil {
   private static List<WorldCup> list=new ArrayList<WorldCup>();
   static{
	  File f=new File("c:"+File.separator+"message.txt");
	  FileReader fr=null;
	  BufferedReader br=null;
	  try {
		 fr=new FileReader(f);
		 br=new BufferedReader(fr);
		 br.readLine();   // ָ�����ƣ��չ���һ��
		 String line="";
		 while((line=br.readLine())!=null){
			 String[] array=line.split("\\|");   // ��ֵ�ǰ���ַ���
			 WorldCup wc=new WorldCup(array[0],array[1],array[2]);   // ����ֺõ����ݷ�װ��WorldCup������
			 list.add(wc);   // ��ӵ�������
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
   
   // ͨ�������Ϣ
   public static WorldCup findInfoByYear(String year){
	   for(WorldCup wc:list){
		   if(wc.getYear().equals(year)){
			   return wc;
		   }
	   }
	   return null;
   }
   
   // ͨ���ٰ�ز�ѯ��Ϣ
   public static List<WorldCup> findInfoByAddress(String address){
	   List<WorldCup> resultList=new ArrayList<WorldCup>();
	   for(WorldCup wc:list){
		   if(wc.getAddress().equals(address)){
			   resultList.add(wc);   // �����ϲ�ѯ�����Ķ�����뵽resultList��
		   }
	   }
	   return resultList;
   }
   
   // ͨ���ھ�����ѯ��Ϣ
   public static List<WorldCup> findInfoByWinner(String winner){
	   List<WorldCup> resultList=new ArrayList<WorldCup>();
	   for(WorldCup wc:list){
		   if(wc.getWinner().equals(winner)){
			   resultList.add(wc);   // �����ϲ�ѯ�����Ķ�����뵽resultList��
		   }
	   }
	   return resultList;
   }
}
