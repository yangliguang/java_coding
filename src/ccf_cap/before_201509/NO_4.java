package ccf_cap.before_201509;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月10日下午1:52:23
 */
public class NO_4 {
	public static void main(String[] args) {
		NO_4 m = new NO_4();
		Scanner sc = new Scanner(System.in);
		int city_n = sc.nextInt();
		int road_n = sc.nextInt();

		city[] citys = new city[city_n];
		//节点
		for(int i = 0; i < city_n; i++){
			citys[i] = m.new city(i+1, 0);
		}
		road[] roads = new road[road_n];
		//边
 		for(int i = 0; i < road_n; i++){
			roads[i] = m.new road(i+1, sc.nextInt(), sc.nextInt());
		}
 		List<String> pairs = new ArrayList<String>();
 		//for(int i = )
 		for(int i = 0 ; i < city_n; i++){
 			city[] i_citys = citys;
 			for(city ccc :  citys)
 				ccc.setColor(0);
 			road[] i_roads = roads;
 			//根节点设为黑色
 			i_citys[i].setColor(1);
 			List<city> i_adj_citys = new ArrayList<city>();
 			i_adj_citys.add(i_citys[i]);
 			//找到邻接节点们的临接节点
 			while(i_adj_citys.size() != 0){
 				//i_adj_citys这些节点们的临接节点
 				//List<city> adjs = getAllAdj(i_adj_citys, i_citys, i_roads);
 				//begin
 				List<city> adjs = new ArrayList<city>();
 				for(city c : i_adj_citys){
 					//c的邻接节点
 					for(road r : i_roads){
 						if(r.getStart() == c.getNumber()){
 							for(int ii = 0; ii < i_citys.length; ii++){
 								if(i_citys[ii].getNumber() == r.getEnd()){
 									if(i_citys[ii].getColor() == 0){
 										i_citys[ii].setColor(1);
 										adjs.add(i_citys[ii]);
 									}
 									break;
 								}
 							}
 							//city c = new city(r.getEnd());
 							
 						}
 					}
 				}
 				//end
 				for(int j = 0; j < adjs.size(); j++){
 					//加入结果中
 					pairs.add(i_citys[i].getNumber() + " " + adjs.get(j).getNumber());
 				}
 				i_adj_citys = adjs;
 			}
 		}
 		//System.out.println(pairs);
 		int count = 0;
 		for(String pair : pairs){
 			String contrary_pair = pair.split(" ")[1] + " " + pair.split(" ")[0];
 			if(pairs.contains(contrary_pair))
 				count++;
 		}
 		System.out.println(count/2);
 		long end = System.currentTimeMillis();
 		System.out.println(end);
	}
	
	
	
	public class city{
		private int number;
		private int color;
		//前驱节点
		private city pi;
		public city(){}
		public city(int number){
			this.number = number;
		}
		public city(int number, int color){
			this.number = number;
			this.color = color;
		}
		//邻接链表
		public List<city> getAdj(city[] i_citys, road[] i_roads){
			List<city> adj_citys = new ArrayList<city>();
			for(road r : i_roads){
				if(r.getStart() == this.number){
					for(int i = 0; i < i_citys.length; i++){
						if(i_citys[i].getNumber() == r.getEnd()){
							if(i_citys[i].getColor() == 0)
								adj_citys.add(new city(r.getEnd()));
							break;
						}
					}
				}
			}
			
			return null;
		}
		public int getColor() {
			return color;
		}
		public void setColor(int color) {
			this.color = color;
		}
		public city getPi() {
			return pi;
		}
		public void setPi(city pi) {
			this.pi = pi;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		
	}
	public class road{
		private int number;
		private int start;
		private int end;
		public road(){}
		public road(int number, int start, int end){
			this.number = number;
			this.setStart(start);
			this.setEnd(end);
		}
		public int getStart() {
			return start;
		}
		public void setStart(int start) {
			this.start = start;
		}
		public int getEnd() {
			return end;
		}
		public void setEnd(int end) {
			this.end = end;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
	}
	
}
