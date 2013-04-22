package org.mvnsearch.aria2.service;

import java.util.Map;

/**
 * aria service
 *
 * @author linux_china
 */
public interface AriaService {
    /**
     * connect with host
     *
     * @param host host name
     * @param port port
     */
    public void connect(String host, int port) throws Exception;

    /**
     * get xml rpc url
     *
     * @return xml rpc url
     */
    public String getXmlRpcUrl();

    /**
     * download url with options
     *
     * @param url     url
     * @param options options
     * @return gid
     */
    public String addUri(String url, Map<Object, Object> options) throws Exception;

    /**
     * remove download
     *
     * @param gid gid
     * @throws Exception exception
     */
    public void remove(String gid) throws Exception;

    /**
     * pause download
     *
     * @param gid gid
     * @throws Exception exception
     */
    public void pause(String gid) throws Exception;

    /**
     * tell download status
     *
     * @param gid gid
     * @return status information
     */
    public Map<String, String> tellStatus(String gid);

    /**
     * get global stat
     * <pre>
     * numActive:0
     * downloadSpeed:0
     * uploadSpeed:0
     * numWaiting:0
     * numStopped:2
     * </pre>
     *
     * @return global stat
     */
    public Map<String, String> getGlobalStat() throws Exception;
}