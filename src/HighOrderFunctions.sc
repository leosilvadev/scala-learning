import traits.collections.user.User

object HighOrderFunctions {

	val users = Array.fill(10)(User.generate) //> users  : Array[traits.collections.user.User] = Array(䨾倁縙甾뾅昰㍆�
                                                  //| �䜼倵, 牋锼㖫ꯝᰜ髋滧่揻痧, secret: І技䓵㱞ପ䎰폈嬙静�
                                                  //| ��, 漉椧늅篒뉚秲핣潟稤ꜷ, 묬℈ꉈꙡᩦ䝡쳢䝓㍒鲓, secret: 
                                                  //| ᛅ峒Ἳ㊋ك褻഻纥郪蹱, 䖞ᩞ퓾ै籩啡┏鋆⊐囐, 쉒텈ᙌ紏�
                                                  //| ��䢓ꀛ⒀橙朹, secret: ਫ굮ᤲ흇䈕쯴鼸瀭褪쒅, 㙺◮䀩ᆶ兴�
                                                  //| �崮獡㖶쳹, 맑ꏆⅣ뉶㣗僳荧젱㝀踾, secret: 寅ꭙᗣ烀炧㾣孺
                                                  //| 傉⭸ㆵ, ꠺騛街겋劤ඣ㌹㗝堅譾, 誥돵ᓂላ㪦▝饭旇⬓┌, s
                                                  //| ecret: 㱿쐴屎耇뜒맡ⳑ唜訣툴, 赵爖뼈祦ꕏ생๟確㛗谣, 恂�
                                                  //| �䊰떓鑉㌖乃ㅮ科⶿, secret: 徐盻쓟儃颧Ⓥ븮幐ꊵ䥛, ䷡乺햴
                                                  //| 災쵤憥⺌౵寍䉗, 륽萅㹗汲㎂뫒⯗ㆼꓡ敵, secret: ⇑ැ획頱�
                                                  //| ��嚤樜ฑ龯ằ, ֒疶냀ᴴἄ癜騯䄞稍䴆, 疉ฮ㨔狯粴將❪Ύ�
                                                  //| �Ṩ, secret: ♹୸蒂롽糋㚅썕鷍܇勵, 뙤ᬔ孠唎殴䧊턭惁䙥ण,
                                                  //|  筧䆊婯ᄆ뺎毜⇌䜝耵퐹, secret: バ楨怐㵽話皦䎗唋그Ș, ᨒ�
                                                  //| ��퐬빣ὺ഍ꨊກ뒐祭, 鰆᳋䲱☟滥龪蜞懩읨剉, secret: 뺕䤵�
                                                  //| �ᅮ梬件魯؛퍎拡)

	users.filter { _.age > 18 }.map { user => s"${user.name} [${user.username}], ${user.age} old " }
                                                  //> res0: Array[String] = Array("䨾倁縙甾뾅昰㍆䂦䜼倵 [牋锼㖫ꯝᰜ
                                                  //| 髋滧่揻痧], 71 old ", "漉椧늅篒뉚秲핣潟稤ꜷ [묬℈ꉈꙡᩦ
                                                  //| 䝡쳢䝓㍒鲓], 41 old ", "꠺騛街겋劤ඣ㌹㗝堅譾 [誥돵ᓂላ㪦
                                                  //| ▝饭旇⬓┌], 49 old ", "赵爖뼈祦ꕏ생๟確㛗谣 [恂⏾䊰떓鑉
                                                  //| ㌖乃ㅮ科⶿], 64 old ", "䷡乺햴災쵤憥⺌౵寍䉗 [륽萅㹗汲㎂
                                                  //| 뫒⯗ㆼꓡ敵], 49 old ", "֒疶냀ᴴἄ癜騯䄞稍䴆 [疉ฮ㨔狯粴�
                                                  //| ��❪Ύ战Ṩ], 70 old ", "뙤ᬔ孠唎殴䧊턭惁䙥ण [筧䆊婯ᄆ뺎�
                                                  //| ��⇌䜝耵퐹], 72 old ", "ᨒ얹퐬빣ὺ഍ꨊກ뒐祭 [鰆᳋䲱☟滥�
                                                  //| ��蜞懩읨剉], 34 old ")


	val a = Array(1,2,3,4,5)                  //> a  : Array[Int] = Array(1, 2, 3, 4, 5)
	val b = List(5,2,8,1,3)                   //> b  : List[Int] = List(5, 2, 8, 1, 3)
	
	//Generate a Array of List
	a.map(i => b.take(i))                     //> res1: Array[List[Int]] = Array(List(5), List(5, 2), List(5, 2, 8), List(5, 2
                                                  //| , 8, 1), List(5, 2, 8, 1, 3))
	//Map and transform the lists in elements
	a.map(i => b.take(i)).flatten             //> res2: Array[Int] = Array(5, 5, 2, 5, 2, 8, 5, 2, 8, 1, 5, 2, 8, 1, 3)
	a.flatMap(i => b.take(i))                 //> res3: Array[Int] = Array(5, 5, 2, 5, 2, 8, 5, 2, 8, 1, 5, 2, 8, 1, 3)

	//The same thing!
	a.reduceLeft((a,b) => a+b)                //> res4: Int = 15
	a.reduceLeft(_+_)                         //> res5: Int = 15

	a.foldLeft("00")(_+_)                     //> res6: String = 0012345


	b.find(_%3 == 0).map( _/3).getOrElse(0)   //> res7: Int = 1


	def completeFunction(i:Int): Int = ???    //> completeFunction: (i: Int)Int

	val partialFunction:PartialFunction[Any,String] = {
		case i:Int => "Number"
		case s:String => "The string "+s
	}                                         //> partialFunction  : PartialFunction[Any,String] = <function1>

	partialFunction(1)                        //> res8: String = Number

	partialFunction("MyName")                 //> res9: String = The string MyName
}