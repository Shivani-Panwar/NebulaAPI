package com.myproject.myapi.controller;


import com.myproject.myapi.dao.ApiLogInterface;
import com.myproject.myapi.model.CsvDetails;
import com.myproject.myapi.model.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ApiController {
    @Autowired
    ApiLogInterface apiRepo;

    private static final List<Worker> workers=new ArrayList();

    static{
        workers.add(new Worker("W1","aworker","0 core(s) in use","1% 1.726 GiB/125.9 GiB","GeForce RTX 2070, not used","0% 1.726 GiB/261.9 GiB"));
        workers.add(new Worker("W2","bworker","3 core(s) in use","17% 174.3 GiB/996 GiB","","13% 198.3 GiB/1.473 TiB"));
        workers.add(new Worker("W3","cworker","32 core(s) in use","3% 37.32 GiB/1008 GiB","GeForce RTX 2080, not used","10% 157.3 GiB/1.485 TiB"));
        workers.add(new Worker("W4","dworker","48 core(s) in use","13% 32.55 GiB/244 GiB","GeForce RTX 1080, not used","43% 152.6 GiB/352 GiB"));
        workers.add(new Worker("W5","eworker","5 core(s) in use","1% 1.726 GiB/125.9 GiB","GeForce GTX 1660, not used","0% 1.726 GiB/261.9 GiB"));
        workers.add(new Worker("W6","fworker","27 core(s) in use","10% 100.8 GiB/1008 GiB","","10% 2.619 GiB/261.9 GiB"));


    }

        @GetMapping(value = "/annotated/worker/{workerID}")
        public ResponseEntity<Worker> getData(@PathVariable String workerID) throws IOException {
            int errorCount=0;
            Optional<Worker> worker = workers.stream().filter(x -> x.getWorkerID().equals(workerID)).findAny();



            if(worker.isPresent()){
                CsvDetails details=new CsvDetails();
                details.setApiCallData(workerID);
                details.setApiKey("/annotated/worker");
                details.setApiValue("{\"workerID\":" +worker.get().getWorkerID()+ ":|\"workerName\":"+worker.get().getWorkerName()+"|\"cpuUsage\":"+worker.get().getCpuUsage()+"|\"ram\":"+worker.get().getRam()+"|\"gpu\":"+worker.get().getGpu()+"|\"vRam\":"+worker.get().getvRam()+"}");
                errorCount=save2CSV(details,errorCount);
                apiRepo.apiLogDets("admin_1", LocalDate.now(), LocalTime.now(),"success",errorCount);
                return ResponseEntity.ok(worker.get());
            }
            errorCount++;
            apiRepo.apiLogDets("admin_1", LocalDate.now(), LocalTime.now(),"fail",errorCount);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

        public int save2CSV(CsvDetails dets,int errorCount) throws IOException {
            FileWriter fw = null;
            BufferedWriter bw = null;
            PrintWriter pw = null;

                fw = new FileWriter("ApiDetails.csv", true);
                try{
                    bw = new BufferedWriter(fw);
                    pw =new PrintWriter(bw);
                    pw.println(dets.toCSVString());
                    pw.flush();
                }catch(Exception e){
                    errorCount++;
            }
                pw.close();
                bw.close();
                fw.close();
            return errorCount;
        }
}
