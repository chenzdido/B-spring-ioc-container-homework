@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？
答：
（1）如果从第三方库连接组件（没有源代码），无法进行自动装配，此时只能使用@Bean手动装配；
（2）根据某些动态状态来实现特定的实现时，选择@Bean也比较合适 ，如下面这个示例：
    @Bean
    public SomeService someService() {
        switch (state) {
        case 1:
            return new Impl1();
        case 2:
            return new Impl2();
        case 3:
            return new Impl3();
        default:
            return new Impl();
        }
    }