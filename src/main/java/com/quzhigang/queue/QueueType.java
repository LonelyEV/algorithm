
/**
 * Project Name:algorithm
 * File Name:QueueType.java
 * Package Name:com.quzhigang.queue
 * Date:2017年7月20日下午08:11:32
 * author 屈志刚  email:598700560
 *
*/

package com.quzhigang.queue;


public class QueueType {

    static final int QUEUELEN = 15;  //队列长度
    DATA[] data = new DATA[QUEUELEN];
    int head;  //队列头
    int tail;  //队列尾


    /**
     * 
     * init:(初始化队列). <br/>
     * TODO(这里描述这个方法适用条件 – 可选).<br/>
     * TODO(这里描述这个方法的执行流程 – 可选).<br/>
     * TODO(这里描述这个方法的使用方法 – 可选).<br/>
     * TODO(这里描述这个方法的注意事项 – 可选).<br/>
     *
     * @author 屈志刚
     * @return
     * @since JDK 1.7
     */
    public QueueType init(){

        QueueType queueType;

        if((queueType = new QueueType()) != null){

            queueType.head = 0;
            queueType.tail = 0;
            return queueType;
        }
        return null;

    }

    /**
     * 
     * isEmpty:(判断是否为空队列). <br/>
     * TODO(这里描述这个方法适用条件 – 可选).<br/>
     * TODO(这里描述这个方法的执行流程 – 可选).<br/>
     * TODO(这里描述这个方法的使用方法 – 可选).<br/>
     * TODO(这里描述这个方法的注意事项 – 可选).<br/>
     *
     * @author 屈志刚
     * @param queueType
     * @return
     * @since JDK 1.7
     */
    public int isEmpty(QueueType queueType){

        int temp = 0;
        if(queueType.head == queueType.tail)
            temp = 1;
            return temp;

    }

    /**
     * 
     * isFull:(判断满队列). <br/>
     * TODO(这里描述这个方法适用条件 – 可选).<br/>
     * TODO(这里描述这个方法的执行流程 – 可选).<br/>
     * TODO(这里描述这个方法的使用方法 – 可选).<br/>
     * TODO(这里描述这个方法的注意事项 – 可选).<br/>
     *
     * @author 屈志刚
     * @param queueType
     * @return
     * @since JDK 1.7
     */
    public int isFull(QueueType queueType){

        int temp = 0;
        if(queueType.tail == QUEUELEN)
            temp = 1;
            return (temp);
    }

    /**
     * 
     * clearQueue:(清空队列). <br/>
     * TODO(这里描述这个方法适用条件 – 可选).<br/>
     * TODO(这里描述这个方法的执行流程 – 可选).<br/>
     * TODO(这里描述这个方法的使用方法 – 可选).<br/>
     * TODO(这里描述这个方法的注意事项 – 可选).<br/>
     *
     * @author 屈志刚
     * @param queueType
     * @since JDK 1.7
     */
    public void clearQueue(QueueType queueType){

        queueType.head = 0;
        queueType.tail = 0;
    }

    /**
     * 
     * freeQueue:(释放内存空间). <br/>
     * TODO(这里描述这个方法适用条件 – 可选).<br/>
     * TODO(这里描述这个方法的执行流程 – 可选).<br/>
     * TODO(这里描述这个方法的使用方法 – 可选).<br/>
     * TODO(这里描述这个方法的注意事项 – 可选).<br/>
     *
     * @author 屈志刚
     * @param queueType
     * @since JDK 1.7
     */
    public void freeQueue(QueueType queueType){

        if(queueType != null){
            queueType = null;
        }
    }

    /**
     * 
     * inQueue:(入队). <br/>
     * TODO(这里描述这个方法适用条件 – 可选).<br/>
     * TODO(这里描述这个方法的执行流程 – 可选).<br/>
     * TODO(这里描述这个方法的使用方法 – 可选).<br/>
     * TODO(这里描述这个方法的注意事项 – 可选).<br/>
     *
     * @author 屈志刚
     * @param queueType
     * @param data
     * @return
     * @since JDK 1.7
     */
    public int inQueue(QueueType queueType, DATA data){

        if(queueType.tail == QUEUELEN){

            System.out.println("队列已满！操作失败");
            return 0;

        }else{

            queueType.data[queueType.tail++] = data;
            return (1);
        }
    }



    /**
     * 
     * outQueue:(出对). <br/>
     * TODO(这里描述这个方法适用条件 – 可选).<br/>
     * TODO(这里描述这个方法的执行流程 – 可选).<br/>
     * TODO(这里描述这个方法的使用方法 – 可选).<br/>
     * TODO(这里描述这个方法的注意事项 – 可选).<br/>
     *
     * @author 屈志刚
     * @param queueType
     * @return
     * @since JDK 1.7
     */
    public DATA outQueue(QueueType queueType){

        if(queueType.head == queueType.tail){

            System.out.println("队列已空！操作失败");
            System.exit(0);
        }else{
            return queueType.data[queueType.head++];
        }
        return null;
    }

    /**
     * 
     * peekQueue:(读节点数据). <br/>
     * TODO(这里描述这个方法适用条件 – 可选).<br/>
     * TODO(这里描述这个方法的执行流程 – 可选).<br/>
     * TODO(这里描述这个方法的使用方法 – 可选).<br/>
     * TODO(这里描述这个方法的注意事项 – 可选).<br/>
     *
     * @author 屈志刚
     * @param queueType
     * @return
     * @since JDK 1.7
     */
    public DATA peekQueue(QueueType queueType){

        if(queueType.isEmpty(queueType) == 1){

            System.out.println("空队列");
            return null;

        }else{

            return queueType.data[queueType.head];
        }
    }

    /**
     * 
     * getQueueLen:(获取队列长度). <br/>
     * TODO(这里描述这个方法适用条件 – 可选).<br/>
     * TODO(这里描述这个方法的执行流程 – 可选).<br/>
     * TODO(这里描述这个方法的使用方法 – 可选).<br/>
     * TODO(这里描述这个方法的注意事项 – 可选).<br/>
     *
     * @author 屈志刚
     * @param queueType
     * @return
     * @since JDK 1.7
     */
    public int getQueueLen(QueueType queueType){

        int temp;
        temp = queueType.tail - queueType.head;
        return (temp);
    }




}
