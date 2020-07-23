package com.xiaoyuan.threadjuc.thread.pool;

/**
 * @author : liyuan  
 * @description : 线程池总结
 * @date : 2020/7/23 08:01  
 */
public class ThreadPoolDescription {

    /**
     * @description 创建线程池
     * @param corePoolSize    核心线程池的数量,创建完成后准备就绪,等待被调用,除非线程设置了超时设置
     * @param maximumPoolSize 最大线程数量;控制资源并发
     * @param keepAliveTime   存活时间 ,当前线程数量大于最大线程数量时,释放空闲的线程.只要线程空闲大于指定的存货时间.核心线程不会被释放
     * @param unit            时间单位
     * @param workQueue       BlockingQueue<Runnable> workQueue, 阻塞队列,如果任务有很多,就会将目前多的任务放在队列里面,只要有线程空闲,就会去队列里面取出新的任务继续执行(直接提交队列、有界任务队列、无界任务队列、优先任务队列)
     * 1、直接提交队列：设置为SynchronousQueue队列，SynchronousQueue是一个特殊的BlockingQueue，它没有容量，没执行一个插入操作就会阻塞，需要再执行一个删除操作才会被唤醒，反之每一个删除操作也都要等待对应的插入操作
     * 使用SynchronousQueue队列，提交的任务不会被保存，总是会马上提交执行。如果用于执行任务的线程数量小于maximumPoolSize，则尝试创建新的进程，如果达到maximumPoolSize设置的最大值，则根据你设置的handler执行拒绝策略。
     * 因此这种方式你提交的任务不会被缓存起来，而是会被马上执行，在这种情况下，你需要对你程序的并发量有个准确的评估，才能设置合适的maximumPoolSize数量，否则很容易就会执行拒绝策略；
     * 2、有界的任务队列：有界的任务队列可以使用ArrayBlockingQueue
     * 使用ArrayBlockingQueue有界任务队列，若有新的任务需要执行时，线程池会创建新的线程，直到创建的线程数量达到corePoolSize时，则会将新的任务加入到等待队列中。若等待队列已满，即超过ArrayBlockingQueue初始化的容量，
     * 则继续创建线程，直到线程数量达到maximumPoolSize设置的最大线程数量，若大于maximumPoolSize，则执行拒绝策略。在这种情况下，线程数量的上限与有界任务队列的状态有直接关系，
     * 如果有界队列初始容量较大或者没有达到超负荷的状态，线程数将一直维持在corePoolSize以下，反之当任务队列已满时，则会以maximumPoolSize为最大线程数上限。
     * 3、无界的任务队列：有界任务队列可以使用LinkedBlockingQueue实现
     * 使用无界任务队列，线程池的任务队列可以无限制的添加新的任务，而线程池创建的最大线程数量就是你corePoolSize设置的数量，也就是说在这种情况下maximumPoolSize这个参数是无效的，哪怕你的任务队列中缓存了很多未执行的任务，
     * 当线程池的线程数达到corePoolSize后，就不会再增加了；若后续有新的任务加入，则直接进入队列等待，当使用这种任务队列模式时，一定要注意你任务提交与处理之间的协调与控制，不然会出现队列中的任务由于无法及时处理导致一直增长，直到最后资源耗尽的问题。
     * 4、优先任务队列：优先任务队列通过PriorityBlockingQueue
     * 除了第一个任务直接创建线程执行外，其他的任务都被放入了优先任务队列，按优先级进行了重新排列执行，且线程池的线程数一直为corePoolSize，也就是只有一个。
     * 通过运行的代码我们可以看出PriorityBlockingQueue它其实是一个特殊的无界队列，它其中无论添加了多少个任务，线程池创建的线程数也不会超过corePoolSize的数量，只不过其他队列一般是按照先进先出的规则处理任务，而PriorityBlockingQueue队列可以自定义规则根据任务的优先级顺序先后执行。
     * @param threadFactory   创建线程的工厂
     * ThreadPoolExecutor扩展主要是围绕beforeExecute()、afterExecute()和terminated()三个接口实现的，
     * 1、beforeExecute：线程池中任务运行前执行
     * 2、afterExecute：线程池中任务运行完毕后执行
     * 3、terminated：线程池退出后执行
     * 通过这三个接口我们可以监控每个任务的开始和结束时间，或者其他一些功能
     * @param handler         如果阻塞队列满了,按照我们指定的拒绝策略拒绝执行任务
     * 1、AbortPolicy策略：该策略会直接抛出异常，阻止系统正常工作；
     * 2、CallerRunsPolicy策略：如果线程池的线程数量达到上限，该策略会把任务队列中的任务放在调用者线程当中运行；
     * 3、DiscardOledestPolicy策略：该策略会丢弃任务队列中最老的一个任务，也就是当前任务队列中最先被添加进去的，马上要被执行的那个任务，并尝试再次提交；
     * 4、DiscardPolicy策略：该策略会默默丢弃无法处理的任务，不予任何处理。当然使用此策略，业务场景中需允许任务的丢失；
     */
//    public static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 20, 30, TimeUnit.SECONDS, new LinkedBlockingDeque<>(100), Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());


    /**
     * @description FixedThreadPool 固定大小的线程池
     * corePoolSize与maximumPoolSize相等，即其线程全为核心线程，是一个固定大小的线程池，是其优势；
     * keepAliveTime = 0 该参数默认对核心线程无效，而FixedThreadPool全部为核心线程；
     * workQueue 为LinkedBlockingQueue（无界阻塞队列），队列最大值为Integer.MAX_VALUE。如果任务提交速度持续大余任务处理速度，会造成队列大量阻塞。因为队列很大，很有可能在拒绝策略前，内存溢出。是其劣势；
     * FixedThreadPool的任务执行是无序的；
     * 适用场景：可用于Web服务瞬时削峰，但需注意长时间持续高峰情况造成的队列阻塞。
     */
/*    public static ExecutorService newFixedThreadPool(int nThreads) {
        return new ThreadPoolExecutor(nThreads, nThreads,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
    }*/

    /**
     * @description CachedThreadPool 所有都可以被回收的线程池
     * corePoolSize = 0，maximumPoolSize = Integer.MAX_VALUE，即线程数量几乎无限制；
     * keepAliveTime = 60s，线程空闲60s后自动结束。
     * workQueue 为 SynchronousQueue 同步队列，这个队列类似于一个接力棒，入队出队必须同时传递，因为CachedThreadPool线程创建无限制，不会有队列等待，所以使用SynchronousQueue；
     *适用场景：快速处理大量耗时较短的任务，如Netty的NIO接受请求时，可使用CachedThreadPool。
     */
/*    public static ExecutorService newCachedThreadPool() {
        return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>());
    }*/

    /**
     * @description SingleThreadExecutor  单例线程池,后台从队列获取任务,挨个执行
     * FixedThreadPool可以向下转型为ThreadPoolExecutor，并对其线程池进行配置，而SingleThreadExecutor被包装后，无法成功向下转型。因此，SingleThreadExecutor被定以后，无法修改，做到了真正的Single。
     */
/*    public static ExecutorService newSingleThreadExecutor() {
        return new FinalizableDelegatedExecutorService
                (new ThreadPoolExecutor(1, 1,
                        0L, TimeUnit.MILLISECONDS,
                        new LinkedBlockingQueue<Runnable>()));
    }*/

    /**
     * @description ScheduledThreadPool 定时任务线程池
     * scheduleAtFixedRate 任务运行周期不受任务执行时间的影响 任务开始即计时
     * scheduleWithFixedDelay 任务运行周期受任务执行时间影响  任务结束才计时
     *
     */
/*    public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize) {
        return new ScheduledThreadPoolExecutor(corePoolSize);
    }*/

}
