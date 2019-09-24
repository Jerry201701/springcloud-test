# springcloud-test
重点声明：我是在https://gitee.com/liuge1988/kitty.git的基础上根据自己的需要作了一点改进！ 不清楚了可以去查看原文。 
#上传到github报了警报，把target里面的jar包传上来了 #将consul改成zookeeper,考虑到后面集成hadoop,用zookeeper3.4会报错org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented for /backup/backup-service/4665b7bd-9927-4a86-8d38-124678a4f3c3，改成3.5就ok了，注意要下https://mirrors.tuna.tsinghua.edu.cn/apache/zookeeper/stable/apache-zookeeper-3.5.5-bin.tar.gz，或者要用maven编译，而且还不一定成功，这个坑害我搞了一下午！
1,在原来的基础上复制了一份，但是dao始终注入不进去，后来在启动类上添加了扫包的注解成功@MapperScan(annotationClass = Repository.class, basePackages = "com.cloud.admin.dao")
2.注意启动顺序：monitor,admin,backup,其他随便
端口占用：
monitor:8000
admin:8001
backup:8002
config:8003
gateway:8004
hystrix:8005
producer:8006
consumer:8007
order:8008
zuul:8009
3,配置中心采用bus+kafka
4.准备把网关改成gateway,捣腾半天最后发现zookeeper没有集成，自己写暂时也没搞出来，先就用zuul吧
5，zookeeper也可以做成配置中心，做到实时刷新，但是从zuki上传txt文件，应该是读取txt文件后生成
key-value，感觉不方便，这个根据具体项目吧，我还是继续用bus+kafka作配置中心


