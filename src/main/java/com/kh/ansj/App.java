package com.kh.ansj;

import java.util.List;

import org.ansj.domain.Term;
import org.ansj.library.UserDefineLibrary;
import org.ansj.splitWord.analysis.ToAnalysis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 String str = "藤村说海上保安厅以未造成人员伤亡以及巡视船没有明显受损为由不予追究保钓人士的刑事责任冲绳县警方在对保钓船进行调查时也未发现武器和其他违法物品冲绳县警方也作出了不追究保钓人士刑事责任的判断" ;
    	 System.out.println(ToAnalysis.parse(str));
    	 System.out.println(ToAnalysis.parse("这是一个伸手不见五指的黑夜。我叫孙悟空，我爱北京，我爱Python和C++。"));
    	 System.out.println(ToAnalysis.parse("我不喜欢日本和服。"));
    	 System.out.println(ToAnalysis.parse("雷猴回归人间。"));
    	 System.out.println(ToAnalysis.parse("工信处女干事每月经过下属科室都要亲口交代24口交换机等技术性器件的安装工作"));
    	 System.out.println(ToAnalysis.parse("我需要廉租房"));
    	 System.out.println(ToAnalysis.parse("永和服装饰品有限公司"));
    	 System.out.println(ToAnalysis.parse("我爱北京天安门"));
    	 System.out.println(ToAnalysis.parse("abc"));
    	 System.out.println(ToAnalysis.parse("隐马尔可夫"));
    	 System.out.println(ToAnalysis.parse("雷猴是个好网站"));
    	 System.out.println(ToAnalysis.parse("“Microsoft”一词由“MICROcomputer（微型计算机）”和“SOFTware（软件）”两部分组成"));
    	 System.out.println(ToAnalysis.parse("草泥马和欺实马是今年的流行词汇"));
    	 System.out.println(ToAnalysis.parse("伊藤洋华堂总府店"));
    	 System.out.println(ToAnalysis.parse("中国科学院计算技术研究所"));
    	 System.out.println(ToAnalysis.parse("罗密欧与朱丽叶"));
    	 
    	 // 增加新词,中间按照'\t'隔开
         UserDefineLibrary.insertWord("ansj中文分词", "userDefine", 1000);
         List<Term> terms = ToAnalysis.parse("我觉得Ansj中文分词是一个不错的系统!我是王婆!");
         System.out.println("增加新词例子:" + terms);
         // 删除词语,只能删除.用户自定义的词典.
         UserDefineLibrary.removeWord("ansj中文分词");
         terms = ToAnalysis.parse("我觉得ansj中文分词是一个不错的系统!我是王婆!");
         System.out.println("删除用户自定义词典例子:" + terms);
    }
}
