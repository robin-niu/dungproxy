#client整体结构


client结构如下图:
![img](../../pic/client_architecture.png)

解决IP环境依赖问题的方式,那就是为每个目标维护一个资源池,所以就客户端结构来说,每个域名下的IP资源都是独立的。然后则是预校验机制,所以IP在加入到IPPool的时候,都需要进行可用性探测。这样保证IP在加入的时候,都是可用的
