package com.kh.ansj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.ToAnalysis;

public class Filter {

	private Map<String, Boolean> blackwordMap;
	
	public static void main(String[] args) {
		Filter filter = new Filter();
		System.out.println(filter.filter("草泥马和欺实马是今年的流行词汇"));
		System.out.println(filter.filter("工信处女干事每月经过下属科室都要亲口交代24口交换机等技术性器件的安装工作"));
		System.out.println(filter.filter("我需要廉租房"));
		System.out.println(filter.filter("永和服装饰品有限公司"));
		System.out.println(filter.filter("我爱北京天安门"));
		System.out.println(filter.filter("台*湾风景优美"));
		System.out.println(filter.filter("你 好，大家好。shit, fuck FUCK, Fuck"));
		
		String str = "我要吃牛奶，我要上学，还我父母血汗钱；我叫刘强，今年考起昆明理工大学，因为没钱支付学费，来大理为父母讨血汗钱交学费……”前天，13名孩子来到大理南国城大理东盟玉石城门口替父母讨要工资，他们中年龄最大的20岁，最小的仅5岁，孩子们手中都拿着一张要学费的标语。他们的父母6年前曾在南国城项目打工，开发商拖欠1000多名农民工工资达2000多万元。 　　现场 5岁孩子为父讨薪 　　上午10点，13个高矮不一，站在大理南国城东盟玉石城门口的孩子吸引了众多游客的目光。一个小男孩举着标语的举动引起众人的关注，“我叫余贤，今年5岁了，是曲靖农村的，我爸爸在这里打工好多年了，没拿到钱，我马上要读书了，爸爸在外面打工好久没回家了，我想喝牛奶……”听着小余贤奶声奶气地叙说，让围观者感到心疼。 　　比余贤大3岁的吴凡告诉记者，“我是师宗的，爸爸6年前和叔叔一起来到大理南国城当建筑工，由于他长期不寄钱回家，妈妈以为他在外面做坏事，和他离婚了……”吴凡说，父母离婚后，他跟着爸爸到处流浪，爸爸在什么地方打工，他就跟到什么地方。2009年时，爸爸悄悄地跑了，几年来，他只好跟着叔叔(曾经也在南国城当建筑工人)住。 　　晚报记者现场了解到，替父母讨薪的孩子共有13人，其中5人今年刚考上大学，还有几个今年上高一，都为学费的事相约到南国城讨薪。一个叫刘强的女孩说：“我是重庆的，今年考上昆明理工大学，爸爸6年前到昆明打工，由于南国城的开发商拖欠农民工工资，我的学费成了全家人最头疼的事，迫不得已，我只有来替爸爸讨血汗钱。” 　　看着孩子们站在烈日下手举标语，许多游客没有去逛玉石城，而是拿出手中的相机、手机进行拍摄，来自江苏的游客李女士气愤地说：“这些娃娃太可怜了，开发商怎么这么缺德，为何要拖欠农民工的血汗钱长达6年之久呢？” 　　诉苦 包工头不敢回家 　　“现在云南省高院的终审判决都下了，而新接手南国城项目的公司，有钱装修，盖房子，就是没有钱履行法院的生效判决。”包工头张先生说，他曾带了100多个农民工在南国城搞土建，欠薪的时间拖得太长了，他很着急，农民工把他也逼得急，逼得他很长时间不敢回家。 　　据了解，承建南国城的建筑商是云南建工集团第十建筑有限公司，建筑商的出纳高先生说，他们公司在2006年4月接手南国城项目，2007年6月完工，整个项目工程款近1亿元，公司垫付了1000多万元，7个工期中，涉及9家施工单位，1000多名农民工，依照省高院最终的判决结果，开发商还应当支付2000多万元，这笔钱中，有1700多万属农民工工资，公司前期已先垫付了部分农民工工资，现在面对孩子们讨薪的情况实在是无能为力了。 　　高先生透露，省高院终审判决后，在当地政府的主持下，新接手的公司承诺在6月30日之前将款项付清，但直到现在他们也没有拿到一分钱，他们找到南国城的开发商得到的答复是：“法院的判决，就是一张废纸！”同时，他们已向大理州中院申请了强制执行。 　　实录 建筑商和开发商对话 　　在讨薪现场，高先生拨通了南国城开发商一负责人段先生的电话，两人对话如下： 　　高：段总，南国城欠我们的工程款咋个说？ 　　段：工程款，你们总要给我们一个时间缓缓嘛！ 　　高：你们不是春节时就承诺今年6月30日之前付清，现在已经这么长时间了，且省高院的判决都下来了，你们都还不付…… 　　段：高院判决下来，总有个时间性，大家有大家的难处，小家有小家的难处。 　　高：你们有难处，为什么还在搞装修，在南国城对面还在搞建设，难道做这些就有钱，但没有钱履行判决。 　　段：还了你们的冤枉债，我们格是不吃饭了，大家要相互理解。 　　高：我打电话给你要钱，你说我们要冤枉债，什么叫冤枉债啊！ 　　段：我给你开个玩笑不可以噶！ 　　高：你们什么时候付得出钱呢？前段时间你们不是说法院的判决是一张废纸。 　　段：钱这个东西也不是我说了算，你也不是不知道。这个钱我们肯定是要付的，省高院判决也好，联合国的判决也好，总得有个时间…… 　　最终，这位负责人还是没有给出一个具体支付农民工工资的时间。 　　走访 南国城里大部分空置着 　　高先生告诉记者，“南国城建好已有5年了，拖欠农民工的工资长达6年，南国城修好后一直闲置至今。新接管的东家将南国城最靠马路的商铺装修后，搞起了东盟玉石城，每天吸引了众多游客。” 　　晚报记者在现场看到，南国城里的商铺房门紧锁，门上的油漆已出现不同程度的脱落。整个南国城，除了东盟玉石城有些人气，再往里走，空寂无人，十分萧条，走了好半天才见到一名清洁工杨女士在清扫树叶，她说：“我是去年11月到这里当清洁工，原来的南国城已改名为密湾，为啥要改名，我也不太清楚。” 　　事件背景 　　讨薪事件已拉锯了6年 　　大理南国城，地处大理古城东北面的洱海之滨，按规划，南国城是集旅游、休闲度假、商贸、会展为一体的复合型文化旅游小镇。占地150亩，总建筑面积约10万平方米，投资超过两亿元，建成商铺600余间。 　　2006年通过大理州、市政府招商，云南广厦置业有限公司(以下简称广厦公司)与大理州、市政府签订了“大理·南国城”投资协议。 　　2007年10月15日，南国城建好完工，因广厦公司出现资金问题，一直拖欠工程尾款2100万余元。之后，当地政府引进了大理州新华石寨子旅游有限公司接管广厦公司债权债务。可是6年过去了，1000多名农民工还是没拿到一分钱。去年10月9日，施工方将广厦公司告上法庭，要求支付拖欠的工程款、滞纳金及违约金共计4000万余元。 　　大理州中院一审判决：由广厦公司支付云南十建工程款2180万余元，违约金及滞纳金不予支持。第十建筑工程公司不服，向云南省高院提起上诉。 　　今年6月，省高院终审判令广厦公司支付第十建筑公司工程款1500万余元，并支付违约金500万元，两项共计2000万余元。 　　柏立诚 摄影报道 春城晚报";
		long timer = System.currentTimeMillis();
		String replaced = "";
		for (int i = 0; i < 10000; i++) {
			replaced = filter.filter(str);
		}
		System.out.println(replaced);
		System.out.println((System.currentTimeMillis() - timer));
	}

	public Filter() {
		blackwordMap = new HashMap<String, Boolean>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(Filter.class.getClassLoader().getResourceAsStream(
				"blackword.txt")));
		try {
			String temp = "";
			while ((temp = br.readLine()) != null) {
				blackwordMap.put(temp, true);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public String filter(String str) {

		if (str == null) {
			return null;
		}

		List<Term> terms = ToAnalysis.parse(str);
		// System.out.println(terms);
		StringBuilder replaced = new StringBuilder();
		for (Term term : terms) {
			String name = term.getName();
			if (blackwordMap.get(name) != null) {
				for (int i  = 0; i < name.length(); i += 1) {
					replaced.append("*");
				}
			} else {
				replaced.append(name);
			}
		}

		return replaced.toString();
	}

}
