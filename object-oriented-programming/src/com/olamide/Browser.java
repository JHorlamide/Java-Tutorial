package com.olamide;

public class Browser {
    public String navigate(String address) {
        String ipAddress = findIpAddress(address);
        return sendHttpRequest(ipAddress);
    }

    private String sendHttpRequest(String ipAddress) {
        return "<html></html>";
    }

    private String findIpAddress(String address) {
        return "127.0.01";
    }
}
