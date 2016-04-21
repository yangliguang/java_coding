package alibaba;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:Young
 * Class Comment:
 * 优惠券是目前较为受用户欢迎的促销手段，为了方便用户使用优惠券，网站在用户提交购买购物车中的商品时自动为用户推荐并使用最合适的优惠券。目前假设有两类优惠券：
1、“满包邮”：即在单一店铺中购买商品总价满足一定条件时会减免用户的快递费用，例如：满100包邮
2、“红包”：即单一店铺中购买商品总价满足一定条件时会产生一定程度的金额减免，例如：满100减10、满300减20等
请就如上设定，设计购物车提交时优惠券的推荐程序，规定每个店铺只能使用一张优惠券。
问题1：请阐述你的设计方案，形式不限
问题2：请用Java实现推荐程序，代码范围限定使用JDK原生API
 * Date: 2016年4月20日下午8:15:11
 */
public class Privilege {
	public static void main(String[] args) {
		Privilege p = new Privilege();
		int account = 150;
		Bonus b1 = p.new Bonus(1,100,10);
		Bonus b2 = p.new Bonus(2,300,20);
		Bonus b3 = p.new Bonus(3,100,true);
		List<Bonus> bs = new ArrayList<Bonus>();
		bs.add(b1);
		bs.add(b2);
		bs.add(b3);
		Bonus best = getBest(account, bs);
	}
	static Bonus getBest(int account, List<Bonus> bs){
		int max = 0;
		int id = 0;;
		int i = -1;
		for(Bonus b : bs){
			i++;
			int discount = 0;
			if(b.baoyou){
				if(b.man >= account)
					discount = 10;
			} else{
				if(b.man >= account)
					discount = b.jian;
			}
			if(discount >= max){
				id = i;
			}
		}
		return bs.get(i);
	}
	public class Bonus{
		public int id;
		public int man;
		public int jian;
		public boolean baoyou;
		public Bonus(int id, int man, int jian){
			this.id = id;
			this.man = man;
			this.jian = jian;
		}
		public Bonus(int id, int man, boolean baoyou){
			this.id = id;
			this.man = man;
			this.baoyou = baoyou;
		}
	}
}
