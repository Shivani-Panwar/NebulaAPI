package com.myproject.myapi.model;

public class Worker {
    private String workerID;
    private String workerName;
    private String cpuUsage;
    private String ram;
    private String gpu;
    private String vRam;

    public Worker(String workerID, String workerName, String cpuUsage, String ram, String gpu, String vRam) {
        this.workerID = workerID;
        this.workerName = workerName;
        this.cpuUsage = cpuUsage;
        this.ram = ram;
        this.gpu = gpu;
        this.vRam = vRam;
    }

    public Worker() {
    }

    public String getWorkerID() {
        return workerID;
    }

    public void setWorkerID(String workerID) {
        this.workerID = workerID;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(String cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getvRam() {
        return vRam;
    }

    public void setvRam(String vRam) {
        this.vRam = vRam;
    }
}
