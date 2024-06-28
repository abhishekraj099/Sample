package com.hello.shayriapp.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shayriapp.R
import com.example.shayriapp.ui.theme.primaryLight

import com.hello.shayriapp.model.HanumanModel


@Composable
fun MainToolbar(title: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            modifier = Modifier.size(45.dp)
                .clickable {
                    onClick.invoke()
                }
            ,
            colors = CardDefaults.cardColors(
                containerColor = primaryLight
            ),
            shape = RoundedCornerShape(100.dp)
        ) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_back),
                    contentDescription = null,
                    tint = Color.Black
                )
            }
        }

        Text(
            text = title, style = TextStyle(
                fontSize = 24.sp, fontWeight = FontWeight.Bold
            ), color = Color.Black, modifier = Modifier.padding(start = 25.dp)
        )
    }
}

fun getList(): List<HanumanModel> {
    val shayriData = listOf(
        HanumanModel(
            "Hanuman Chalisa", listOf(
                """
                श्रीगुरु चरन सरोज रज, निज मनु मुकुरु सुधारि।
                बरनऊँ रघुबर बिमल जसु, जो दायकु फल चारि॥
                बुद्धिहीन तनु जानिके, सुमिरौं पवन-कुमार।
                बल बुधि विद्या देहु मोहिं, हरहु कलेस बिकार॥

                जय हनुमान ज्ञान गुन सागर।
                जय कपीस तिहुँ लोक उजागर॥

                रामदूत अतुलित बल धामा।
                अंजनि-पुत्र पवनसुत नामा॥

                महाबीर बिक्रम बजरंगी।
                कुमति निवार सुमति के संगी॥

                कंचन बरन बिराज सुबेसा।
                कानन कुण्डल कुंचित केसा॥

                हाथ बज्र औ ध्वजा बिराजे।
                काँधे मूँज जनेऊ साजे॥

                संकर सुवन केसरी नन्दन।
                तेज प्रताप महा जग बन्दन॥

                विद्यावान गुनी अति चातुर।
                राम काज करिबे को आतुर॥

                प्रभु चरित्र सुनिबे को रसिया।
                राम लखन सीता मन बसिया॥

                सूक्ष्म रूप धरि सियहिं दिखावा।
                बिकट रूप धरि लंक जरावा॥

                भीम रूप धरि असुर सँहारे।
                रामचन्द्र के काज सँवारे॥

                लाय सजीवन लखन जियाए।
                श्रीरघुबीर हरषि उर लाए॥

                रघुपति कीन्ही बहुत बड़ाई।
                तुम मम प्रिय भरतहि सम भाई॥

                सहस बदन तुम्हरो जस गावैं।
                अस कहि श्रीपति कण्ठ लगावैं॥

                सनकादिक ब्रह्मादि मुनीसा।
                नारद सारद सहित अहीसा॥

                जम कुबेर दिगपाल जहाँ ते।
                कवि कोबिद कहि सके कहाँ ते॥

                तुम उपकार सुग्रीवहिं कीन्हा।
                राम मिलाय राजपद दीन्हा॥

                तुम्हरो मंत्र विभीषन माना।
                लंकेश्वर भए सब जग जाना॥

                जुग सहस्र जोजन पर भानू।
                लील्यो ताहि मधुर फल जानू॥

                प्रभु मुद्रिका मेलि मुख माही।
                जलधि लांघि गये अचरज नाहीं॥

                दुर्गम काज जगत के जेते।
                सुगम अनुग्रह तुम्हरे तेते॥

                राम दुआरे तुम रखवारे।
                होत न आज्ञा बिनु पैसारे॥

                सब सुख लहै तुम्हारी सरना।
                तुम रक्षक काहू को डरना॥

                आपन तेज सम्हारो आपै।
                तीनों लोक हाँक तें काँपै॥

                भूत पिसाच निकट नहिं आवै।
                महाबीर जब नाम सुनावै॥

                नासै रोग हरै सब पीरा।
                जपत निरंतर हनुमत बीरा॥

                संकट तें हनुमान छुड़ावै।
                मन क्रम बचन ध्यान जो लावै॥

                सब पर राम तपस्वी राजा।
                तिनके काज सकल तुम साजा॥

                और मनोरथ जो कोई लावै।
                सोइ अमित जीवन फल पावै॥

                चारों जुग परताप तुम्हारा।
                है परसिद्ध जगत उजियारा॥

                साधु संत के तुम रखवारे।
                असुर निकंदन राम दुलारे॥

                अष्ट सिद्धि नौ निधि के दाता।
                अस बर दीन जानकी माता॥

                राम रसायन तुम्हरे पासा।
                सदा रहो रघुपति के दासा॥

                तुम्हरे भजन राम को पावै।
                जनम जनम के दुख बिसरावै॥

                अन्त काल रघुबर पुर जाई।
                जहाँ जन्म हरि-भक्त कहाई॥

                और देवता चित्त न धरई।
                हनुमत सेइ सर्ब सुख करई॥

                संकट कटै मिटै सब पीरा।
                जो सुमिरै हनुमत बलबीरा॥

                जय जय जय हनुमान गोसाईं।
                कृपा करहु गुरुदेव की नाईं॥

                जो शत बार पाठ कर कोई।
                छूटहि बंदि महासुख होई॥

                जो यह पढ़ै हनुमान चालीसा।
                होय सिद्धि साखी गौरीसा॥

                तुलसीदास सदा हरि चेरा।
                कीजै नाथ हृदय महँ डेरा॥

                पवनतनय संकट हरन, मंगल मूरति रूप।
                राम लखन सीता सहित, हृदय बसहु सुर भूप॥
                """.trimIndent()
            )
        ),
        HanumanModel(
            "Hanuman Chalisa (English)", listOf(
                """
Sri Guru Charan Saroj Raj Nij Man Mukur Sudhari, Baranau Raghuvar Bimal Jasu Jo Dayaku Ohal Chari II

Buddhiheen Tanu Janike Sumarau Pavan Kumar, Bal Buddhi Vidya Dehu Mohi Harau Kalesh Vikar II

Jai Hanuman gyan gun sagar
Jai Kapis tihun lok ujagar

Ram doot atulit bal dhama
Anjaani putra Pavan sut nama

Mahabir Bikram Bajrangi
Kumati nivar sumati ke sangi

Kanchan varan viraj subesa
Kanan kundal kunchit kesa

Hath vajra aur dhvaja viraje
Kaandhe moonj janeyu saje

Shankar suvan kesri nandan
Tej pratap maha jag vandan

Vidyavan guni ati chatur
Ram kaj karibe ko aatur

Prabu charitra sunibe ko rasiya
Ram Lakhan Sita man basiya

Sukshma roop dhari siyahi dikhava
Vikat roop dhari lank jarava

Bhima roop dhari asur sanghare
Ramachandra ke kaj sanvare

Laye Sanjivan Lakhan jiyaye
Shri Raghuvir harashi ur laye

Raghupati kinhi bahut badai
Tum mam priye Bharat hi sam bhai

Sahas badan tumharo yash gaave
Asa kahi Shripati kanth lagaave

Sankadhik Brahmadi Muneesa
Narad Saarad sahit Aheesa

Yam Kuber Digpaal jahan te
Kavi Kovid kahi sake kahan te

Tum upkar Sugreevahin keenha
Ram milaye rajpad deenha

Tumharo mantra Vibheeshan maana
Lankeshwar bhaye sab jag jana

Yug sahastra jojan par Bhanu
Leelyo tahi madhur phal janu

Prabhu mudrika meli mukh mahee
Jaladhi langhi gaye achraj nahee

Durgam kaj jagath ke jete
Sugam anugraha tumhre tete

Ram dwaare tum rakhvare
Hoat na agya binu paisare

Sub sukh lahae tumhari sar na
Tum rakshak kahu ko dar naa

Aapan tej samharo aapai
Teenhon lok hank te kanpai

Bhoot pisaach nikat nahin aavai
Mahavir jab naam sunave

Nase rog harae sab peera
Japat nirantar Hanumant beera

Sankat te Hanuman chudavae
Man kram vachan dhyan jo lavai

Sab par Ram tapasvee raja
Tin ke kaj sakal Tum saja

Aur manorath jo koi lavai
Soi amit jeevan phal pavai

Charon jug partap tumhara
Hai persidh jagat ujiyara

Sadhu Sant ke tum rakhware
Asur nikandan Ram dulhare

Ashta sidhi nav nidhi ke dhata
As var deen Janki mata

Ram rasayan tumhare pasa
Sada raho Raghupati ke dasa

Tumhare bhajan Ram ko pavai
Janam janam ke dukh bisraavai

Anth kaal Raghuvir pur jayee
Jahan janam Hari Bakht Kahayee

Aur Devta chit na dharahi
Hanumanth sehi sarve sukh karehi

Sankat kate mite sab peera
Jo sumirai Hanumat balbeera

Jai Jai Jai Hanuman Gosayin
Kripa karahu Gurudev ki nyahin

Jo sat bar path kare kohi
Chutahi bandhi maha sukh hohi

Jo yah padhe Hanuman Chalisa
Hoye siddhi sakhi Gaurisa

Tulsidas sada hari chera
Keejai nath hridaye mein dera

Pavan tanay sankat harana, Mangal moorati roop I
Ram Lakhan Sita sahit, Hridaya basahu sur bhoop II
                """.trimIndent()
            )
        ),
        HanumanModel(
            "Lord Hanuman Vandana", listOf(
                """
चरण शरण में आयी के,
धरुं तिहारा ध्यान॥
संकट से रक्षा करो,
संकट से रक्षा करो,
पवन पुत्र हनुमान॥

दुर्मम काज बनाय के,
कीन्हे भक्त निहाल॥
अब मोरी विनती सुनो,
अब मोरी विनती सुनो,
हे अंजनी के लाल॥

हाथ जोड़ विनती करूँ,
सुनो वीर हनुमान॥
कष्टों से रक्षा करो,
कष्टों से रक्षा करो,
राम भक्ति देहूं दान
पवनपुत्र हनुमान॥ 
                """.trimIndent()
            )
        ),
        HanumanModel(
            "Lord Hanuman Arti", listOf(
                """
आरती कीजै हनुमान लला की ।
दुष्ट दलन रघुनाथ कला की ॥

जाके बल से गिरवर काँपे ।
रोग-दोष जाके निकट न झाँके ॥
अंजनि पुत्र महा बलदाई ।
संतन के प्रभु सदा सहाई ॥
आरती कीजै हनुमान लला की ॥

दे वीरा रघुनाथ पठाए ।
लंका जारि सिया सुधि लाये ॥
लंका सो कोट समुद्र सी खाई ।
जात पवनसुत बार न लाई ॥
आरती कीजै हनुमान लला की ॥

लंका जारि असुर संहारे ।
सियाराम जी के काज सँवारे ॥
लक्ष्मण मुर्छित पड़े सकारे ।
लाये संजिवन प्राण उबारे ॥
आरती कीजै हनुमान लला की ॥

पैठि पताल तोरि जमकारे ।
अहिरावण की भुजा उखारे ॥
बाईं भुजा असुर दल मारे ।
दाहिने भुजा संतजन तारे ॥
आरती कीजै हनुमान लला की ॥

सुर-नर-मुनि जन आरती उतरें ।
जय जय जय हनुमान उचारें ॥
कंचन थार कपूर लौ छाई ।
आरती करत अंजना माई ॥
आरती कीजै हनुमान लला की ॥

जो हनुमानजी की आरती गावे ।
बसहिं बैकुंठ परम पद पावे ॥
लंक विध्वंस किये रघुराई ।
तुलसीदास स्वामी कीर्ति गाई ॥

आरती कीजै हनुमान लला की ।
दुष्ट दलन रघुनाथ कला की ॥
                """.trimIndent()
            )
        ),

    )
    return shayriData
}

