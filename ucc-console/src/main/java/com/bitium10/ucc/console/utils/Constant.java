/**
 * Copyright (c) 2014, shouli1990@gmail.com|shouli1990@gmail.com. All rights reserved.
 *
 */
package com.bitium10.ucc.console.utils;

/**
 * <b>项目名</b>： ucc <br>
 * <b>包名称</b>： com.bitium10.ucc.console <br>
 * <b>类名称</b>： Constant <br>
 * <b>类描述</b>： <br>
 * <b>创建人</b>： <a href="mailto:shouli1990@gmail.com">李朋明</a> <br>
 * <b>修改人</b>： <br>
 * <b>创建时间</b>：2015/4/5 20:06<br>
 * <b>修改时间</b>： <br>
 * <b>修改备注</b>： <br>
 *
 * @version 1.0.0 <br>
 */
public interface Constant {
    public final static String _ZK_SERVERS = Config._CONFIG.get("zk.servers");
    public final static int    _ZK_TIMEOUT = Integer.parseInt(Config._CONFIG.get("zk.timeout"));

    //db
    public final static String DRIVER   = "jdbc.driver";
    public final static String URL      = "jdbc.url";
    public final static String USERNAME = "jdbc.username";
    public final static String PASSWORD = "jdbc.password";
}
