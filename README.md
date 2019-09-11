# springcloud-test
重点声明：我是在https://gitee.com/liuge1988/kitty.git的基础上根据自己的需要作了一点改进！ 不清楚了可以去查看原文。 
#上传到github报了警报，把target里面的jar包传上来了 #将consul改成zookeeper,考虑到后面集成hadoop,用zookeeper3.4会报错，改成3.5，注意要下https://mirrors.tuna.tsinghua.edu.cn/apache/zookeeper/stable/apache-zookeeper-3.5.5-bin.tar.gz，或者要用maven编译，而且还不一定成功，这个坑害我搞了一下午！
1,在原来的基础上复制了一份，但是dao始终注入不进去，后来在启动类上添加了扫包的注解成功@MapperScan(annotationClass = Repository.class, basePackages = "com.cloud.admin.dao")
