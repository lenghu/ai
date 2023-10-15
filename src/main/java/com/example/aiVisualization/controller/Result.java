package com.example.aiVisualization.controller;

public class Result {
    private Object data;
    private Integer code;
    private String msg;

    public Result(Object data, Integer code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
