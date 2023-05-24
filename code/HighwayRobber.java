// course exercise. chap5, question1

public class HighwayRobber{

    public static void main(String[] args) {

        /* 问题描述：
        某人有100,000元,每经过一次路口，需要交费,规则如下:
        1) 当现金>50000时,每次交5%
        2) 当现金<=50000时,每次交1000
        编程计算该人可以经过多少次路口, 要求: 使用 while + break方式完成

        思路分析:
        1. 定义 double money 保存 100000
        2. 根据题的要求，我们分析出来有三种情况 
            money > 50000 
            money >= 1000 && money <= 50000
            money < 1000 
        3. 使用多分支 if-elseif-else 
        4. while+break[money < 1000], 同时使用一个变量count来保存通过路口

        代码实现: */

        int moneyInHand = 100_000;
        int roadCrossed = 0;
        while (true) { 
            if (moneyInHand <= 1_000)
                break; // 钱不够，不让过 
            else if (moneyInHand <= 50_000) 
                moneyInHand -= 1_000;
            else 
                moneyInHand *= 0.95;
            roadCrossed++;
        }
        System.out.println("最多可以经过 " + roadCrossed + " 个路口");

        
    }
}