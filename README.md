# 矿车升级/CartUpgrader

一个Minecraft 1.16.5版本的Fabric模组，让各种矿车被破坏时可以像1.19+一样完整掉落，而不是1.18-那样破碎成矿车和漏斗啥的两部分。

**目前只作为实验性模组，使用前请备份存档。**

下载：[CurseForge](https://www.curseforge.com/minecraft/mc-mods/cartupgrader "CartUpgrader") 或者 [Modrinth](https://modrinth.com/mod/cartupgrader "CartUpgrader") 或者查看Release.

### 适用范围：

* 普通矿车
* 漏斗矿车
* 箱子矿车
* 熔炉矿车
* TNT矿车

### 版本需求：

* Minecraft 1.16.5
* Fabric Loader >=0.14.0
* Fabric API >= 0.30.0

眼馋Minecraft 1.19+的矿车完整掉落特性好久了，费工夫学了一下Fabric开发和Mixin注入，搓了个小东西作为练手。挺高兴。

TNT矿车爆炸时可能有（没出现过，没验证过但我总害怕有）bug，有问题或想法请及时联系我。

未来可能会带来升级，加入控制开关。

# CartUpgrader

 A Minecraft 1.16.5 fabric mod, which enables container and other minecarts drop themselves when they're destroyed, as their behaviors in 1.19+.

**This is only an experimental mod. Please backup your saves before use.**

DownLoad: [CurseForge](https://www.curseforge.com/minecraft/mc-mods/cartupgrader "CartUpgrader") or [Modrinth](https://modrinth.com/mod/cartupgrader "CartUpgrader") visit release.

### These minecart entities are involved:

* Minecart(itself)
* Minecart with Hopper
* Minecart with Chest
* Minecart with Furnace
* Minecart with TNT

### Depends:

* Minecraft 1.16.5
* Fabric Loader >=0.14.0
* Fabric API >= 0.30.0

Frankly speaking, I'm that kind of person who would like to stay at an old version of game, but eager to see new features, so I spent a period of time learning Fabric and Mixin, and wrote this as a simple practice. I'm fufilled.

Minecarts with TNT may not behave as I wish(I don't find bugs, but I'm afraid there might be), so please contact with me if you have any questions  or ideas.
