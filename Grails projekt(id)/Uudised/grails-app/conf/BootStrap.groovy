import uudised.Article
import uudised.User

class BootStrap {

    def init = { servletContext ->
		
		if (!Article.count()) {
			
			new User(login: "autor", password: "autor", firstName: "autor", lastName: "autor").save(failOnError:true)
			byte[] articleImage1 = (new File('C:/images/artikkel1.jpg')).bytes
			byte[] articleImage2 = (new File('C:/images/artikkel2.jpg')).bytes
			byte[] articleImage3 = (new File('C:/images/artikkel3.jpg')).bytes
			byte[] articleImage4 = (new File('C:/images/artikkel4.jpg')).bytes
			byte[] articleImage5 = (new File('C:/images/artikkel5.jpg')).bytes
			byte[] articleImage6 = (new File('C:/images/artikkel6.png')).bytes
			byte[] articleImage7 = (new File('C:/images/artikkel7.jpg')).bytes
			byte[] articleImage8 = (new File('C:/images/artikkel8.jpg')).bytes
			
			//v�lismaa uudised
			new Article(title: "Moskva kohus vahistas tagaselja Ukraina rahvusradikaalide juhi", intro: "Moskva Basmann�i kohus andis t�na loa v�tta vahi alla Ukraina rahvuslaste liikumise Paremsektori liider Dm�tro Jaro�, keda s��distatakse terrorismile �hutamises.",content: "Uurijate v�itel pannakse talle s��ks avalikku terrorismile ja ekstremismile �hutamist ning selleks massimeedia kasutamist, vahendas Interfax. /nParemsektori liider kuulutati rahvusvaheliselt tagaotsitavaks. S��distus esitati talle tagaselja. /nUkraina peaprokuratuuri pressiteenistus teatas aga, et mingit alust Ukraina kodaniku Jaro�i kinnipidamiseks ja teisele riigile v�ljaandmiseks pole.",priority: "3",views: 20000, author: User.findByLogin("autor"), category: "V�lismaa", photo: articleImage1).save(failOnError:true)
			Thread.currentThread().sleep(3*1000)
			new Article(title: "L�una-Korea luureteenistus sattus v�ltsimisskandaali", intro: "L�una-Korea riiklikku luureteenistust (NIS) on tabanud j�rjekordne skandaal, asutust s��distatakse t�endite fabritseerimises eesm�rgiga diskrediteerida endist Souli linnaametnikku.",content: "NIS-i s��distatakse dokumentide v�ltsimises eesm�rgiga ehitada �les spionaa�ijuhtum Souli ametniku vastu, kes p�genes 2004. aastal P�hja-Koreast L�una-Koreasse. V�idetavalt v�ltsis luureteenistus ka Hiina piirivalve dokumente. /nPeking on kinnitanud, et dokumendid ei ole autentsed. NIS l�kkas Hiina avalduse j�rel s��distused tagasi, eitades osalust v�ltsimises. /nEelmisel n�dalal v�tsid juhtumit puudutavad arengud dramaatilise p��rde, kui v�ltsimisega seostatav luureteenistuse nuhk �ritas teha enesetappu. Suitsiidikatse eba�nnestus ning prokur�rid v�tsid mehe kolmap�eval vahi alla. /nPresident Park Geun-hye avaldas esmasp�eval skandaali �le s�gavat kahetsust ja kutsus l�bi viima p�hjalikku juurdlust. /nM�ni tund hiljem otsisid prokur�rid l�bi NIS-i peakorteri Souli l�unaosas. /nParki erakonna Saenuri seadusandjad n�uavad juunis peetavate kohalike valimiste eel NIS-i juhi Nam Jae-jooni tagasiastumist. /n�See teema on v�ga h�iriv. Mind vapustasid v�idetavad v�ltsimis- ja kinnim�tsimiskatsed,� �tles Saenuri rahvaesindaja Shim Jae-chul. �Paistab v�ltimatu, et luure�lem Nam v�tab vastutuse,� s�nas ta. /nTegemist on tundliku juhtumiga presidendi jaoks, kes aasta eest Nami ametisse m��ras. /nM��dunud aastal vallandus riigis skandaal NIS-i sekkumise t�ttu 2012. aasta presidendivalimiste kampaaniasse. Korduvalt nime vahetanud luureteenistust saadab kurikuulus maine, mille juured ulatuvad aastak�mneid kestnud autoritaarsesse valitsemisperioodi enne �leminekut demokraatiale 1980. aastate teises pooles.",priority: "3",views: 20000, author: User.findByLogin("autor"), category: "V�lismaa", photo: articleImage2).save(failOnError:true)
			Thread.currentThread().sleep(3*1000)
			new Article(title: "Allikas: Merkel peab Venemaa tegevust Krimmis annekteerimiseks", intro: "Saksa kantsler Angela Merkel nimetas t�na oma konservatiividest seadusandjatega kohtudes Venemaa tegevust Ukraina Krimmi autonoomses vabariigis annekteerimiseks, teatas erakonna allikas.",content: "Allika s�nul �tles Merkel, et Venemaa on Krimmi poolsaare �varastanud�, ning lisas, et toimunut saab nimetada annekteerimiseks. Merkel r�hutas vajadust kolmesuunaliseks tegevuseks - aidata Ukrainat, hoida dialoogi Moskvaga, kuid samas astuda ka karmimaid samme Venemaa suhtes, muu hulgas sanktsioonide kaudu. Endisel Ida-Saksamaal �les kasvanud Merkel on korduvalt suhelnud telefoni teel Venemaa presidendi Vladimir Putiniga seoses Ukraina kriisiga.",priority: "2",views: 20000, author: User.findByLogin("autor"), category: "V�lismaa", photo: articleImage3).save(failOnError:true)
			Thread.currentThread().sleep(3*1000)
			new Article(title: "�Koomapoisi� surm t�i T�rki uued suurmeeleavaldused", intro: "P�rast 269 koomas lebatud p�eva l�puks hinge heitnud 15-aastase Berkin Elvani matustele kogunesid k�mned tuhanded istanbullased.",content: "�Koomapoisina� tuntuks saanud Elvan sai raskelt viga mullu juunis valitsusvastasel meeleavaldusel Istanbulis. Ta ei olnud protestil osaleja, vaid sai v�givaldselt meeleavaldusi maha surnud politseinike k�e l�bi viga ajal, kui ta oli suundunud ema k�sul poodi leiba ostma. Ta suri eile haiglas ning kohe p�rast nooruki surmateadet hakkasid inimesed t�navatele tulema, mitte ainult Istanbulis, vaid ka teistes T�rgi linnades. ��l vastu t�nast pidasid korrakaitsjad �le T�rgi kinni sadu meeleavaldajaid, nende seas 97 Istanbulis, 51 Ankaras, umbes 100 Izmir, 36 Bursas ja 21 Mersinis.",priority: "2",views: 20000, author: User.findByLogin("autor"), category: "V�lismaa", photo: articleImage8).save(failOnError:true)
			
			//eesti uudised
			new Article(title: "Vanalinna talvine parkimiskord muutub paindlikumaks", intro: "Linnavalitsuse  korraldusega antakse transpordiameti juhile �igus muuta parkimiskorda Tallinna vanalinnas vastavalt ilmastikutingimustele.",content: "Suvise ja talvise parkimiskorra eesm�rgiks on tagada t�navapuhastajatele v�imalus vanalinna t�navate puhastamiseks. Vanalinn on jagatud kaheks piirkonnaks ja suvise parkimiskorra ajal on �hes piirkonnas parkimine keelatud kahel ��l n�dalas, et t�navapuhastajad saaksid oma t��d teha. Talvise parkimiskorra ajal on parkimine keelatud �hes piirkonnas paaritutel ja teises piirkonnas paariskuup�evadel. Talvine parkimiskord on karmim eeldatava lumekoristuse vajaduse t�ttu. Praeguse muudatuse eesm�rk on muuta parkimiskord paindlikuks ja tegelikele ilmastikuoludele vastavaks. Seni kehtinud korra j�rgi peavad s�idukiomanikud ka praegu j�rgima talvist parkimiskorda, kuigi lumi on ammu l�inud ja v�ljas laulavad linnud. Vana korra kohaselt v�is transpordiamet kehtivad parkimiskorda muuta vaid �hekordselt, kehtivusega vaid �ks kuu. Uue korra kohaselt saab transpordiameti juhataja muuta vanalinna parkimiskorda kiiresti, vastavalt tegelikele ilmaoludele. Parkimiskorralduse muudatustest teavitatakse avalikkust ajalehes, milles Tallinna linn avaldab ametlikke teadaandeid ning Tallinna linna veebilehel, samuti t�histatakse muudetud parkimiskorraldus vastavate liikluskorraldusvahenditega.",priority: "3",views: 20000, author: User.findByLogin("autor"), category: "Eesti", photo: articleImage4).save(failOnError:true)
			Thread.currentThread().sleep(3*1000)
			new Article(title: "Mitu koolimaja l�heb kevadel remonti", intro: "Kuigi tavaline kooliremontide haripunkt on p�rast jaanip�eva, mil koolipere on suvevaheajal, algab kolmes Tartu koolis remont juba aprillis ja mais.",content: "Ehitajad on �sja l�ppenud riigihankega leitud Karlova g�mnaasiumi, Kivilinna g�mnaasiumi ja Descartes�i l�tseumi ruume remontima. K�ik need on tulevased p�hikoolihooned ja nagu abilinnapea Tiia Teppan r��kis, keskendub linn l�hiaastail eesk�tt p�hikoolide �pikeskkonna parandamisele, sest g�mnaasiumid on enamasti korralikud. �Sellel aastal oleme rege rautanud �igel ajal, hange kuulutati v�lja varakult ja alustatakse kohe,� �tles ta. Abilinnapea m��nis, et v�ib-olla segab peatselt algav remont m�ningal m��ral koolit��d, aga t��maht on suur ja septembriks peab plaanitu tehtud olema. /nParem ajastus /n�Et �hiskondlike hoonete ehitus k�ib valdavalt suvel ja kulmineerub suhteliselt l�hikesel perioodil p�rast jaanip�eva, loob see olukorra, kus ehitushinnad suvel oluliselt t�usevad,� p�hjendas varasemat algus Tartu linnavarade osakonna juhataja Kunnar J�rgenson. �Hooajaline hinnat�us on kuni 30 protsenti, lisaks on ka ehitajaid suhteliselt v�he, pakkumisi tuleb kaks-kolm, kui hangetega suve algusesse j��da. Selle t�ttu on eesm�rk, et hanked oleksid v�imalikult vara tehtud,� r��kis ta. Praegu oli hangetel pakkujaid kuus kuni kaheksa ja hind j�i linna eeldatud piiridesse. S�ltuvalt koolimajast algab remont m�rtsis, aprillis v�i mais. J�rgenson �tles, et paratamatult ei ole p�rast jaanip�eva alustades paari kuuga ehk augusti l�puks v�imalik suuremahulisi t�id �ra teha. Descartes�i l�tseumi hoone remondi hanke v�itja on JB Ehituse O� hinnaga 411 782 eurot. Kavas on remontida  kooli A-korpuse nullkorrus, kus hakkavad paiknema nii Descartes�i l�tseumi kui ka kommertsg�mnaasiumi poiste t���petuse klassid ja r�ivistud, universaalne t��tuba, koristus- ja laoruumid, v�ike spordisaal koos riietus- ja pesuruumiga ning �petajate ruumid. T�� kestab kuus kuud ja orienteeriv l�petamise t�htaeg on septembri algus. Kivilinna g�mnaasiumi p�hikooli majas remonditakse keldrikorrusel asuvad t���petuse klassid ning neljandal korrusel v��rkeelte, loodusainete, f��sika- ja keemiaklassid ning tualettruumid. Remondihanke v�itis AS Semuehitus hinnaga 336 441 eurot. Karlova g�mnaasiumis remonditakse kehalise kasvatuse riietus- ja pesuruumid, �petajate ruumid ning k�sit��klass, keldrikorrusele ehitatakse tualetid. Remontima hakkab O� PVH Ehitus, kes pakkus hinnaks 154 852 eurot. Peale selle kuulutas linnavalitsus eile Kellukese lasteaia k��gi remondi riigihanke v�itjaks Eviko hinnaga 94 032 eurot. /nSuur t�� ees /nJ�rgenson �tles, et koolimajade tervikremondi tegemise tempo s�ltub sellest, kui palju saab Tartu haridusministeeriumilt rahalist toetust � ministeerium on seda lubanud, sest Tartu on teinud koolireformi. Aprilli alguses peaks selguma Nooruse 9 koolimaja remondi hanke pakkumused, sellesse majja saavad uued ruumid Tamme g�mnaasium ja t�iskasvanute g�mnaasium. Ehitus algab plaanide kohaselt juunis ja kestab j�rgmise aasta juulini. Veel on t�navu kavas H�rma g�mnaasiumi katuse parandus, Raatuse, Reiniku ja Forseliuse koolimaja �mber vajab remonti sademeveedrenaa� ja kunstig�mnaasiumis on plaanis valgustuse remont. Veeriku koolis on l�petada katuse remont, mis algas l�inud s�gisel.",priority: "1",views: 20000, author: User.findByLogin("autor"), category: "Eesti", photo: articleImage5).save(failOnError:true)
			Thread.currentThread().sleep(3*1000)
			new Article(title: "Tallinn valmistub uute trammide tulekuks", intro: "V�hem kui kuu aja p�rast algab moodsa veeremi vajadusi arvestava uue trammitee rajamine.",content: "�Trammiliini uuendamise tervikprojekt on kavas l�bi viia 2015. aasta l�puks. Trammiliinidel nr 3 ja 4 hakkavad s�itma 20 uut Hispaania tootja CAF moodsat trammi,� �tles Aas. Tallinna transpordiameti teatel algab trammitee rekonstrueerimine 7. aprillil, esmalt v�etakse k�sile Vabaduse v�ljaku ja P�rnu maantee viadukti vaheline l�ik. Aas lisas, et esimene moodne tramm j�uab Tallinna juba t�navu novembris. �Trammiliini rekonstrueerimine ja moderniseerimine on �heks Tallinna �histranspordi prioriteetseks arengueesm�rgiks,� �tles Aas. Projekti eesm�rgiks on Tallinna �histranspordi kasutajaskonna suurendamine ning teeninduskvaliteedi parandamine. �Trammiliin nr 4 �hendab linna olulisi s�lmpunkte ning piirkondi, �htlasi kulgeb liin pikalt l�bi kesklinna, mis aitab kindlasti kaasa linnapildi atraktiivsemaks muutmisele ja reisijate mugavale liiklemisele,� �tles Aas. Suuremahuliste rekonstrueerimist��de k�igus uuendatakse lisaks uue trammitee rajamisele teealused kommunikatsioonid, trassile j��vad s�idu- ja k�nniteed ning haljastus. Trammitee rajatakse kogu ulatuses betoonalusele, vahetatakse v�lja kontaktliinid, ehitatakse �mber P�rnu maantee depoo ja uuendatakse veoalajaamad. Taristu projekteerimise ja rekonstrueerimise riigihanke v�itis konsortsium AS Merko Ehitus Eesti, KMG Inseneriehituse AS ja Ratatek Oy. T��de maksumus on 26 miljonit eurot, millest 85 protsenti rahastatakse KIKi vahendusel ELi �htekuuluvusfondist ning �lej��nu on Tallinna omafinantseering. Seoses trammitee rekonstrueerimisega katkeb 3. ja 4. liini trammide liiklus, trammikasutajate teenindamiseks pannakse Hobujaama ja Kalevi peatuse vahel k�ima ajutine bussiliin nr 52.",priority: "2",views: 20000, author: User.findByLogin("autor"), category: "Eesti", photo: articleImage6).save(failOnError:true)
			Thread.currentThread().sleep(3*1000)
			new Article(title: "P�ikest jagub, ent muutus tulemas", intro: "Poola kohalt kagusse liikuva k�rgr�huala ja Norra mere p�hjaossa saabuva uue ts�kloni vahel on meil homme eriti kena kevadine ilm.",content: "Tuul on sisemaal vaikne v�i m��dukas, rannikul veidi tugevam. P�ikest jagub k�llaga ja seda tasub nautida, sest ilmamuutus talve ajutiseks taastumiseks on l�henemas. Homme on selge v�i v�hese pilvisusega sajuta ilm. Puhub l��nekaare tuul 3-8 m/s, �htupoolikul rannikualadel puhanguti kuni 12 m/s. �husooja on 6-11 kraadi, tuulele avatud rannikul 3-5 kraadi.",priority: "2",views: 20000, author: User.findByLogin("autor"), category: "Eesti", photo: articleImage7).save(failOnError:true)
					
		}
		
    }
    def destroy = {
    }
}
