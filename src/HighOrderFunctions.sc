import traits.collections.user.User

object HighOrderFunctions {

	val users = Array.fill(10)(User.generate) //> users  : Array[traits.collections.user.User] = Array(┊歴埥㸁솭╛怍�
                                                  //| �添琾, 빗嗗碭্飱퓭ꯒ흮诇⪕, secret: 嬾濼喩ꐿ埢纻⻵㜾X�
                                                  //| �, 듫큋꧳㮤囁扮뒿맑툻⓲, Ꞇ闅殤ਃ䜇糚⎹禇⩈쒅, secret: �
                                                  //| ��꿭뿢㮵闖⽃櫾㭐칠與, ᝤ兙㜠䃽禼ⳛᶊ믧㹄켞, ꓀儃⍬꽧�
                                                  //| ��ꂞ펒걨ዓ俺, secret: 焑陮鑹兄糑狰ቛா縋戉, 퓮ጼً剦뭧臂
                                                  //| 臬퐜菔炋, ⽰ꚝꡯ쩿蘭臮ᵤݽᒫ⑏, secret: 霊㠔⹓㒅ኊ䵚ජ�
                                                  //| �跹쟥, 䂤텶Ⰼ潚僖朵⋁⊼茽፬, 瘟磃쫃怐㌐ՠ뻋稫麣讷, secr
                                                  //| et: 濺淟齥킚儬蘽퇑ꅸ夹ࡪ, ල꞉붝깡揮㭌섺텘䈴롖, 毉뛄Ȝ
                                                  //| 絺꙳᠁퀽膒㥄鑓, secret: ퟞ窵覲ꂯ盎ꪸ嵋佯鶞婉, ܙ柑侬徏�
                                                  //| �库ᖆྡ릪㎻, 睆䐄틻ᑌ䫩ꁽ탒쩫뤖伽, secret: ㈗싨붐澏⍘먦
                                                  //| 䯋先⯅䴻, 淞鱩庨ꠏ槣釱ꋏ黓碃㦟, 㵑⣒꺭繛낌☴᡹䉃㨦곿
                                                  //| , secret: 턬씟䢌햣ỏ苮얞㈪ᳮ蘬, 䣂ꃱൌ⟬䨞厩诓ږ⚵櫳, ᡵ
                                                  //| 䆝ք⻅⭓摪랭耦氻摄, secret: ⬨꿸迢⮭甖焷ꬫ挅慓ꪂ, 慧뷅�
                                                  //| �넛ණ焝ᤊ쩿༴饪, 䎆ڤ⓺澤ꭳ茦狀㵬᳓ԡ, secret: 撬찡밿髀�
                                                  //| �ᄬ왛繘题ꇑ)

	users.filter { _.age > 18 }.map { user => s"${user.name} [${user.username}], ${user.age} old " }
                                                  //> res0: Array[String] = Array("┊歴埥㸁솭╛怍㮦添琾 [빗嗗碭্飱
                                                  //| 퓭ꯒ흮诇⪕], 58 old ", "듫큋꧳㮤囁扮뒿맑툻⓲ [Ꞇ闅殤ਃ䜇
                                                  //| 糚⎹禇⩈쒅], 58 old ", "ᝤ兙㜠䃽禼ⳛᶊ믧㹄켞 [꓀儃⍬꽧苒
                                                  //| ꂞ펒걨ዓ俺], 68 old ", "퓮ጼً剦뭧臂臬퐜菔炋 [⽰ꚝꡯ쩿蘭�
                                                  //| ��ᵤݽᒫ⑏], 28 old ", "䂤텶Ⰼ潚僖朵⋁⊼茽፬ [瘟磃쫃怐㌐ՠ
                                                  //| 뻋稫麣讷], 54 old ", "ල꞉붝깡揮㭌섺텘䈴롖 [毉뛄Ȝ絺꙳᠁�
                                                  //| ��膒㥄鑓], 42 old ", "淞鱩庨ꠏ槣釱ꋏ黓碃㦟 [㵑⣒꺭繛낌☴�
                                                  //| ��䉃㨦곿], 47 old ", "䣂ꃱൌ⟬䨞厩诓ږ⚵櫳 [ᡵ䆝ք⻅⭓摪랭
                                                  //| 耦氻摄], 58 old ")


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

}