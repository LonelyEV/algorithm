
/**
 * Project Name:algorithm
 * File Name:QueueTest.java
 * Package Name:com.quzhigang.queue
 * Date:2017年7月20日下午08:20:32
 * author 屈志刚  email:598700560
 *
*/

package com.quzhigang.queue;


import java.util.Scanner;

public class QueueTest {

    public static void main(String args[]){

        QueueType queueType = new QueueType();
        DATA data;

        Scanner input = new Scanner(System.in);
        QueueType queue = queueType.init();

        System.out.println("入队操作开始：");
        System.out.println("请输入姓名  年龄进行入队操作：");

        do{

            DATA tempData = new DATA();
            tempData.setName(input.next());
            tempData.setAge(input.nextInt());

            if(tempData.getName().equals("0")){

                break;
            }else{
                queueType.inQueue(queue,tempData);
            }

        }while (true);

        input.nextLine();

        String temp = "1";
        System.out.println("出队列操作：按任意非0键进行出对操作");

        temp = input.next();
        while (!temp.equals("0")){

            data = queueType.outQueue(queue);
            System.out.printf("出队列的数据为(%s,%d)\n",data.getName(),data.getAge());
            temp = input.next();

        }

        System.out.println("测试结束！");
        queueType.freeQueue(queue);


    }


}
