package bean;

import Entity.MenuConfigBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @PackageName:
 * @FileName:
 * @Description:
 * @Author: wangshy
 * @company: 上海势航网络科技有限公司
 * @Date 17/12/20
 */
public class Utils {
    public static List<MenuConfigBean> menuConfigBeanList = new ArrayList<MenuConfigBean>();
    private static Map<String, Integer> hmap = new HashMap<String, Integer>();

    public static int getKey(String key) {
        if (hmap.size() == 0) {
            setMap();
        }
//        System.out.println(hmap.get(key));
        if (null == hmap.get(key)) {
            return 10001;
        }
        return hmap.get(key);
    }

    public static void setMap(String s, Integer i) {
        hmap.put(s, i);
    }

    public static int getMapSiz() {
        return hmap.size();
    }

//    public static int getMapSizValue() {
//        Integer index = hmap.get(hmap.keySet());
//        if (index != null)
//            return index + 1;
//        else {
//            return 0;
//        }
//    }

    private static void setMap() {
        hmap.put("家常菜", 1);
        hmap.put("快手菜", 2);
        hmap.put("创意菜", 3);
        hmap.put("素菜", 4);
        hmap.put("凉菜", 5);
        hmap.put("烘焙", 6);
        hmap.put("面食", 7);
        hmap.put("汤", 8);
        hmap.put("自制调味料", 9);
        hmap.put("川菜", 10);
        hmap.put("粤菜", 11);
        hmap.put("湘菜", 12);
        hmap.put("鲁菜", 13);
        hmap.put("京菜", 14);
        hmap.put("东北菜", 15);
        hmap.put("西餐", 16);
        hmap.put("日本料理", 17);
        hmap.put("韩国料理", 18);
        hmap.put("韭菜", 19);
        hmap.put("春笋", 20);
        hmap.put("菠菜", 21);
        hmap.put("草莓", 22);
        hmap.put("樱桃", 23);
        hmap.put("苹果", 24);
        hmap.put("猪肝", 25);
        hmap.put("鲫鱼", 26);
        hmap.put("排骨", 27);
        hmap.put("清肺", 28);
        hmap.put("护肝", 29);
        hmap.put("减肥", 30);
        hmap.put("养胃", 31);
        hmap.put("丰胸", 32);
        hmap.put("排毒", 33);
        hmap.put("补血", 34);
        hmap.put("补钙", 35);
        hmap.put("提高免疫力", 36);
        hmap.put("早餐", 37);
        hmap.put("午餐", 38);
        hmap.put("下午茶", 39);
        hmap.put("晚餐", 40);
        hmap.put("夜宵", 41);
        hmap.put("踏青", 42);
        hmap.put("10分钟内", 43);
        hmap.put("10-20分钟", 44);
        hmap.put("半小时-1小时", 45);
        hmap.put("炒", 46);
        hmap.put("蒸", 47);
        hmap.put("煮", 48);
        hmap.put("电饭煲", 49);
        hmap.put("微波炉", 50);
        hmap.put("烤箱", 51);
        hmap.put("酸", 52);
        hmap.put("甜", 53);
        hmap.put("辣", 54);
        hmap.put("私房菜", 57);
        hmap.put("下酒菜", 58);
        hmap.put("小吃", 61);
        hmap.put("海鲜", 62);
        hmap.put("饭", 64);
        hmap.put("粥", 65);
        hmap.put("面", 66);
        hmap.put("粉", 67);
        hmap.put("饼", 68);
        hmap.put("饺子", 69);
        hmap.put("馒头", 70);
        hmap.put("包子", 71);
        hmap.put("卷子", 72);
        hmap.put("蛋糕", 73);
        hmap.put("面包", 74);
        hmap.put("饼干", 75);
        hmap.put("披萨", 76);
        hmap.put("零食", 77);
        hmap.put("果冻", 78);
        hmap.put("糖果", 79);
        hmap.put("布丁", 80);
        hmap.put("挞类", 81);
        hmap.put("羹", 82);
        hmap.put("果汁", 83);
        hmap.put("炖品", 84);
        hmap.put("糖水", 85);
        hmap.put("甜品", 86);
        hmap.put("沙拉", 87);
        hmap.put("饮品", 88);
        hmap.put("冰品", 89);
        hmap.put("便当", 90);
        hmap.put("烧烤", 91);
        hmap.put("寿司", 92);
        hmap.put("火锅", 93);
        hmap.put("酱汁", 94);
        hmap.put("佐料", 95);
        hmap.put("拼盘", 96);
        hmap.put("杂烩", 97);
        hmap.put("闽菜", 101);
        hmap.put("浙菜", 102);
        hmap.put("苏菜", 104);
        hmap.put("徽菜", 105);
        hmap.put("豫菜", 107);
        hmap.put("晋菜", 108);
        hmap.put("赣菜", 109);
        hmap.put("湖北菜", 110);
        hmap.put("清真菜", 111);
        hmap.put("云南菜", 112);
        hmap.put("贵州菜", 113);
        hmap.put("新疆菜", 114);
        hmap.put("淮扬菜", 115);
        hmap.put("潮州菜", 116);
        hmap.put("客家菜", 117);
        hmap.put("香港美食", 118);
        hmap.put("台湾菜", 119);
        hmap.put("泰国菜", 123);
        hmap.put("意大利菜", 124);
        hmap.put("法国菜", 125);
        hmap.put("东南亚菜", 126);
        hmap.put("印度菜", 127);
        hmap.put("美容", 129);
        hmap.put("补肾", 130);
        hmap.put("润肺", 131);
        hmap.put("滋阴", 133);
        hmap.put("抗衰老", 135);
        hmap.put("降血压", 136);
        hmap.put("祛痘", 137);
        hmap.put("防癌", 139);
        hmap.put("增肥", 140);
        hmap.put("明目", 142);
        hmap.put("防辐射", 143);
        hmap.put("降血脂", 144);
        hmap.put("健脑益智", 145);
        hmap.put("增高", 147);
        hmap.put("壮阳", 148);
        hmap.put("乌发", 149);
        hmap.put("调经", 150);
        hmap.put("助睡眠", 151);
        hmap.put("健脾胃", 152);
        hmap.put("润肠通便", 153);
        hmap.put("孕妇", 155);
        hmap.put("儿童", 156);
        hmap.put("幼儿", 157);
        hmap.put("老年人", 158);
        hmap.put("考生", 159);
        hmap.put("产妇", 160);
        hmap.put("运动员", 161);
        hmap.put("白领", 162);
        hmap.put("司机", 163);
        hmap.put("便秘", 164);
        hmap.put("贫血", 165);
        hmap.put("腹泻", 166);
        hmap.put("感冒", 167);
        hmap.put("咳嗽", 168);
        hmap.put("甲亢", 169);
        hmap.put("痛风", 170);
        hmap.put("胃痛", 171);
        hmap.put("失眠", 172);
        hmap.put("健忘", 173);
        hmap.put("骨折", 174);
        hmap.put("痔疮", 175);
        hmap.put("晕车", 176);
        hmap.put("低血糖", 177);
        hmap.put("消化不良", 178);
        hmap.put("月经不调", 179);
        hmap.put("口腔溃疡", 180);
        hmap.put("骨质疏松", 181);
        hmap.put("猪肉", 182);
        hmap.put("羊肉", 183);
        hmap.put("牛肉", 184);
        hmap.put("猪蹄", 186);
        hmap.put("五花肉", 187);
        hmap.put("腊肉", 188);
        hmap.put("火腿", 189);
        hmap.put("香肠", 190);
        hmap.put("鸡肉", 191);
        hmap.put("鸡翅", 192);
        hmap.put("鸡腿", 193);
        hmap.put("鸡蛋", 194);
        hmap.put("鸭肉", 195);
        hmap.put("鸭腿", 196);
        hmap.put("咸蛋", 197);
        hmap.put("皮蛋", 198);
        hmap.put("鹌鹑蛋", 199);
        hmap.put("草鱼", 201);
        hmap.put("鲈鱼", 202);
        hmap.put("带鱼", 203);
        hmap.put("三文鱼", 204);
        hmap.put("虾仁", 205);
        hmap.put("文蛤", 206);
        hmap.put("紫菜", 207);
        hmap.put("海带", 208);
        hmap.put("南瓜", 209);
        hmap.put("茄子", 210);
        hmap.put("胡萝卜", 211);
        hmap.put("白菜", 212);
        hmap.put("莴笋", 213);
        hmap.put("生菜", 214);
        hmap.put("山药", 215);
        hmap.put("西红柿", 216);
        hmap.put("西兰花", 217);
        hmap.put("菠萝", 219);
        hmap.put("梨", 220);
        hmap.put("香蕉", 221);
        hmap.put("柠檬", 222);
        hmap.put("木瓜", 223);
        hmap.put("橙子", 225);
        hmap.put("西瓜", 226);
        hmap.put("大米", 227);
        hmap.put("糯米", 228);
        hmap.put("小米", 229);
        hmap.put("面条", 230);
        hmap.put("方便面", 231);
        hmap.put("绿豆", 232);
        hmap.put("豆腐", 233);
        hmap.put("高筋面粉", 234);
        hmap.put("牛奶", 235);
        hmap.put("聚会", 241);
        hmap.put("熬夜", 242);
        hmap.put("单身", 243);
        hmap.put("二人世界", 244);
        hmap.put("二月二", 245);
        hmap.put("元宵节", 246);
        hmap.put("清明节", 247);
        hmap.put("端午节", 248);
        hmap.put("七夕节", 249);
        hmap.put("中秋节", 250);
        hmap.put("重阳节", 251);
        hmap.put("情人节", 252);
        hmap.put("复活节", 253);
        hmap.put("愚人节", 254);
        hmap.put("母亲节", 255);
        hmap.put("父亲节", 256);
        hmap.put("万圣节", 257);
        hmap.put("感恩节", 258);
        hmap.put("圣诞节", 259);
        hmap.put("腊八节", 260);
        hmap.put("春节", 261);
        hmap.put("立春", 262);
        hmap.put("雨水", 263);
        hmap.put("惊蛰", 264);
        hmap.put("春分", 265);
        hmap.put("清明", 266);
        hmap.put("谷雨", 267);
        hmap.put("立夏", 268);
        hmap.put("小满", 269);
        hmap.put("芒种", 270);
        hmap.put("夏至", 271);
        hmap.put("小暑", 272);
        hmap.put("大暑", 273);
        hmap.put("立秋", 274);
        hmap.put("处暑", 275);
        hmap.put("白露", 276);
        hmap.put("秋分", 277);
        hmap.put("寒露", 278);
        hmap.put("霜降", 279);
        hmap.put("立冬", 280);
        hmap.put("小雪", 281);
        hmap.put("大雪", 282);
        hmap.put("冬至", 283);
        hmap.put("小寒", 284);
        hmap.put("大寒 ", 285);
        hmap.put("爆", 287);
        hmap.put("煲", 288);
        hmap.put("炖", 290);
        hmap.put("煎", 291);
        hmap.put("焖", 292);
        hmap.put("烧", 293);
        hmap.put("炸", 294);
        hmap.put("熬", 295);
        hmap.put("烤", 296);
        hmap.put("卤", 297);
        hmap.put("泡", 298);
        hmap.put("烙", 299);
        hmap.put("酿", 300);
        hmap.put("酱", 301);
        hmap.put("溜", 302);
        hmap.put("扒", 303);
        hmap.put("焯", 304);
        hmap.put("涮", 305);
        hmap.put("烩", 306);
        hmap.put("煨", 307);
        hmap.put("腌", 308);
        hmap.put("熏", 309);
        hmap.put("焗", 310);
        hmap.put("灼", 311);
        hmap.put("炝", 312);
        hmap.put("清炒", 313);
        hmap.put("滑炒", 314);
        hmap.put("爆炒", 315);
        hmap.put("红烧", 316);
        hmap.put("醋溜", 317);
        hmap.put("微波", 318);
        hmap.put("干煸", 319);
        hmap.put("铁板", 320);
        hmap.put("拔丝", 321);
        hmap.put("酱爆", 322);
        hmap.put("红焖", 323);
        hmap.put("葱爆", 324);
        hmap.put("酱烧", 325);
        hmap.put("葱烧", 326);
        hmap.put("压榨", 327);
        hmap.put("煎焖", 328);
        hmap.put("苦", 331);
        hmap.put("咸", 333);
        hmap.put("酸甜", 334);
        hmap.put("香辣", 335);
        hmap.put("麻辣", 336);
        hmap.put("香甜", 337);
        hmap.put("咸香", 338);
        hmap.put("奶香", 339);
        hmap.put("葱香", 340);
        hmap.put("五香", 341);
        hmap.put("酱香", 342);
        hmap.put("草莓味", 343);
        hmap.put("抹茶味", 344);
        hmap.put("香草味", 345);
        hmap.put("柠檬味", 346);
        hmap.put("薄荷味", 347);
        hmap.put("橘子味", 348);
        hmap.put("番茄味", 349);
        hmap.put("果味", 350);
        hmap.put("咖喱味", 351);
        hmap.put("孜然味", 352);
        hmap.put("芥末味", 353);
        hmap.put("烧烤味", 354);
        hmap.put("糖醋味", 355);
        hmap.put("泡椒味", 356);
        hmap.put("黑椒味", 357);
        hmap.put("茄汁味", 358);
        hmap.put("怪味", 359);
    }

    private static long[] ls = new long[3000];
    private static int li = 0;

    public synchronized static long getPK() {
        /*
         * 2012-10-18 苏沫予： 修改主键生成算法，使主键在软件生命周期内具有时间连续性同时适应JS
         * 前端应用，根据当前算法，至少17年内不会发生2^53溢出问题 - 关于性能问题：
         * 新主键方案每10毫秒内有十万分之一的可能性会发生冲突主键问题，因此
         * 当系统每秒数据生成量达到100条时生成器实际性能大约下降0.003%，此
         * 后呈线性下降，每秒数据生成量150000条时，主键生成性能大约下降一倍， 每秒生成数据超过300000条后，该主键生成算法将不再安全 -
         * 关于并发问题： 该算法并发运行时（例如分布式服务器系统）存在每秒千万分之一的冲突
         * 可能性，因此建议不用于并发式系统，即便投入应用，也应当保证每秒并 发插入数据不超过1000条。
         */
        String a = String.valueOf((System.currentTimeMillis() / 10L) % 100000000000L);
        String d = (String.valueOf((1 + Math.random()) * 100000)).substring(1, 6);
        // 苏沫予：添加代码结束（同时移除韩欣宇的代码方案）
        long lo = Long.parseLong(a + d);
        for (int i = 0; i < 3000; i++) {
            long lt = ls[i];
            if (lt == lo) {
                lo = getPK();
                break;
            }
        }
        ls[li] = lo;
        li++;
        if (li == 3000) {
            li = 0;
        }
        return lo;
    }
}
