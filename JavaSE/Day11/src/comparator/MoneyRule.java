package comparator;

import java.util.Comparator;
// 以money为第一排序规则
public class MoneyRule implements Comparator<Girl>{

	@Override
	public int compare(Girl g1, Girl g2) {
		if(g1.getMoney()>g2.getMoney()){
			return -1;
		}else if(g1.getMoney()<g2.getMoney()){
			return 1;
		}else{
			if(g1.getFace()>g2.getFace()){
				return -1;
			}else if(g1.getFace()<g2.getFace()){
				return 1;
			}else{
				return g1.getName().compareTo(g2.getName());
			}
		}

	}
   
}
