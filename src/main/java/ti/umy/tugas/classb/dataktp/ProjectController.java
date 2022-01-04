/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ti.umy.tugas.classb.dataktp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author user
 */
@Controller

public class ProjectController {

     @RequestMapping("/tampildataktp")
     public String getData(Model model){
         ArrayList<List<String>> data = new ArrayList<>();
         
         data.add(Arrays.asList("Id","Nomor Ktp","Nama","Alamat"));
         data.add(Arrays.asList("01","001","Rezka","Bengkulu"));
         data.add(Arrays.asList("02","002","Rahma","Yogyakarta"));
         data.add(Arrays.asList("03","003","Bagas","Bandung"));
         data.add(Arrays.asList("04","004","Bagus","Bogor"));
         data.add(Arrays.asList("05","005","Randy","Bogor"));
         data.add(Arrays.asList("06","006","Bayu","Bengkulu"));
         data.add(Arrays.asList("07","007","Zavira","Yogyakarta"));
         data.add(Arrays.asList("08","008","Wiwit","Jakarta"));
         data.add(Arrays.asList("09","009","Tri","Padang"));
         data.add(Arrays.asList("010","0010","Deri","Lampung"));
         data.add(Arrays.asList("011","0011","Vika","Padang"));
         data.add(Arrays.asList("012","0012","Fajar","Bogor"));
         data.add(Arrays.asList("013","0013","Dimas","Lampung"));
         data.add(Arrays.asList("014","0014","Yogi","Papua"));
         data.add(Arrays.asList("015","0015","Ainun","Bogor"));
         data.add(Arrays.asList("016","0016","Dian","Yogyakarta"));
         data.add(Arrays.asList("017","0017","Fadhil","Yogyakarta"));
         data.add(Arrays.asList("018","0018","Bintang","Bengkulu"));
         data.add(Arrays.asList("019","0019","Esy","Palembang"));
         data.add(Arrays.asList("020","0020","Bambang","Bogor"));
                 
         model.addAttribute("data", data);
         return "view";
     }
}
