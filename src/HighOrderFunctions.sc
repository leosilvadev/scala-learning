import traits.collections.user.User

object HighOrderFunctions {

	val users = Array.fill(10)(User.generate) //> users  : Array[traits.collections.user.User] = Array(譮ൄ䵲쎉笜낀벧�
                                                  //| �齯큃, ꦳尠⬅둕材ጞ㏿᫾䚙穹, secret: ᇮ瞟輭ீ涐ɩᵋۅ觝�
                                                  //| �, ᶜ箜䙪뵩瓽웼⨙㫾όⱡ, 툃灿㫨禸飳켂귇倛闭锴, secret: �
                                                  //| �꜄㧎籠쳯쳿씓䊧⥷, ɂ뢳㳪᡿묘ꐠ̖ნ퇛朓, 䒆櫿椗⪫奘�
                                                  //| �餬엂ꩉ뭨, secret: ᷼绡틙춉䟂庭뻂鬺᱉Ὼ, ༾䆽ᾜ䋉辬䉺誢
                                                  //| 螩嘸垞, 㲒舮ꈚ裻檉씁鎯ᢌ烋䏒, secret: 힋솵讂姸灛䮂ޖꍮ�
                                                  //| �㼨, 팔괙ꘖ뉌舤줐ᵌㆴ௻⍕, 圷叵諴ᵘ弃꽁䵱栞鲥ᬖ, secret
                                                  //| : 矤첋☤盖椄۪䩥ᝑ⣫斤, Ⱉ៩㟺믔≬鱿䖿ొ秓׷, 篛㞶邜᠑
                                                  //| 渶뤲烂Ო靾蝠, secret: 鯎饧꧝庡䓈飌녃讹凸ꑽ, ኾ澒ႏ 綥�
                                                  //| ��䈪譭澂㥨, ╜⪓뾡룢ᦚ爰ꐀꎞ杊잇, secret: 홶ꔙ椆ܾ抯ꈜ櫵
                                                  //| 늱灹划, 岾쓑滮蝗㺃繡猁樣ᦇ昖, 悹璕㒻Ԡ箧荆귬ⳮ컥គ, se
                                                  //| cret: 䖈蝉뉓伤띫ꚞ㫉講ꍘ鬥, 捇沭盍侻䕅欵ꆠ䰡펶ᬄ, ѽ签�
                                                  //| ��᷂쫅⪀泿븂믠噺, secret: 噣㷃聎ּ⪅姽崎缌馰쩫, 纞쮨閲ᅾ
                                                  //| 㞪쌅卫傹쥣ꔪ, 䌺퉷嵬䚨誨䦆ꀪ̶ᢲ氹, secret: ꣲᙔ⪒吅ถ�
                                                  //| �쩄툼蝫爫)

	users.filter { _.age > 18 }.map { user => s"${user.name} [${user.username}], ${user.age} old " }
                                                  //> res0: Array[String] = Array("譮ൄ䵲쎉笜낀벧ჹ齯큃 [꦳尠⬅둕材
                                                  //| ጞ㏿᫾䚙穹], 35 old ", "ᶜ箜䙪뵩瓽웼⨙㫾όⱡ [툃灿㫨禸飳�
                                                  //| ��귇倛闭锴], 30 old ", "ɂ뢳㳪᡿묘ꐠ̖ნ퇛朓 [䒆櫿椗⪫奘䱜
                                                  //| 餬엂ꩉ뭨], 78 old ", "팔괙ꘖ뉌舤줐ᵌㆴ௻⍕ [圷叵諴ᵘ弃꽁
                                                  //| 䵱栞鲥ᬖ], 38 old ", "Ⱉ៩㟺믔≬鱿䖿ొ秓׷ [篛㞶邜᠑渶뤲�
                                                  //| ��Ო靾蝠], 77 old ", "捇沭盍侻䕅欵ꆠ䰡펶ᬄ [ѽ签㙃᷂쫅⪀�
                                                  //| �븂믠噺], 50 old ", "纞쮨閲ᅾ㞪쌅卫傹쥣ꔪ [䌺퉷嵬䚨誨䦆�
                                                  //| �̶ᢲ氹], 78 old ")
}