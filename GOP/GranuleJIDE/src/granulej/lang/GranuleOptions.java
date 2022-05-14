package granulej.lang;

/*
    系统功能选项，可以打开或关闭一些功能，以及是否打印一些测试信息
 */
public class GranuleOptions {

    //    enableDirtyFlag：是否允许脏技术
    public static final boolean enableDirtyFlag = true;
    //    enableRewriteNew：
    public static final boolean enableRewriteNew = true;
    //    enablePreloadThread：是否允许预加载粒技术
    public static final boolean enablePreloadThread = true;
    //    enableSearchTimeStat：
    public static final boolean enableSearchTimeStat = false;
    //    enableAnalyseGranuleSub：
    public static final boolean enableAnalyseGranuleSub = false;
    //    enablePrintDebugInfo：
    public static final boolean enablePrintDebugInfo = false;
    //    enableMarkTime：是否允许标注时间，测试使用
    public static final boolean enableMarkTime = false;

    // 多线程上下文、粒管理器测试输出
    public static final boolean enableThredTestInfo = true;

    // gop中间测试信息输出
    public static final boolean enableGopTestInfo = true;
}
