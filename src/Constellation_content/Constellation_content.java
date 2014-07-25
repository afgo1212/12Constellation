package Constellation_content;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Constellation_content
 */
@WebServlet("/Constellation_content")
public class Constellation_content extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Constellation_content() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		java.io.PrintWriter out = response.getWriter();
		String month,day;
		String constellation[] ={"摩羯","水瓶","雙魚","山羊","金牛","雙子","巨蟹","獅子","處女","天秤","天蠍","射手"};
		int d;
		month=request.getParameter("m");
		day = request.getParameter("d");
		d = Integer.parseInt(day);
		out.print("生日:"+month);
		out.print("/"+d);
		switch(month){
		case "1":
		  if(d<=19){
			  out.print("<img src='Pic\\capricornus.jpg'>");
			  out.print(constellation[0]);
			  out.print("座刻苦耐勞，有勇往直前、克服困難的毅力，意志力強，不易受他人影響，處處謹慎，堅守原則，重視紀律，有家庭觀念。");
		  }
		  else {
			  out.print("<img src='Pic\\水平.jpg'>");
				out.print(constellation[1]);
				  out.print("座崇尚自由，創意十足，興趣廣闊，有前瞻性；獨立，有個人風格，對自己的感情忠實，對人非常友愛而富同情心。");
			  }		  break;
		case "2":
			if(d<=18){
				out.print("<img src='Pic\\水平.jpg'>");
				out.print(constellation[1]);
				  out.print("座崇尚自由，創意十足，興趣廣闊，有前瞻性；獨立，有個人風格，對自己的感情忠實，對人非常友愛而富同情心。");
			  }
			else{
				out.print("<img src='Pic\\雙魚.jpg'>");
				out.print(constellation[2]);
				  out.print("座慈悲心懷，個性溫柔纖細，捨己為人，不自私，不多疑，浪漫。");
			}	  
			break;
			case"3":
			if(d<=20){
				out.print("<img src='Pic\\雙魚.jpg'>");
				out.print(constellation[2]);
				  out.print("座慈悲心懷，個性溫柔纖細，捨己為人，不自私，不多疑，浪漫。");
			  }
			else{
				out.print("<img src='Pic\\山羊.jpg'>");
				out.print(constellation[3]);
				  out.print("座自信而有活力，勇於接受挑戰，做事積極、迅速、果斷，俐落不拖泥帶水；坦白直率；爆發力強，講義氣，不畏強權，是個正義使者。");
			  }
			break;
		case"4":
			if(d<20){
				out.print("<img src='Pic\\山羊.jpg'>");
				out.print(constellation[3]);
				  out.print("座自信而有活力，勇於接受挑戰，做事積極、迅速、果斷，俐落不拖泥帶水；坦白直率；爆發力強，講義氣，不畏強權，是個正義使者。");
			  }
			else{
				out.print("<img src='Pic\\金牛.jpg'>");
				out.print(constellation[4]);
				  out.print("座耐性十足，穩健積極，性情溫和，細心，追求和平，值得信賴。");
			}
			break;
		case"5":
			if(d<=20){
				out.print("<img src='Pic\\金牛.jpg'>");
				out.print(constellation[4]);
				  out.print("座耐性十足，穩健積極，性情溫和，細心，追求和平，值得信賴。");
			  }
			else{
				out.print("<img src='Pic\\雙子.jpg'>");
				out.print(constellation[5]);
				  out.print("座朋友多，富幽默感，生活多采多姿；博學，頭腦靈活，適應力強，能隨機應變。 ");
			}
			break;
		case"6":
			if(d<=21){
				out.print("<img src='Pic\\雙子.jpg'>");
				out.print(constellation[5]);
				  out.print("座朋友多，富幽默感，生活多采多姿；博學，頭腦靈活，適應力強，能隨機應變。 ");
			  }
			else{
				out.print("<img src='Pic\\巨蟹.jpg'>");
				out.print(constellation[6]);
				out.print("座有親和力，懂得體貼關懷而具有同情心；特別會照顧人，愛家很有家庭觀念；對自己信任的人無條件付出，因此是個相當好的搭檔及知心朋友。 ");
			}
			break;
		case"7":
			if(d<=22){
				out.print("<img src='Pic\\巨蟹.jpg'>");
				out.print(constellation[6]);
				  out.print("座有親和力，懂得體貼關懷而具有同情心；特別會照顧人，愛家很有家庭觀念；對自己信任的人無條件付出，因此是個相當好的搭檔及知心朋友。 ");
			  }
			else{
				out.print("<img src='Pic\\獅子.jpg'>");
				out.print(constellation[7]);
				  out.print("座極具領導能力和組織力，行動積極充滿自信，善於表現自己好的一面，坦白公正、熱情如火，誠懇正直。 ");
			  }
			break;
		case"8":
			if(d<=22){
				out.print("<img src='Pic\\獅子.jpg'>");
				out.print(constellation[7]);
				  out.print("座極具領導能力和組織力，行動積極充滿自信，善於表現自己好的一面，坦白公正、熱情如火，誠懇正直。 ");
			  }
			else{
				out.print("<img src='Pic\\處女.jpg'>");
				out.print(constellation[8]);
				  out.print("座天真純情，處事嚴謹不浮躁，冷靜有條理，分析能力強，注重衛生。 ");
			}
			break;
		case"9":
			if(d<=22){
				out.print("<img src='Pic\\處女.jpg'>");
				out.print(constellation[8]);
				  out.print("座天真純情，處事嚴謹不浮躁，冷靜有條理，分析能力強，注重衛生。 ");
			  }
			else{
				out.print("<img src='Pic\\天平.jpg'>");
				out.print(constellation[9]);
				  out.print("座平衡、協調，會小心的衡量每件事情；能體諒他人、保持溫和的態度，總是表現好的一面給別人看，容易和別人保持和諧的關係。 ");
			}
			break;
		case"10":
			if(d<=22){
				out.print("<img src='Pic\\天平.jpg'>");
				out.print(constellation[9]);
				  out.print("座平衡、協調，會小心的衡量每件事情；能體諒他人、保持溫和的態度，總是表現好的一面給別人看，容易和別人保持和諧的關係。 ");
			  }
			else{
				out.print("<img src='Pic\\天蠍.jpg'>");
				out.print(constellation[10]);
				  out.print("座有過人的耐力和堅強的意志力，直覺敏銳，堅持追求適時的真相，善於保守秘密；有強烈的洞察力與足夠的信心，對決定的事有執行力。 ");
			}
			break;
		case"11":
			if(d<=21){
				out.print("<img src='Pic\\天蠍.jpg'>");
				out.print(constellation[10]);
				out.print("座有過人的耐力和堅強的意志力，直覺敏銳，堅持追求適時的真相，善於保守秘密；有強烈的洞察力與足夠的信心，對決定的事有執行力。 ");
			  }
			else{
				out.print("<img src='Pic\\射手.jpg'>");
				out.print(constellation[11]);
				  out.print("座是最幽默風趣的星座，常能帶給別人快樂；做事積極，動作迅速，想到就會付出行動；探求新強，極具創意，喜歡冒險並願意嘗試各種不同的新事物。 ");
			}
			break;
		case"12":
			if(d<=21){
				out.print("<img src='Pic\\射手.jpg'>");
				out.print(constellation[11]);
				  out.print("座是最幽默風趣的星座，常能帶給別人快樂；做事積極，動作迅速，想到就會付出行動；探求新強，極具創意，喜歡冒險並願意嘗試各種不同的新事物。 ");
			  }
			else{
				out.print("<img src='Pic\\capricornus.jpg'>");
				out.print(constellation[0]);
				out.print("座刻苦耐勞，有勇往直前、克服困難的毅力，意志力強，不易受他人影響，處處謹慎，堅守原則，重視紀律，有家庭觀念。");
			  }
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
