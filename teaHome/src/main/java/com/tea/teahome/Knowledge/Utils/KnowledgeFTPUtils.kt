package com.tea.teahome.Knowledge.Utils

import com.tea.teahome.Knowledge.Ftp.FTP

/**
 * 通过FTP获取知识数据
 *
 * @author jiang yuhang
 * @version 1.0
 * @date 2021-02-17 15:45
 */
class KnowledgeFTPUtils(private val privatePath: String) {
    /**
     * FTP
     */
    private val ftp: FTP

    /**
     * FTP登录是否成功
     */
    val isConnected: Boolean

    /**
     * 如果FTP登陆成功，下载全部的文件到PrivatePath中
     *
     * @author jiang yuhang
     * @date 2021-02-17 22:26
     */
    fun downloadFilesFromFtp() {
        ftp.downloadFiles("/", privatePath)
    }

    /**
     * 初始化变量，获取FTp中的文件
     *
     * @author jiang yuhang
     * @date 2021-02-17 15:52
     */
    init {
        val FTP_ADDRESS = "106.13.54.66"
        val FTP_PORT = 21
        val FTP_USERNAME = "jiangyuhang"
        val FTP_PASSWORD = "Jyh86350517"
        val BASE_PATH = ""
        ftp = FTP(FTP_ADDRESS, FTP_PORT, FTP_USERNAME, FTP_PASSWORD, BASE_PATH)
        //获取FTP登录是否成功
        isConnected = ftp.b
    }
}