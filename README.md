# Adsorb Side Float Ball 吸边悬浮球
参考FloatWindow https://github.com/MeteorCh/FloatWindow
 # 模仿微信浮窗的（~~可折叠~~）自动靠边，贴边变形，悬浮按钮  
 Adsorb Side Ball 模仿微信浮窗的可折叠自动靠边悬浮按钮，在[FloatMenuSample](https://github.com/crosg/FloatMenuSample)和[FloatingActionButtonSpeedDial](https://github.com/leinardi/FloatingActionButtonSpeedDial)的参考下写的模仿微信浮窗的悬浮自动贴边可展开浮动按钮。
 具体见原作者的博客：https://blog.csdn.net/qq_31709249/article/details/98449374
 # 效果图：
 ![image](https://github.com/huyongqiang/com.goals.floatabsorbsideball/blob/master/2C7FD55A.gif)
 # 更新记录
 * 2021.1.20 本次更新：1修复不能初始化在屏幕右边的问题； 2点击事件集中到onExpend()；3去除了点击展开事件（工作需求如此，如果需要点击展开，可以参考下原作者的更接近微信的）；4添加了红色的背景阴影；5调整拖动后，悬浮球的位置在触电的位置，如果你需要不被指尖挡住，可以将注释的代码放开，但是在拖动的时候会有跳跃的效果，不是很连贯。
 * 2019.9.5 更新：界面重做，使得界面更加扁平化，更加美观。同时支持设置文字功能，具体见代码。效果如下图所示：
 ![image](https://github.com/MeteorCh/FloatWindow/blob/master/SceenShoot/Screenrecorder-2019-09-05-20-53-54-314.gif)
 * 2019.10.13 更新：重新设计构造方法，能自定义初始悬浮窗出现在左边还是右边，能自定义悬浮窗初始出现时距离屏幕顶部的距离（即可自定义悬浮窗的位置）。

